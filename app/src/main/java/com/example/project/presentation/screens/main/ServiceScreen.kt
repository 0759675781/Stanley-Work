package com.example.project.presentation.screens.main

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.project.MainViewModel

@Composable
fun ServiceScreen(navController: NavController, vm: MainViewModel) {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "Service Screen")


        BottomNavigationMenu(
            selectedItem = BottomNavigationItem.SERVICES,
            navController = navController
        )

    }
}