package br.univali.pdm.listacontatos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [AdicionarContatoFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AdicionarContatoFragment : Fragment() {

    private lateinit var viewOfLayout: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View
        val botaoSalvarAdicionar: Button
        val botaoCancelarAdicionar: Button

        view = inflater.inflate(R.layout.fragment_adicionar_contato, container, false)
        botaoSalvarAdicionar = view.findViewById(R.id.botaoSalvarAdicionar)
        botaoCancelarAdicionar = view.findViewById(R.id.botaoCancelarAdicionar)

        botaoSalvarAdicionar.setOnClickListener(View.OnClickListener {



        })


        return inflater.inflate(R.layout.fragment_adicionar_contato, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment AdicionarContatoFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            AdicionarContatoFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}