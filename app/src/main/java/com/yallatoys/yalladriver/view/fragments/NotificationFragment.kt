package com.yallatoys.yalladriver.view.fragments

import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.yallatoys.yalladriver.R

class NotificationFragment():Fragment(R.layout.job_notification) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        getSupportActionBar().setBackground(new ColorDrawable(getResources().getColor(R.color.white)));
        (activity as AppCompatActivity?)!!.supportActionBar!!.setHomeAsUpIndicator(resources.getDrawable(R.drawable.ic_back_blue))
//        setHasOptionsMenu(false);
    }
}