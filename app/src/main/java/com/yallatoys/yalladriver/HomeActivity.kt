package com.yallatoys.yalladriver


import android.graphics.Color.alpha
import android.os.Build
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomappbar.BottomAppBar
import com.google.android.material.shape.MaterialShapeDrawable
import com.google.android.material.shape.RelativeCornerSize
import com.google.android.material.shape.RoundedCornerTreatment
import com.yallatoys.yalladriver.databinding.ActivityHomeBinding


class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navhost =
            supportFragmentManager.findFragmentById(binding.navHostFragment.id) as NavHostFragment
        navController = navhost.findNavController()
        binding.bottomNavigationView.setupWithNavController(navController)
//        setCustomActionBar()
        setSupportActionBar(binding.toolbar)
        setupActionBarWithNavController(navController)
        val bottomAppBar = findViewById<BottomAppBar>(binding.bottomAppBar.id)
        val bottomBarBackground =
            bottomAppBar.background as MaterialShapeDrawable
        bottomBarBackground.shapeAppearanceModel = bottomBarBackground.shapeAppearanceModel
            .toBuilder()
            .setTopLeftCorner(RoundedCornerTreatment())
            .setTopLeftCornerSize(RelativeCornerSize(0.3f))
            .setTopRightCorner(RoundedCornerTreatment())
            .setTopRightCornerSize(RelativeCornerSize(0.3f))
            .build()
        setstatuscolor()
        navController.addOnDestinationChangedListener { controller, destination, arguments ->
            when (destination.id) {
                R.id.settingsFragment -> {
                    hideBottomNav()
//                    hideActionBar()
                    binding.toolbar.setBackgroundColor(R.color.yella_settings_color)
                    binding.toolbar.title = ""
                }
                else -> {
                    binding.toolbar.setBackgroundColor(alpha(0))
                    binding.toolbar.menu.hasVisibleItems()
                    showBottomNav()
                    showActionBar()
                }
            }
        }


    }

    //    private fun setCustomActionBar(){
//        setSupportActionBar(binding.customToolbar.toolbar)
//        binding.customToolbar.tvTitle.text = "Test"
//    }
    @Override
    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }

    @Override
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {

        return super.onPrepareOptionsMenu(menu)
    }

    private fun showBottomNav() {
        binding.bottomAppBar.visibility = View.VISIBLE
        binding.fab.visibility = View.VISIBLE

    }

    private fun hideBottomNav() {
        binding.bottomAppBar.visibility = View.GONE
        binding.fab.visibility = View.GONE
    }

    private fun showActionBar() {
        binding.toolbar.visibility = View.VISIBLE
    }

    private fun hideActionBar() {
        binding.toolbar.visibility = View.GONE
    }

    fun setstatuscolor() {
        if (Build.VERSION.SDK_INT >= 21) {
            val window = this.window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.statusBarColor = this.resources.getColor(R.color.main_background)
        }
    }
}