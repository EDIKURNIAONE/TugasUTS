package com.example.tugasuts

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
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

        // Hubungkan ke layout
        val username = findViewById<EditText>(R.id.editText)
        val email = findViewById<EditText>(R.id.editText)
        val namaDepan = findViewById<EditText>(R.id.editFirstName)
        val namaBelakang = findViewById<EditText>(R.id.editLastName)
        val password = findViewById<EditText>(R.id.editPassword)
        val konfirmasiPassword = findViewById<EditText>(R.id.editPassword)
        val btnKirim = findViewById<Button>(R.id.btnCancel)

        btnKirim.setOnClickListener {
            if (username.text.isEmpty() || email.text.isEmpty() ||
                namaDepan.text.isEmpty() || namaBelakang.text.isEmpty() ||
                password.text.isEmpty() || konfirmasiPassword.text.isEmpty()
            ) {
                Toast.makeText(this, "Semua input harus terisi!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (password.text.toString() != konfirmasiPassword.text.toString()) {
                Toast.makeText(this, "Password dan Konfirmasi Password tidak sama!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            Toast.makeText(this, "Registrasi Berhasil!", Toast.LENGTH_SHORT).show()
        }

    }
}  insets
}
    }
}