package com.alexta.apps.dolly.application

import android.util.Log
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class ApplicationViewModel @Inject constructor() : ViewModel() {

    fun greeting() {
        Log.i("ApplicationViewModel", "Hello Application!")
    }

}
