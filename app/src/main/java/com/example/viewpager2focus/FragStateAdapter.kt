package com.example.viewpager2focus

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter


class FragStateAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        return if(position == 0) {
            FirstFragment();
        } else {
            SecondFragment();
        }
    }
}