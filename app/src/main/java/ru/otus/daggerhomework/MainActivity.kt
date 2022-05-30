package ru.otus.daggerhomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import ru.otus.daggerhomework.di.DaggerMainActivityComponent

class MainActivity : AppCompatActivity() {

    private val component by lazy {
        DaggerMainActivityComponent.create()
    }

    private val _color = MutableStateFlow<Int>(0)
    val color: StateFlow<Int> = _color


    override fun onCreate(savedInstanceState: Bundle?) {
        //component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}