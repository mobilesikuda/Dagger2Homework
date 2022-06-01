package ru.otus.daggerhomework.di

import android.content.Context
import androidx.lifecycle.MutableLiveData
import dagger.BindsInstance
import dagger.Component
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import ru.otus.daggerhomework.MainActivity
import javax.inject.Singleton

@Component(modules = [AppModule::class])
@Singleton
interface MainActivityComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context, @BindsInstance color: MutableLiveData<Int>): MainActivityComponent
    }

    fun inject(mainActivity: MainActivity)

}