package dev.blend.util.render

import java.awt.Color

object ColorUtil {

    @JvmStatic
    fun mixColors(primary: Color, secondary: Color, factor: Double): Color {
        val otherFactor = 1.0 - factor
        val redFactor = (primary.red * otherFactor + secondary.red * otherFactor).toInt()
        val greenFactor = (primary.green * otherFactor + secondary.green * otherFactor).toInt()
        val blueFactor = (primary.blue * otherFactor + secondary.blue * otherFactor).toInt()
        return Color(redFactor, greenFactor, blueFactor)
    }
    @JvmStatic
    fun applyOpacity(color: Color, opacity: Double): Color {
        return Color(color.red, color.green, color.blue, (opacity / 255.0).toInt())
    }
    @JvmStatic
    fun setOpacity(color: Color, opacity: Int): Color {
        return Color(color.red, color.green, color.blue, opacity)
    }

}