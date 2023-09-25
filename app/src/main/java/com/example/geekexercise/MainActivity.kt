package com.example.geekexercise

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import org.telegram.telegrambots.meta.api.methods.send.SendMessage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.editText)
        val sendButton = findViewById<Button>(R.id.sendButton)

        sendButton.setOnClickListener {
            val messageText = editText.text.toString()

            val telegramBot = YourTelegramBot()
            val response = SendMessage("2038205258", messageText)
            telegramBot.execute(response)
        }
    }
}
