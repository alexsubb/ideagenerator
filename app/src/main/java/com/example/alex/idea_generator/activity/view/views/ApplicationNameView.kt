package com.example.alex.idea_generator.activity.view.views

import android.content.Context
import android.graphics.Color
import android.view.Gravity
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.example.alex.idea_generator.R

class ApplicationNameView(context: Context): LinearLayout(context) {

    private val titleTextView = TextView(context).apply {

        text = context.getText(R.string.app_name)
        textSize = 40f
        gravity = Gravity.CENTER_HORIZONTAL
        setTextColor(Color.YELLOW)
    }

    private val LampImageView = ImageView(context).apply {
        setImageDrawable(context.resources.getDrawable(R.drawable.ic_change_style))
        setPadding(30,0,0,0)
    }


    init {
        orientation = HORIZONTAL
        addView(titleTextView)
        addView(LampImageView)
    }
}