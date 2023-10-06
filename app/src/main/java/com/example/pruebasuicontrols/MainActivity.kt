package com.example.pruebasuicontrols

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.pruebasuicontrols.ui.theme.PruebasUIControlsTheme

class MainActivity : ComponentActivity() {
    private lateinit var nombre: EditText
    private lateinit var pass: EditText
    private lateinit var respuesta: TextView
    private lateinit var respuesta1: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            setContentView(R.layout.main_activity)
            nombre = findViewById(R.id.nombre)
            pass = findViewById(R.id.contraseña)
            respuesta = findViewById(R.id.respuesta)
            respuesta1 = findViewById(R.id.respuesta1)
            }
        }

    fun mostrarTexto(view: View){
        val nombre = nombre.text.toString()
        val contra = pass.text.toString()
        respuesta.text = nombre
        respuesta1.text = contra

    }
    }

