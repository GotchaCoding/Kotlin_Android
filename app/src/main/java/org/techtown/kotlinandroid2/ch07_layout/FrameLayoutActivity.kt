package org.techtown.ch_07layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

import org.techtown.kotlinandroid2.databinding.ActivityFramlayoutBinding

class FrameLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityFramlayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            binding.button.visibility = View.INVISIBLE
            binding.imageView1.visibility = View.VISIBLE
        }

        binding.imageView1.setOnClickListener {
            binding.button.visibility = View.VISIBLE
            binding.imageView1.visibility = View.INVISIBLE
        }
    }
}