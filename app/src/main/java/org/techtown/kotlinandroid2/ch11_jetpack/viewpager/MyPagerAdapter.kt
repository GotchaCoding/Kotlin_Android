package org.techtown.kotlinandroid2.ch11_jetpack.viewpager

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.techtown.kotlinandroid2.databinding.ItemViewpagerBinding

class MyPagerViewHolder(val binding: ItemViewpagerBinding): RecyclerView.ViewHolder(binding.root)

class MyPagerAdapter(val datas: MutableList<String>): RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun getItemCount(): Int{
        return datas.size
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder
            = MyPagerViewHolder(ItemViewpagerBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val binding=(holder as MyPagerViewHolder).binding
        //뷰에 데이터 출력
        binding.tvnItemViewpager.text=datas[position]
        when(position % 3){
            0 -> binding.tvnItemViewpager.setBackgroundColor(Color.RED)
            1 -> binding.tvnItemViewpager.setBackgroundColor(Color.BLUE)
            2 -> binding.tvnItemViewpager.setBackgroundColor(Color.GREEN)
        }
    }
}