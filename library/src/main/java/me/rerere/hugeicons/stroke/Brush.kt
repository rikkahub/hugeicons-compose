package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Brush: ImageVector
    get() {
        if (_brush != null) {
            return _brush!!
        }
        _brush = ImageVector.Builder(
            name = "Brush",
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
        moveTo(7.49478f, 13.753f)
        curveTo(10.5833f, 10.1644f, 17.5788f, 3.15478f, 20.5387f, 3.00445f)
        curveTo(22.3699f, 2.82906f, 18.7218f, 9.32547f, 10.0785f, 16.4339f)
        moveTo(11.4581f, 10.0449f)
        lineTo(13.7157f, 12.3249f)
        moveTo(3f, 20.8546f)
        curveTo(3.70948f, 18.3472f, 3.26187f, 19.5794f, 3.50407f, 16.6919f)
        curveTo(3.63306f, 16.2644f, 3.89258f, 14.9377f, 5.51358f, 14.2765f)
        curveTo(7.35618f, 13.5249f, 8.70698f, 14.6611f, 9.05612f, 15.195f)
        curveTo(10.0847f, 16.3102f, 10.2039f, 17.6952f, 9.05612f, 19.2774f)
        curveTo(7.9083f, 20.8596f, 4.50352f, 21.2527f, 3f, 20.8546f)
        }
        }.build()

        return _brush!!
    }

private var _brush: ImageVector? = null
