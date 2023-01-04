package org.techtown.kotlinandroid2.ch06_view.viewclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.techtown.kotlinandroid2.databinding.ActivityViewbindingBinding

class ViewClassActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        //바인딩 객체 획득
        val binding = ActivityViewbindingBinding.inflate(layoutInflater)

        setContentView(binding.root)

//        val textView1 : TextView =findViewById(R.id.txt1);

        //제네릭으로 명시
//        val textView2 = findViewById<TextView>(R.id.txt1);

    }
}