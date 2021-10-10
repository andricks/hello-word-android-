package com.example.helloword

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button=findViewById<Button>(R.id.btnenviar);
        button.setOnClickListener(){
            val inputNombre = findViewById<TextView>(R.id.textNombre)
            val inputMensaje=findViewById<TextView>(R.id.textMensaje)
            inputMensaje.text = "Hola"+inputNombre.text

        }


    }
}