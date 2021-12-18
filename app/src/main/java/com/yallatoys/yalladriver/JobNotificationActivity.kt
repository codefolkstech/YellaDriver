package com.yallatoys.yalladriver

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.yallatoys.yalladriver.databinding.JobNotificationBinding

class JobNotificationActivity : AppCompatActivity() {
    private lateinit var binding: JobNotificationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= JobNotificationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            layoutAccept.setOnClickListener {
                val intent = Intent(this@JobNotificationActivity, JobActivity::class.java)
                startActivity(intent)
            }

        }
    }
}