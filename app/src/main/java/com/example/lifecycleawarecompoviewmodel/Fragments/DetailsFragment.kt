package com.example.lifecycleawarecompoviewmodel.Fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.example.lifecycleawarecompoviewmodel.viewmodel.SharedViewModel

class DetailsFragment : Fragment() {
    /*
    Use the "by activityViewModels()" Kotlin property delegate
    from the fragment-ktx artifact
     */

    private val model : SharedViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        model.selected.observe(viewLifecycleOwner ,
        Observer<Item> {
            item->
            //Update the UI
        })
    }
}