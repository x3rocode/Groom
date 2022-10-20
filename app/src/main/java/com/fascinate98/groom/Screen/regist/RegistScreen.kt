package com.fascinate98.groom.Screen.regist

import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.fascinate98.groom.Screen.ui.theme.GroomTheme

@Composable
fun RegistScreen(
    viewModel: RegistViewModel = hiltViewModel()
) {
    Surface() {
        val coins = viewModel.coin.value
        
        GroomTheme {
            Surface {
                Text(text = coins.toString())
            }
        }
    }
}