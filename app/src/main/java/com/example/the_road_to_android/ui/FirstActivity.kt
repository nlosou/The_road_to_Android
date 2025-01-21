package com.example.the_road_to_android.ui

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity

import com.example.the_road_to_android.R

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_layout)
    }
}