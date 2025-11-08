package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.KeyframesDouble: ImageVector
    get() {
        if (_keyframesDouble != null) {
            return _keyframesDouble!!
        }
        _keyframesDouble = ImageVector.Builder(
            name = "KeyframesDouble",
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
        moveTo(14.0022f, 4.5f)
        curveTo(14.3777f, 4.16667f, 14.6984f, 4f, 15.0682f, 4f)
        curveTo(15.7664f, 4f, 16.2898f, 4.59409f, 17.3368f, 5.78228f)
        lineTo(19.9115f, 8.70448f)
        curveTo(21.3038f, 10.2847f, 22f, 11.0747f, 22f, 12f)
        curveTo(22f, 12.9253f, 21.3038f, 13.7153f, 19.9115f, 15.2955f)
        lineTo(17.3368f, 18.2177f)
        curveTo(16.2898f, 19.4059f, 15.7664f, 20f, 15.0682f, 20f)
        curveTo(14.6984f, 20f, 14.3777f, 19.8333f, 14.0022f, 19.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.70914f, 5.78228f)
        curveTo(7.76637f, 4.59409f, 8.29499f, 4f, 9f, 4f)
        curveTo(9.70501f, 4f, 10.2336f, 4.59409f, 11.2909f, 5.78228f)
        lineTo(13.891f, 8.70448f)
        curveTo(15.297f, 10.2847f, 16f, 11.0747f, 16f, 12f)
        curveTo(16f, 12.9253f, 15.297f, 13.7153f, 13.891f, 15.2955f)
        lineTo(11.2909f, 18.2177f)
        curveTo(10.2336f, 19.4059f, 9.70501f, 20f, 9f, 20f)
        curveTo(8.29499f, 20f, 7.76637f, 19.4059f, 6.70914f, 18.2177f)
        lineTo(4.10902f, 15.2955f)
        curveTo(2.70301f, 13.7153f, 2f, 12.9253f, 2f, 12f)
        curveTo(2f, 11.0747f, 2.70301f, 10.2847f, 4.10902f, 8.70448f)
        lineTo(6.70914f, 5.78228f)
        }
        }.build()

        return _keyframesDouble!!
    }

private var _keyframesDouble: ImageVector? = null
