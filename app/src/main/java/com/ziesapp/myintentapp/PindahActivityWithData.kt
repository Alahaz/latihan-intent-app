package com.ziesapp.myintentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PindahActivityWithData : AppCompatActivity() {

    companion object{
        const val EXTRA_UMUR = "extra_umur"
        const val EXTRA_NAMA = "extra_nama"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pindah_with_data)

        val tvDataDiterima: TextView = findViewById(R.id.tv_with_data)

        val nama = intent.getStringExtra(EXTRA_NAMA)
        val umur = intent.getIntExtra(EXTRA_UMUR,0)

        val text = "Name : $nama, umur kamu : $umur"
        tvDataDiterima.text = text

    }
}
