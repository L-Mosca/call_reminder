package com.mosca.call_reminder.presentation.screen.home.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mosca.call_reminder.R
import com.mosca.call_reminder.presentation.base.BaseText

@Composable
fun RecordList() {
    val list = mutableListOf<String>(
        "Gravação",
        "Gravação",
        "Gravação",
        "Gravação",
        "Gravação",
        "Gravação",
        "Gravação",
        "Gravação",
        "Gravação",
        "Gravação",
        "Gravação",
        "Gravação",
        "Gravação",
        "Gravação",
        "Gravação",
        "Gravação",
        "Gravação",
        "Gravação",
        "Gravação",
        "Gravação",
        "Gravação",
        "Gravação",
        "Gravação",
        "Gravação",
        "Gravação",
        "Gravação",
        "Gravação",
        "Gravação",
        "Gravação",
    )
    LazyColumn(modifier = Modifier.padding(horizontal = 20.dp)) {
        list.forEach { _ ->
            item { RecordItem() }
        }
    }
}

@Composable
fun RecordItem() {
    Box(contentAlignment = Alignment.Center, modifier = Modifier.padding(vertical = 5.dp)) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
        ) {
            PlayButton()
            Spacer(modifier = Modifier.width(14.dp))
            Column(verticalArrangement = Arrangement.SpaceAround) {
                BaseText(text = "Audio name", fontWeight = FontWeight.W600)
                BaseText(
                    text = "27/05/2022 - 00:36:27",
                    fontSize = 10.sp,
                    color = colorResource(id = R.color.gray_600)
                )
                Spacer(modifier = Modifier.height(8.dp))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RecordListPreview() {
    RecordList()
}