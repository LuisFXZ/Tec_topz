package com.luisfxz.tec_top

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.luisfxz.tec_top.R.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_register)

        val GoToLogin = findViewById<TextView>(id.go_to_login)
        GoToLogin.setOnClickListener{goToLogin()}
    }
    private fun goToLogin(){
        val i = Intent(this,MainActivity::class.java)
        startActivity(i)
    }
}