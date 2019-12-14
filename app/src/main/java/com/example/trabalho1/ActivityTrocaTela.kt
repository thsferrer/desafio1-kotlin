package com.example.trabalho1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_desafio1.*
import kotlinx.android.synthetic.main.activity_main.*

import kotlinx.android.synthetic.main.activity_troca_tela.*

class ActivityTrocaTela : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desafio1)
        setSupportActionBar(toolbar)

        botao.setOnClickListener {
            var gas = gasolina.text.toString().toFloat()
            var al = alcool.text.toString().toFloat()
            if (gas * 0.7 > al) {
                resultado.setText("Álcool!")
            } else {
                resultado.setText("Gasolina!")
            }
            Log.i("AULA", "Fiz a conta!")
        }
    }

}
