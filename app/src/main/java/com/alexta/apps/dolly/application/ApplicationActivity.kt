package com.alexta.apps.dolly.application

import android.os.Bundle
import com.alexta.apps.dolly.R
import com.alexta.apps.dolly.shared.framework.activities.BaseActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class ApplicationActivity : BaseActivity<ApplicationViewModel>() {

    @Inject
    lateinit var viewModel: ApplicationViewModel

    override fun layoutId() = R.layout.activity_application

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.greeting()
    }


}