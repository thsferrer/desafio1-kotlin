package com.example.trabalho1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_desafio1.*

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_troca_tela.*
import kotlinx.android.synthetic.main.activity_troca_tela.view.*
import java.math.BigDecimal
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_troca_tela)

       /* val intent = intent
        if(intent != null){
            val login = intent.getSerializableExtra("login") as Login

            val campoLogin = findViewById<TextView>(R.id.usuario)campoLogin.text = login.username
            val campoSenha = findViewById<TextView>(R.id.senha)campoSenha.text = login.password*/

        entrar.setOnClickListener {
            val intent = Intent(this@MainActivity, ActivityTrocaTela::class.java)
            startActivity(intent)
        }

    }


}
