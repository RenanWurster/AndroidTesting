package com.example.androidtesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val title = findViewById<TextView>(R.id.tvTitle)
        val contextWrapper = ContextWrapper(this)

        title.text = contextWrapper.getTitle()
    }
}