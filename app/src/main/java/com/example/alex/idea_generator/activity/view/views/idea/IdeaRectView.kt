package com.example.alex.idea_generator.activity.view.views.idea

import android.content.Context
import android.graphics.*
import android.graphics.drawable.Drawable
import android.view.View
import android.view.WindowManager
import com.example.alex.idea_generator.R
import com.example.alex.idea_generator.activity.view.utils.ScreedSizeAttitute


class IdeaRectView(context: Context, var title: String, val subtitle: String, var colors: Int) : View(context) {

    val ATTITUDE_BY_WIDTH = 1 / 720f
    val ATTITUDE_BY_HEIGHT = 1 / 1280f
    val DRAWABLE_LEFT_ATTITUDE = 579 / 631f
    val DRAWABLE_RIGHT_ATTITUDE = 14 / 631f
    val DRAWABLE_TOP_ATTITUDE = 619 / 264f
    val DRAWABLE_BOTTOM_ATTITUDE = 54 / 264f

    val rectPaint = Paint().apply {
        color = colors
    }

    private val image: Drawable = context.resources.getDrawable(R.drawable.ic_clear_idea)

    init {
        setPadding(0, 15, 0, 15)
    }


    override fun onDraw(canvas: Canvas) {
        drawRoundRect(canvas)
        drawClearImage(canvas)
        super.onDraw(canvas)
    }

    private fun drawClearImage(canvas: Canvas) {
        val left = width * DRAWABLE_LEFT_ATTITUDE
        val right = width * DRAWABLE_RIGHT_ATTITUDE
        val top = height * DRAWABLE_TOP_ATTITUDE
        val bottom = height * DRAWABLE_BOTTOM_ATTITUDE
        image.setBounds(left.toInt(), top.toInt(), right.toInt(), bottom.toInt())
        image.draw(canvas)

    }

    private fun drawRoundRect(canvas: Canvas) {
        val mainRect = RectF(1f, 10f, this.width - 1f, this.height - 10f)
        canvas.drawRoundRect(mainRect, 60f, 60f, rectPaint)

    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val width = ScreedSizeAttitute.getWidth(context,690)
        val height = ScreedSizeAttitute.getHeight(context,300)
        val widthMeasureSpec = MeasureSpec.makeMeasureSpec(width.toInt(), MeasureSpec.EXACTLY)
        val heightMeasureSpec = MeasureSpec.makeMeasureSpec(height.toInt(), MeasureSpec.EXACTLY)
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
    }

}