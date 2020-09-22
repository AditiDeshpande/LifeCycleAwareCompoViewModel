package com.example.lifecycleawarecompoviewmodel.Fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.lifecycleawarecompoviewmodel.viewmodel.SharedViewModel
import java.nio.channels.Selector

class MasterFragment : Fragment(){

    private lateinit var itemSelector: Selector

    /*
    Use the "by activityViewModels()" Kotlin property delegate
    from the fragment-ktx artifact
     */

    private val model : SharedViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        itemSelector.setOnClickListener {
            item ->
            //Update the UI
        }
    }
}