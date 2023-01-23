package com.example.prework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val click_me = findViewById<Button>(R.id.button)

        click_me.setOnClickListener {
            // your code to perform when the user clicks on the button
            Toast.makeText( this, "You clicked me.", Toast.LENGTH_SHORT).show()
        }

    }


}