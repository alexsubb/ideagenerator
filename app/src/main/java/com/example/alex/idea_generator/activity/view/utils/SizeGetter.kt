package com.example.alex.idea_generator.activity.view.utils

import android.content.Context

class SizeGetter private constructor(val sizeDp: Float, val sizePx: Float?) {

    constructor(sizeDp: Float) : this(sizeDp, null)

    constructor(sizeDp: Int) : this(sizeDp.toFloat())

    constructor(sizeDp: Double) : this(sizeDp.toFloat())

    companion object {

        val ZERO = SizeGetter(0)


        fun forPx(px: Float) = SizeGetter(0f, px)

        fun forPx(px: Int) = forPx(px.toFloat())

        fun forPx(px: Double) = forPx(px.toFloat())

    }

    private var value: Float? = sizePx

    fun get(context: Context): Float {
        var value = this.value
        if (value == null) {
            value = ViewUtils.dpToPx(sizeDp, context)
            this.value = value
        }
        return value
    }

    fun getInt(context: Context) = get(context).toInt()

    operator fun plus(other: SizeGetter) = SizeGetter(sizeDp + other.sizeDp)

    operator fun minus(other: SizeGetter) = SizeGetter(sizeDp - other.sizeDp)

    operator fun div(value: Float) = SizeGetter(sizeDp / value)

    operator fun div(value: Int) = SizeGetter(sizeDp / value)

    operator fun times(value: Float) = SizeGetter(sizeDp * value)

    operator fun times(value: Int) = SizeGetter(sizeDp * value)

}