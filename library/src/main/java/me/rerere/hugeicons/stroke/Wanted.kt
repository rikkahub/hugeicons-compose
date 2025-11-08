package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Wanted: ImageVector
    get() {
        if (_wanted != null) {
            return _wanted!!
        }
        _wanted = ImageVector.Builder(
            name = "Wanted",
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
        moveTo(18.5168f, 2.01455f)
        horizontalLineTo(7.884f)
        curveTo(6.84571f, 2.01455f, 5.43937f, 1.83217f, 4.71912f, 2.75868f)
        curveTo(4.29227f, 3.30777f, 4.29227f, 4.11843f, 4.29227f, 5.73976f)
        curveTo(4.29227f, 7.03795f, 6.03931f, 8.01066f, 6.01966f, 8.50982f)
        curveTo(6f, 9.00954f, 4.29227f, 10.0064f, 4.29227f, 11.3362f)
        verticalLineTo(17.5311f)
        curveTo(4.29227f, 18.1246f, 4.01196f, 18.5844f, 3.75968f, 19.1077f)
        curveTo(3.13475f, 20.404f, 2.82228f, 21.0522f, 3.10469f, 21.5261f)
        curveTo(3.38709f, 22f, 4.08579f, 22f, 5.48318f, 22f)
        horizontalLineTo(15.8539f)
        curveTo(17.6706f, 22f, 18.579f, 22f, 19.1433f, 21.4146f)
        curveTo(19.7077f, 20.8293f, 19.7077f, 19.8872f, 19.7077f, 18.0029f)
        verticalLineTo(6.48344f)
        curveTo(19.7077f, 5.88992f, 19.988f, 5.43019f, 20.2403f, 4.90687f)
        curveTo(20.8653f, 3.61056f, 21.1777f, 2.9624f, 20.8953f, 2.48848f)
        curveTo(20.6129f, 2.01455f, 19.9142f, 2.01455f, 18.5168f, 2.01455f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 18f)
        horizontalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 7.5f)
        curveTo(13.5f, 8.32843f, 12.8284f, 9f, 12f, 9f)
        curveTo(11.1716f, 9f, 10.5f, 8.32843f, 10.5f, 7.5f)
        curveTo(10.5f, 6.67157f, 11.1716f, 6f, 12f, 6f)
        curveTo(12.8284f, 6f, 13.5f, 6.67157f, 13.5f, 7.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.89128f, 11.5556f)
        curveTo(9.34109f, 11.8715f, 7.89853f, 12.5165f, 8.77715f, 13.3237f)
        curveTo(9.20634f, 13.718f, 9.68436f, 14f, 10.2853f, 14f)
        horizontalLineTo(13.7147f)
        curveTo(14.3156f, 14f, 14.7937f, 13.718f, 15.2229f, 13.3237f)
        curveTo(16.1015f, 12.5165f, 14.6589f, 11.8715f, 14.1087f, 11.5556f)
        curveTo(12.8185f, 10.8148f, 11.1815f, 10.8148f, 9.89128f, 11.5556f)
        }
        }.build()

        return _wanted!!
    }

private var _wanted: ImageVector? = null
