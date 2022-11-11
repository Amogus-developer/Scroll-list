package com.example.myscroll

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myscroll.databinding.ActivityInfactivity3Binding

class INFActivity3 : AppCompatActivity() {
    lateinit var bindingClass3: ActivityInfactivity3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass3 = ActivityInfactivity3Binding.inflate(layoutInflater)
        setContentView(bindingClass3.root)
        bindingClass3.imageView3.setOnClickListener {
            val intent = Intent(applicationContext, MainActivity::class.java)
            finish()
            startActivity(intent)
        }
    }
}