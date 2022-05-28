package br.univali.pdm.listacontatos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var adicionarContato: FloatingActionButton

    private lateinit var listaContatosFragment: ListaContatosFragment
    private lateinit var adicionarContatoFragment: AdicionarContatoFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adicionarContato = findViewById(R.id.adicionarContato)
        adicionarContato.setOnClickListener(this)

        listaContatosFragment = ListaContatosFragment()
        adicionarContatoFragment = AdicionarContatoFragment()
    }

    private fun setFragment(fragment: AdicionarContatoFragment){
        val fragmentTransition = supportFragmentManager.beginTransaction()
        fragmentTransition.replace(R.id.fragmentContainerView, fragment)
        fragmentTransition.commit()
    }

    override fun onClick(v: View) {

        when (v.id){
            R.id.adicionarContato -> {
                setFragment(adicionarContatoFragment)
            }
        }

    }

}