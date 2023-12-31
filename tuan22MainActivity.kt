package com.example.myapplication.tuan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.myapplication.R

class tuan22MainActivity : AppCompatActivity() {
    var lv:ListView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan22_main)
        lv = findViewById(R.id.tuan22lv)
        val arr = arrayOf("item1","item2","so3","item4","item5","so6","7")
        val adapter=ArrayAdapter(this,
            android.R.layout.activity_list_item,arr)
        lv!!.adapter = adapter

    }
}