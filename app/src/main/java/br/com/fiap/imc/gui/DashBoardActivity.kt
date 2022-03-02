package br.com.fiap.imc.gui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.fiap.imc.R

class DashBoardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_board)

        supportActionBar!!.hide()


    }

}