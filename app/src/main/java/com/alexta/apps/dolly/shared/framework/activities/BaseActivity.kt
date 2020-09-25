package com.alexta.apps.dolly.shared.framework.activities

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel

abstract class BaseActivity<V : ViewModel> : AppCompatActivity() {

    internal val activity by lazy { this }

    @LayoutRes
    internal abstract fun layoutId(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutId())
    }

}