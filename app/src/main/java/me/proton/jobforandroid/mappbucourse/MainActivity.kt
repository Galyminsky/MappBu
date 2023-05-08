package me.proton.jobforandroid.mappbucourse

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import me.proton.jobforandroid.mappbucourse.databinding.ActivityMainBinding
import me.proton.jobforandroid.mappbucourse.fragment.AlcoFragment

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //binding.fab.setColorFilter(Color.CYAN)
        binding.fab.hide()

        binding.fab.setOnClickListener(this)
        binding.btnDis.setOnClickListener(this)
        binding.btnHide.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.fab -> supportFragmentManager.beginTransaction().replace(R.id.content, AlcoFragment.newInstance())
                .commit()
            R.id.btnDis -> binding.fab.show()
            R.id.btnHide -> binding.fab.hide()
        }
    }
}