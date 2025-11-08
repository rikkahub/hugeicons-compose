package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.StarSquare: ImageVector
    get() {
        if (_starSquare != null) {
            return _starSquare!!
        }
        _starSquare = ImageVector.Builder(
            name = "StarSquare",
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
        moveTo(2f, 12f)
        curveTo(2f, 7.52166f, 2f, 5.28249f, 3.39124f, 3.89124f)
        curveTo(4.78249f, 2.5f, 7.02166f, 2.5f, 11.5f, 2.5f)
        curveTo(15.9783f, 2.5f, 18.2175f, 2.5f, 19.6088f, 3.89124f)
        curveTo(21f, 5.28249f, 21f, 7.52166f, 21f, 12f)
        curveTo(21f, 16.4783f, 21f, 18.7175f, 19.6088f, 20.1088f)
        curveTo(18.2175f, 21.5f, 15.9783f, 21.5f, 11.5f, 21.5f)
        curveTo(7.02166f, 21.5f, 4.78249f, 21.5f, 3.39124f, 20.1088f)
        curveTo(2f, 18.7175f, 2f, 16.4783f, 2f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.3638f, 7.72209f)
        lineTo(13.2437f, 9.49644f)
        curveTo(13.3637f, 9.74344f, 13.6837f, 9.98035f, 13.9536f, 10.0257f)
        lineTo(15.5485f, 10.2929f)
        curveTo(16.5684f, 10.4643f, 16.8083f, 11.2103f, 16.0734f, 11.9462f)
        lineTo(14.8335f, 13.1964f)
        curveTo(14.6236f, 13.4081f, 14.5086f, 13.8164f, 14.5736f, 14.1087f)
        lineTo(14.9285f, 15.6562f)
        curveTo(15.2085f, 16.8812f, 14.5636f, 17.355f, 13.4887f, 16.7148f)
        lineTo(11.9939f, 15.8226f)
        curveTo(11.7239f, 15.6613f, 11.2789f, 15.6613f, 11.004f, 15.8226f)
        lineTo(9.50913f, 16.7148f)
        curveTo(8.43925f, 17.355f, 7.78932f, 16.8761f, 8.06929f, 15.6562f)
        lineTo(8.42425f, 14.1087f)
        curveTo(8.48925f, 13.8164f, 8.37426f, 13.4081f, 8.16428f, 13.1964f)
        lineTo(6.92442f, 11.9462f)
        curveTo(6.1945f, 11.2103f, 6.42947f, 10.4643f, 7.44936f, 10.2929f)
        lineTo(9.04419f, 10.0257f)
        curveTo(9.30916f, 9.98035f, 9.62912f, 9.74344f, 9.74911f, 9.49644f)
        lineTo(10.629f, 7.72209f)
        curveTo(11.109f, 6.7593f, 11.8889f, 6.7593f, 12.3638f, 7.72209f)
        }
        }.build()

        return _starSquare!!
    }

private var _starSquare: ImageVector? = null
