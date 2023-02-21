
package org.techtown.kotlinandroid2.ch11_jetpack.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.techtown.kotlinandroid2.R

class FragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
    }
}