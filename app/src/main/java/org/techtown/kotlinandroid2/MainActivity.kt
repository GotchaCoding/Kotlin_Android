package org.techtown.kotlinandroid2


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.techtown.kotlinandroid2.ch06_view.doit.LoginActivity
import org.techtown.kotlinandroid2.ch07_layout.doit.KeypadActivity
import org.techtown.kotlinandroid2.ch08_event.doit.StopWatchActivity
import org.techtown.kotlinandroid2.ch09_resource.doit.MessengerActivity
import org.techtown.kotlinandroid2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnDoitLogin06doit.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        binding.btnKeypad07doit.setOnClickListener {
            val intent = Intent(this, KeypadActivity::class.java)
            startActivity(intent)
        }

        binding.btnStopWatch08doit.setOnClickListener {
            val intent = Intent(this, StopWatchActivity::class.java)
            startActivity(intent)
        }

        binding.btnMessenger09doit.setOnClickListener {
            val intent = Intent(this, MessengerActivity::class.java)
            startActivity(intent)
        }


    }
}