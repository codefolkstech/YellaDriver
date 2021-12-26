package com.yallatoys.yalladriver

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import com.yallatoys.yalladriver.databinding.JobviewDesignBinding

class JobActivity : AppCompatActivity() {
    private lateinit var binding: JobviewDesignBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= JobviewDesignBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            jobrelativeLayout.setOnClickListener {
                val intent = Intent(this@JobActivity, JobStatusActivity::class.java)
                startActivity(intent)
            }
            imageViewOrderUpDown.setOnClickListener {
                if(relativeHiddenView.visibility==View.VISIBLE){
                    relativeHiddenView.visibility=View.GONE
               imageViewOrderUpDown.setImageResource(R.drawable.ic_baseline_expand_more_24)

                }else{
                    relativeHiddenView.visibility=View.VISIBLE
                    imageViewOrderUpDown.setImageResource(R.drawable.ic_baseline_expand_less_24)
                }
            }
        }
    }
}