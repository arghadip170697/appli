package com.example.appli

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class secondact : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondact)
    }
    fun button2(view: View){
        val skillact = Intent(this, secondact::class.java)
        startActivity(skillact)

    }
}
