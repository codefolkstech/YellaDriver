package com.yallatoys.yalladriver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.yallatoys.yalladriver.databinding.OrderItemsRowBinding
import com.yallatoys.yalladriver.databinding.TotalEarningsFragmentBinding

class SplashActivity : AppCompatActivity() {
    private lateinit var binding:OrderItemsRowBinding
//    private lateinit var totalEarningsFragmentBinding: TotalEarningsFragmentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= OrderItemsRowBinding.inflate(layoutInflater)
//        totalEarningsFragmentBinding= TotalEarningsFragmentBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val months=resources.getStringArray(R.array.Quantity)
        val arrayAdapter=ArrayAdapter(this,R.layout.quantity_dropdown_item,months)
        binding.fromMonthEarning.setAdapter(arrayAdapter)
    }
}