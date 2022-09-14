package tads.eaj.ufrn.intentactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextEntrada: TextView =  findViewById(R.id.editTextEntrada) //Link com um componente "editText" presente no layout na activity_main
        val buttonAbrir: Button = findViewById(R.id.buttonAbrir) //Link com um componente "button" no layout na activity_main

        buttonAbrir.setOnClickListener { // Método responsavel por reagir a ação de click no botão

            val texto = editTextEntrada.text.toString() //Pegando o valor String que está dentro da variavel editTextEntrada

            // Intent = Chamadas a objetos feitos pelo sistema operacional a partir da classe Intent.
            val intent = Intent(this, ActivityRecebe::class.java) // (onde você está, para onde você vai)

            val param = Bundle() // Objeto usado para serializar parâmetros que serão enviados através de uma Intent.

            param.putString("TEXTO", texto)

            intent.putExtras(param)

            startActivity(intent) //Maneira Básica de navegar entre telas - Inicia a próxima Activity sem qualquer vínculo.
        }
    }
}