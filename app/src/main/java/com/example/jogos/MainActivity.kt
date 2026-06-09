package com.example.jogos

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtResultado = findViewById<TextView>(R.id.txtResultado)
        val editEntrada = findViewById<EditText>(R.id.editEntrada)
        val btnDescobrir = findViewById<Button>(R.id.btnDescobrir)

        btnDescobrir.setOnClickListener {

            val nome = editEntrada.text.toString().trim()

            if (nome.isEmpty()) {

                Toast.makeText(
                    this,
                    "Digite seu nome",
                    Toast.LENGTH_SHORT
                ).show()

            } else {

                val personagens = arrayOf(
                    "Leon S. Kennedy",
                    "Jill Valentine",
                    "Ashley Graham",
                    "Claire Redfield",
                    "Ada Wong",
                    "Albert Wesker"
                )

                val personagem =
                    personagens[(0 until personagens.size).random()]

                txtResultado.text =
                    "$nome, você seria o personagem: $personagem!"

                Toast.makeText(
                    this,
                    "Personagem descoberto",
                    Toast.LENGTH_SHORT
                ).show()

                editEntrada.text.clear()
            }
        }
    }
}