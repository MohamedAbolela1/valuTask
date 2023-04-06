// Generated by Dagger (https://dagger.dev).
package com.example.samplearch.home.data.repository;

import com.example.samplearch.home.data.remote.ProductsRemoteDataSource;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ProductRepository_Factory implements Factory<ProductRepository> {
  private final Provider<ProductsRemoteDataSource> productsRemoteDataSourceProvider;

  public ProductRepository_Factory(
      Provider<ProductsRemoteDataSource> productsRemoteDataSourceProvider) {
    this.productsRemoteDataSourceProvider = productsRemoteDataSourceProvider;
  }

  @Override
  public ProductRepository get() {
    return newInstance(productsRemoteDataSourceProvider.get());
  }

  public static ProductRepository_Factory create(
      Provider<ProductsRemoteDataSource> productsRemoteDataSourceProvider) {
    return new ProductRepository_Factory(productsRemoteDataSourceProvider);
  }

  public static ProductRepository newInstance(ProductsRemoteDataSource productsRemoteDataSource) {
    return new ProductRepository(productsRemoteDataSource);
  }
}