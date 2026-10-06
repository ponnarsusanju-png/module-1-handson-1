package com.example.module1handson1

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.module1handson1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupUI()
    }

    private fun setupUI() {

        // Send button
        binding.btnSend.setOnClickListener {

            val message = binding.etMessage.text.toString().trim()

            if (message.isEmpty()) {

                Toast.makeText(
                    this,
                    "Please enter a message",
                    Toast.LENGTH_SHORT
                ).show()

            } else {

                binding.tvUserMessage.text = message

                binding.tvAiResponse.text =
                    "AI API is not connected yet. Your message was received successfully."

                binding.etMessage.text?.clear()
            }
        }

        // Ask AI
        binding.cardAsk.setOnClickListener {
            binding.etMessage.setText(
                "Explain this topic in simple words"
            )
        }

        // Coding
        binding.cardCode.setOnClickListener {
            binding.etMessage.setText(
                "Help me write Kotlin code"
            )
        }

        // Study
        binding.cardStudy.setOnClickListener {
            binding.etMessage.setText(
                "Create a study plan for me"
            )
        }
    }
}