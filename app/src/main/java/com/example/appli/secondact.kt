package com.example.appli

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_secondact.*

class secondact : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondact)

        secondsub.setOnClickListener {
            val secondintent = Intent(this, fin::class.java)
            startActivity(secondintent)
        }
    }


}
