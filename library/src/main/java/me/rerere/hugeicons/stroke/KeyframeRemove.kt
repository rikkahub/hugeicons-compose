package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.KeyframeRemove: ImageVector
    get() {
        if (_keyframeRemove != null) {
            return _keyframeRemove!!
        }
        _keyframeRemove = ImageVector.Builder(
            name = "KeyframeRemove",
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
        moveTo(6.70914f, 7.78222f)
        curveTo(7.76637f, 6.59403f, 8.29499f, 5.99994f, 9f, 5.99994f)
        curveTo(9.70501f, 5.99994f, 10.2336f, 6.59403f, 11.2909f, 7.78222f)
        lineTo(13.891f, 10.7044f)
        curveTo(15.297f, 12.2846f, 16f, 13.0747f, 16f, 13.9999f)
        curveTo(16f, 14.9252f, 15.297f, 15.7153f, 13.891f, 17.2955f)
        lineTo(11.2909f, 20.2177f)
        curveTo(10.2336f, 21.4058f, 9.70501f, 21.9999f, 9f, 21.9999f)
        curveTo(8.29499f, 21.9999f, 7.76637f, 21.4058f, 6.70914f, 20.2177f)
        lineTo(4.10902f, 17.2955f)
        curveTo(2.70301f, 15.7153f, 2f, 14.9252f, 2f, 13.9999f)
        curveTo(2f, 13.0747f, 2.70301f, 12.2846f, 4.10902f, 10.7044f)
        lineTo(6.70914f, 7.78222f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 4.99994f)
        horizontalLineTo(22f)
        }
        }.build()

        return _keyframeRemove!!
    }

private var _keyframeRemove: ImageVector? = null
