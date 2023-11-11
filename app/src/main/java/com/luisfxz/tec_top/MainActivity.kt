package com.luisfxz.tec_top

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.luisfxz.tec_top.R.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        val GoToRegister = findViewById<TextView>(id.go_to_register)
        GoToRegister.setOnClickListener{goToRegister()}
    }
    private fun goToRegister(){
        val i = Intent(this,RegisterActivity::class.java)
        startActivity(i)
    }
}