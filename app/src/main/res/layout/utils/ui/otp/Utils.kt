package com.khabeer.tamshia_user.utils.ui.otp

import android.content.Context
import android.util.TypedValue

object Utils {
    internal fun getPixels(context: Context, valueInDp: Int): Int {
        val r = context.resources
        val px = TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP,
            valueInDp.toFloat(),
            r.displayMetrics
        )
        return px.toInt()
    }

    internal fun getPixels(context: Context, valueInDp: Float): Int {
        val r = context.resources
        val px = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, valueInDp, r.displayMetrics)
        return px.toInt()
    }
}