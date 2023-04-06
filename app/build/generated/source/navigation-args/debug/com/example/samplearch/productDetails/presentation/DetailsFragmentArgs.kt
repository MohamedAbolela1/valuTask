package com.example.samplearch.productDetails.presentation

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.example.samplearch.home.domain.model.Product
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class DetailsFragmentArgs(
  public val productItem: Product
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(Product::class.java)) {
      result.putParcelable("productItem", this.productItem as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Product::class.java)) {
      result.putSerializable("productItem", this.productItem as Serializable)
    } else {
      throw UnsupportedOperationException(Product::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(Product::class.java)) {
      result.set("productItem", this.productItem as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Product::class.java)) {
      result.set("productItem", this.productItem as Serializable)
    } else {
      throw UnsupportedOperationException(Product::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("DEPRECATION")
    public fun fromBundle(bundle: Bundle): DetailsFragmentArgs {
      bundle.setClassLoader(DetailsFragmentArgs::class.java.classLoader)
      val __productItem : Product?
      if (bundle.containsKey("productItem")) {
        if (Parcelable::class.java.isAssignableFrom(Product::class.java) ||
            Serializable::class.java.isAssignableFrom(Product::class.java)) {
          __productItem = bundle.get("productItem") as Product?
        } else {
          throw UnsupportedOperationException(Product::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__productItem == null) {
          throw IllegalArgumentException("Argument \"productItem\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"productItem\" is missing and does not have an android:defaultValue")
      }
      return DetailsFragmentArgs(__productItem)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): DetailsFragmentArgs {
      val __productItem : Product?
      if (savedStateHandle.contains("productItem")) {
        if (Parcelable::class.java.isAssignableFrom(Product::class.java) ||
            Serializable::class.java.isAssignableFrom(Product::class.java)) {
          __productItem = savedStateHandle.get<Product?>("productItem")
        } else {
          throw UnsupportedOperationException(Product::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__productItem == null) {
          throw IllegalArgumentException("Argument \"productItem\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"productItem\" is missing and does not have an android:defaultValue")
      }
      return DetailsFragmentArgs(__productItem)
    }
  }
}
