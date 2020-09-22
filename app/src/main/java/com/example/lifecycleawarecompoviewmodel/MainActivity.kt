package com.example.lifecycleawarecompoviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import com.example.lifecycleawarecompoviewmodel.viewmodel.LifeCycleAwareViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        Create a ViewModel the first time the system calls an
        activity's onCreate method.
        Re-created activities receive the same LifeCycleAwareViewModel
        instance created by the first activity
         */
        /*
        Use the 'by viewModels()' Kotlin property delegate
        from the activity-ktx artifact
         */

        val model: LifeCycleAwareViewModel by viewModels()
        model.getUsers().observe(this ,
        Observer<List<User>>{
            users ->
            /*
            Update the UI
             */
        }

    }
}