package com.aadar.recyclerview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView : RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val items = listOf(
            MyData(R.drawable.ic_launcher_foreground, text1 = "TEXT1", text2 = "Text1", text3 = "text1"),
            MyData(R.drawable.ic_launcher_foreground, text1 = "TEXT1", text2 = "Text1", text3 = "text1"),
            MyData(R.drawable.ic_launcher_foreground, text1 = "TEXT1", text2 = "Text1", text3 = "text1"),
            MyData(R.drawable.ic_launcher_foreground, text1 = "TEXT1", text2 = "Text1", text3 = "text1"),
            MyData(R.drawable.ic_launcher_foreground, text1 = "TEXT1", text2 = "Text1", text3 = "text1"),
            MyData(R.drawable.ic_launcher_foreground, text1 = "TEXT1", text2 = "Text1", text3 = "text1"),
            MyData(R.drawable.ic_launcher_foreground, text1 = "TEXT1", text2 = "Text1", text3 = "text1"),
            MyData(R.drawable.ic_launcher_foreground, text1 = "TEXT1", text2 = "Text1", text3 = "text1"),
            MyData(R.drawable.ic_launcher_foreground, text1 = "TEXT1", text2 = "Text1", text3 = "text1"),
            MyData(R.drawable.ic_launcher_foreground, text1 = "TEXT1", text2 = "Text1", text3 = "text1"),
            MyData(R.drawable.ic_launcher_foreground, text1 = "TEXT1", text2 = "Text1", text3 = "text1"),
            MyData(R.drawable.ic_launcher_foreground, text1 = "TEXT1", text2 = "Text1", text3 = "text1"),
            MyData(R.drawable.ic_launcher_foreground, text1 = "TEXT1", text2 = "Text1", text3 = "text1"),
            MyData(R.drawable.ic_launcher_foreground, text1 = "TEXT1", text2 = "Text1", text3 = "text1"),
            MyData(R.drawable.ic_launcher_foreground, text1 = "TEXT1", text2 = "Text1", text3 = "text1"),
            MyData(R.drawable.ic_launcher_foreground, text1 = "TEXT1", text2 = "Text1", text3 = "text1"),
            MyData(R.drawable.ic_launcher_foreground, text1 = "TEXT1", text2 = "Text1", text3 = "text1"),
            MyData(R.drawable.ic_launcher_foreground, text1 = "TEXT1", text2 = "Text1", text3 = "text1"),
            MyData(R.drawable.ic_launcher_foreground, text1 = "TEXT1", text2 = "Text1", text3 = "text1"),
            MyData(R.drawable.ic_launcher_foreground, text1 = "TEXT1", text2 = "Text1", text3 = "text1"),

        )

        val adapter = MyAdapter(items)
        recyclerView.adapter = adapter


    }
}