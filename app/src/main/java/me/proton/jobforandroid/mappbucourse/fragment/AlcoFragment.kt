package me.proton.jobforandroid.mappbucourse.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import me.proton.jobforandroid.mappbucourse.R


class AlcoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_alco, container, false)
    }

    companion object {

        @JvmStatic
        fun newInstance() = AlcoFragment()
    }
}