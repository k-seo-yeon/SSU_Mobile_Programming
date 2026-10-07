package com.example.mp0403

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var imgBody: ImageView
    lateinit var imgDress: ImageView
    lateinit var imgNeck: ImageView
    lateinit var imgCrown: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(
                systemBars.left, systemBars.top,
                systemBars.right, systemBars.bottom
            )
            insets
        }

        imgBody = findViewById(R.id.imgBody)
        imgDress = findViewById(R.id.imgDress)
        imgNeck = findViewById(R.id.imgNeck)
        imgCrown = findViewById(R.id.imgCrown)

        hideItems()
    }

    fun onClickChoice(view: View) {
        when (view.id) {
            R.id.imgDress1 -> {
                imgDress.setImageResource(R.drawable.dress1)
                imgDress.visibility = View.VISIBLE
            }

            R.id.imgDress2 -> {
                imgDress.setImageResource(R.drawable.dress2)
                imgDress.visibility = View.VISIBLE
            }

            R.id.imgDress3 -> {
                imgDress.setImageResource(R.drawable.dress3)
                imgDress.visibility = View.VISIBLE
            }

            R.id.imgCrown1 -> {
                imgCrown.setImageResource(R.drawable.crown1)
                imgCrown.visibility = View.VISIBLE
            }

            R.id.imgCrown2 -> {
                imgCrown.setImageResource(R.drawable.crown2)
                imgCrown.visibility = View.VISIBLE
            }

            R.id.imgNeck1 -> {
                imgNeck.setImageResource(R.drawable.necklace1)
                imgNeck.visibility = View.VISIBLE
            }

            R.id.imgNeck2 -> {
                imgNeck.setImageResource(R.drawable.necklace2)
                imgNeck.visibility = View.VISIBLE
            }
        }
    }

    fun onClickReset(view: View?) {
        hideItems()
    }

    private fun hideItems() {
        imgDress.visibility = View.INVISIBLE
        imgNeck.visibility = View.INVISIBLE
        imgCrown.visibility = View.INVISIBLE
    }
}