package com.fascinate98.groom.Screen.regist

import android.content.res.Resources.Theme
import android.widget.EditText
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.fascinate98.groom.Screen.ui.theme.BabyFont
import com.fascinate98.groom.Screen.ui.theme.GroomTheme
import org.w3c.dom.Text

@Composable
fun RegistScreen(
    viewModel: RegistViewModel = hiltViewModel()
) {
    Surface() {
        
        GroomTheme {
            Surface {
                //Text(text = coins.toString())
            }
        }
    }
}

@Composable
fun pledge(
    modifier: Modifier = Modifier,
    onNameChanged : () -> Unit,
    name: String
    ){
    Column(modifier = modifier) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(text = "내 이름은", fontFamily = BabyFont)
            TextField(value = name, onValueChange = {onNameChanged},
                modifier = Modifier.height(30.dp)
                    .width(100.dp))
            Text(text = "이애요", fontFamily = BabyFont)
        }
        Text(text = "나는 차칸살람이애요", fontFamily = BabyFont)
    }

}

@Preview(showBackground = true)
@Composable
fun pledgePreview(){
    var name: String = ""
    var onNameChanged : () -> Unit

    pledge(onNameChanged = {}, name = name, modifier = Modifier.padding(20.dp))
}