package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PoliceCap: ImageVector
    get() {
        if (_policeCap != null) {
            return _policeCap!!
        }
        _policeCap = ImageVector.Builder(
            name = "PoliceCap",
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
        moveTo(2.0799f, 9.73404f)
        curveTo(1.52911f, 12.578f, 4.00638f, 14f, 4.00638f, 14f)
        horizontalLineTo(19.995f)
        curveTo(19.995f, 14f, 22.4709f, 12.578f, 21.9201f, 9.73404f)
        curveTo(21.5732f, 7.94296f, 17.7287f, 5.58788f, 14.9296f, 4.08959f)
        curveTo(13.5726f, 3.3632f, 12.894f, 3f, 12f, 3f)
        curveTo(11.1059f, 3f, 10.4274f, 3.3632f, 9.07038f, 4.08959f)
        curveTo(6.2713f, 5.58788f, 2.42678f, 7.94296f, 2.0799f, 9.73404f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.14163f, 14f)
        curveTo(2.66809f, 15.3249f, 2.21055f, 18.5761f, 5.30556f, 19.3837f)
        curveTo(7.36279f, 19.9204f, 9.64289f, 20.487f, 10.9407f, 20.8065f)
        curveTo(11.4645f, 20.9355f, 11.7264f, 21f, 12f, 21f)
        curveTo(12.2736f, 21f, 12.5355f, 20.9355f, 13.0593f, 20.8065f)
        curveTo(14.3571f, 20.487f, 16.6372f, 19.9204f, 18.6944f, 19.3837f)
        curveTo(21.7894f, 18.5761f, 21.3319f, 15.3249f, 19.8584f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.3899f, 7.72984f)
        lineTo(11.4959f, 7.1281f)
        curveTo(11.8098f, 6.9573f, 12.1902f, 6.9573f, 12.5041f, 7.1281f)
        lineTo(13.6101f, 7.72984f)
        curveTo(13.9002f, 7.88767f, 14.0631f, 8.21f, 13.977f, 8.52648f)
        curveTo(13.7595f, 9.3254f, 13.2247f, 10.5958f, 12f, 11f)
        curveTo(10.7753f, 10.5958f, 10.2405f, 9.3254f, 10.023f, 8.52648f)
        curveTo(9.93688f, 8.21f, 10.0998f, 7.88767f, 10.3899f, 7.72984f)
        }
        }.build()

        return _policeCap!!
    }

private var _policeCap: ImageVector? = null
