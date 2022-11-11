package com.example.myscroll

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myscroll.databinding.ActivityInfactivity1Binding

class INFActivity1 : AppCompatActivity() {
    lateinit var bindingClass1: ActivityInfactivity1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass1 = ActivityInfactivity1Binding.inflate(layoutInflater)
        setContentView(bindingClass1.root)
        bindingClass1.imageView.setOnClickListener {
            val intent = Intent(applicationContext, MainActivity::class.java)
            finish()
            startActivity(intent)
        }
    }
}