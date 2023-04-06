package com.example.samplearch.home.presentation

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.example.samplearch.R
import com.example.samplearch.home.domain.model.Product
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class HomeFragmentDirections private constructor() {
  private data class ActionFragmentHomeToFragmentDetails(
    public val productItem: Product
  ) : NavDirections {
    public override val actionId: Int = R.id.action_fragmentHome_to_fragmentDetails

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
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
  }

  public companion object {
    public fun actionFragmentHomeToFragmentDetails(productItem: Product): NavDirections =
        ActionFragmentHomeToFragmentDetails(productItem)
  }
}
