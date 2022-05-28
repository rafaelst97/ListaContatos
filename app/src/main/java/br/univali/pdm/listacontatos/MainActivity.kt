package br.univali.pdm.listacontatos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
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
        setFragment(listaContatosFragment)
    }

    private fun setFragment(fragment: Fragment){
        val fragmentTransition = supportFragmentManager.beginTransaction()
        fragmentTransition.replace(R.id.fragmentContainerView, fragment)
        fragmentTransition.addToBackStack(null)
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