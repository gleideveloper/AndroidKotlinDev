package com.gleidev.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("LOG", "onCreate() " + System.currentTimeMillis())
    }

    //Metódo é chamado a partir do momento Activity ficou visível para o usuário
    override fun onStart() {
        super.onStart()
        Log.i("LOG", "onStart() " + System.currentTimeMillis())
    }

    override fun onResume() {
        super.onResume()
        Log.i("LOG", "onResume() " + System.currentTimeMillis())
        btnAbrirSecond.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
    }

    override fun onPause() {
        super.onPause()
        Log.i("LOG", "onPause() " + System.currentTimeMillis())
    }
}