package com.alexta.apps.dolly.onboarding

import com.alexta.apps.dolly.R
import com.alexta.apps.dolly.shared.framework.fragments.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class OnboardingFragment : BaseFragment<OnboardingViewModel>() {

    @Inject
    lateinit var viewModel: OnboardingViewModel

    override fun getLayoutId() = R.layout.fragment_onboarding

    override fun initViews() {}

}