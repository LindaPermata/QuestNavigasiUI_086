package com.example.questnavigasiui_086

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

enum class Navigasi {
    Formulirku,
    Detail
}

@Composable
fun DataApp(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier
){
    Scaffold { isiRuang->
        NavHost(
            NavController = navController,
            startDestination = Navigasi.Formulirku.name,

            modifier = Modifier.padding( isiRuang )){
            composable(route = Navigasi.Formulirku.name){
                FormIsian (
                    OnSubmitBtnClick = {
                        navController.navigate(Navigasi.Detail.name)
                    }
                )
            }
        }

    }

}