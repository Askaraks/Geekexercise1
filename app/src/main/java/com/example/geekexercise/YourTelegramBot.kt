package com.example.geekexercise
import org.telegram.telegrambots.bots.TelegramLongPollingBot
import org.telegram.telegrambots.meta.api.methods.send.SendMessage

class YourTelegramBot : TelegramLongPollingBot() {
    override fun getBotUsername(): String {
        return "Caller123_bot"
    }

    override fun getBotToken(): String {
        return "6455569818:AAHhd-xPKAv1FCruXKtKnM0hRCLgGh7juZk"
    }

    override fun onUpdateReceived(update: org.telegram.telegrambots.meta.api.objects.Update) {
        if (update.hasMessage() && update.message.hasText()) {
            val chatId = update.message.chatId.toString()
            val text = update.message.text
            val response = SendMessage(chatId, "Вы сказали: $text")

            execute(response)
        }
    }
}
