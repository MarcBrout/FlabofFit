package io.marc.flaboffit

import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_task.*

class TaskActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task)

        when (intent.getStringExtra(MainActivity.TASK)) {
            MainActivity.TASK_LIFT -> configureLift()
            MainActivity.TASK_YOGA -> configureYoga()
            MainActivity.TASK_CARDIO -> configureCardio()
        }
    }

    private fun configureCardio() {
        main_title.text = MainActivity.TASK_CARDIO
        main_background.background = resources.getDrawable(R.drawable.detail_cardio_bg, applicationContext.theme)
        main_logo.setImageDrawable(resources.getDrawable(R.drawable.heart, applicationContext.theme))
    }

    private fun configureLift() {
        main_title.text = MainActivity.TASK_LIFT
        main_background.background = resources.getDrawable(R.drawable.detail_weight_bg, applicationContext.theme)
        main_logo.setImageDrawable(resources.getDrawable(R.drawable.weight, applicationContext.theme))
    }

    private fun configureYoga() {
        main_title.text = MainActivity.TASK_YOGA
        main_background.background = resources.getDrawable(R.drawable.detail_yoga_bg, applicationContext.theme)
        main_logo.setImageDrawable(resources.getDrawable(R.drawable.lotus, applicationContext.theme))
    }
}
