package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var campoNombre: EditText? = null
    var Message : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSuma: Button = findViewById(R.id.suma)
        btnSuma.setOnClickListener{suma()}

        val btnMultiplicacion: Button = findViewById(R.id.multiplicacion)
        btnMultiplicacion.setOnClickListener{multiplicacion()}

        val btnResta: Button = findViewById(R.id.resta)
        btnResta.setOnClickListener{resta()}

        val btnDivision: Button = findViewById(R.id.division)
        btnDivision.setOnClickListener{division()}

        /*  boton de transferencia  */
        val BtnNext : Button = findViewById(R.id.nextView)
        BtnNext.setOnClickListener{transfer(1)}

        campoNombre= findViewById(R.id.inputName)
        Message= findViewById(R.id.Mensaje)

    }


    private fun suma(){
        var boxnumber: EditText=findViewById(R.id.input1)
        var numberinp1: Int= Integer.parseInt(boxnumber.text.toString())

        var boxnumber2: EditText=findViewById(R.id.input2)
        var numberinp2: Int = Integer.parseInt(boxnumber2.text.toString())

        var resultado = numberinp1 + numberinp2

        var textResultado: TextView=findViewById(R.id.result)
        textResultado.text = "el resultado de la suma es: $resultado"
    }

    private fun multiplicacion(){
        var boxnumber: EditText=findViewById(R.id.input1)
        var numberinp1: Int= Integer.parseInt(boxnumber.text.toString())

        var boxnumber2: EditText=findViewById(R.id.input2)
        var numberinp2: Int = Integer.parseInt(boxnumber2.text.toString())

        var resultado = numberinp1 * numberinp2

        var textResultado: TextView=findViewById(R.id.result)
        textResultado.text = "el resultado de la multiplicacion es: $resultado"
    }
    private fun resta(){
        var boxnumber: EditText=findViewById(R.id.input1)
        var numberinp1: Int= Integer.parseInt(boxnumber.text.toString())

        var boxnumber2: EditText=findViewById(R.id.input2)
        var numberinp2: Int = Integer.parseInt(boxnumber2.text.toString())

        var resultado = numberinp1 - numberinp2

        var textResultado: TextView = findViewById(R.id.result)
        textResultado.text = "el resultado de la resta es: $resultado"
    }
    private fun division(){
        var boxnumber: EditText=findViewById(R.id.input1)
        var numberinp1: Int= Integer.parseInt(boxnumber.text.toString())

        var boxnumber2: EditText=findViewById(R.id.input2)
        var numberinp2: Int = Integer.parseInt(boxnumber2.text.toString())

        var resultado = numberinp1 / numberinp2

        var textResultado: TextView = findViewById(R.id.result)
        textResultado.text = "el resultado de la division es: $resultado"
    }

    /*   funcion transferencia   */
    private fun transfer(boton: Int){
                var intent = Intent(this,ActivityMensaje::class.java)
                /* paso de informacion entre actividades */
                var myBundle:Bundle = Bundle()
                myBundle.putString("Nombre" , campoNombre!!.text.toString())
                //agregamos  la informacion al  intent para que sea enviada
                intent.putExtras(myBundle)
                startActivity(intent)
            }
        }

