package com.company0ne.recyclerview_jetpack_compose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            CircularImage()
            PreviewItem()
        }
    }
}

//Image modifier composable
@Preview(showBackground = true, widthDp = 300, heightDp = 500)
@Composable
private fun PreviewFunction() {
    Text(text = "Hello",
        color = Color.White,
        modifier = Modifier
            .clickable { }
            .background(Color.Blue)
            .size(200.dp)
            .border(4.dp, Color.Red)
            .clip(CircleShape)
            .background(Color.Yellow)
    )
}

@Composable
fun ListViewItem(imgId: Int, name: String, occupation: String, modifier: Modifier) {
    Row(modifier.padding(8.dp)) {
        Image(
            painter = painterResource(id = imgId),
            contentDescription = "",
            modifier = Modifier.size(40.dp)
        )
        Column() {
            Text(
                text = name,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = occupation,
                fontWeight = FontWeight.Light,
                fontSize = 12.sp
            )
        }
    }
}

@Composable
fun CircularImage() {
    val painter = painterResource(R.drawable.flag)
    Image(
        painter = painter,
        contentDescription = "Circular Image",
        modifier = Modifier
            .size(80.dp)
            .clip(CircleShape)
            .border(2.dp, Color.LightGray, CircleShape)
    )
}

@Composable
fun TextInput() {
    val state = remember {
        mutableStateOf(" ")
    }
    TextField(value = state.value, onValueChange = {
        state.value = it
    })
}





