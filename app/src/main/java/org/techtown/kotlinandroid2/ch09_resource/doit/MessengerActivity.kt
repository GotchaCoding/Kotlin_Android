package org.techtown.kotlinandroid2.ch09_resource.doit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.techtown.kotlinandroid2.R

class MessengerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_messenger)
    }
}