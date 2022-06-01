package ru.otus.daggerhomework.di

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import ru.otus.daggerhomework.*

@Module
interface AppModule {

    @Binds
    fun bindColorGenerator( impl: ColorGeneratorImpl): ColorGenerator

    @Binds
    fun bindFragmentProducer(impl: FragmentProducer) : Fragment

    @Binds
    fun bindFragmentReceiver(impl: FragmentReceiver) : Fragment

    @Binds
    fun bindViewModelProducer(impl: ViewModelProducer) : ViewModel

    @Binds
    fun bindViewModelReceiver(impl: ViewModelReceiver) : ViewModel

}