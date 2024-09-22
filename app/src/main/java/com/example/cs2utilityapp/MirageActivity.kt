package com.example.cs2utilityapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MirageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_mirage)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val mirageCTImageView: ImageView = findViewById(R.id.my_image_view_mirageCT)
        mirageCTImageView.contentDescription = getString(R.string.mirageCT_clickable_image)
        mirageCTImageView.setOnClickListener {
            val intent = Intent(this, MirageActivity::class.java)
            startActivity(intent)
        }
        val mirageJungleImageView: ImageView = findViewById(R.id.my_image_view_mirageJungle)
        mirageJungleImageView.contentDescription = getString(R.string.mirageJungle_clickable_image)
        mirageJungleImageView.setOnClickListener {
            val intent = Intent(this, MirageActivity::class.java)
            startActivity(intent)
        }
    }
}