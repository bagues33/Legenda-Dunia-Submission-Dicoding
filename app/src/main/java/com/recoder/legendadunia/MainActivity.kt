package com.recoder.legendadunia

import android.content.Intent
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.recoder.legendadunia.adapter.LegendaDuniaAdapter
import com.recoder.legendadunia.databinding.ActivityMainBinding
import com.recoder.legendadunia.model.LegendaDunia
import com.recoder.legendadunia.repository.LegendaDuniaData

class MainActivity : AppCompatActivity() {

    private var backPressedTime: Long = 0
    private lateinit var backToast: Toast
    private var list: ArrayList<LegendaDunia> = arrayListOf()
    private lateinit var mainBinding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        overridePendingTransition(R.animator.fade_in, R.animator.fade_out)
        setContentView(mainBinding.root)

        list.addAll(LegendaDuniaData.listData)

        mainBinding.rvLegendaDunia.layoutManager = LinearLayoutManager(this)
        val legendaDuniaAdapter = LegendaDuniaAdapter(list)
        mainBinding.rvLegendaDunia.adapter = legendaDuniaAdapter

    }

    // manampilkan dialog
    private fun showDialog(){
        val view = View.inflate(this@MainActivity, R.layout.layout_dialog, null)

        val builder = AlertDialog.Builder(this@MainActivity)
        builder.setView(view)

        val dialog = builder.create()
        dialog.show()
        dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)
        val btn = view.findViewById<Button>(R.id.btnOk)
        btn.setOnClickListener {
            dialog.dismiss()
        }
        val displayMetrics = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(displayMetrics)
        val displayWidth = displayMetrics.widthPixels
        val layoutParams = WindowManager.LayoutParams()
        layoutParams.copyFrom(dialog.window!!.attributes)
        val dialogWindowWidth = (displayWidth * 0.96f).toInt()
        layoutParams.width = dialogWindowWidth
        dialog.window!!.attributes = layoutParams
    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_profile, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean = when (item.itemId) {
        R.id.menuProfile -> {
            startActivity(Intent(this, ProfileActivity::class.java))
            true
        }
        R.id.menuInfo -> {
            showDialog()
            true
        }
        else -> super.onOptionsItemSelected(item)
    }

    override fun onBackPressed() {
        backToast = Toast.makeText(this, "Klik sekali lagi untuk keluar", Toast.LENGTH_SHORT)
        if (backPressedTime + 2000 > System.currentTimeMillis()) {
            backToast.cancel()
            super.onBackPressed()
            return
        } else {
            backToast.show()
        }
        backPressedTime = System.currentTimeMillis()

    }
}