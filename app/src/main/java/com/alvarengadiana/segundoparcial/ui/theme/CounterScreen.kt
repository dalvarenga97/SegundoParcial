package com.alvarengadiana.segundoparcial.ui

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Alignment

@Composable
fun CounterScreen(viewModel: CounterViewModel = viewModel()) {
    val count = viewModel.count.collectAsState()

    Column(
        modifier = Modifier.fillMaxSize().wrapContentSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "${count.value}", fontSize = 24.sp, fontWeight = FontWeight.Bold)
        
        Row(modifier = Modifier.wrapContentSize()) {
            Button(onClick = { viewModel.decrement() }) {
                Text(text = "Decrementar")
            }
            Button(onClick = { viewModel.increment() }) {
                Text(text = "Incrementar")
            }
        }
    }
}
