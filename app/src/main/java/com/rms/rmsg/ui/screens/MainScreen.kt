@file:OptIn(ExperimentalPagerApi::class, ExperimentalPagerApi::class)

package com.rms.rmsg.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.rememberPagerState
import com.rms.rmsg.repository.getAllPagerModels
import com.rms.rmsg.repository.getPages
import com.rms.rmsg.ui.theme.Coral
import com.rms.rmsg.ui.theme.DarkPurple
import com.rms.rmsg.ui.theme.Purple
import com.rms.rmsg.ui.views.SoundText

val pages = getPages(getAllPagerModels())

@Composable
fun MainScreen() {
    val pagerstate = rememberPagerState(
        pageCount = pages.size,
        initialOffscreenLimit = 3,
        initialPage = 0
    )
    Surface(modifier = Modifier.fillMaxSize(), color = DarkPurple) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.Start
        ) {
            Spacer(modifier = Modifier.height(20.dp))
            SoundText(text = "Play")
            Spacer(modifier = Modifier.height(20.dp))
            Column(
                modifier = Modifier
                    .clip(RoundedCornerShape(48.dp, 48.dp, 0.dp, 0.dp))
                    .fillMaxSize()
                    .background(
                        Purple
                    ),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                HorizontalPager(
                    state = pagerstate,
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.Start,
                    verticalAlignment = Alignment.Top
                ) { page ->
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Spacer(modifier = Modifier.height(20.dp))
                        Row {
                            var columnsCount = 0
                            while (columnsCount < pages[page].size) {
                                Column(
                                    modifier = Modifier.weight(1F),
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ) {
                                    var j = 0
                                    while (j < pages[page][columnsCount].size) {
                                        Button(
                                            onClick = { /*TODO*/ },
                                            modifier = Modifier
                                                .clip(RoundedCornerShape(24.dp))
                                                .background(Coral)
                                                .width(150.dp)
                                                .height(80.dp),
                                            colors = ButtonDefaults.buttonColors(backgroundColor = Coral)
                                        ) {
                                            SoundText(
                                                text = pages[page][columnsCount][j].title,
                                                padding_start = 0.dp,
                                                size = 18.sp
                                            )
                                        }
                                        Spacer(modifier = Modifier.height(20.dp))
                                        j++
                                    }
                                }
                                columnsCount++
                            }
                        }
                    }
                }
                Spacer(modifier = Modifier.height(20.dp))
                HorizontalPagerIndicator(
                    pagerState = pagerstate,
                    activeColor = Yellow,
                    inactiveColor = Color.DarkGray,
                    indicatorWidth = 20.dp,
                    indicatorHeight = 5.dp,
                    indicatorShape = RoundedCornerShape(5.dp)
                )
            }
        }
    }
}

@Preview
@Composable
fun MainScreenPreview() {
    MainScreen()
}