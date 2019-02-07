package com.example.alex.idea_generator.activity.view.utils

import android.content.Context
import android.graphics.Point
import android.view.WindowManager

object ScreedSizeAttitute {

    private val ATTITUDE_BY_WIDTH = 1 / 720f
    private val ATTITUDE_BY_HEIGHT = 1 / 1280f

    private fun getPoint(context: Context): Point {

        val wm = context.getSystemService(Context.WINDOW_SERVICE) as WindowManager
        val display = wm.defaultDisplay
        val size = Point()
        display.getSize(size)
        return size
    }

    private fun getX(context: Context):Int{

        return getPoint(context).x
    }

    private fun getY(context: Context):Int{

        return getPoint(context).y
    }

    fun getWidth(context: Context, width: Int):Float{

        return (width* getX(context)* ATTITUDE_BY_WIDTH)
    }

    fun getHeight(context: Context, height: Int):Float{

        return (height* getY(context) * ATTITUDE_BY_HEIGHT)
    }
}