package com.example.figmaloginapp

import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textview = findViewById<TextView>(R.id.txtLogin)
        textview.paintFlags = Paint .UNDERLINE_TEXT_FLAG
    }
}