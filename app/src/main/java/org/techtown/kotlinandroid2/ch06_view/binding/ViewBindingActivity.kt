package org.techtown.kotlinandroid2.ch06_view.binding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import org.techtown.kotlinandroid2.databinding.ActivityViewbindingBinding


class ViewBindingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        //바인딩 객체 획득
        val binding = ActivityViewbindingBinding.inflate(layoutInflater)

        //액티비티 화면 출력
        setContentView(binding.root)

        //뷰 객체 이용
        binding.visibleBtn.setOnClickListener {
            binding.targetView.visibility = View.VISIBLE
        }

        binding.invisibleBtn.setOnClickListener {
            binding.targetView.visibility = View.INVISIBLE
        }

    }
}