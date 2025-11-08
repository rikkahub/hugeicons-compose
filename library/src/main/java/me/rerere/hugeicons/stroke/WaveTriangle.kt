package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.WaveTriangle: ImageVector
    get() {
        if (_waveTriangle != null) {
            return _waveTriangle!!
        }
        _waveTriangle = ImageVector.Builder(
            name = "WaveTriangle",
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
        moveTo(3.00006f, 12f)
        horizontalLineTo(7.34066f)
        curveTo(7.74069f, 12f, 8.10223f, 12.2384f, 8.25981f, 12.6061f)
        lineTo(10.8435f, 18.6348f)
        curveTo(10.9385f, 18.8563f, 11.1564f, 19f, 11.3974f, 19f)
        curveTo(11.7303f, 19f, 12.0001f, 18.7302f, 12.0001f, 18.3974f)
        verticalLineTo(5.60262f)
        curveTo(12.0001f, 5.2698f, 12.2699f, 5f, 12.6027f, 5f)
        curveTo(12.8438f, 5f, 13.0616f, 5.14367f, 13.1566f, 5.36526f)
        lineTo(15.74f, 11.3939f)
        curveTo(15.8975f, 11.7616f, 16.2591f, 12f, 16.6591f, 12f)
        horizontalLineTo(20.9997f)
        }
        }.build()

        return _waveTriangle!!
    }

private var _waveTriangle: ImageVector? = null
