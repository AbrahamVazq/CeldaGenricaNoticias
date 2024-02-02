package com.example.celdagenricanoticias

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.celdagenricanoticias.ui.theme.CeldaGenricaNoticiasTheme

class FilterNews:  ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setContent {
            CeldaGenricaNoticiasTheme {
                ViewFilterContainer()
            }
        }

    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ViewFilterContainer() {
    Surface(
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp)
        ){

            TopBar()
            InfoView()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun TopFilterBar(){
    TopAppBar(
        title = { Text( text = "Configuración de noticias") },
        navigationIcon = {
            IconButton(onClick = {
                //QUE HACER CUANDO LE DAS TAP. GENREALEMNTE IR ATRAS
            }
            ) {
                Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Regresar")
            }
        }
    )
}

@Preview
@Composable
fun InfoView() {

    Column(modifier = Modifier
        .height(42.dp)
        .background(Color.White)) {

        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxSize()
        ){

            Text(
                text = "Configura el contenido que quieres ver en tu sección de noticias",
                textAlign = TextAlign.Left,
                modifier = Modifier.padding(start = 16.dp, end = 16.dp),
                style = MaterialTheme.typography.bodyMedium.copy(fontWeight = FontWeight.Medium, fontSize = 14.sp)
            )
        }
    }
}



@Composable
fun FilterCell(withCategory: Categories) {
    //var isChecked by remember { mutableStateOf(true) }
    var isChecked = true
    Column(modifier = Modifier
        .height(56.dp)
        .background(Color.White)) {

        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceBetween) {

            Text(
                text = withCategory.category,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(start = 16.dp),
                style = MaterialTheme.typography.titleMedium
            )

            Switch(
                modifier = Modifier.padding(end = 16.dp),
                checked = isChecked,
                onCheckedChange = { isChecked = it }
            )
        }
    }
}



data class Categories (
    val category: String,
    var isActive: Boolean
)

