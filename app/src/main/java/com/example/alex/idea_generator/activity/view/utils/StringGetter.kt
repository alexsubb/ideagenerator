package com.example.alex.idea_generator.activity.view.utils

import android.content.Context

class StringGetter (private val resId: Int) {

    private var string: String? = null

    constructor(string: String? = "") : this(0) {
        this.string = string ?: ""
    }

    constructor(charSequence: CharSequence?) : this(charSequence as? String)

    fun get(context: Context): String {
        var res = string
        if (res == null) {
            res = context.getString(resId)!!
            string = res
        }
        return res
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StringGetter) return false

        if (string != null && other.string != null && string != other.string) return false
        if (string != null && string == other.string) return true
        if (resId == other.resId) return true

        return false
    }

    override fun hashCode(): Int {
        var result = resId
        result = 31 * result + (string?.hashCode() ?: 0)
        return result
    }


}