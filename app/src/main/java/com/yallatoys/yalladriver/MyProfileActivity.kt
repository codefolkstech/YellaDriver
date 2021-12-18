package com.yallatoys.yalladriver

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yallatoys.yalladriver.databinding.MyprofileLayoutBinding

class MyProfileActivity : AppCompatActivity() {

    private lateinit var binding: MyprofileLayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= MyprofileLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {

            saveProfileButton.setOnClickListener {
                val intent = Intent(this@MyProfileActivity, JobActivity::class.java)
                startActivity(intent)
            }
        }
    }
}