package com.recoder.legendadunia

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.net.ConnectivityManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import android.widget.SeekBar
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.recoder.legendadunia.databinding.ActivityDetailBinding
import com.recoder.legendadunia.model.LegendaDunia
import java.lang.Exception
import java.lang.IllegalStateException

@SuppressLint("SetJavaScriptEnabled")
class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_LEGENDA_DUNIA = "extra_legenda_dunia"
    }

    private lateinit var handler : Handler
    private lateinit var detailBinding : ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailBinding = ActivityDetailBinding.inflate(layoutInflater)
        overridePendingTransition(R.animator.fade_in, R.animator.fade_out)
        setContentView(detailBinding.root)
        handler = Handler(Looper.getMainLooper())
        supportActionBar?.title = "Detail "
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

            handler.postDelayed({

                val data = intent.getParcelableExtra<LegendaDunia>(EXTRA_LEGENDA_DUNIA)

                when(data?.name){
                    else -> setBackground(R.color.blueDonker, R.color.blueDonker)
                }

                Glide.with(this@DetailActivity)
                    .load(data?.photo)
                    .into(detailBinding.detailPhoto)

                with(detailBinding){
                        detailName.text = data?.name
                        detailDescription.text = data?.description
                    }
                    detailBinding.progress.visibility = View.GONE

            }, 0)

    }


    private fun setBackground(background: Int, colorText: Int ){
        with(detailBinding){
            detailBackground.setBackgroundResource(background)
            detailName.setBackgroundResource(colorText)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}