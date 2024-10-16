package com.example.controloscomuns

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    /*Exercício Controlos Comuns:
    1-Fazer Layout
    2-Codificar Botão
    3-Toast
    4-Somar -->
    <!--1 botão 2 edit text  e uma text view -->
    <!--Pergunta de teste: qual é o tipo de dados de ed1 editable */
    //Toast
    fun calcula(view: View)
    {
        val ed1 = findViewById<EditText>(R.id.editText1).text.toString().toInt()
        val ed2 = findViewById<EditText>(R.id.editText2).text.toString().toInt()
        val result = ed1 + ed2
        findViewById<TextView>(R.id.textView1).text = result.toString()
        //buscar a referência de Text View
        //val tv findViewById<TextView>(R.id.textView1)
        //tv.text="esta é a conta que eu fiz: $result"

        Toast.makeText(this,R.string.app_name, Toast.LENGTH_LONG).show()
    }

}