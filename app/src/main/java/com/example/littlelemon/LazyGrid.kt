package com.example.littlelemon

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LazyGrid() {
    // GridCells.Fixed(3) - Fixed 3 card in any rotation
    //GridCells.Adaptive(150.dp) - 150 dp is minimum height+width.
    //Auto decide -> number of Box
    LazyVerticalGrid(columns = GridCells.Adaptive(150.dp)){
        items(50){number ->
            MyGridCell(number = number)
        }
    }
}

@Composable
fun MyGridCell(number: Int) {
    Card(modifier = Modifier.padding(8.dp), elevation = 20.dp) {
        Box(modifier = Modifier.aspectRatio(1f), contentAlignment = Alignment.Center) {
            Text(text = "Item" + number, fontSize = 20.sp)
        }
    }
}