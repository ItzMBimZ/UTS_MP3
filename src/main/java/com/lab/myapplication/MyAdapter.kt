package com.lab.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MyAdapter (private val data: ArrayList<AdditionalExercise>): RecyclerView.Adapter<ViewHolder>(){
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ViewHolder(inflater,parent)
    }

    override fun getItemCount(): Int {
        return data.size
    }
}