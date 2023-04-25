package com.example.cartodevisitas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cartodevisitas.ui.theme.CartãoDeVisitasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CartãoDeVisitasTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Black
                ) {
                    PlanoDeFundo()

                }
            }
        }
    }
}

@Composable
fun PlanoDeFundo() {
       Image(
           painter = painterResource(id = R.drawable.fundo),
           contentDescription = null,
           contentScale = ContentScale.Crop
       )
    Cabecalho()
    Rodape()
}

@Composable
fun Rodape() {
    Column(   modifier = Modifier
        .padding(start = 20.dp),
        verticalArrangement = Arrangement.Bottom,
    ) {
        Contato()
        Contato()
        Contato()


    }

}

@Composable
fun Contato() {


    Row() {
        Image(
            painter = painterResource(id = R.drawable.contato),
            contentDescription = null,
        contentScale = ContentScale.Crop,
            modifier = Modifier.size(30.dp)
                .clip(CircleShape)

        )
        Text(
            text = "xxxx-xxxxx",
        fontSize = 20.sp,
        color = Color.White,
        fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun Cabecalho() {
    Column(
        modifier = Modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
      Image(
          painter = painterResource(id = R.drawable.icone),
          contentDescription = null,
          contentScale = ContentScale.Crop,
          modifier = Modifier.size(150.dp),
      )
        Text(
            text =  "Nicolas Cesar De Lima Soares",
            fontSize = 30.sp,
            color = Color.Red,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Programador",
            fontSize = 25.sp,
            color = Color.White,
            fontWeight = FontWeight.Bold

        )



    }
}





