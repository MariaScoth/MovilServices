package com.uxdesign.servicealarm

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.uxdesign.servicealarm.R.id.spinner_sonido

class ConfigurarSonidoAlarma : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_configurar_sonido_alarma)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val spinnerSonido: Spinner = findViewById(spinner_sonido)
        val adapter = ArrayAdapter.createFromResource(
            this,
            R.array.sonido_opciones,
            android.R.layout.simple_spinner_item
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerSonido.adapter = adapter

        //findViewById<View>(R.id.button).setOnClickListener {
        //    val intent = Intent(this, MainActivity::class.java)
        //    startActivity(intent)
        //}
    }
}
