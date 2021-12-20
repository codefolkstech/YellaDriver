package com.yallatoys.yalladriver.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.yallatoys.yalladriver.R

class SettingsFragment():Fragment(R.layout.yalla_settings) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(false);
    }
}