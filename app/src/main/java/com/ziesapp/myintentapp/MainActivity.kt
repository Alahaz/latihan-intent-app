package com.ziesapp.myintentapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnPindahAct: Button = findViewById(R.id.btnPindahAct)
        btnPindahAct.setOnClickListener(this)
        val btnPindahActWithData: Button = findViewById(R.id.btnPindahActWithData)
        btnPindahActWithData.setOnClickListener(this)
        val btnTelpon:Button = findViewById(R.id.btnTelpon)
        btnTelpon.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btnPindahAct -> {
                val pindahActivity = Intent(this@MainActivity, PindahActivity::class.java)
                startActivity(pindahActivity)
            }

            R.id.btnPindahActWithData -> {
                val pindahDenganIntent =
                    Intent(this@MainActivity, PindahActivityWithData::class.java)
                pindahDenganIntent.putExtra(PindahActivityWithData.EXTRA_NAMA, "Alief Ahmad Azies")
                pindahDenganIntent.putExtra(PindahActivityWithData.EXTRA_UMUR, 4)
                startActivity(pindahDenganIntent)
            }
            R.id.btnTelpon -> {
                val nomorTelp = "081219043293"
                val telponIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$nomorTelp"))
                startActivity(telponIntent)
            }
        }
    }
}
