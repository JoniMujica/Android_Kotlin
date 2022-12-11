package com.example.clase26_retrofit2

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.clase26_retrofit2.databinding.ItemsDogsBinding
import com.squareup.picasso.Picasso

class DogViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val binding = ItemsDogsBinding.bind(view)

    fun bind(image:String){
        Picasso.get().load(image).into(binding.imgPerritos)
    }
}