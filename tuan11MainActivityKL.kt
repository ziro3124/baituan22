package com.example.myapplication.tuan1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.myapplication.R

class tuan11MainActivityKL : AppCompatActivity() {
    //khai bao
    var txt1:EditText? = null
    var txt2:EditText? = null
    var btn1:Button? = null
    var tv1:TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan11_main)
        //anh xa
        txt1=findViewById(R.id.text1)
        txt2=findViewById(R.id.text2)
        btn1=findViewById(R.id.button)
        tv1=findViewById(R.id.textView1)
        //xu ly
        btn1!!.setOnClickListener(View.OnClickListener {
            tinhtong()
        })
    }

    private fun tinhtong() {

        val str1=txt1!!.text.toString()
        val so1=str1.toFloat()
        val str2= txt2!!.text.toString()
        val so2=str2.toFloat()
        val tong=so1+so2
        tv1!!.text=tong.toString()
    }
}
