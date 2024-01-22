package br.com.fiap.acmeapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class CadResiduos : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadresiduos)
        val button : Button = findViewById(R.id.btAgenda)
        button.setOnClickListener {
            startActivity(Intent(this, AgendaColeta::class.java))
        }
    }

}