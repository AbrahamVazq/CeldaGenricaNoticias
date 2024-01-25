package com.example.celdagenricanoticias

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.Switch
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign.Companion.Center
import androidx.compose.ui.text.style.TextAlign.Companion.Left
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.celdagenricanoticias.ui.theme.CeldaGenricaNoticiasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val arrNews: MutableList<ModelExample> = arrayListOf()
        arrNews.add(
            ModelExample("Titulo uno noticia", subtitle = "Subtitulo uno noticas", date = "fecha de hoy mero", image = "ta_bien"))
        arrNews.add(
            ModelExample("Titulo Dos noticia", subtitle = "Subtitulo Dos noticas", date = "fecha de hoy mero", image = "ta_bien"))
        arrNews.add(
            ModelExample("Titulo uno noticia", subtitle = "Subtitulo uno noticas", date = "fecha de hoy mero", image = "ta_bien"))
        arrNews.add(
            ModelExample("Titulo Dos noticia", subtitle = "Subtitulo Dos noticas", date = "fecha de hoy mero", image = "ta_bien"))
        arrNews.add(
            ModelExample("Titulo uno noticia", subtitle = "Subtitulo uno noticas", date = "fecha de hoy mero", image = "ta_bien"))
        arrNews.add(
            ModelExample("Titulo Dos noticia", subtitle = "Subtitulo Dos noticas", date = "fecha de hoy mero", image = "ta_bien"))
        arrNews.add(
            ModelExample("Titulo uno noticia", subtitle = "Subtitulo uno noticas", date = "fecha de hoy mero", image = "ta_bien"))
        arrNews.add(
            ModelExample("Titulo Dos noticia", subtitle = "Subtitulo Dos noticas", date = "fecha de hoy mero", image = "ta_bien"))
        arrNews.add(
            ModelExample("Titulo uno noticia", subtitle = "Subtitulo uno noticas", date = "fecha de hoy mero", image = "ta_bien"))
        arrNews.add(
            ModelExample("Titulo Dos noticia", subtitle = "Subtitulo Dos noticas", date = "fecha de hoy mero", image = "ta_bien"))
        arrNews.add(
            ModelExample("Titulo uno noticia", subtitle = "Subtitulo uno noticas", date = "fecha de hoy mero", image = "ta_bien"))
        arrNews.add(
            ModelExample("Titulo Dos noticia", subtitle = "Subtitulo Dos noticas", date = "fecha de hoy mero", image = "ta_bien"))
        arrNews.add(
            ModelExample("Titulo uno noticia", subtitle = "Subtitulo uno noticas", date = "fecha de hoy mero", image = "ta_bien"))
        arrNews.add(
            ModelExample("Titulo Dos noticia", subtitle = "Subtitulo Dos noticas", date = "fecha de hoy mero", image = "ta_bien"))
        arrNews.add(
            ModelExample("Titulo uno noticia", subtitle = "Subtitulo uno noticas", date = "fecha de hoy mero", image = "ta_bien"))
        arrNews.add(
            ModelExample("Titulo Dos noticia", subtitle = "Subtitulo Dos noticas", date = "fecha de hoy mero", image = "ta_bien"))
        arrNews.add(
            ModelExample("Titulo uno noticia", subtitle = "Subtitulo uno noticas", date = "fecha de hoy mero", image = "ta_bien"))
        arrNews.add(
            ModelExample("Titulo Dos noticia", subtitle = "Subtitulo Dos noticas", date = "fecha de hoy mero", image = "ta_bien"))
        arrNews.add(
            ModelExample("Titulo uno noticia", subtitle = "Subtitulo uno noticas", date = "fecha de hoy mero", image = "ta_bien"))
        arrNews.add(
            ModelExample("Titulo Dos noticia", subtitle = "Subtitulo Dos noticas", date = "fecha de hoy mero", image = "ta_bien"))
        arrNews.add(
            ModelExample("Titulo uno noticia", subtitle = "Subtitulo uno noticas", date = "fecha de hoy mero", image = "ta_bien"))
        arrNews.add(
            ModelExample("Titulo Dos noticia", subtitle = "Subtitulo Dos noticas", date = "fecha de hoy mero", image = "ta_bien"))


        setContent {
            CeldaGenricaNoticiasTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    InfoView()
                    /*
                    LazyColumn(modifier = Modifier.fillMaxSize()){
                        //items(arrNews) { news -> GenericCell(item = news) }
                        items(arrNews) { news -> FilterCell() }
                    }*/

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CeldaGenricaNoticiasTheme {
        Greeting("Android")
    }
}

@Composable
fun GenericCell(item: ModelExample) {
    Column(modifier = Modifier.height(88.dp)) {
        Row(modifier = Modifier.fillMaxSize()) {
            Image(painter = painterResource(id = R.mipmap.ta_bien), contentDescription = "",
                modifier = Modifier
                    .width(56.dp)
                    .height(56.dp))
            Column(modifier = Modifier.fillMaxHeight()) {
                Text(text = item.titulo,
                    modifier = Modifier.padding(top = 16.dp, start = 16.dp),
                    style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold,
                        fontSize = 14.sp))
                Text(text = item.subtitle,
                    modifier = Modifier.padding(top = 0.dp, start = 16.dp),
                    style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Medium,
                        fontSize = 12.sp))
                Text(text = item.date,
                    modifier = Modifier.padding(top = 0.dp, start = 16.dp),
                    style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Thin,
                        fontSize = 10.sp))
            }
        }
    }
}


@Preview
@Composable
fun FilterCell() {
    //var isChecked by remember { mutableStateOf(true) }
    var isChecked = true
    Column(modifier = Modifier.height(56.dp)) {
        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
            .fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceBetween) {
            Text(
                text = "(Categoria)",
                textAlign = Center,
                modifier = Modifier.padding(start = 16.dp),
                style = MaterialTheme.typography.titleMedium
            )

            Switch(
                checked = isChecked,
                onCheckedChange = { isChecked = it }
            )
        }
    }
}

@Preview
@Composable
fun InfoView() {
   Column(modifier = Modifier.height(42.dp)) {
       Row(verticalAlignment = Alignment.CenterVertically,
           modifier = Modifier.fillMaxSize()
           ){
//Esto bien podria ser un comun
           Text(
               text = "Configura el contenido que quieres ver en tu sección de noticias",
               textAlign = Left,
               modifier = Modifier.padding(start = 16.dp, end = 16.dp),
               style = MaterialTheme.typography.bodyMedium.copy(fontWeight = FontWeight.Thin, fontSize = 14.sp)
           )
       }

   }
}



data class ModelExample (
    val titulo: String,
    val subtitle: String,
    val date: String,
    val image: String
)


