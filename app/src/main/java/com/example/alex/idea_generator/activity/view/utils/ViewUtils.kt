package com.example.alex.idea_generator.activity.view.utils

import android.content.Context
import android.graphics.Color
import android.util.DisplayMetrics

object ViewUtils {

    private var pxDpK: Float? = null

    private fun getPxDpK(context: Context?): Float? {
        var pxDpK = this.pxDpK
        if (pxDpK == null) {
            context ?: return 0f
            val densityDpi = context.resources?.displayMetrics?.densityDpi?.toFloat() ?: return 0f
            pxDpK = DisplayMetrics.DENSITY_DEFAULT / densityDpi
            this.pxDpK = pxDpK
        }
        return pxDpK
    }

    fun setColorAlpha(color: Int, alpha: Float) =
        Color.argb((Color.alpha(color) * alpha).toInt(), Color.red(color), Color.green(color), Color.blue(color))

    fun pxToDp(px: Float, context: Context?): Float {
        val pxDpK = getPxDpK(context) ?: return 0f
        return px * pxDpK
    }

    fun dpToPx(dp: Float, context: Context?): Float {
        val pxDpK = getPxDpK(context) ?: return 0f
        return dp / pxDpK
    }

}
