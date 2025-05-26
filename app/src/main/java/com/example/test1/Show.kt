package com.example.test1

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Show : AppCompatActivity() {
    @SuppressLint("SetTextI18n", "ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val ourCity = intent.getStringExtra("city")

        val textView = findViewById<TextView>(R.id.textViewCity)
        textView.text = "$ourCity sounds like a nice city, hopefully is sunny and warm!"
    }
}