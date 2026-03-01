package com.example.simulator8085

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                SimulatorHomeScreen()
            }
        }
    }
}

@Composable
private fun SimulatorHomeScreen() {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Text(
                text = "8085 Simulator",
                style = MaterialTheme.typography.headlineMedium
            )
            FeatureCard(
                title = "CPU Module",
                description = "Registers, flags, and fetch-decode-execute cycle."
            )
            FeatureCard(
                title = "Memory Module",
                description = "64KB memory map with pluggable RAM/ROM segments."
            )
            FeatureCard(
                title = "Assembler Module",
                description = "Convert basic 8085 assembly programs into opcodes."
            )
            FeatureCard(
                title = "Debugger Module",
                description = "Step execution, breakpoints, and register inspection."
            )
        }
    }
}

@Composable
private fun FeatureCard(title: String, description: String) {
    Card {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = title, style = MaterialTheme.typography.titleMedium)
            Text(text = description, style = MaterialTheme.typography.bodyMedium)
        }
    }
}
