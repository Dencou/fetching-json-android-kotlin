package com.example.fetchingjson

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class DogAdapter(private val images:List<String>): RecyclerView.Adapter<DogHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return DogHolder(layoutInflater.inflate(R.layout.item_dog , parent,false))
    }

    override fun onBindViewHolder(holder: DogHolder, position: Int) {
        val item = images[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int = images.size

}