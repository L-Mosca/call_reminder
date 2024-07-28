package com.mosca.call_reminder.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.mosca.call_reminder.presentation.screen.home.HomeScreen

@Composable
fun NavGraph(navController: NavHostController) {
    
    NavHost(navController = navController, startDestination = HomeScreenRoute ) {
       composable<HomeScreenRoute> {
           HomeScreen(navController)
       }
    }
}