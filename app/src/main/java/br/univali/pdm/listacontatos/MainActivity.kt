package br.univali.pdm.listacontatos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var adicionarContato: Button

    private lateinit var listaContatosFragment: ListaContatosFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adicionarContato = findViewById(R.id.adicionarContato)

        listaContatosFragment = ListaContatosFragment()
    }

    private fun setFragment(fragment: ListaContatosFragment){
        val fragmentTransition = supportFragmentManager.beginTransaction()
    }

}