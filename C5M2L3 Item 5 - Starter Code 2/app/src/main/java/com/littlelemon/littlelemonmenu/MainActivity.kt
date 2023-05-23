package com.littlelemon.littlelemonmenu

import android.content.res.Configuration.ORIENTATION_LANDSCAPE
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import com.littlelemon.littlelemonmenu.ui.theme.Pink80
import com.littlelemon.littlelemonmenu.ui.theme.Purple80
import com.littlelemon.littlelemonmenu.ui.theme.PurpleGrey80

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val materialBlue700 = Color(0xFF1976D2)
            val scaffoldState = rememberScaffoldState(rememberDrawerState(DrawerValue.Open))
            Scaffold(
                scaffoldState = scaffoldState,
                topBar = {
                    TopAppBar(
                        title = { Text(resources.getString(R.string.app_name)) },
                        contentColor = Color.White,
                        backgroundColor = materialBlue700
                    )
                },
                content = { paddingValues ->
                    MenuContent(paddingValues = paddingValues)
                }
            )
        }
    }
}

@Composable
fun MenuContent(paddingValues: PaddingValues) {
    var configuration = LocalConfiguration.current

    when (configuration.orientation) {
        ORIENTATION_LANDSCAPE -> {
            Surface(modifier = Modifier.padding(paddingValues)) {
                val menuPadding = 8.dp
                Column {
                    Row() {
                        Text(
                            "Appetizers",
                            modifier = Modifier
                                .weight(0.25f)
                                .background(Purple80)
                                .padding(menuPadding)
                                .fillMaxWidth()
                        )
                        Text(
                            "Salads",
                            modifier = Modifier
                                .weight(0.25f)
                                .padding(menuPadding)
                                .fillMaxWidth()
                        )
                    }
                    Row() {
                        Text(
                            "Drinks",
                            modifier = Modifier
                                .weight(0.25f)
                                .background(Pink80)
                                .padding(menuPadding)
                                .fillMaxWidth()
                        )
                        Text(
                            "Mains",
                            modifier = Modifier
                                .weight(0.25f)
                                .background(PurpleGrey80)
                                .padding(menuPadding)
                                .fillMaxWidth()
                        )
                    }
                }
            }
        }
        else -> {
            Surface(modifier = Modifier.padding(paddingValues)) {
                val menuPadding = 8.dp
                Column {
                    Text(
                        "Appetizers",
                        modifier = Modifier
                            .weight(0.25f)
                            .background(Purple80)
                            .padding(menuPadding)
                            .fillMaxWidth()
                    )
                    Text(
                        "Salads",
                        modifier = Modifier
                            .weight(0.25f)
                            .padding(menuPadding)
                            .fillMaxWidth()
                    )
                    Text(
                        "Drinks",
                        modifier = Modifier
                            .weight(0.25f)
                            .background(Pink80)
                            .padding(menuPadding)
                            .fillMaxWidth()
                    )
                    Text(
                        "Mains",
                        modifier = Modifier
                            .weight(0.25f)
                            .background(PurpleGrey80)
                            .padding(menuPadding)
                            .fillMaxWidth()
                    )
                }
            }
        }
    }
}
