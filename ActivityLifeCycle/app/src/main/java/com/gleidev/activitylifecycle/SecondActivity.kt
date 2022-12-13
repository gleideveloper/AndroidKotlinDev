package com.gleidev.activitylifecycle

import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract.RawContacts.Data
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }
    override fun onStart() {
        super.onStart()
        text.text = intent.getStringExtra("Text_value")
        Log.i("LOG", "onStart() ${this.javaClass.simpleName}")
    }
    override fun onResume() {
        super.onResume()
        Log.i("LOG", "onResume() ${this.javaClass.simpleName}")
        btnFinish.setOnClickListener {
            val data = Intent()
            data.putExtra("RETURN", edtPersonName.text.toString())
            setResult(RESULT_OK, data)
            finish()
        }
    }
}