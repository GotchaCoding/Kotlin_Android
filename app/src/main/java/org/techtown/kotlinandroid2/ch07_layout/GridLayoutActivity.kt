package org.techtown.ch_07layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.techtown.kotlinandroid2.databinding.ActivityFramlayoutBinding
import org.techtown.kotlinandroid2.databinding.ActivityGridLayoutBinding

class GridLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityGridLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}