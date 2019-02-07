package com.example.alex.idea_generator.activity.view.views.find

import android.content.Context
import android.view.Gravity
import android.widget.*
import com.example.alex.idea_generator.R
import com.example.alex.idea_generator.activity.view.utils.ScreedSizeAttitute

class FindIdeaRectLayout(context: Context) : FrameLayout(context) {

    private val findImageView = ImageView(context).apply {
        setImageDrawable(context.resources.getDrawable(R.drawable.ic_find_idea))
        setPadding(ScreedSizeAttitute.getWidth(context,7).toInt(),
            ScreedSizeAttitute.getHeight(context,11).toInt(),
            ScreedSizeAttitute.getWidth(context,7).toInt(),
            ScreedSizeAttitute.getHeight(context,11).toInt())
    }

    private val titleTextView = EditText(context).apply {

        textSize = 25f
        hint = "Поиск Идей ...."
        gravity = Gravity.CENTER_HORIZONTAL
        setPadding(0,30,0,10)
    }

    private val textImageLayout = LinearLayout(context).apply {
        orientation = LinearLayout.HORIZONTAL
        gravity = Gravity.LEFT
        addView(findImageView)
        addView(titleTextView)
    }

    init {
        addView(FindIdeaRectView(context))
        addView(textImageLayout)
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val width = ScreedSizeAttitute.getWidth(context, 690)
        val height = ScreedSizeAttitute.getHeight(context, 90)
        val widthMeasureSpec = MeasureSpec.makeMeasureSpec(width.toInt(), MeasureSpec.EXACTLY)
        val heightMeasureSpec = MeasureSpec.makeMeasureSpec(height.toInt(), MeasureSpec.EXACTLY)
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
    }
}