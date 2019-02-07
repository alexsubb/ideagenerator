package com.example.alex.idea_generator.activity.view.views.find

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.view.View
import com.example.alex.idea_generator.activity.view.utils.ScreedSizeAttitute

class FindIdeaRectView(context: Context) : View(context) {

    val rectPaint = Paint().apply {
        color = Color.parseColor("#494959")
    }

    override fun onDraw(canvas: Canvas) {

        drawRoundRect(canvas)
        super.onDraw(canvas)
    }


    private fun drawRoundRect(canvas: Canvas) {
        val mainRect = RectF(1f, 10f, this.width - 1f, this.height - 10f)
        canvas.drawRoundRect(mainRect, 60f, 60f, rectPaint)

    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val width = ScreedSizeAttitute.getWidth(context,690)
        val height = ScreedSizeAttitute.getHeight(context,90)
        val widthMeasureSpec = MeasureSpec.makeMeasureSpec(width.toInt(), MeasureSpec.EXACTLY)
        val heightMeasureSpec = MeasureSpec.makeMeasureSpec(height.toInt(), MeasureSpec.EXACTLY)
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
    }

}