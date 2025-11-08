package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AiMagic: ImageVector
    get() {
        if (_aiMagic != null) {
            return _aiMagic!!
        }
        _aiMagic = ImageVector.Builder(
            name = "AiMagic",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 7f)
        lineTo(9.48415f, 8.39405f)
        curveTo(8.80774f, 10.222f, 8.46953f, 11.136f, 7.80278f, 11.8028f)
        curveTo(7.13603f, 12.4695f, 6.22204f, 12.8077f, 4.39405f, 13.4842f)
        lineTo(3f, 14f)
        lineTo(4.39405f, 14.5158f)
        curveTo(6.22204f, 15.1923f, 7.13603f, 15.5305f, 7.80278f, 16.1972f)
        curveTo(8.46953f, 16.864f, 8.80774f, 17.778f, 9.48415f, 19.6059f)
        lineTo(10f, 21f)
        lineTo(10.5158f, 19.6059f)
        curveTo(11.1923f, 17.778f, 11.5305f, 16.864f, 12.1972f, 16.1972f)
        curveTo(12.864f, 15.5305f, 13.778f, 15.1923f, 15.6059f, 14.5158f)
        lineTo(17f, 14f)
        lineTo(15.6059f, 13.4842f)
        curveTo(13.778f, 12.8077f, 12.864f, 12.4695f, 12.1972f, 11.8028f)
        curveTo(11.5305f, 11.136f, 11.1923f, 10.222f, 10.5158f, 8.39405f)
        lineTo(10f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 3f)
        lineTo(17.7789f, 3.59745f)
        curveTo(17.489f, 4.38087f, 17.3441f, 4.77259f, 17.0583f, 5.05833f)
        curveTo(16.7726f, 5.34408f, 16.3809f, 5.48903f, 15.5975f, 5.77892f)
        lineTo(15f, 6f)
        lineTo(15.5975f, 6.22108f)
        curveTo(16.3809f, 6.51097f, 16.7726f, 6.65592f, 17.0583f, 6.94167f)
        curveTo(17.3441f, 7.22741f, 17.489f, 7.61913f, 17.7789f, 8.40255f)
        lineTo(18f, 9f)
        lineTo(18.2211f, 8.40255f)
        curveTo(18.511f, 7.61913f, 18.6559f, 7.22741f, 18.9417f, 6.94166f)
        curveTo(19.2274f, 6.65592f, 19.6191f, 6.51097f, 20.4025f, 6.22108f)
        lineTo(21f, 6f)
        lineTo(20.4025f, 5.77892f)
        curveTo(19.6191f, 5.48903f, 19.2274f, 5.34408f, 18.9417f, 5.05833f)
        curveTo(18.6559f, 4.77259f, 18.511f, 4.38087f, 18.2211f, 3.59745f)
        lineTo(18f, 3f)
        }
        }.build()

        return _aiMagic!!
    }

private var _aiMagic: ImageVector? = null
