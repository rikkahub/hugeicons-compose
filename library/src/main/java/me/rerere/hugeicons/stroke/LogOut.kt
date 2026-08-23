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

val HugeIcons.LogOut: ImageVector
    get() {
        if (_logOut != null) {
            return _logOut!!
        }
        _logOut = ImageVector.Builder(
            name = "LogOut",
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
            moveTo(19.996f, 12f)
            horizontalLineTo(9.99603f)
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
            moveTo(13.9724f, 6f)
            curveTo(13.9259f, 4.90656f, 13.7875f, 4.20981f, 13.3761f, 3.67372f)
            curveTo(13.2165f, 3.46572f, 13.0303f, 3.27954f, 12.8223f, 3.11994f)
            curveTo(12.0144f, 2.5f, 10.8416f, 2.5f, 8.49603f, 2.5f)
            curveTo(6.15046f, 2.5f, 4.97767f, 2.5f, 4.16975f, 3.11994f)
            curveTo(3.96175f, 3.27954f, 3.77557f, 3.46572f, 3.61597f, 3.67372f)
            curveTo(2.99603f, 4.48164f, 2.99603f, 5.65442f, 2.99603f, 8f)
            lineTo(2.99603f, 16f)
            curveTo(2.99603f, 18.3456f, 2.99603f, 19.5184f, 3.61597f, 20.3263f)
            curveTo(3.77557f, 20.5343f, 3.96175f, 20.7205f, 4.16975f, 20.8801f)
            curveTo(4.97767f, 21.5f, 6.15046f, 21.5f, 8.49603f, 21.5f)
            curveTo(10.8416f, 21.5f, 12.0144f, 21.5f, 12.8223f, 20.8801f)
            curveTo(13.0303f, 20.7205f, 13.2165f, 20.5343f, 13.3761f, 20.3263f)
            curveTo(13.7875f, 19.7902f, 13.9259f, 19.0934f, 13.9724f, 18f)
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
            moveTo(17.4961f, 15.5f)
            curveTo(17.4961f, 15.5f, 20.996f, 12.9223f, 20.996f, 12f)
            curveTo(20.996f, 11.0777f, 17.496f, 8.5f, 17.496f, 8.5f)
        }
        }.build()

        return _logOut!!
    }

private var _logOut: ImageVector? = null
