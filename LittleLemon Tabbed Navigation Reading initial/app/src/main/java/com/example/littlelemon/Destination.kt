package com.example.littlelemon

import androidx.compose.ui.graphics.vector.ImageVector

interface Destination {
    val route:String
    val icon: Int
    val title:String
}

object Home : Destination{
    override val route: String
        get() = "HOME"
    override val icon: Int
        get() = R.drawable.ic_home
    override val title: String
        get() = "Home"
}


object Menu : Destination{
    override val route: String
        get() = "MENU"
    override val icon: Int
        get() = R.drawable.ic_menu
    override val title: String
        get() = "Menu"
}

object Locations : Destination{
    override val route: String
        get() = "LOCATIONS"
    override val icon: Int
        get() = R.drawable.ic_location
    override val title: String
        get() = "Location"
}