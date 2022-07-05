package com.example.cardshop.cardadapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cardshop.R
import com.example.cardshop.data.model.Popular
import com.example.cardshop.databinding.PopularListBinding

class PopularAdapter(
    private val context: Context,
    private val dataset: List<Popular>
) : RecyclerView.Adapter<PopularAdapter.ItemViewHolder>() {

    class ItemViewHolder(val binding: PopularListBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {

        val binding = PopularListBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        val item = dataset[position]

        holder.binding.cardImage.setImageResource(item.imageResource)





    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}
