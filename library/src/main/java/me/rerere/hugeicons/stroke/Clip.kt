package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Clip: ImageVector
    get() {
        if (_clip != null) {
            return _clip!!
        }
        _clip = ImageVector.Builder(
            name = "Clip",
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
        moveTo(4f, 22f)
        horizontalLineTo(7.14444f)
        curveTo(7.51533f, 22f, 7.66655f, 21.6672f, 7.73659f, 21.3171f)
        curveTo(7.89059f, 20.5471f, 8.49844f, 20f, 9.2f, 20f)
        curveTo(9.90156f, 20f, 10.5094f, 20.5471f, 10.6634f, 21.3171f)
        curveTo(10.7334f, 21.6672f, 10.8847f, 22f, 11.2556f, 22f)
        horizontalLineTo(12.7444f)
        curveTo(13.1153f, 22f, 13.2666f, 21.6672f, 13.3366f, 21.3171f)
        curveTo(13.4906f, 20.5471f, 14.0984f, 20f, 14.8f, 20f)
        curveTo(15.5016f, 20f, 16.1094f, 20.5471f, 16.2634f, 21.3171f)
        curveTo(16.3334f, 21.6672f, 16.4847f, 22f, 16.8556f, 22f)
        horizontalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.77232f, 19.9999f)
        curveTo(8.77232f, 19.9999f, 9.62267f, 11.8192f, 9.93709f, 9.47901f)
        curveTo(10.208f, 7.46272f, 6.43388f, 4.71914f, 8.76226f, 3.09366f)
        curveTo(10.8515f, 1.63514f, 13.1483f, 1.63539f, 15.2376f, 3.0938f)
        curveTo(17.5661f, 4.71921f, 13.7927f, 7.46274f, 14.0636f, 9.47901f)
        curveTo(14.378f, 11.8192f, 15.2283f, 19.9999f, 15.2283f, 19.9999f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 22f)
        lineTo(3.67748f, 17.1633f)
        curveTo(3.01417f, 14.3231f, 2.68252f, 12.903f, 3.41535f, 11.9515f)
        curveTo(4.14818f, 11f, 5.57361f, 11f, 8.42448f, 11f)
        horizontalLineTo(15.5755f)
        curveTo(18.4264f, 11f, 19.8518f, 11f, 20.5847f, 11.9515f)
        curveTo(21.3175f, 12.903f, 20.9858f, 14.3231f, 20.3225f, 17.1633f)
        lineTo(19f, 22f)
        }
        }.build()

        return _clip!!
    }

private var _clip: ImageVector? = null
