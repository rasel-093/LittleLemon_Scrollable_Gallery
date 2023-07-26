package com.example.littlelemon

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LazyLisScroll() {
    LazyRow(state = rememberLazyListState()) {
        items(500) {
                  MyCard(number = it)
        }
    }
    Spacer(modifier = Modifier.height(5.dp))
    LazyColumn(state = rememberLazyListState()) {
            items(5000) {
                 MyCard(number = it)
            }
        }
}

@Composable
fun MyCard(number:Int) {
    Card() {
        Text(
            text = number.toString(),
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        )
    }
}
