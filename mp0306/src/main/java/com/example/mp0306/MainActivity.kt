package com.example.mp0306

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var imageView: ImageView
    lateinit var textFileName: TextView

    val images = arrayOf(
        R.drawable.cat1,
        R.drawable.cat2,
        R.drawable.cat3,
        R.drawable.cat4,
        R.drawable.cat5
    )

    val fileNames = arrayOf(
        "cat1.png",
        "cat2.png",
        "cat3.png",
        "cat4.png",
        "cat5.png"
    )

    var index = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        imageView = findViewById(R.id.imageView)
        textFileName = findViewById(R.id.textFileName)

        imageView.setImageResource(images[index])
        textFileName.setText(fileNames[index])
    }

    fun onClickNext(view: View) {
        index = (index + 1) % images.size

        imageView.setImageResource(images[index])
        textFileName.setText(fileNames[index])
    }
}