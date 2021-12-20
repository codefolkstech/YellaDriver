package com.yallatoys.yalladriver

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.LayoutInflater
import com.yallatoys.yalladriver.databinding.ActivityLoginBinding
import com.yallatoys.yalladriver.databinding.YallaLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: YallaLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= YallaLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            layoutJobListAccept.setOnClickListener {
                val intent = Intent(this@LoginActivity, HomeActivity::class.java)
                startActivity(intent)
            }
        }
    }
}