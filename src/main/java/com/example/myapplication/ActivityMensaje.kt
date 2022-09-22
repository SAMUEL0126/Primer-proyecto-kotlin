package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ActivityMensaje : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mensaje)

        val campoMensaje = findViewById<TextView>(R.id.Mensaje)

        // obtenemos la informacion enviada al intent
        var myBundle: Bundle? = this.intent.extras

        //asigna la informacion obtenida en el textview
        if (myBundle != null){
            campoMensaje.text = "hola ${myBundle.getString("Nombre")}Bienvenido"
        }

        val BtnSalir: Button = findViewById(R.id.Salir)
        BtnSalir.setOnClickListener{salir()}
    }

    private fun salir(){
        finish()
    }
}