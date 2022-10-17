package com.fascinate98.groom.presentation.regist_screen

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.ExperimentalComposeApi
import androidx.fragment.app.Fragment
import com.fascinate98.groom.GroomApplication
import com.fascinate98.groom.presentation.regist_screen.viewmodel.RegistViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@ExperimentalMaterialApi
@ExperimentalComposeApi
@AndroidEntryPoint
class RegistFragment: Fragment() {

    @Inject
    lateinit var application: GroomApplication


}