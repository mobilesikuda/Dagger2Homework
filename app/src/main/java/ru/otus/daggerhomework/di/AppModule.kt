package ru.otus.daggerhomework.di

import androidx.fragment.app.Fragment
import dagger.Binds
import dagger.Module
import ru.otus.daggerhomework.FragmentProducer
import ru.otus.daggerhomework.FragmentReceiver

@Module
interface AppModule {

    @Binds
    fun bindFragmentProducer(impl: FragmentProducer) : Fragment

    @Binds
    fun bindFragmentFragmentReceiver(impl: FragmentReceiver) : Fragment

}