package com.example.myscroll

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myscroll.databinding.ActivityInfactivity4Binding

class INFActivity4 : AppCompatActivity() {
    lateinit var bindingClass4: ActivityInfactivity4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass4 = ActivityInfactivity4Binding.inflate(layoutInflater)
        setContentView(bindingClass4.root)
        bindingClass4.imageView4.setOnClickListener {
            val intent = Intent(applicationContext, MainActivity::class.java)
            finish()
            startActivity(intent)
        }
    }
}