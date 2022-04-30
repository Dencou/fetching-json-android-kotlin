package com.example.fetchingjson

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.fetchingjson.databinding.ItemDogBinding
import com.squareup.picasso.Picasso

class DogHolder(view:View):RecyclerView.ViewHolder(view) {

    private val binding = ItemDogBinding.bind(view)

    fun bind(images:String){
        Picasso.get().load(images).into(binding.image)
    }

}