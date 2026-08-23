package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SunMoon: ImageVector
    get() {
        if (_sunMoon != null) {
            return _sunMoon!!
        }
        _sunMoon = ImageVector.Builder(
            name = "SunMoon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(16.5f, 11.5f)
            curveTo(16.5f, 9.567f, 14.933f, 8f, 13f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(13.5f, 2.5f)
            verticalLineTo(4.5f)
            moveTo(19.5018f, 4.5f)
            lineTo(18.0028f, 5.99902f)
            moveTo(21.5018f, 10.5f)
            horizontalLineTo(19.502f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(17f, 16.5314f)
            curveTo(16.116f, 17.0034f, 15.1064f, 17.271f, 14.0343f, 17.271f)
            curveTo(10.552f, 17.271f, 7.72899f, 14.448f, 7.72899f, 10.9657f)
            curveTo(7.72899f, 9.89358f, 7.99657f, 8.88398f, 8.46857f, 8f)
            curveTo(5.33406f, 8.73462f, 3f, 11.548f, 3f, 14.9065f)
            curveTo(3f, 18.8241f, 6.17586f, 22f, 10.0935f, 22f)
            curveTo(13.452f, 22f, 16.2654f, 19.6659f, 17f, 16.5314f)
            close()
        }
        }.build()

        return _sunMoon!!
    }

private var _sunMoon: ImageVector? = null
