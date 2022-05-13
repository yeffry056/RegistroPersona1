package com.jjvcorporation.registropersona.views.personas

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import androidx.appcompat.resources.Compatibility.Api21Impl.inflate
import androidx.core.content.res.ComplexColorCompat.inflate
import androidx.core.graphics.drawable.DrawableCompat.inflate
import androidx.navigation.fragment.findNavController
import com.jjvcorporation.registropersona.R
import com.jjvcorporation.registropersona.databinding.ActivityMainBinding.inflate

import com.jjvcorporation.registropersona.databinding.FragmentListaPersonasBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ListaPersonasFragment : Fragment() {



   // private lateinit var viewModel: ListaPersonasViewModel
    private lateinit var binding: FragmentListaPersonasBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListaPersonasBinding.inflate(inflater,container, false)

        binding.personaButton.setOnClickListener{
            findNavController().navigate(R.id.action_to_personasFragment)
        }
        return binding.root
    }


}