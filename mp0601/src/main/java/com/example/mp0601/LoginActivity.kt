package com.example.mp0601

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.login)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val editText01 = findViewById<EditText>(R.id.editText01)
        val editText02 = findViewById<EditText>(R.id.editText02)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val userId = editText01.text.toString()
            val password = editText02.text.toString()

            Toast.makeText(
                this,
                "아이디 : $userId\n비밀번호 : $password",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}