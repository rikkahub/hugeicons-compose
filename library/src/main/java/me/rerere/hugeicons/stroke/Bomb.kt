package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Bomb: ImageVector
    get() {
        if (_bomb != null) {
            return _bomb!!
        }
        _bomb = ImageVector.Builder(
            name = "Bomb",
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
        moveTo(16f, 15f)
        curveTo(16f, 18.866f, 12.866f, 22f, 9f, 22f)
        curveTo(5.13401f, 22f, 2f, 18.866f, 2f, 15f)
        curveTo(2f, 11.134f, 5.13401f, 8f, 9f, 8f)
        curveTo(12.866f, 8f, 16f, 11.134f, 16f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 8.5f)
        lineTo(11.4685f, 7.17126f)
        curveTo(11.3094f, 6.77352f, 11.2299f, 6.57465f, 11.1227f, 6.40981f)
        curveTo(10.8287f, 5.95761f, 10.3645f, 5.64333f, 9.83543f, 5.53829f)
        curveTo(9.64256f, 5.5f, 9.42838f, 5.5f, 9f, 5.5f)
        curveTo(8.57162f, 5.5f, 8.35744f, 5.5f, 8.16457f, 5.53829f)
        curveTo(7.63553f, 5.64333f, 7.17133f, 5.95761f, 6.87732f, 6.40981f)
        curveTo(6.77014f, 6.57465f, 6.69059f, 6.77352f, 6.5315f, 7.17126f)
        lineTo(6f, 8.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 7.5f)
        lineTo(20.5f, 6f)
        moveTo(20.5f, 6f)
        lineTo(19f, 4.5f)
        moveTo(20.5f, 6f)
        lineTo(19f, 7.5f)
        moveTo(20.5f, 6f)
        lineTo(22f, 4.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 5.99993f)
        curveTo(14f, 5.99993f, 14.4095f, 3.43983f, 11.8598f, 2.26722f)
        curveTo(9.61977f, 1.23706f, 8.77077f, 3.40757f, 9.05199f, 5f)
        }
        }.build()

        return _bomb!!
    }

private var _bomb: ImageVector? = null
