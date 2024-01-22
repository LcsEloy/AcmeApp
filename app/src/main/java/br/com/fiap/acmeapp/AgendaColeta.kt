package br.com.fiap.acmeapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class AgendaColeta : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agendacoleta)
        findViewById<TextView>(R.id.msgRegiao)
        val buttonNt : Button = findViewById(R.id.btNorte)
        buttonNt.setOnClickListener {
            startActivity(Intent(this, RegiaoNorte::class.java))
        }
        val buttonSl : Button = findViewById(R.id.btSul)
        buttonSl.setOnClickListener {
            startActivity(Intent(this, RegiaoSul::class.java))
        }
        val buttonLst : Button = findViewById(R.id.btLeste)
        buttonLst.setOnClickListener {
            startActivity(Intent(this, RegiaoLeste::class.java))
        }
        val buttonOst : Button = findViewById(R.id.btOeste)
        buttonOst.setOnClickListener {
            startActivity(Intent(this, RegiaoOeste::class.java))
        }
        val buttonCl : Button = findViewById(R.id.btCancelar)
        buttonCl.setOnClickListener {
            startActivity(Intent(this, CadResiduos::class.java))
        }
    }

}