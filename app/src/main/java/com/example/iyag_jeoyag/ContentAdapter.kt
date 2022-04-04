package com.example.iyag_jeoyag

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ContentAdapter(val items: ArrayList<Content>, val context: Context): BaseAdapter() {
    override fun getCount(): Int {
        return items.size
    }

    override fun getItem(position: Int): Any {
        return items[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view:View = LayoutInflater.from(context).inflate(R.layout.activity_content_layout, null)

        val medicine_name = view.findViewById<TextView>(R.id.medicine_name)

        val content = items[position]

        medicine_name.text = content.name

        return view
    }

}