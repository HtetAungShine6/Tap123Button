package com.example.mosquito.android

import android.os.Parcelable
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class PageAdapter(fm:FragmentManager) : FragmentPagerAdapter(fm){
    override fun getItem(position: Int) : Fragment {
        when(position){
            0->{return Fragment1()}
            1->{return Fragment2()}
            2->{return Fragment3()}
            else -> {return Fragment()}
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position){
            0->{return "Tab1"}
            1->{return "Tab2"}
            2->{return "Tab3"}
        }
        return super.getPageTitle(position)
    }

    override fun getCount(): Int {
        return 3
    }
}