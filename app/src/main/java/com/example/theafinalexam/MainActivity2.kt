package com.example.theafinalexam

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    private var areOptionsVisible = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val button: Button = findViewById(R.id.button)
        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)

        button.setOnClickListener {
            if (areOptionsVisible) {
                button1.visibility = View.GONE
                button2.visibility = View.GONE
                button3.visibility = View.GONE
            } else {
                button1.visibility = View.VISIBLE
                button2.visibility = View.VISIBLE
                button3.visibility = View.VISIBLE
            }
            areOptionsVisible = !areOptionsVisible
        }

        button1.setOnClickListener {
            startActivity(Intent(this, MainActivity3::class.java))
        }

        button2.setOnClickListener {
            startActivity(Intent(this, MainActivity4::class.java))
        }

        button3.setOnClickListener {
            startActivity(Intent(this, MainActivity5::class.java))
        }
    }
}
