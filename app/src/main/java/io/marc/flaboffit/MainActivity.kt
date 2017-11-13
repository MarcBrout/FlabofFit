package io.marc.flaboffit

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {
    companion object {
        val TASK_LIFT = "Weight Lifting"
        val TASK_YOGA = "Yoga"
        val TASK_CARDIO = "Cardio"
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
    }

    private fun taskChosen(task: String) {
        val intent = Intent(this, TaskActivity::class.java)
        intent.putExtra("task", task)
        startActivity(intent)
    }
}
