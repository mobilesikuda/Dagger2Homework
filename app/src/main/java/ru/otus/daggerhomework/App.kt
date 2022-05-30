package ru.otus.daggerhomework

import android.app.Application
import android.content.Context
import ru.otus.daggerhomework.di.ApplicationComponent
import ru.otus.daggerhomework.di.DaggerApplicationComponent


class App() :Application () {

    val component: ApplicationComponent by lazy {
        DaggerApplicationComponent.factory().create( applicationContext )
    }

}