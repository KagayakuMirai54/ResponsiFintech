package com.example.responsifintech

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class RecoveryActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var ic_back : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recovery)

        ic_back = findViewById(R.id.ic_back)

        ic_back.setOnClickListener(this)


    }
    override fun onClick(v: View) {
        when (v.id) {
            R.id.ic_back -> {
                val intent = Intent(this@RecoveryActivity, LoginActivity::class.java)
                startActivity(intent)
            }
        }
    }
}

