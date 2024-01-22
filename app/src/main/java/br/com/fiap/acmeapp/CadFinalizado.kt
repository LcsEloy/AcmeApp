package br.com.fiap.acmeapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button

class CadFinalizado : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadfinalizado)
        val button : Button = findViewById(R.id.btVoltar)
        button.setOnClickListener {
            startActivity(Intent(this, CadResiduos::class.java))
        }
    }
}