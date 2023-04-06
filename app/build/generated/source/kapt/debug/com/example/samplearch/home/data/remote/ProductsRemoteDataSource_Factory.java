// Generated by Dagger (https://dagger.dev).
package com.example.samplearch.home.data.remote;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ProductsRemoteDataSource_Factory implements Factory<ProductsRemoteDataSource> {
  private final Provider<ProductsApiService> productsApiServiceProvider;

  public ProductsRemoteDataSource_Factory(Provider<ProductsApiService> productsApiServiceProvider) {
    this.productsApiServiceProvider = productsApiServiceProvider;
  }

  @Override
  public ProductsRemoteDataSource get() {
    return newInstance(productsApiServiceProvider.get());
  }

  public static ProductsRemoteDataSource_Factory create(
      Provider<ProductsApiService> productsApiServiceProvider) {
    return new ProductsRemoteDataSource_Factory(productsApiServiceProvider);
  }

  public static ProductsRemoteDataSource newInstance(ProductsApiService productsApiService) {
    return new ProductsRemoteDataSource(productsApiService);
  }
}
