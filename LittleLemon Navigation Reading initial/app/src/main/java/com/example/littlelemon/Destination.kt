package com.example.littlelemon

interface Destination {
    val route: String
}

object Home : Destination{
    override val route: String
        get() = home
}

object Menu : Destination{
    override val route: String
        get() = menu
}