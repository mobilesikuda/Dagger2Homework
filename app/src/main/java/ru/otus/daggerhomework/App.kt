package ru.otus.daggerhomework

import android.app.Application
import android.content.Context


class App(
    val context: Context
    ) :Application () {

    val component: ApplicationComponent by lazy {
        //DaggerApplicationComponent.create()
        DaggerApplicationComponent.factory().create(applicationContext)
    }

    init {
         component.inject(this)
    }

}