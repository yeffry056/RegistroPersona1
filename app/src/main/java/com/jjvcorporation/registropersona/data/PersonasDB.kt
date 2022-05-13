package com.jjvcorporation.registropersona.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.jjvcorporation.registropersona.model.Persona

@Database(
    entities = [Persona::class],
    version = 1
)
abstract class PersonasDB: RoomDatabase() {
    abstract val personaDao: PersonaDao

}