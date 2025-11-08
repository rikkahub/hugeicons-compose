package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.KeyframeAdd: ImageVector
    get() {
        if (_keyframeAdd != null) {
            return _keyframeAdd!!
        }
        _keyframeAdd = ImageVector.Builder(
            name = "KeyframeAdd",
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
        moveTo(6.70914f, 7.78228f)
        curveTo(7.76637f, 6.59409f, 8.29499f, 6f, 9f, 6f)
        curveTo(9.70501f, 6f, 10.2336f, 6.59409f, 11.2909f, 7.78228f)
        lineTo(13.891f, 10.7045f)
        curveTo(15.297f, 12.2847f, 16f, 13.0747f, 16f, 14f)
        curveTo(16f, 14.9253f, 15.297f, 15.7153f, 13.891f, 17.2955f)
        lineTo(11.2909f, 20.2177f)
        curveTo(10.2336f, 21.4059f, 9.70501f, 22f, 9f, 22f)
        curveTo(8.29499f, 22f, 7.76637f, 21.4059f, 6.70914f, 20.2177f)
        lineTo(4.10902f, 17.2955f)
        curveTo(2.70301f, 15.7153f, 2f, 14.9253f, 2f, 14f)
        curveTo(2f, 13.0747f, 2.70301f, 12.2847f, 4.10902f, 10.7045f)
        lineTo(6.70914f, 7.78228f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.5f, 9f)
        lineTo(18.5f, 2f)
        moveTo(15f, 5.5f)
        horizontalLineTo(22f)
        }
        }.build()

        return _keyframeAdd!!
    }

private var _keyframeAdd: ImageVector? = null
