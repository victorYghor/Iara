package com.iara.home

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.iara.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var b: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityHomeBinding.inflate(layoutInflater)
        val view: View = b.root
        setContentView(view)
    }
}