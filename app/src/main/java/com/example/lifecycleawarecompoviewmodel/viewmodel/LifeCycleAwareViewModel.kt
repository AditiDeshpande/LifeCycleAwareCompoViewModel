package com.example.lifecycleawarecompoviewmodel.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


/*
Just a skeleton of ViewModel implementation just to understand
the flow and steps

Architecture components provides ViewModel helper class for the UI
controller that is responsible for preparing data for the UI.
ViewModel objects are automatically retained during configuartion
changes so that data they hold is immediately available to the
next activity or fragment instance. e.g if u need to display
a list of users in your app, make sure to assign responsibility
to acquire and keep the list of users to a ViewModel, instead of
an Activity or Fragment, as illustrated in foll. ex.
 */
class LifeCycleAwareViewModel : ViewModel() {
    private val users: MutableLiveData<List<User>> by lazy{
            MutableLiveData().also{
                loadUsers()
        }
    }

    fun getUsers(): LiveData<List<User>>{
        return users
    }

    private fun loadUsers(){
        //Do asynchronous operation to fetch users.
    }


}