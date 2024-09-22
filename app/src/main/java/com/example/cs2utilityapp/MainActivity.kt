package com.example.cs2utilityapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Find and set content description for Mirage image
        val mirageImageView: ImageView = findViewById(R.id.my_image_view_mirage)
        mirageImageView.contentDescription = getString(R.string.mirage_clickable_image)
        mirageImageView.setOnClickListener {
            val intent = Intent(this, MirageActivity::class.java)
            startActivity(intent)
        }

        // Find and set content description for Dust2 image
        val dust2ImageView: ImageView = findViewById(R.id.my_image_view_dust2)
        dust2ImageView.contentDescription = getString(R.string.dust2_clickable_image)
    }
}
