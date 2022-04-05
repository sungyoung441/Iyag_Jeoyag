package com.example.iyag_jeoyag

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    lateinit var ContentAdapter: ContentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val main_list = findViewById<ListView>(R.id.main_list)

        val arrContent = arrayListOf<Content>()

        ContentAdapter = ContentAdapter(arrContent, this)
        main_list.adapter = ContentAdapter

    }
}