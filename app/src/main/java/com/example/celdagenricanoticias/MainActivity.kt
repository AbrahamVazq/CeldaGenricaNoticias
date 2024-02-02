package com.example.celdagenricanoticias

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.Switch
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
        setContent {
            CeldaGenricaNoticiasTheme {
                ViewContainer()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ViewContainer() {

    val arrNews: MutableList<ModelExample> = arrayListOf( ModelExample("Titulo uno noticia", subtitle = "Subtitulo uno noticas", date = "fecha de hoy mero", image = "ta_bien", category = "Politica"),
        ModelExample("Titulo Dos noticia", subtitle = "Subtitulo Dos noticas", date = "fecha de hoy mero", image = "ta_bien", category = "Ciencia y salud"),
    ModelExample("Titulo uno noticia", subtitle = "Subtitulo uno noticas", date = "fecha de hoy mero", image = "ta_bien", category = "Entretenimiento"),
    ModelExample("Titulo Tres noticia", subtitle = "Subtitulo Tres noticas", date = "fecha de hoy mero", image = "ta_bien", category = "Farandula"),
    ModelExample("Titulo Cuatro noticia", subtitle = "Subtitulo Cuatro noticas", date = "fecha de hoy mero", image = "ta_bien", category = "Redes Sociales"),
    ModelExample("Titulo Cinco  noticia", subtitle = "Subtitulo Cinco noticas", date = "fecha de hoy mero", image = "ta_bien", category = "Juegos"),
    ModelExample("Titulo Seis noticia", subtitle = "Subtitulo Seis noticas", date = "fecha de hoy mero", image = "ta_bien", category = "Mundo"),
    ModelExample("Titulo Siete noticia", subtitle = "Subtitulo Siete noticas", date = "fecha de hoy mero", image = "ta_bien", category = "Economia"),
            ModelExample("Titulo Ocho noticia", subtitle = "Subtitulo Ocho noticas", date = "fecha de hoy mero", image = "ta_bien", category = "Deportes"))

    Surface(
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp)
        ) {
            
            TopBar()
            ViewCategoryNew()
            Spacer(modifier = Modifier.height(2.dp))
            LazyColumn(modifier = Modifier.weight(1f)) {
                items(arrNews) {
                    news -> GenericCell(item = news)
                    Divider(color = Color.Gray, thickness = 0.5.dp)}
            }
            Spacer(modifier = Modifier.height(5.dp))
            FooterTVInfo()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun TopBar(){
    TopAppBar(title = { Text(text = "Noticias") },
        actions = {
            IconButton(onClick = { /* que hacer cuando le den tap al boton (NAVEGACION PADRINO)*/ }) {
                Icon(imageVector = Icons.Default.Settings, contentDescription = "filtro")
            }
        }
    )
}

@Composable
fun GenericCell(item: ModelExample) {
    Column(
        modifier = Modifier
            .height(88.dp)
            .background(Color.White)) {

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxSize()) {

            Image(painter = painterResource(id = R.mipmap.ta_bien), contentDescription = "",
                modifier = Modifier
                    //.padding(start = 16.dp)
                    .width(56.dp)
                    .height(56.dp))

            Column(
                modifier = Modifier.padding(start = 4.dp),
                verticalArrangement = Arrangement.Top) {

                Text(text = item.category,
                    modifier = Modifier.padding(top = 2.dp, start = 16.dp),
                    style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold,
                        fontSize = 10.sp, color = Color.Gray))
                Text(text = item.titulo,
                    modifier = Modifier.padding(top = 2.dp, start = 16.dp),
                    style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold,
                        fontSize = 14.sp))
                Text(text = item.subtitle,
                    modifier = Modifier.padding(top = 0.dp, start = 16.dp),
                    style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Medium,
                        fontSize = 12.sp))
                Text(text = item.date,
                    modifier = Modifier.padding(top = 8.dp, start = 16.dp),
                    style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Thin,
                        fontSize = 10.sp))
            }
        }
    }
}


@Preview
@Composable
fun GenericCell() {
    Column(
        modifier = Modifier
            .height(88.dp)
            .background(Color.White)) {

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxSize()) {

            Image(painter = painterResource(id = R.mipmap.ta_bien), contentDescription = "",
                modifier = Modifier
                    .width(56.dp)
                    .height(56.dp))

            Column(
                modifier = Modifier.padding(start = 4.dp),
                verticalArrangement = Arrangement.Top) {

                Text(text = "categoria",
                    modifier = Modifier.padding(top = 2.dp, start = 16.dp),
                    style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold,
                        fontSize = 10.sp, color = Color.Gray))
                Text(text = "Titulo Noticia",
                    modifier = Modifier.padding(top = 2.dp, start = 16.dp),
                    style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold,
                        fontSize = 14.sp))
                Text(text = "Subtitulo Noticia",
                    modifier = Modifier.padding(top = 0.dp, start = 16.dp),
                    style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Medium,
                        fontSize = 12.sp))
                Text(text = "Miercoles 23 de Enero del 2024",
                    modifier = Modifier.padding(top = 8.dp, start = 16.dp),
                    style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Thin,
                        fontSize = 10.sp))
            }
        }
    }
}


@Preview
@Composable
fun FooterTVInfo() {
    Column(modifier = Modifier
        .height(60.dp)
        .background(Color.White)) {

        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxSize()) {

            Image(painter = painterResource(id = R.mipmap.info), contentDescription = "",
                modifier = Modifier
                    .padding(start = 16.dp)
                    .width(16.dp)
                    .height(16.dp)
            )

           Row(verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(start = 2.dp),
                horizontalArrangement = Arrangement.SpaceBetween) {

                Text(
                    text = "TV Azteca",
                    textAlign = Center,
                    modifier = Modifier.padding(start = 2.dp),
                    style = MaterialTheme.typography.titleMedium.copy(
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp
                    )
                )
            }
        }
    }
}

@Preview
@Composable
fun ViewCategoryNew() {
    Column(modifier = Modifier
        .height(68.dp)
        .background(Color.White),
        verticalArrangement = Arrangement.spacedBy(8.dp))
    {
        LazyRow(modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp)
            .height(60.dp),
            verticalAlignment = Alignment.CenterVertically) {
            items(5) {
                index -> CategoryButton()
            }
        }
        Spacer(modifier = Modifier.width(6.dp))
    }
}

@Preview
@Composable
fun CategoryButton() {
    Button(onClick = { },
        modifier = Modifier
            .height(36.dp)
            .padding(start = 2.dp, end = 2.dp)
            .border(1.dp, Color.White, RoundedCornerShape(0.5.dp))
            .background(Color.White,)
    ) {
        Text(text = "(Categorias)",
            color = Color.White)
    }
}

data class ModelExample (
    val titulo: String,
    val subtitle: String,
    val date: String,
    val image: String,
    var category: String
)
