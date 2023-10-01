package com.example.cl1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class FirstScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_screen)

        val btnCancelar = findViewById<Button>(R.id.btnCancelar);

        val btnCrear = findViewById<Button>(R.id.btnCrear);


        btnCancelar.setOnClickListener{
            Toast.makeText(applicationContext,"El usuario esta intentando cancelar el registro",Toast.LENGTH_LONG).show()
        };

        btnCrear.setOnClickListener{
           val productScreen = Intent(this,Login::class.java)
            startActivity(productScreen);

        };



    }
}