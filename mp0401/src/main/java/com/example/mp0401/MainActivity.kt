package com.example.mp0401

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        } // 위젯 연결
        var imageView1 = findViewById<ImageView>(R.id.imageView1)
        var imageView2 = findViewById<ImageView>(R.id.imageView2)
        var editText = findViewById<EditText>(R.id.editText)
        var button = findViewById<Button>(R.id.button)

        // 주사위 이미지 리소스 배열 선언
        var diceNumber = intArrayOf(
            R.drawable.dice1, R.drawable.dice2,
            R.drawable.dice3, R.drawable.dice4,
            R.drawable.dice5, R.drawable.dice6
        )

        // 주사위 값 랜덤으로 설정
        var numA = (Math.random() * 6).toInt() + 1
        var numB = (Math.random() * 6).toInt() + 1

        // 주사위 값에 해당하는 이미지 출력
        imageView1.setImageResource(diceNumber[numA - 1])
        imageView2.setImageResource(diceNumber[numB - 1])

        // 결과보기 버튼 클릭
        button.setOnClickListener {
            var answer = editText.text.toString().toIntOrNull()

            if (answer == null) {
                Toast.makeText(
                    this, "합계를 입력하세요", Toast.LENGTH_SHORT
                ).show()
            } else if (answer == numA + numB) {
                Toast.makeText(
                    this, "맞았습니다", Toast.LENGTH_SHORT
                ).show()
            } else {
                Toast.makeText(
                    this, "틀렸습니다", Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}