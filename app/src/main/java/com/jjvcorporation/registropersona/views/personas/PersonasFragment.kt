package com.jjvcorporation.registropersona.views.personas

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.core.graphics.drawable.DrawableCompat.inflate
import androidx.core.view.get
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import com.jjvcorporation.registropersona.R
import com.jjvcorporation.registropersona.databinding.FragmentPersonasBinding
import com.jjvcorporation.registropersona.model.Persona
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PersonasFragment : Fragment() {



    private val viewModel: PersonasViewModel by viewModels()

//OJO
    private lateinit var binding: FragmentPersonasBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = FragmentPersonasBinding.inflate(inflater,container, false)
        binding.guardarButton.setOnClickListener {
          //  val bala: Float = findNavController().navigate(R.id.balanceTextInput.toFloat())


            val persona = Persona(
                0,   binding.personaEditText.text.toString(),
                binding.balanceEditTex.floatValue()
            )
            viewModel.guardar(persona)

            val snackBar = Snackbar.make(binding.root, "Persona guardada", Snackbar.LENGTH_LONG)
            snackBar.show()
        }
        return binding.root
    }
    fun TextInputEditText.floatValue() = text.toString().toFloatOrNull() ?: 0.0f


}

