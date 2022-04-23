package com.example.responsifintech

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
//import android.text.method.LinkMovementMethod
import android.view.View
import android.widget.Button
import android.widget.TextView

//import android.widget.TextView

class LoginActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btn_Login: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_Login = findViewById(R.id.btn_Login)
        btn_Login.setOnClickListener(this)

        val tv_here:TextView = findViewById(R.id.tv_here)
        tv_here.setOnClickListener{
            val intent = Intent (this, RecoveryActivity::class.java )
            startActivity(intent)
        }

        val tv_here2:TextView = findViewById(R.id.tv_here2)
        tv_here2.setOnClickListener{
            val intent = Intent (this, RegisterActivity::class.java )
            startActivity(intent)
        }



    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_Login -> {
                val intentBiasa = Intent(this@LoginActivity, HomeActivity::class.java)
                startActivity(intentBiasa)
            }

        }
    }




//
//    fun here(view: View) {
//        when (view.id) {
//            R.id.here -> {
//                val here = Intent(this@LoginActivity, RecoveryActivity::class.java)
//                startActivity(here)
//            }
//        }
//    }

//    fun register(view: View) {
//        when(view.id){
//            R.id.here_2 ->{
//                val intentHere_2 = Intent( this@LoginActivity, RegisterActivity::class.java)
//                startActivity(intentHere_2)
//        }
//    }
//    fun here2(view: View) {
//        when (view.id) {
//            R.id.here2 -> {
//                val here2 = Intent(this@LoginActivity, RegisterActivity::class.java)
//                startActivity(here2)
//            }
//        }
//
//    }

}

//TextView textView  = findViewById(R.id.here)
//textView.setMovementMethod (LinkMovementMethod.getInstance())
////
////        TextView = findViewById(R.id.here2)
////            .setMovementMethod (LinkMovementMethod.getInstance())