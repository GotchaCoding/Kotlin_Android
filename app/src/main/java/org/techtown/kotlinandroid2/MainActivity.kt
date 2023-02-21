package org.techtown.kotlinandroid2


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.techtown.kotlinandroid2.ch06_view.doit.LoginActivity
import org.techtown.kotlinandroid2.ch07_layout.doit.KeypadActivity
import org.techtown.kotlinandroid2.ch08_event.doit.StopWatchActivity
import org.techtown.kotlinandroid2.ch09_resource.doit.MessengerActivity
import org.techtown.kotlinandroid2.ch10_dialog.DialogActivity
import org.techtown.kotlinandroid2.ch11_jetpack.ActionBarActivity
import org.techtown.kotlinandroid2.ch11_jetpack.drawer.DrawerActivity
import org.techtown.kotlinandroid2.ch11_jetpack.fragment.FragmentActivity
import org.techtown.kotlinandroid2.ch11_jetpack.viewpager.ViewPagerActivity
import org.techtown.kotlinandroid2.ch11_jetpack.viewpager.doit.JetpackActivity
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

        binding.btnDialog10.setOnClickListener {
            val intent = Intent(this, DialogActivity::class.java)
            startActivity(intent)
        }

        binding.btnAppcommaptLibrary.setOnClickListener {
            val intent = Intent(this, ActionBarActivity::class.java)
            startActivity(intent)
        }

        binding.btnFragment.setOnClickListener {
            val intent = Intent(this, FragmentActivity::class.java)
            startActivity(intent)
        }

        binding.btnViewPager.setOnClickListener {
            val intent = Intent(this, ViewPagerActivity::class.java)
            startActivity(intent)
        }

        binding.btnDrawerLayout.setOnClickListener {
            val intent = Intent(this, DrawerActivity::class.java)
            startActivity(intent)
        }

        binding.btnJetpack.setOnClickListener {
            val intent = Intent(this, JetpackActivity::class.java)
            startActivity(intent)
        }
    }


}