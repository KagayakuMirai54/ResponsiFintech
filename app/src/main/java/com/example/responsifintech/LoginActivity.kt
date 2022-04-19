package com.example.responsifintech

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        TextView = findViewById(R.id.here)
        .setMovementMethod (LinkMovementMethod.getInstance())

        TextView = findViewById(R.id.here2)
            .setMovementMethod (LinkMovementMethod.getInstance())
    }
}