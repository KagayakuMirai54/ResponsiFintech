package com.example.responsifintech

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class RegisterActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var ic_back : Button
    private lateinit var btn_Register: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

            btn_Register = findViewById(R.id.btn_Login)
            btn_Register.setOnClickListener(this)

            ic_back = findViewById(R.id.ic_back)
            ic_back.setOnClickListener(this)

        }
        override fun onClick(v: View) {
            when (v.id) {
                R.id.btn_register -> {
                    val intent = Intent(this@RegisterActivity, HomeActivity::class.java)
                    startActivity(intent)
                }
            }
            when (v.id) {
                R.id.ic_back -> {
                    val intent = Intent(this@RegisterActivity, HomeActivity::class.java)
                    startActivity(intent)
                }
            }
        }
    }