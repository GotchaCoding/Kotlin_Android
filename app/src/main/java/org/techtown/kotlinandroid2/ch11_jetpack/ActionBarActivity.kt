package org.techtown.kotlinandroid2.ch11_jetpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.SearchView
import org.techtown.kotlinandroid2.R
import org.techtown.kotlinandroid2.databinding.ActivityAppcompatLibraryBinding
import org.techtown.kotlinandroid2.databinding.ActivityMainBinding

class ActionBarActivity : AppCompatActivity() {
    private val tag: String = "AppcompatActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        val binding = ActivityAppcompatLibraryBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_appcompat_library)
//        setSupportActionBar(binding.toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.menu_main, menu)


        val MenuItem1: MenuItem? = menu?.add(0, 0, 0, "menu1")
        val menuItem2: MenuItem? = menu?.add(0, 1, 0, "menu2")

        //서치뷰
        val menuItem = menu?.findItem(R.id.menu_search)
        val searchView = menuItem?.actionView as SearchView
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextChange(newText: String?): Boolean {
                //검색어 변경 이벤트
                return true
            }

            override fun onQueryTextSubmit(query: String?): Boolean {
                //키보드의 검색 버튼을 클릭한 순간의 이벤트
                return true
            }
        })
        return super.onCreateOptionsMenu(menu)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean = when (item.itemId) {
        0 -> {
            Log.d(tag, "menu1 click")
            true
        }
        1 -> {
            Log.d(tag, "menu2 click")
            true
        }
        else -> super.onOptionsItemSelected(item)
    }


}