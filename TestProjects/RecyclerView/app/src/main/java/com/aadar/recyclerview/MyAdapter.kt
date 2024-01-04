package com.aadar.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val items : List<MyData>): RecyclerView.Adapter<MyAdapter.ViewHolder>(){
    class ViewHolder (view: View): RecyclerView.ViewHolder(view){
        val image : ImageView = view.findViewById(R.id.img)
        val text1 : TextView = view.findViewById(R.id.textView)
        val text2 : TextView = view.findViewById(R.id.textView2)
        val text3 : TextView = view.findViewById(R.id.textView3)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.ViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyAdapter.ViewHolder, position: Int) {
        val  item = items[position]
        holder.image.setImageResource(item.image)
        holder.text1.text = item.text1
        holder.text2.text = item.text2
        holder.text3.text = item.text3
    }

    override fun getItemCount(): Int {
        return items.size
    }
}