package io.marc.flaboffit

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_settings.*

class SettingsActivity : Activity() {

    private fun setBgColor() {
        when (MainActivity.NIGHTMODE)
        {
            true -> settingsBackgound.setBackgroundColor(0xFF848484.toInt())
            false -> settingsBackgound.setBackgroundColor(0xFF000000.toInt())
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        settingsBackBtn.setOnClickListener { v ->
            startActivity(Intent(this, MainActivity::class.java))
        }

        settingsNightModeButton.setOnClickListener { v ->
            MainActivity.NIGHTMODE = !MainActivity.NIGHTMODE
            setBgColor()
        }

        setBgColor()
    }
}
