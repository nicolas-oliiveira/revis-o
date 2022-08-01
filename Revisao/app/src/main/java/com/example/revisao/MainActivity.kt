package com.example.revisao

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtNome:TextView = findViewById(R.id.txtNome)
        val txtEndereco:TextView = findViewById(R.id.txtEndereco)
        val txtBairo:TextView = findViewById(R.id.txtBairro)
        val txtCep:TextView = findViewById(R.id.txtCep)
        val txtCidade:TextView = findViewById(R.id.txtCidade)

        val btnCadastrar:Button = findViewById(R.id.btnCadastrar)

        btnCadastrar.setOnClickListener{
            Toast.makeText(this, "Nome " +txtNome.toString(), Toast.LENGTH_SHORT).show()
            val intent = Intent(this, resultado::class.java)
            startActivity(intent)
        }

    }
}