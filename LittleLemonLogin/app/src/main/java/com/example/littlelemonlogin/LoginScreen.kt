package com.example.littlelemonlogin

import android.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun LoginScreen() {
    Box(contentAlignment = Alignment.Center) {

        Column(horizontalAlignment= Alignment.CenterHorizontally){
            Image(
                painter = painterResource(id = R.drawable.littlelemonlogo),
                contentDescription = "Logo Image"
            )
            TextField(value = "", onValueChange = {}, label = { Text(text = "Username") }
            )
            TextField(value = "", onValueChange = {}, label = { Text(text = "Password") }
            )

            Button(onClick = { /*TODO*/ },
               colors = ButtonDefaults.buttonColors(
                   backgroundColor = colorResource(id = R.color.button_background)
               )
            ) {
                Text(text =  "Login", color = colorResource(id = R.color.button_text_color))
            }

        }
    }
}
