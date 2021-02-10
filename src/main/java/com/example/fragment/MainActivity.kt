package com.example.fragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val welcomeFragment=WelcomeFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.myFrame, welcomeFragment)
            commit()
        }
    }
}