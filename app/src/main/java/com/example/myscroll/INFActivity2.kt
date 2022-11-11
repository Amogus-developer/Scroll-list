package com.example.myscroll

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myscroll.databinding.ActivityInfactivity2Binding

class INFActivity2 : AppCompatActivity() {
    lateinit var bindingClass2: ActivityInfactivity2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass2 = ActivityInfactivity2Binding.inflate(layoutInflater)
        setContentView(bindingClass2.root)
        bindingClass2.imageView2.setOnClickListener {
            val intent = Intent(applicationContext, MainActivity::class.java)
            finish()
            startActivity(intent)
        }
    }
}