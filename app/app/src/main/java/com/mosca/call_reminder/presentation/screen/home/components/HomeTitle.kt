package com.mosca.call_reminder.presentation.screen.home.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.mosca.call_reminder.R
import com.mosca.call_reminder.presentation.base.BaseText

@Composable
fun HomeTitle() {
    BaseText(
        text = stringResource(id = R.string.recording),
        fontSize = 32.sp,
        fontWeight = FontWeight.W600
    )
}

@Preview
@Composable
fun HomeTitlePreview() {
    HomeTitle()
}