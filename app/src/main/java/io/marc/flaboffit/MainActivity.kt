package io.marc.flaboffit

import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {
    enum class Task(val str: String) {
        LIFT("Weight Lift"),
        YOGA("Yoga"),
        CARDIO("Cardio")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        weightLayout.setOnClickListener { v ->
            taskChosen(Task.LIFT)
        }
        yogaLayout.setOnClickListener { v ->
            taskChosen(Task.YOGA)
        }
        cardioLayout.setOnClickListener { v ->
            taskChosen(Task.CARDIO)
        }
    }

    private fun taskChosen(task: Task) {
        
    }
}
