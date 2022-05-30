package ru.otus.daggerhomework.di

import dagger.Component
import ru.otus.daggerhomework.MainActivity
import javax.inject.Singleton

@Component
@Singleton
interface MainActivityComponent {

    fun inject( mainActivity: MainActivity )
}