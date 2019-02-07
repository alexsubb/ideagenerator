package com.example.alex.idea_generator.service.ideashelp

import android.annotation.SuppressLint
import java.text.SimpleDateFormat
import java.util.*

object DateTime {

    @SuppressLint("SimpleDateFormat")
    fun getNowDate():String{

        return SimpleDateFormat("dd.MM.yyyy").format(Date())
    }

    @SuppressLint("SimpleDateFormat")
    fun getNowTime():String{

        return SimpleDateFormat("HH:mm:ss").format(Date())
    }

    @SuppressLint("SimpleDateFormat")
    fun getNowTimeDate():String{

        return SimpleDateFormat("HH:mm:ss dd.MM.yyyy").format(Date())
    }

    @SuppressLint("SimpleDateFormat")
    fun getNowHourMin():String{

        return SimpleDateFormat("HH:mm").format(Date())
    }
}