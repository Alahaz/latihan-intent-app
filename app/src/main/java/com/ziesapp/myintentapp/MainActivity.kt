 package com.ziesapp.myintentapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

 class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnPindahAct:Button = findViewById(R.id.btnPindahAct)
        btnPindahAct.setOnClickListener(this)
    }

     override fun onClick(v: View) {
         when(v.id){
             R.id.btnPindahAct ->{
                 val pindahActivity = Intent(this@MainActivity, PindahActivity::class.java)
                 startActivity(pindahActivity)
             }
         }
     }
 }
