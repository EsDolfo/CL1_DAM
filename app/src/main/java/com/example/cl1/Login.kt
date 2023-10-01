package com.example.cl1

import android.app.Dialog
import android.content.Intent
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CalendarContract.Colors
import android.view.Window
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.compose.ui.graphics.Color

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnCloseSesion = findViewById<Button>(R.id.btnSalir)

        btnCloseSesion.setOnClickListener{
            val title: String ="Confirmar";
            val message: String ="¿Esta seguro que desea abandonar la aplicación?"

            showTitleExit(title,message);
        };
    }

    private fun showTitleExit(title: String, message: String) {
        val dialogConf = Dialog(this)
        dialogConf.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialogConf.setCancelable(false)
        dialogConf.setContentView(R.layout.message_alert)

        dialogConf.window?.setBackgroundDrawable(ColorDrawable(android.graphics.Color.TRANSPARENT))

        val titleM = dialogConf.findViewById<TextView>(R.id.title);
        val messageM = dialogConf.findViewById<TextView>(R.id.message);

        val btnSi = dialogConf.findViewById<Button>(R.id.btnSi);
        val btnNo = dialogConf.findViewById<Button>(R.id.btnNo);

        titleM.text = title;
        messageM.text = message;

        btnSi.setOnClickListener{
          val pantallaInicio = Intent(this,FirstScreen::class.java)
          startActivity(pantallaInicio)
        };

        btnNo.setOnClickListener{
            Toast.makeText(this, "Sigue en linea", Toast.LENGTH_SHORT).show()
            dialogConf.dismiss()
        };

        dialogConf.show();

    }















}