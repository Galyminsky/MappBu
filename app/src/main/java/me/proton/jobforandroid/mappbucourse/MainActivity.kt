package me.proton.jobforandroid.mappbucourse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import me.proton.jobforandroid.mappbucourse.databinding.ActivityMainBinding
import me.proton.jobforandroid.mappbucourse.fragment.CatalogFragment
import me.proton.jobforandroid.mappbucourse.fragment.DeliveryFragment
import me.proton.jobforandroid.mappbucourse.fragment.HomeFragment
import me.proton.jobforandroid.mappbucourse.fragment.SettingFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction()
            .replace(R.id.contener, HomeFragment.newInstance())
            .commit()

        binding.nav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.item_home -> supportFragmentManager.beginTransaction()
                    .replace(R.id.contener, HomeFragment.newInstance())
                    .commit()

                R.id.item_catalog -> supportFragmentManager.beginTransaction()
                    .replace(R.id.contener, CatalogFragment.newInstance())
                    .commit()

                R.id.item_delivery -> supportFragmentManager.beginTransaction()
                    .replace(R.id.contener, DeliveryFragment.newInstance())
                    .commit()

                R.id.item_setting -> supportFragmentManager.beginTransaction()
                    .replace(R.id.contener, SettingFragment.newInstance())
                    .commit()
            }
            return@setOnItemSelectedListener true
        }
    }
}