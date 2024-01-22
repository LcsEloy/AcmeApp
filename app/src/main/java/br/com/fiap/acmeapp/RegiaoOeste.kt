package br.com.fiap.acmeapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button

class RegiaoOeste : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regiaooeste)
        val button : Button = findViewById(R.id.btCancelarAg)
        button.setOnClickListener {
            startActivity(Intent(this, CadResiduos::class.java))
        }
        val buttonConfirma : Button = findViewById(R.id.btCfAgendamento)
        buttonConfirma.setOnClickListener {
            startActivity(Intent(this, CadFinalizado::class.java))
        }
    }

}