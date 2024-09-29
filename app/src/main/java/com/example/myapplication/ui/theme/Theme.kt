package com.example.myapplication.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color



// Luodaan mukautettu värijärjestelmä
private val LightColors = lightColorScheme(
    primary = OrangePrimary,  // Ensisijainen väri, käytetään painikkeissa jne.
    secondary = Color(0xFF03DAC6),  // Toissijainen väri
    background = Color(0xFFFFFFFF), // Taustaväri
    surface = Color(0xFFFFFFFF),
    onPrimary = Color.White,  // Tekstiväri, kun tausta on primary
    onSecondary = Color.Black,  // Tekstiväri, kun tausta on secondary
    onBackground = Color.Black,  // Tekstiväri taustaväriin nähden
    onSurface = Color.Black
)

// Jos haluat tukea myös tummaa teemaa, voit lisätä darkColorScheme tähän
private val DarkColors = darkColorScheme(
    primary = OrangePrimary,
    secondary = Color(0xFF03DAC6),
    background = Color(0xFF121212),
    surface = Color(0xFF121212),
    onPrimary = Color.Black,
    onSecondary = Color.White,
    onBackground = Color.White,
    onSurface = Color.White
)

@Composable
fun MyApplicationTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) DarkColors else LightColors

    MaterialTheme(
        colorScheme = colors,
        content = content
    )
}

