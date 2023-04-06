package com.example.samplearch.home.presentation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.samplearch.base.BaseAdapter
import com.example.samplearch.base.BaseViewHolder
import com.example.samplearch.databinding.ItemProductBinding
import com.example.samplearch.home.domain.model.Product
import com.example.samplearch.utils.ui.LoadImage


class ProductsAdapter(
    private val onProductItemClicked: (item: Product) -> Unit
) : BaseAdapter<Product>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BaseViewHolder<Product> {
        val binding =
            ItemProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FestivalViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BaseViewHolder<Product>, position: Int) {
        holder.onBind(data[position])
    }

    override fun getItemCount(): Int = data.size

    inner class FestivalViewHolder(private val binding: ItemProductBinding) :
        BaseViewHolder<Product>(binding.root) {
        override fun onBind(item: Product) {
            binding.root.setOnClickListener { onProductItemClicked(item) }
            val context = binding.root.context
            binding.tvTitle.text = item.title
            LoadImage.loadFestivalImage(context, item.image, binding.imgProduct)
            binding.tvPrice.text = item.price.toString()

        }
    }
}