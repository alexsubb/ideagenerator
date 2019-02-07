package com.example.alex.idea_generator.activity

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.LinearLayout
import com.example.alex.idea_generator.activity.view.views.idea.IdeaRectView
import android.view.Window
import android.view.WindowManager
import com.example.alex.idea_generator.activity.view.views.ApplicationNameView
import com.example.alex.idea_generator.activity.view.views.buttons.ButtonsAddMenuView
import com.example.alex.idea_generator.activity.view.views.find.FindIdeaRectLayout
import com.example.alex.idea_generator.activity.view.views.find.FindIdeaRectView
import com.example.alex.idea_generator.activity.view.views.idea.IdeaRectLayout
import com.example.alex.idea_generator.service.database.DatabaseHandler


class AppActivity : AppCompatActivity() {

    val dataBase = DatabaseHandler(this)

    val activityView: LinearLayout by lazy {
        object : LinearLayout(this) {
            init {
                fitsSystemWindows = true
                orientation = VERTICAL
                setBackgroundColor(Color.parseColor("#21212D"))
                addView(ApplicationNameView(context).apply {
                    gravity = Gravity.CENTER_HORIZONTAL
                })
                addView(FindIdeaRectLayout(context)).apply {
                    gravity = Gravity.CENTER_HORIZONTAL
                }
                addView(ButtonsAddMenuView(context))
                /*addView(
                    IdeaRectLayout(
                        context, IdeaRectView(
                            context = context,
                            title = "Создать игру",
                            subtitle = "Для начала сделать дизайн документ, в котором нужно описать все детали игры, чтобы не придумывать на ходу и после этого можно сразу начать делать вашу игру и зарабатывать на этом деньги",
                            colors = Color.parseColor("#91213e")
                        )
                    ).apply {
                    gravity = Gravity.CENTER_HORIZONTAL
                }
                )

                addView(
                    IdeaRectLayout(
                        context, IdeaRectView(
                            context = context,
                            title = "Создать игру",
                            subtitle = "Для начала сделать дизайн документ, в котором нужно описать все детали игры, чтобы не придумывать на ходу и после этого можно сразу начать делать вашу игру и зарабатывать на этом деньги",
                            colors = Color.parseColor("#F9cc10")
                        )
                    ).apply {
                        gravity = Gravity.CENTER_HORIZONTAL
                    }

                )*/

            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        this.window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(activityView)
    }
}


