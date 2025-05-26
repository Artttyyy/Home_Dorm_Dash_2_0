package com.example.homedormdash

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        bottomNavigationView = findViewById(R.id.bottom_nav)

        bottomNavigationView.setOnItemSelectedListener { menuItem ->
            when(menuItem.itemId){
                R.id.home_button -> {
                    replaceFragment(HomeFragment())
                    true
                }
                R.id.map_button -> {
                    replaceFragment(MapFragment())
                    true
                }
                R.id.profile_button -> {
                    replaceFragment(ProfileFragment())
                    true
                }
                R.id.search_button -> {
                    replaceFragment(SearchFragment())
                    true
                }
                else -> false
            }
        }
        replaceFragment(HomeFragment())
    }
    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.frame_container, fragment).commit()
    }
}
