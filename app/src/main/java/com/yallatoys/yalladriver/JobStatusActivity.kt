package com.yallatoys.yalladriver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.yallatoys.yalladriver.databinding.JobStatusLayoutBinding

class JobStatusActivity : AppCompatActivity() {
    private lateinit var binding: JobStatusLayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= JobStatusLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            imageViewOrderUpDown.setOnClickListener {
                if(relativeHiddenView.visibility== View.VISIBLE){
                    relativeHiddenView.visibility= View.GONE
                    imageViewOrderUpDown.setImageResource(R.drawable.ic_baseline_expand_more_24)
                }else{
                    relativeHiddenView.visibility= View.VISIBLE
                    imageViewOrderUpDown.setImageResource(R.drawable.ic_baseline_expand_less_24)
                }
            }
            imageViewOrderUpDown1.setOnClickListener {
                if(relativeHiddenView1.visibility== View.VISIBLE){
                    relativeHiddenView1.visibility= View.GONE
                    imageViewOrderUpDown1.setImageResource(R.drawable.ic_baseline_expand_more_24)
                }else{
                    relativeHiddenView1.visibility= View.VISIBLE
                    imageViewOrderUpDown1.setImageResource(R.drawable.ic_baseline_expand_less_24)
                }
            }
        }
    }
}