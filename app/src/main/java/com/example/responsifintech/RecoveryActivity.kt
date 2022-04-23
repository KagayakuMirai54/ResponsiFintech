package com.example.responsifintech

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class RecoveryActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btn_back : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recovery)

        btn_back = findViewById(R.id.btn_back)

        btn_back.setOnClickListener(this)


    }
    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_back -> {
                val intent = Intent(this@RecoveryActivity, LoginActivity::class.java)
                startActivity(intent)
            }
        }
    }
}

