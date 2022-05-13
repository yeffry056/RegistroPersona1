package com.jjvcorporation.registropersona.di

import android.content.Context
import androidx.room.Room
import com.jjvcorporation.registropersona.data.PersonaDao
import com.jjvcorporation.registropersona.data.PersonasDB
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun ProviePersonasDb(@ApplicationContext appContext: Context):PersonasDB
    {
        return Room.databaseBuilder(
            appContext,
            PersonasDB::class.java,
            "Personas.db").fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    fun ProvidePersonaDao(personasDB: PersonasDB): PersonaDao{
        return  personasDB.personaDao
    }
}