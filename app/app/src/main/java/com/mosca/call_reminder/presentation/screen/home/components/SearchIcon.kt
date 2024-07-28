package com.mosca.call_reminder.presentation.screen.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mosca.call_reminder.R

@Composable
fun SearchIcon() {
    Box(
        modifier = Modifier
            .size(40.dp)
            .clip(CircleShape)
            .background(color = colorResource(id = R.color.gray_300)),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_search),
            contentDescription = stringResource(id = R.string.search),
            contentScale = ContentScale.Crop,
        )
    }
}

@Preview
@Composable
fun SearchIconPreview() {
    SearchIcon()
}