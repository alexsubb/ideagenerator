package com.example.alex.idea_generator.activity.view.views.idea

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Point
import android.view.Gravity
import android.view.WindowManager
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.LinearLayout.VERTICAL
import android.widget.TextView
import com.example.alex.idea_generator.activity.view.utils.ScreedSizeAttitute

@Suppress("NAME_SHADOWING")
class IdeaRectLayout(context: Context, ideaRectView: IdeaRectView):FrameLayout(context){

    private val ATTITUDE_BY_WIDTH = 1 / 720f
    private val ATTITUDE_BY_HEIGHT = 1 / 1280f

    private val titleTextView = TextView(context).apply {

        text = ideaRectView.title
        textSize = 25f
        gravity = Gravity.CENTER_HORIZONTAL
    }

    @SuppressLint("SetTextI18n")
    private val subtitleTextView = TextView(context).apply {

        text = if(ideaRectView.subtitle.length <=155){
            ideaRectView.subtitle
        } else {
            ideaRectView.subtitle.substring(0,155) + " ..."
        }
        textSize = 18f
        gravity = Gravity.LEFT
        setPadding(30,0,0,0)
    }

    private val titleSubtitleLayout = LinearLayout(context).apply {
        orientation = VERTICAL
        gravity = Gravity.CENTER_HORIZONTAL
        addView(titleTextView)
        addView(subtitleTextView)
    }

    init {
        addView(ideaRectView)
        addView(titleSubtitleLayout)
    }

    @SuppressLint("DrawAllocation")
    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {

        val width = ScreedSizeAttitute.getWidth(context,690)
        val height = ScreedSizeAttitute.getHeight(context,300)
        val widthMeasureSpec = MeasureSpec.makeMeasureSpec(width.toInt(), MeasureSpec.EXACTLY)
        val heightMeasureSpec = MeasureSpec.makeMeasureSpec(height.toInt(), MeasureSpec.EXACTLY)
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
    }
}