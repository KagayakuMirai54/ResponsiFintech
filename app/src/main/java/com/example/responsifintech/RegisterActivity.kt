package com.example.responsifintech

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class RegisterActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btn_backrgstr : Button
    private lateinit var btn_Register: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

            btn_Register = findViewById(R.id.btn_Login)
            btn_Register.setOnClickListener(this)

            btn_backrgstr = findViewById(R.id.btn_backrgstr)
            btn_backrgstr.setOnClickListener(this)

        }
        override fun onClick(v: View) {
            when (v.id) {
                R.id.btn_register -> {
                    val intent = Intent(this@RegisterActivity, HomeActivity::class.java)
                    startActivity(intent)
                }
            }
            when (v.id) {
                R.id.btn_backrgstr -> {
                    val intent2 = Intent(this@RegisterActivity, LoginActivity::class.java)
                    startActivity(intent2)
                }
            }
        }
    }