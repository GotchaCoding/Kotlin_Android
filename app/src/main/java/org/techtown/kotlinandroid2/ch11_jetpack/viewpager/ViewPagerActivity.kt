package org.techtown.kotlinandroid2.ch11_jetpack.viewpager

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import org.techtown.kotlinandroid2.R
import org.techtown.kotlinandroid2.ch11_jetpack.OneFragment
import org.techtown.kotlinandroid2.ch11_jetpack.ThreeFragment
import org.techtown.kotlinandroid2.ch11_jetpack.TwoFragment
import org.techtown.kotlinandroid2.databinding.ActivityViewPagerBinding

class ViewPagerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_view_pager)

        val binding = ActivityViewPagerBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val datas = mutableListOf<String>()
//        for(i in 1..3) {
//            datas.add("Item$i")
//        }
//    binding.viewpager.adapter = MyPagerAdapter(datas)  //리사이클러뷰 어뎁터

        val adapter = MyFragmentPagerAdapter(this)
        binding.viewpager.adapter = adapter
    }

    class MyFragmentPagerAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {
        val fragments: List<Fragment>
        init {
            fragments= listOf(OneFragment(), TwoFragment(), ThreeFragment())
            Log.d("log" ,"fragments size : ${fragments.size}")
        }
        override fun getItemCount(): Int = fragments.size

        override fun createFragment(position: Int): Fragment = fragments[position]
        }
    }
