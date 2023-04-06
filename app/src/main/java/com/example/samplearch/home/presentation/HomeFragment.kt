package com.example.samplearch.home.presentation


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.samplearch.base.BaseFragment
import com.example.samplearch.base.ErrorBinding
import com.example.samplearch.databinding.FragmentHomeBinding
import com.example.samplearch.databinding.LayoutMainErrorBinding
import com.example.samplearch.home.domain.model.Product
import com.example.samplearch.home.presentation.adapter.ProductsAdapter
import com.example.samplearch.model.ErrorTypes
import com.example.samplearch.model.LoadingTypes
import com.example.samplearch.model.ViewState


class HomeFragment : BaseFragment<FragmentHomeBinding>() , ErrorBinding {
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentHomeBinding
        get() = FragmentHomeBinding ::inflate

    override val errorLayoutBinding: LayoutMainErrorBinding
        get() = binding.layoutError

    private val mainViewModel by activityViewModels<MainViewModel>()
    private lateinit var productsAdapter: ProductsAdapter

    override fun setup() {
        setListeners()
        setupRecyclerView()
        observeViewModels()
    }

    private fun setListeners() {
        binding.swipeRefresh.setOnRefreshListener {
            mainViewModel.refreshServicesList()
        }
    }

    private fun setupRecyclerView() {
        productsAdapter = ProductsAdapter(::onProductItemClicked)
        with(binding.rvProducts) {
            adapter = productsAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }
    }

    private fun onProductItemClicked(product: Product) {
        navigateTo(HomeFragmentDirections.actionFragmentHomeToFragmentDetails(product))
    }

    private fun observeViewModels() {
        with(mainViewModel) {
            loadingStateLiveData.observe(viewLifecycleOwner, ::bindLoadingState)
            shouldClearPreviousList.observe(viewLifecycleOwner, ::bindAdapterState)
            productListState.observe(viewLifecycleOwner, ::bindProductsListState)
        }
    }

    private fun bindAdapterState(shouldClearAdapter: Boolean) {
        if (shouldClearAdapter)
            productsAdapter.clearData()
    }

    private fun bindProductsListState(state: ViewState<MutableList<Product>>) {
        when (state) {
            is ViewState.Success -> onProductsSuccess(state.data)
            is ViewState.Error -> onViewStateError(state.errorTypes)
            else -> {
            }
        }
    }

    private fun onProductsSuccess(productsList: MutableList<Product>) {
        productsAdapter.addAll(productsList)
        bindSuccess(binding.layoutProducts)
    }

    private fun onViewStateError(errorTypes: ErrorTypes) {
        bindError(requireContext(), errorTypes, true, binding.layoutProducts) {
            mainViewModel.reloadServicesList()
        }
    }

    private fun bindLoadingState(loadingTypes: LoadingTypes) {
        with(binding) {
            bindLoading(loadingTypes, progressMain, progressHover, progressPaging, swipeRefresh)
        }
    }
}