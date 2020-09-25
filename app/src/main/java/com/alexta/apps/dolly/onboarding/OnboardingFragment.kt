package com.alexta.apps.dolly.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.alexta.apps.dolly.databinding.FragmentOnboardingBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class OnboardingFragment : Fragment() {

    @Inject
    lateinit var viewModel: OnboardingViewModel

    @Inject
    lateinit var adapter: OnboardingPagerAdapter

    private lateinit var binding: FragmentOnboardingBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val attachToRoot = false
        binding = FragmentOnboardingBinding.inflate(inflater, container, attachToRoot)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    private fun initViews() {
        initViewPager()
    }

    private fun initViewPager() {
        binding.pager.adapter = adapter
    }

}