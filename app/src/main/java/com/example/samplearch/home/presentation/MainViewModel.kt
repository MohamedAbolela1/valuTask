package com.example.samplearch.home.presentation

import androidx.lifecycle.*
import com.example.samplearch.base.BaseViewModel
import com.example.samplearch.home.data.model.ProductResponse
import com.example.samplearch.home.data.repository.ProductRepository
import com.example.samplearch.home.domain.mapper.toProductList
import com.example.samplearch.home.domain.model.Product
import com.example.samplearch.model.ErrorTypes
import com.example.samplearch.model.LoadingTypes
import com.example.samplearch.model.ViewState
import com.example.samplearch.utils.ui.SingleLiveEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor(
    private val productRepository: ProductRepository
) : BaseViewModel() {
    private val _productListState =
        MutableLiveData<ViewState<MutableList<Product>>>()
    val productListState: LiveData<ViewState<MutableList<Product>>> =
        _productListState

    private val _shouldClearPreviousList = SingleLiveEvent<Boolean>()
    val shouldClearPreviousList: LiveData<Boolean> = _shouldClearPreviousList

    init {
        getProductsServicesList()
    }

    fun refreshServicesList() {
        viewModelScope.launch {
            emitLoadingState(LoadingTypes.RefreshLoading(true))
            val productState = executeProductsListState()
            if (productState is ViewState.Success)
                clearPreviousData()
            emitProductListSate(productState)
            emitLoadingState(LoadingTypes.RefreshLoading(false))
        }
    }

    private fun clearPreviousData() {
        _shouldClearPreviousList.value = true
    }

    fun reloadServicesList() {
        getProductsServicesList()
    }

    private fun getProductsServicesList() {
        viewModelScope.launch {
            emitLoadingState(LoadingTypes.MainLoading(true))
            val productState = executeProductsListState()
            if (productState is ViewState.Success)
                clearPreviousData()
            emitProductListSate(productState)
            emitLoadingState(LoadingTypes.MainLoading(false))
        }
    }



    private suspend fun executeProductsListState(): ViewState<MutableList<Product>> {
        val customizedServicesListState =
            validateResponse { productRepository.getProductsList() }
        return mapProductListState(customizedServicesListState)
    }

    private fun mapProductListState(state: ViewState<MutableList<ProductResponse>>): ViewState<MutableList<Product>> {
        return when (state) {
            is ViewState.Valid -> onProductListValid(state.data)
            is ViewState.Error -> state
            else -> ViewState.Idle
        }
    }

    private fun onProductListValid(data: MutableList<ProductResponse>?): ViewState<MutableList<Product>> {
        return if (data.isNullOrEmpty()) {
            ViewState.Error(ErrorTypes.NoData())
        } else {
            ViewState.Success(data.toProductList())
        }
    }

    private fun emitProductListSate(productListState: ViewState<MutableList<Product>>) {
        _productListState.value = productListState
    }

}
