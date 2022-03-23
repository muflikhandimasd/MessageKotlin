package com.muflikhan.messagekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var btnAlert : Button
    private lateinit var btnToast : Button
    private lateinit var btnSnackbar : Button

    // create a alertdialog
    private lateinit var alert : AlertDialog.Builder

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAlert = findViewById(R.id.btnAlert)
        btnToast = findViewById(R.id.btnToast)
        btnSnackbar = findViewById(R.id.btnSnackbar)

        alert = AlertDialog.Builder(this)

        btnAlert.setOnClickListener {
            alert.setTitle("Judul Alert")
                .setMessage("Apakah kamu yakin untuk melanjutkan?")
                .setCancelable(true)
                .setPositiveButton("Ya"){dialogInterface, it -> finish()}
                .setNegativeButton("Tidak"){dialogInterface, it -> dialogInterface.cancel()}
                .show()
        }

        btnToast.setOnClickListener {
            Toast.makeText(this@MainActivity,"Contoh Toast",Toast.LENGTH_SHORT).show()
        }

        btnSnackbar.setOnClickListener {
          Snackbar.make(it, "Contoh Snackbar", Snackbar.LENGTH_SHORT).show()

        }
    }
}