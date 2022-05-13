package com.jjvcorporation.registropersona.views.personas

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jjvcorporation.registropersona.data.PersonaDao
import com.jjvcorporation.registropersona.model.Persona
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PersonasViewModel @Inject constructor(
    val personaDao: PersonaDao
) : ViewModel() {

    //private  val guardado = Mutable
    fun guardar(persona: Persona){
        viewModelScope.launch {
            personaDao.Insertar(persona)
        }
    }
}