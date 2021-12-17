package com.yallatoys.yalladriver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var item: MenuItem
    private lateinit var deliveryCount: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        item = menu?.findItem(R.id.deliveryCount)!!
        val view = item.actionView

        deliveryCount = view.findViewById(R.id.textviewDeliveryCount)
        deliveryCount.text = "12"

        return super.onCreateOptionsMenu(menu)
    }
}