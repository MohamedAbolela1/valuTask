package com.example.samplearch.productDetails.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.samplearch.R
import com.example.samplearch.base.BaseFragment
import com.example.samplearch.databinding.FragmentDetailsBinding
import com.example.samplearch.home.domain.model.Product
import com.example.samplearch.utils.ui.LoadImage
import com.example.samplearch.utils.ui.getValidText


class DetailsFragment : BaseFragment<FragmentDetailsBinding>() {
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentDetailsBinding
        get() = FragmentDetailsBinding ::inflate

    private lateinit var product: Product
    private val args : DetailsFragmentArgs by navArgs()

    override fun setup() {
        setToolbar(
            mToolbar = binding.toolbarDetails.toolbar,
            navigationIconDrawable = R.drawable.ic_back
        )

        product = args.productItem
        bindData(product)
    }

    private fun bindData(product: Product) {
        with(binding){
            LoadImage.loadFestivalImage(requireContext(),product.image,imgProduct)
            tvTitle.text = product.title.getValidText()
            tvDescription.text = product.description
            tvPrice.text = "price : ${product.price}"
            tvRating.text = product.rate.toString()
        }
    }

}