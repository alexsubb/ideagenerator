package com.example.alex.idea_generator.activity.view.views

import android.content.Context
import android.graphics.Point
import android.os.Parcel
import android.os.Parcelable
import android.view.WindowManager
import android.widget.LinearLayout

class BottomButtonsView(context: Context) : LinearLayout(context) {


    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {

        val wm = context.getSystemService(Context.WINDOW_SERVICE) as WindowManager
        val display = wm.defaultDisplay
        val size = Point()
        display.getSize(size)
        val width = size.x
        val height = 174*width/720f
        val widthMeasureSpec = MeasureSpec.makeMeasureSpec(width,MeasureSpec.EXACTLY)
        val heightMeasureSpec = MeasureSpec.makeMeasureSpec(height.toInt(),MeasureSpec.EXACTLY)
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
    }
}