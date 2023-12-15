package com.loc.composeglowingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.loc.composeglowingcard.ui.theme.ComposeGlowingCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Black.copy(alpha = 0.9f)),
                    contentAlignment = Alignment.Center
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 16.dp),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            GlowingCard(
                                glowingColor = Color.Cyan,
                                modifier = Modifier.size(100.dp),
                                cornersRadius = 10.dp
                            ) {}

                            GlowingCard(
                                glowingColor = Color.White,
                                modifier = Modifier.size(100.dp),
                                cornersRadius = 10.dp
                            ) {}

                            GlowingCard(
                                glowingColor = Color.Yellow,
                                modifier = Modifier.size(100.dp),
                                cornersRadius = 10.dp
                            ) {}
                        }

                        Spacer(modifier = Modifier.height(50.dp))
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 16.dp),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            GlowingCard(
                                glowingColor = Color.Cyan,
                                modifier = Modifier.size(100.dp),
                                cornersRadius = Int.MAX_VALUE.dp
                            ) {}

                            GlowingCard(
                                glowingColor = Color.White,
                                modifier = Modifier.size(100.dp),
                                cornersRadius = Int.MAX_VALUE.dp
                            ) {}

                            GlowingCard(
                                glowingColor = Color.Yellow,
                                modifier = Modifier.size(100.dp),
                                cornersRadius = Int.MAX_VALUE.dp,
                            ) {}
                        }
                    }
                }
            }
        }
    }
