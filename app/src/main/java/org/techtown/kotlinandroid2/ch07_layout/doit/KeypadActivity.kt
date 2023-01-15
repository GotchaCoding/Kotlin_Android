package org.techtown.kotlinandroid2.ch07_layout.doit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import org.techtown.kotlinandroid2.R
import org.techtown.kotlinandroid2.databinding.ActivityKeypadBinding

/*
* 키 패드 입력 시 tvContent 에 노출   -> o
* 12 글자 이상 시 더 이상 입력 할 수 없습니다. Toast 메세지 노출과 함께 추가 안됨. --> o
* 백키 눌렀을 때 한글자씩 제거   -> o
* 초기화 버튼 만들어서 모든 글자 제거  -> o
* */
class KeypadActivity : AppCompatActivity() {
    lateinit var stringNum: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityKeypadBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.tv1.setOnClickListener {
            binding.tvContent.append("1")
            var myNum = binding.tvContent.text
            stringNum = myNum.toString()
            toast()

        }
        binding.tv2.setOnClickListener {
            binding.tvContent.append("2")
            var myNum = binding.tvContent.text
            stringNum = myNum.toString()
            toast()
        }
        binding.tv3.setOnClickListener {
            binding.tvContent.append("3")
            var myNum = binding.tvContent.text
            stringNum = myNum.toString()
            toast()
        }
        binding.tv4.setOnClickListener {
            binding.tvContent.append("4")
            var myNum = binding.tvContent.text
            stringNum = myNum.toString()
            toast()
        }
        binding.tv5.setOnClickListener {
            binding.tvContent.append("5")
            var myNum = binding.tvContent.text
            stringNum = myNum.toString()
            toast()
        }
        binding.tv6.setOnClickListener {
            binding.tvContent.append("6")
            var myNum = binding.tvContent.text
            stringNum = myNum.toString()
            toast()
        }
        binding.tv7.setOnClickListener {
            binding.tvContent.append("7")
            var myNum = binding.tvContent.text
            stringNum = myNum.toString()
            toast()
        }
        binding.tv8.setOnClickListener {
            binding.tvContent.append("8")
            var myNum = binding.tvContent.text
            stringNum = myNum.toString()
            toast()
        }
        binding.tv9.setOnClickListener {
            binding.tvContent.append("9")
            var myNum = binding.tvContent.text
            stringNum = myNum.toString()
            toast()
        }
        binding.tv0.setOnClickListener {
            binding.tvContent.append("0")
            var myNum = binding.tvContent.text
            stringNum = myNum.toString()
            toast()
        }
        binding.tvStar.setOnClickListener {
            binding.tvContent.append("*")
            var myNum = binding.tvContent.text
            stringNum = myNum.toString()
            toast()
        }
        binding.tvWell.setOnClickListener {
            binding.tvContent.append("#")
            var myNum = binding.tvContent.text
            stringNum = myNum.toString()
            toast()
        }
        binding.iconBack.setOnClickListener {
            var myNum = binding.tvContent.text
            Log.e("log", "mynum 확인 : " + myNum)
            myNum = myNum.substring(0, myNum.length - 1)
            binding.tvContent.text = myNum
            stringNum = myNum
            Log.e("log", "stirngNu, 확인 : " + stringNum)
        }

        //아이디가 왜 다름?
        binding.btnInit.setOnClickListener {
            binding.tvContent.text = ""
        }
    }

    private fun toast() {
        if (stringNum.length == 12) {
            Toast.makeText(this@KeypadActivity, "12글자 이상 입력시 더 이상 입력 할 수 없습니다.", Toast.LENGTH_LONG)
                .show()
        }
    }

}
