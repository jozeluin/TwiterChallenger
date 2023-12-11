package com.example.twitterchallenger.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun MyTwiter() {
    Column (Modifier.fillMaxSize()

    ){
        Box(
            Modifier
                .fillMaxSize()
                .weight(1.5f)
                // .padding(1.dp)
                .background(Color(0xFF242323))
        ) {
            BodyTwiter()
        }
        Divider(
            Modifier
                .background(Color(0xFF3A3737))
                .height(2.dp)

        )
        Box(
            Modifier
                .fillMaxSize()
                .weight(1f)
                // .padding(1.dp)
                .background(Color(0xFF242323))
        ) { }

    }

}

@Composable
fun BodyTwiter() {
    Box (
        Modifier
            .height(200.dp)
            .width(300.dp)
            .background(Color.Red)
    ){}

}
