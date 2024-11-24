package com.example.anuk_guerraizquierdo_uf1_act12

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.HorizontalScrollView
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val toggleScroll: ToggleButton = findViewById(R.id.toggleScroll)
        val horizontalScrollView: HorizontalScrollView = findViewById(R.id.horizontalScrollView)

        toggleScroll.setOnCheckedChangeListener { _, isChecked ->
            horizontalScrollView.isHorizontalScrollBarEnabled = isChecked
        }
    }
}