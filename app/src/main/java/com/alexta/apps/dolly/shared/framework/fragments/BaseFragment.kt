package com.alexta.apps.dolly.shared.framework.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController

abstract class BaseFragment : Fragment() {

    internal val activity by lazy { this }

    private val navigationController by lazy { findNavController() }

    @LayoutRes
    internal abstract fun getLayoutId(): Int

    internal abstract fun initViews()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val attachToRoot = false
        return inflater.inflate(getLayoutId(), container, attachToRoot)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    internal fun navigateTo(directions: NavDirections) {
        navigationController.navigate(directions)
    }

}