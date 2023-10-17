package com.example.weatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.leanback.widget.Row
import com.example.weatherapp.ui.theme.WeatherAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AllFunction()
                }
            }
        }
    }
}

@Composable
fun AllFunction() {
    Column (modifier = Modifier
        .padding(20.dp)
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Spacer(modifier = Modifier.padding(7.dp))
        Text(
            text = "WEATHER APP",
            fontSize = 30.sp
        )
        Spacer(modifier = Modifier.padding(8.dp))
        StatusWeather()
        Spacer(modifier = Modifier.padding(8.dp))
        LocTemp()
        Spacer(modifier = Modifier.padding(8.dp))
        Statusss()
    }
}

@Composable
fun StatusWeather(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .clip(RoundedCornerShape(20.dp))
        .background(color = Color.LightGray)){
        Column (modifier = Modifier
            .padding(13.dp)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally){
            Image(painter = painterResource(id = R.drawable.background),
                contentDescription = null,
                modifier = Modifier
                    .size(200.dp))
            Text(text = "Rain", fontSize = 30.sp)
        }
    }
}

@Composable
fun LocTemp(){
    Text(
        text = "21°C",
        fontWeight = FontWeight.Bold,
        fontSize = 64.sp,
        textAlign = TextAlign.Center,
        modifier = Modifier.fillMaxWidth()
    )
    Spacer(modifier = Modifier.padding(8.dp))
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ){
        Image(
            painter = painterResource(id = R.drawable.baseline_location_on_24),
            contentDescription = "Map"
        )
        Spacer(modifier = Modifier.padding(3.dp))
        Text(
            "Yogyakarta",
            fontSize = 30.sp,
            textAlign = TextAlign.Center
        )
    }
    Spacer(modifier = Modifier.padding(8.dp))
    Text(
        text = "Tamantirto, Kasihan, Bantul, Daerah Istimewa Yogyakarta",
        fontSize = 20.sp,
        color = Color.Gray,
        textAlign = TextAlign.Center,
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
fun Statusss() {
    Box(modifier = Modifier
        .fillMaxWidth()
        .clip(RoundedCornerShape(20.dp))
        .background(color = Color.LightGray)) {
        Column(
            modifier = Modifier
                .padding(13.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row {
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .padding(4.dp)
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Humidity",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "60%",
                        fontSize = 18.sp
                    )
                }
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .padding(4.dp)
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "UV Index",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "5",
                        fontSize = 18.sp
                    )
                }
            }
            Row {
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .padding(4.dp)
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Sunrise",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "6:00 AM",
                        fontSize = 18.sp
                    )
                }
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .padding(4.dp)
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Sunset",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "6:00 PM",
                        fontSize = 18.sp
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    WeatherAppTheme {
        Box(modifier = Modifier
            .fillMaxSize()
            .background(Color.White))
        AllFunction()
    }
}