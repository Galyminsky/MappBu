package me.proton.jobforandroid.mappbucourse

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import me.proton.jobforandroid.mappbucourse.databinding.ActivityMainBinding
import me.proton.jobforandroid.mappbucourse.fragment.AlcoFragment
import me.proton.jobforandroid.mappbucourse.fragment.CatalogFragment
import me.proton.jobforandroid.mappbucourse.fragment.DeliveryFragment
import me.proton.jobforandroid.mappbucourse.fragment.HelpFragment
import me.proton.jobforandroid.mappbucourse.fragment.HomeFragment
import me.proton.jobforandroid.mappbucourse.fragment.SettingFragment

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.topAppBar)
        supportFragmentManager.beginTransaction().replace(R.id.contener, HomeFragment.newInstance())
            .commit()

        binding.nav.setOnNavigationItemSelectedListener(this)
        binding.nav.selectedItemId = R.id.item_home

        binding.topAppBar.setOnMenuItemClickListener { menuItem: MenuItem ->
            when (menuItem.itemId) {
                R.id.item_alco -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.contener, AlcoFragment.newInstance()).commit()
                    true
                }
                R.id.item_help -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.contener, HelpFragment.newInstance()).commit()
                    true
                }
                else -> false
            }
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.item_home -> supportFragmentManager.beginTransaction()
                .replace(R.id.contener, HomeFragment.newInstance()).commit()

            R.id.item_catalog -> supportFragmentManager.beginTransaction()
                .replace(R.id.contener, CatalogFragment.newInstance()).commit()

            R.id.item_delivery -> supportFragmentManager.beginTransaction()
                .replace(R.id.contener, DeliveryFragment.newInstance()).commit()

            R.id.item_setting -> supportFragmentManager.beginTransaction()
                .replace(R.id.contener, SettingFragment.newInstance()).commit()
        }

        return true
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val menuInflater = menuInflater
        menuInflater.inflate(R.menu.top_menu, menu)
        return true
    }
}