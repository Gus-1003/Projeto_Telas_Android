package tads.eaj.ufrn.intentactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class ActivityRecebe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recebe)

        val textViewSaida: TextView = findViewById(R.id.textViewSaida)

        val editTextEntrada = intent.extras?.getString("TEXTO", "Valor não informado")

        textViewSaida.text = editTextEntrada
    }
}