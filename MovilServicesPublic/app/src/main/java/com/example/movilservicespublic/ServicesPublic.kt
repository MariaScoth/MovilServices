package com.example.movilservicespublic

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ServicesPublic : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_services_public)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
       // val btnAbrirOtraPantalla = findViewById<ImageButton>(R.id.button1)
        //val btnAbrirOtraPantalla1 = findViewById<ImageButton>(R.id.button2)
        //val btnAbrirOtraPantalla2 = findViewById<ImageButton>(R.id.button3)
        //val btnAbrirOtraPantalla3 = findViewById<ImageButton>(R.id.button4)
       // btnAbrirOtraPantalla.setOnClickListener {
        //val intent = Intent(this, ConfigurarAlarmaRecepcion::class.java)
          //  startActivity(intent)
        //}
        //btnAbrirOtraPantalla1.setOnClickListener {
          //  val intent = Intent(this, ConfigurarAlarmaRecepcion::class.java)
            //startActivity(intent)
        //}
        //btnAbrirOtraPantalla2.setOnClickListener {
          //  val intent = Intent(this, ConfigurarAlarmaRecepcion::class.java)
            //startActivity(intent)
        //}
        //btnAbrirOtraPantalla3.setOnClickListener {
          //  val intent = Intent(this, ConfigurarAlarmaRecepcion::class.java)
           // startActivity(intent)
        //}

    }
}