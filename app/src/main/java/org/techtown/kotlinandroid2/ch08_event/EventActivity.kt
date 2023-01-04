package org.techtown.kotlinandroid2.ch08_event

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import android.view.MotionEvent

import org.techtown.kotlinandroid2.databinding.ActivityEventBinding

class EventActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityEventBinding.inflate(layoutInflater)
        setContentView(binding.root)





    }


    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        when(keyCode) {
            KeyEvent.KEYCODE_0 -> Log.d("tag" , "0키를 눌렀네요")   //소프트키보드의 키는 이벤트 처리 안됨
            KeyEvent.KEYCODE_A -> Log.d("tag" , "A 키를 눌렀네요")  //소프트키보드의 키는 이벤트 처리 안됨
            KeyEvent.KEYCODE_BACK -> Log.d("tag" , "Back Button 키를 눌렀네요")
            KeyEvent.KEYCODE_VOLUME_UP -> Log.d("tag" , "Volum up 키를 눌렀네요")
            KeyEvent.KEYCODE_VOLUME_DOWN -> Log.d("tag" , "Volum down 키를 눌렀네요")



       }

        return super.onKeyDown(keyCode, event)
    }

    override fun onKeyUp(keyCode: Int, event: KeyEvent?): Boolean {
        Log.d("tag" , "onKeyUp")
        return super.onKeyUp(keyCode, event)
    }



    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when (event?.action) {
            MotionEvent.ACTION_DOWN -> {
                Log.d("tag" , "Touch down event x : ${event.x}, rawX : ${event.rawX}" )
            }
            MotionEvent.ACTION_UP -> {
                Log.d("tag" , "Touch up event")
            }
        }

        return super.onTouchEvent(event)
    }
}