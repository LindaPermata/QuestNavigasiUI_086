@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.questnavigasiui_086.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun FormIsian(
    jenisK:List<String> = listOf("Laki-laki","Perempuan"),
    onSubmitBtnClick:() -> Unit,
){
    Scaffold (modifier= Modifier,
        {
            TopAppBar(

            )
        })

}
