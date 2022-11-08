package com.example.tablayouttask.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.tablayouttask.fragments.EgyptFragment
import com.example.tablayouttask.fragments.EnglandFragment
import com.example.tablayouttask.fragments.FranceFragment
import com.example.tablayouttask.fragments.SpainFragment
import com.example.tablayouttask.fragments.USAFragment

class FragmentAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 5
    }

    override fun getItem(position: Int): Fragment {

        var fragment: Fragment? = null
        when (position) {
            0 -> {
                fragment = EgyptFragment()
            }

            1 -> {
                fragment = EnglandFragment()
            }

            2 -> {
                fragment = FranceFragment()
            }

            3 -> {
                fragment = SpainFragment()
            }

            4 -> {
                fragment = USAFragment()
            }
        }

        return fragment!!
    }

    override fun getPageTitle(position: Int): CharSequence? {
        var title: String? = null
        when (position) {
            0 -> {
                title = "Egypt"
            }

            1 -> {
                title = "Englnd"
            }

            2 -> {
                title = "France"

            }

            3 -> {
                title = "Spain"
            }

            4 -> {
                title = "UAS"
            }
        }
        return title
    }

}