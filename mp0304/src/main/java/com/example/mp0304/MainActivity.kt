package com.example.mp0304

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var editName: EditText
    lateinit var editPassword: EditText
    lateinit var editEmail: EditText
    lateinit var editBirthday: EditText
    lateinit var editPhone: EditText
    lateinit var textResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        editName = findViewById(R.id.editName)
        editPassword = findViewById(R.id.editPassword)
        editEmail = findViewById(R.id.editEmail)
        editBirthday = findViewById(R.id.editBirthday)
        editPhone = findViewById(R.id.editPhone)
        textResult = findViewById(R.id.textResult)
    }
    fun onClickResult(view: View?) {
        val name = editName.text.toString()
        val password = editPassword.text.toString()
        val email = editEmail.text.toString()
        val birthday = editBirthday.text.toString()
        val phone = editPhone.text.toString()

        textResult.setText(
            "성명: $name\n" +
                    "비밀번호: $password\n" +
                    "이메일: $email\n" +
                    "생년월일: $birthday\n" +
                    "연락처: $phone"
        )
    }
}