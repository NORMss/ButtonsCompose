package com.norm.mybuttonscompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.norm.mybuttonscompose.ui.theme.MyButtonsComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyButtonsComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {

                        //https://m3.material.io/components/all-buttons

                        Text(
                            text = "High emphasis – For the primary, most important, or most common action on a screen",
                            modifier = Modifier
                                .fillMaxWidth(0.9f)
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Button(
                            onClick = {

                            }
                        ) {
                            Text(
                                text = "Button"
                            )
                        }
                        Text(
                            text = "Medium emphasis – For important actions that don’t distract from other onscreen elements",
                            modifier = Modifier
                                .fillMaxWidth(0.9f)
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        ElevatedButton(onClick = { /*TODO*/ }) {
                            Icon(
                                imageVector = Icons.Outlined.Add,
                                contentDescription = "add",
                                modifier = Modifier.size(16.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = "ElevatedButton"
                            )
                        }
                        FilledTonalButton(onClick = { /*TODO*/ }) {
                            Text(
                                text = "FilledTonalButton"
                            )
                        }
                        OutlinedButton(onClick = { /*TODO*/ }) {
                            Text(
                                text = "OutlinedButton"
                            )
                        }
                        Text(
                            text = "Low emphasis – For optional or supplementary actions with the least amount of prominence",
                            modifier = Modifier
                                .fillMaxWidth(0.9f)
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        TextButton(onClick = { /*TODO*/ }) {
                            Text(
                                text = "TextButton"
                            )
                        }
                    }
                }
            }
        }
    }
}