package br.com.fiap.acmeapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class HomePage : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)
        findViewById<TextView>(R.id.msgBemVindo)
        val button : Button = findViewById(R.id.btInicio)
        button.setOnClickListener {
            startActivity(Intent(this, CadResiduos::class.java))
        }
    }

}