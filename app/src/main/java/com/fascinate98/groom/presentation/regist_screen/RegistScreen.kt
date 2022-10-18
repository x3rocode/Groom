package com.fascinate98.groom.presentation.regist_screen

import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.fascinate98.groom.presentation.regist_screen.viewmodel.RegistViewModel
import com.fascinate98.groom.presentation.ui.theme.GroomTheme

@Composable
fun RegistScreen(
    viewModel: RegistViewModel = hiltViewModel()
) {
    Surface() {
        val coins = viewModel.coins.value
        
        GroomTheme {
            Surface {
                Text(text = coins.toString())
            }
        }
    }
}