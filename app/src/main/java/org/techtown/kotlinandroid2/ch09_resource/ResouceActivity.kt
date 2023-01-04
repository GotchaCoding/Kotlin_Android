package org.techtown.kotlinandroid2.ch09_resource

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import org.techtown.kotlinandroid2.R
import org.techtown.kotlinandroid2.databinding.ActivityResourceBinding

class ResouceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityResourceBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView.text = getString(R.string.World)


    }
}