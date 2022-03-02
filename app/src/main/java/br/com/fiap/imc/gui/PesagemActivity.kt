package br.com.fiap.imc.gui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.fiap.imc.R

class PesagemActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pesagem)

        supportActionBar!!.hide()


    }

}