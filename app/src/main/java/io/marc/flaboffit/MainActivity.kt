package io.marc.flaboffit

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_settings.*

class MainActivity : Activity() {
    companion object {
        var NIGHTMODE = false
        val PARAM_TASK = "task"
        val TASK_LIFT = "Weight Lifting"
        val TASK_YOGA = "Yoga"
        val TASK_CARDIO = "Cardio"
    }

    private fun setBgColor() {
        when (MainActivity.NIGHTMODE)
        {
            true -> mainBg.setBackgroundColor(0xFF848484.toInt())
            false -> mainBg.setBackgroundColor(0xFF000000.toInt())
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        weightLayout.setOnClickListener { v ->
            taskChosen(TASK_LIFT)
        }
        yogaLayout.setOnClickListener { v ->
            taskChosen(TASK_YOGA)
        }
        cardioLayout.setOnClickListener { v ->
            taskChosen(TASK_CARDIO)
        }
        mainSettingsButton.setOnClickListener { v ->
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }
        setBgColor()
    }

    private fun taskChosen(task: String) {
        val intent = Intent(this, TaskActivity::class.java)
        intent.putExtra(PARAM_TASK, task)
        startActivity(intent)
    }
}
