package org.techtown.kotlinandroid2.ch08_event.doit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.view.KeyEvent
import android.widget.Toast
import org.techtown.kotlinandroid2.R
import org.techtown.kotlinandroid2.databinding.ActivityStopWatchBinding

class StopWatchActivity : AppCompatActivity() {

    //뒤로가기 버튼을 누른 시각을 저장하는 속성
   var initTime=0L

    //멈춘 시각을 저장하는 속성
    var pauseTime = 0L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityStopWatchBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding) {
            startButton.setOnClickListener {
                chronometer.base = SystemClock.elapsedRealtime() + pauseTime
                chronometer.start()

                //버튼표시여부 조정
                stopButton.isEnabled = true
                resetButton.isEnabled = true
                startButton.isEnabled = false
            }
            stopButton.setOnClickListener {
                pauseTime = chronometer.base - SystemClock.elapsedRealtime()
                chronometer.stop()
                stopButton.isEnabled = false
                resetButton.isEnabled = true
                startButton.isEnabled = true
            }
            resetButton.setOnClickListener {
                pauseTime = 0L
                chronometer.base = SystemClock.elapsedRealtime()
                chronometer.stop()
                stopButton.isEnabled = false
                resetButton.isEnabled = false
                startButton.isEnabled = true
            }
        }
    }


    //뒤로가기 버튼이벤트 핸들러
    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if(keyCode ===KeyEvent.KEYCODE_BACK) {
            //뒤로가기 버튼을 처음 눌렀거나 누른지 3초가 지낫을때 처리
            if(System.currentTimeMillis() - initTime > 3000) {
                Toast.makeText(this, "종료하려면 한 번 더 누르세요!!" , Toast.LENGTH_SHORT).show()
                initTime = System.currentTimeMillis()
                return true
            }
        }
        return super.onKeyDown(keyCode, event)
    }
}