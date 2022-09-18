package com.most.oneapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ChatBubble
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.most.oneapp.ui.theme.ButtonGray

@Composable
fun HomeScreen() {
    Box(
        Modifier
            .background(MaterialTheme.colorScheme.background)
            .fillMaxWidth()
    ) {

        Row(
            Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp, vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = stringResource(R.string.app_name), style = MaterialTheme.typography.titleMedium)
            Spacer(Modifier.weight(1f))
            // icon
            IconButton(
                onClick = {},
                modifier = Modifier
                    .clip(CircleShape)
                    .background(ButtonGray)
            ) {
                Icon(
                    Icons.Rounded.Search,
                    contentDescription = stringResource(id = R.string.search)
                )
            }
            Spacer(modifier = Modifier.width(8.dp))
            IconButton(onClick = {},
                modifier = Modifier
                    .clip(CircleShape)
                    .background(ButtonGray)) {
                Icon(imageVector = Icons.Rounded.ChatBubble, stringResource(id = R.string.search))
            }
        }
    }
}