package com.example.paketb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val calonkades = findViewById<Button>(R.id.calonkades)
        val daftartps = findViewById<Button>(R.id.daftartps)

        calonkades.setOnClickListener {
            val intent = Intent(this, calon::class.java)
            startActivity(intent)
        }
        daftartps.setOnClickListener {
            val intent = Intent(this, tps::class.java)
            startActivity(intent)
        }
    }
}
