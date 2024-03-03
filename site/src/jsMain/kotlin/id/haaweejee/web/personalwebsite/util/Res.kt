package id.haaweejee.web.personalwebsite.util

import com.varabyte.kobweb.compose.ui.graphics.Color
import org.jetbrains.compose.web.css.rgb

object Res {
    enum class Theme(val color: Color) {
        BLUE(color = Color.rgb(r = 33, g = 150, b = 243)),
        LIGHT_BLUE(color = Color.rgb(r = 168, g = 236, b = 255)),
        DARK_BLUE(color = Color.rgb(r = 34, g = 63, b = 94)),
        SOCIAL_ICON_BACKGROUND_LIGHT(color = Color.rgb(r = 230, g = 230, b = 230)),
        SOCIAL_ICON_BACKGROUND_DARK(color = Color.rgb(r = 48, g = 82, b = 118)),
        GRADIENT_ONE(color = Color.rgb(r = 161, g = 196, b = 253)),
        GRADIENT_ONE_DARK(color = Color.rgb(r = 19, g = 38, b = 58)),
        GRADIENT_TWO(color = Color.rgb(r = 194, g = 233, b = 251)),
        GRADIENT_TWO_DARK(color = Color.rgb(r = 20, g = 46, b = 73)),
    }

    object Icon {
        const val EMAIL_LIGHT = "mail.svg"
        const val EMAIL_DARK = "mail_light.svg"
        const val GITHUB_LIGHT = "github_light.svg"
        const val GITHUB = "github.svg"
        const val INSTAGRAM = "instagram.svg"
        const val INSTAGRAM_LIGHT = "instagram_light.svg"
        const val GITLAB = "gitlab.svg"
        const val GITLAB_LIGHT = "gitlab_light.svg"
        const val SUN = "sun.svg"
        const val MOON = "moon.svg"
    }

    object Image {
        const val PROFILE_PHOTO = "photo.jpg"
    }

    object String {
        const val NAME = "Hendrawan Wibowo Jatmiko"
        const val PROFESSION = "Android Developer"
        const val ABOUT_ME = "Android Developer with two years of experience in mobile app development. I graduated from Raharja University with a degree in Informatics Engineering. At Harian Kompas, I worked on the 'Kompas.id' Android application, reaching 500k downloads on the play store."
        const val BUTTON_TEXT = "Get in touch"
        const val ROBOTO_CONDENSED = "RobotoCondensedBold"
        const val ROBOTO_REGULAR = "RobotoRegular"
        const val MY_EMAIL = "mailto:hendrawanwib@gmail.com"
        const val SAVED_THEME = "theme"
    }

    object Dimens {
        const val BORDER_RADIUS = 8
        const val MAX_CARD_WIDTH = 1000
        const val MAX_CARD_HEIGHT = 600
        const val ICON_SIZE = 24
        const val ICON_SIZE_LG = 32
    }
}