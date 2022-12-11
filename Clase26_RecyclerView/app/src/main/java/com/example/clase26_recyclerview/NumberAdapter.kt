package com.example.clase26_recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.clase26_recyclerview.databinding.ItemNumberBinding

class NumberAdapter(private val numberList : List<Int>) : RecyclerView.Adapter<NumberAdapter.ViewHolder>() {


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private val binding = ItemNumberBinding.bind(itemView)
        fun bind(item:Int) {
            binding.tvItemNumber.text = item.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_number,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(numberList[position])
    }

    override fun getItemCount() = numberList.size
}
