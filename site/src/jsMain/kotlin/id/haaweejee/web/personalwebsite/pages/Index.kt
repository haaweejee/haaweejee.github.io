package id.haaweejee.web.personalwebsite.pages

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.css.functions.LinearGradient
import com.varabyte.kobweb.compose.css.functions.linearGradient
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backgroundImage
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import id.haaweejee.web.personalwebsite.components.ProfileCard
import id.haaweejee.web.personalwebsite.components.ThemeSwitchButton
import id.haaweejee.web.personalwebsite.util.Res
import kotlinx.browser.localStorage
import org.jetbrains.compose.web.dom.Text

@Page
@Composable
fun HomePage() {
    var colorMode by ColorMode.currentState

    LaunchedEffect(colorMode) {
        val savedTheme = localStorage.getItem(Res.String.SAVED_THEME) ?: ColorMode.LIGHT.name
        colorMode = ColorMode.valueOf(savedTheme)
    }

    ThemeSwitchButton(
        colorMode = colorMode
    ) {
        colorMode = colorMode.opposite
        localStorage.setItem(Res.String.SAVED_THEME, colorMode.name)
    }

    Box(
        Modifier
            .fillMaxSize()
            .backgroundImage(
                linearGradient(
                    dir = LinearGradient.Direction.ToRight,
                    from = if (colorMode.isLight) Res.Theme.GRADIENT_ONE.color else Res.Theme.GRADIENT_ONE_DARK.color,
                    to = if (colorMode.isLight) Res.Theme.GRADIENT_TWO.color else Res.Theme.GRADIENT_TWO_DARK.color
                )
            ),
        contentAlignment = Alignment.Center
    ) {
        ProfileCard(colorMode)
    }
}
