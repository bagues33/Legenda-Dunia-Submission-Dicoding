package com.recoder.legendadunia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.os.Bundle
import com.bumptech.glide.Glide
import com.recoder.legendadunia.databinding.ActivityDetailBinding
import com.recoder.legendadunia.model.LegendaDunia

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_LEGENDA_DUNIA = "extra_legenda_dunia"
    }

    private lateinit var detailBinding : ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailBinding = ActivityDetailBinding.inflate(layoutInflater)
        overridePendingTransition(R.animator.fade_in, R.animator.fade_out)
        setContentView(detailBinding.root)
        supportActionBar?.title = "Detail "
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

                val data = intent.getParcelableExtra<LegendaDunia>(EXTRA_LEGENDA_DUNIA)

                setBackground(R.color.blueDonker, R.color.blueDonker)

                Glide.with(this@DetailActivity)
                    .load(data?.photo)
                    .into(detailBinding.detailPhoto)

                with(detailBinding){
                        detailName.text = data?.name
                        detailDescription.text = data?.description
                        detailKelahiran.text = data?.kelahiran
                        detailKebangsaan.text = data?.kebangsaan
                        detailGaji.text = data?.gaji
                        detailTIm.text = data?.tim

                        actionShare.setOnClickListener {
                            val intent = Intent(Intent.ACTION_SEND)
                            intent.putExtra(Intent.EXTRA_TEXT, (" Nama : ${data?.name} \n Deskripsi : ${data?.description} \n Kelahiran : ${data?.kelahiran} \n Kebangsaan : ${data?.kebangsaan} \n Gaji : ${data?.gaji} \n Tim : ${data?.tim}"))
                            intent.type = "text/plain"
                            startActivity(Intent.createChooser(intent, "Send To"))
                        }
                }

                detailBinding.progress.visibility = View.GONE
    }

    private fun setBackground(background: Int, colorText: Int ){
        with(detailBinding){
            detailBackground.setBackgroundResource(background)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}