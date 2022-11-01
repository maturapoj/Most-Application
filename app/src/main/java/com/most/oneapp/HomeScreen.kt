package com.most.oneapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.most.oneapp.composable.TopAppBar

@Composable
fun HomeScreen() {
    Box(
        Modifier
            .background(MaterialTheme.colorScheme.background)
            .fillMaxWidth()
    ) {
        TopAppBar("Hello Most", onClickSearch = {}, onClickMessage = {})
    }
}