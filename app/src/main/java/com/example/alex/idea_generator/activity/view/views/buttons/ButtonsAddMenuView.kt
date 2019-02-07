package com.example.alex.idea_generator.activity.view.views.buttons

import android.content.Context
import android.graphics.Canvas
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import com.example.alex.idea_generator.R
import com.example.alex.idea_generator.activity.view.utils.ScreedSizeAttitute

class ButtonsAddMenuView(context: Context) : LinearLayout(context) {

    private val changeColorImage = ImageView(context).apply {
        setImageDrawable(context.resources.getDrawable(R.drawable.ic_change_idea_color))
       setPadding(-50,0,-50,0)
        setOnClickListener {
            Toast.makeText(context,"Кнопка изменения",Toast.LENGTH_SHORT).show()
        }
    }

    private val addImage = ImageView(context).apply {
        setImageDrawable(context.resources.getDrawable(R.drawable.ic_add_idea))
        setPadding(-50,0,-50,0)
        setOnClickListener {
            Toast.makeText(context,"Кнопка добавления",Toast.LENGTH_SHORT).show()
        }
    }

    private val clearImage = ImageView(context).apply {
        setImageDrawable(context.resources.getDrawable(R.drawable.ic_clear_idea_add_view))
        setPadding(-50,0,-50,0)
        setOnClickListener {
            Toast.makeText(context,"Кнопка очистки",Toast.LENGTH_SHORT).show()
        }
    }

    init {

        orientation = HORIZONTAL
        addView(changeColorImage)
        addView(addImage)
        addView(clearImage)
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val width = ScreedSizeAttitute.getWidth(context, 400)
        val height = ScreedSizeAttitute.getHeight(context, 100)
        val widthMeasureSpec = MeasureSpec.makeMeasureSpec(width.toInt(), MeasureSpec.EXACTLY)
        val heightMeasureSpec = MeasureSpec.makeMeasureSpec(height.toInt(), MeasureSpec.EXACTLY)
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
    }

}