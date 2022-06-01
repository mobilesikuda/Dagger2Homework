package ru.otus.daggerhomework

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.annotation.ColorInt
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import kotlinx.coroutines.flow.observeOn
import javax.inject.Inject

class FragmentReceiver @Inject constructor() : Fragment() {

    private lateinit var frame: View
    @Inject
    lateinit var model: ViewModelReceiver

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_b, container, true)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        frame = view.findViewById(R.id.frame)
        //val model = ViewModelProvider(this).get(ViewModelReceiver::class.java)
        model.color.observe( viewLifecycleOwner, {
            model.observeColors()
            populateColor(it)
        })
    }

    fun populateColor(@ColorInt color: Int) {
        frame.setBackgroundColor(color)
    }


}