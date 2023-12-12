package com.example.twitterchallenger.ui


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.twitterchallenger.R


@Composable
fun MyTwiter() {
    Column(
        Modifier.fillMaxSize()

    ) {
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
                .background(Color(0xFF3C3B3B))
                .height(1.dp)

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

    Row(Modifier.fillMaxSize()) {


        Column(
            modifier = Modifier
                .fillMaxSize()
                .weight(0.75f)
                .background(Color(0xFF242323)),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Image(
                painter = painterResource(id = R.drawable.profile),
                contentDescription = "Imagen de la izquierda",
                modifier = Modifier
                    .size(100.dp)
                    .padding(10.dp)
                    .clip(
                        CircleShape
                    )
            )

        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .weight(2f)
                .background(Color(0xFF242323))
        ) {
            Mensajes()

        }
    }


}

@Composable
fun Mensajes() {
    Column(
        Modifier
            .fillMaxSize()
            .padding(end = 40.dp, start = 10.dp)
    ) {
        Row(Modifier.weight(0.5f)) {

            Text(text = "Aris", color = Color(0xff4ea8e9), textAlign = TextAlign.Right)

        }
        Divider(
            Modifier
                .background(Color(0xFF3C3B3B))
                .height(1.dp)

        )
        Row(Modifier.weight(2.5f)) {

        }
        Divider(
            Modifier
                .background(Color(0xFF3C3B3B))
                .height(1.dp)

        )
        Row(Modifier.weight(2.5f)) {

        }


    }
}
