package org.techtown.kotlinandroid2.ch10_dialog

import android.app.DatePickerDialog
import android.content.Context
import android.content.DialogInterface
import android.media.RingtoneManager
import android.net.Uri
import android.os.*
import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import android.view.LayoutInflater
import android.widget.DatePicker
import androidx.appcompat.app.AlertDialog


import org.techtown.kotlinandroid2.R
import org.techtown.kotlinandroid2.databinding.ActivityDialogBinding

class DialogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val inflater = getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val rootView = inflater.inflate(R.layout.activity_dialog, null)
        setContentView(rootView)


        val items = arrayOf<String>("사과", "복숭아", "수박", "딸기")

        /**
         * 소리얻기
         */
        val notification: Uri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
        val ringtone = RingtoneManager.getRingtone(applicationContext, notification)
        ringtone.play()

        /**
         * 진동
         */
        val vibrator = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            val vibratorManager = this.getSystemService(Context.VIBRATOR_MANAGER_SERVICE)
                    as VibratorManager
            vibratorManager.defaultVibrator;
        } else {
            getSystemService(VIBRATOR_SERVICE) as Vibrator
        }

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            vibrator.vibrate(
                VibrationEffect.createOneShot(500,
                VibrationEffect.DEFAULT_AMPLITUDE))
        } else {
            vibrator.vibrate(500)
        }


        /**
         * 라디오버튼
         */
        //라디오버튼
//        AlertDialog.Builder(this).run {
//
//            setSingleChoiceItems(items, 1, object : DialogInterface.OnClickListener {
//                override fun onClick(dialog: DialogInterface?, p1: Int) {
//                    Log.d("log", "${items[p1]} 이 선택되었습니다.")
//                }
//            })
//            show()}


        val dialogBinding = ActivityDialogBinding.inflate(layoutInflater)
        //목록출력
        AlertDialog.Builder(this).run {
            setTitle("items test")
//            setIcon(android.R.drawable.ic_dialog_info)
            setView(dialogBinding.root)
            setItems(items, object : DialogInterface.OnClickListener {
                override fun onClick(dialog: DialogInterface?, p1: Int) {
                    Log.d("log", "선택한 과일 : ${items[p1]}")
                }
            })
            setCancelable(false)
            setPositiveButton("닫기", null)
            show()
        }.setCanceledOnTouchOutside(false)


        /**
         *  //알림창 띄우기
         */
//        AlertDialog.Builder(this).run {
//            setTitle("test dialog")
//            setIcon(android.R.drawable.ic_dialog_info)
//            setMessage("정말 종료하시겠습니까?")
//            setPositiveButton("OK", eventHandler)
//            setNegativeButton("Cancel", eventHandler)
//            setNeutralButton("More", null)
//            show()
//        }


    }


    private val eventHandler = object : DialogInterface.OnClickListener {
        override fun onClick(dialog: DialogInterface?, p1: Int) {
            if (p1 == DialogInterface.BUTTON_POSITIVE) {
                Log.d("log", "positive button click")
            } else if (p1 == DialogInterface.BUTTON_NEGATIVE) {
                Log.d("log", "negative button click")
            }
        }
    }
}