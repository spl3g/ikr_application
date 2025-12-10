package com.example.ikr_application.navigation

import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import com.example.ikr_application.R
import com.example.ikr_application.spl3g.ui.MyFragment

enum class Screens(
    @StringRes val title: Int,
    val type: Class<out Fragment>,
) {
    SAMPLE(R.string.title_sample, MyFragment::class.java)
}