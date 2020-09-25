package com.alexta.apps.dolly.onboarding

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alexta.apps.dolly.R
import kotlinx.android.synthetic.main.item_onboarding_page.view.*
import javax.inject.Inject

class OnboardingPagerAdapter @Inject constructor() :
    RecyclerView.Adapter<OnboardingPagerViewHolder>() {

    private val pages = intArrayOf(1, 2, 3, 4)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnboardingPagerViewHolder {
        val attachToRoot = false
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_onboarding_page, parent, attachToRoot)
        return OnboardingPagerViewHolder(view)
    }

    override fun getItemCount() = pages.size

    override fun onBindViewHolder(holder: OnboardingPagerViewHolder, position: Int) {
        with(holder.itemView) {
            page_text.text = pages[position].toString()
        }
    }

}