package org.techtown.ch_07layout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

import org.techtown.kotlinandroid2.databinding.ActivityLinearBinding

class LinearLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityLinearBinding.inflate(layoutInflater)

        setContentView(binding.root)




    }
}