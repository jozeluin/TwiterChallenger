package com.example.twitterchallenger.ui


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box


import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextAlign.Companion.End
import androidx.compose.ui.text.style.TextAlign.Companion.Start
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.twitterchallenger.R

@Preview
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

    Row() {


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
                    .size(75.dp)
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

    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(end = 20.dp)) {
        Row(modifier = Modifier.padding(top = 15.dp)) {
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.5f),
                text = "JLuis",
                color = Color.White,
                fontWeight = FontWeight.Bold
            )
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                text = "@JLuis 4h",
                //textAlign = Start,
                color = Color.Gray
            )

            Icon(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 70.dp)


                    .weight(1f),
                painter = painterResource(id = R.drawable.ic_dots),
                tint = Color.White,
                contentDescription = "null" // decorative element,

            )
        }
        Spacer(modifier = Modifier.size(2.dp))
        Text(modifier = Modifier.fillMaxWidth(),
            text = "Descripcion larga sobre dwd",
            color = Color.White, )


    }


}
