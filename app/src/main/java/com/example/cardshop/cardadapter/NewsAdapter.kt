package com.example.cardshop.cardadapter
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cardshop.R
import com.example.cardshop.data.model.News
import com.example.cardshop.data.model.Popular
import com.example.cardshop.databinding.NewsListBinding
import com.example.cardshop.databinding.PopularListBinding

class NewsAdapter(
    private val context: Context,
    private val dataset: List<News>
) : RecyclerView.Adapter<NewsAdapter.ItemViewHolder>() {

    class ItemViewHolder(val binding: NewsListBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {

        val binding = NewsListBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        val item = dataset[position]

        holder.binding.newsImage.setImageResource(item.imageResource)





    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}
