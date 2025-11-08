package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.WifiLocation: ImageVector
    get() {
        if (_wifiLocation != null) {
            return _wifiLocation!!
        }
        _wifiLocation = ImageVector.Builder(
            name = "WifiLocation",
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
        moveTo(12f, 2f)
        curveTo(16.8706f, 2f, 21f, 6.03298f, 21f, 10.9258f)
        curveTo(21f, 15.8965f, 16.8033f, 19.3847f, 12.927f, 21.7567f)
        curveTo(12.6445f, 21.9162f, 12.325f, 22f, 12f, 22f)
        curveTo(11.675f, 22f, 11.3555f, 21.9162f, 11.073f, 21.7567f)
        curveTo(7.2039f, 19.3616f, 3f, 15.9137f, 3f, 10.9258f)
        curveTo(3f, 6.03298f, 7.12944f, 2f, 12f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 9.47776f)
        curveTo(9.14883f, 8.54314f, 10.5209f, 8f, 11.9946f, 8f)
        curveTo(13.4729f, 8f, 14.849f, 8.54657f, 16f, 9.48661f)
        moveTo(14.1743f, 12f)
        curveTo(13.5182f, 11.5909f, 12.7779f, 11.3607f, 11.9946f, 11.3607f)
        curveTo(11.2152f, 11.3607f, 10.4784f, 11.5886f, 9.82477f, 11.9938f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 15f)
        horizontalLineTo(12.0064f)
        }
        }.build()

        return _wifiLocation!!
    }

private var _wifiLocation: ImageVector? = null
