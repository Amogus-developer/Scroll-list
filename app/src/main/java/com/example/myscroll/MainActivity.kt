package com.example.myscroll

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myscroll.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var bindingClass: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.imageView8.setOnClickListener {
            val intent = Intent(applicationContext, INFActivity1::class.java)
            finish()
            startActivity(intent)
        }
        bindingClass.imageView9.setOnClickListener {
            val intent = Intent(applicationContext, INFActivity2::class.java)
            finish()
            startActivity(intent)
        }
        bindingClass.imageView10.setOnClickListener {
            val intent = Intent(applicationContext, INFActivity3::class.java)
            finish()
            startActivity(intent)
        }
        bindingClass.imageView11.setOnClickListener {
            val intent = Intent(applicationContext, INFActivity4::class.java)
            finish()
            startActivity(intent)
        }

    }
}