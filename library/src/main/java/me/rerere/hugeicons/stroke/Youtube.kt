package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Youtube: ImageVector
    get() {
        if (_youtube != null) {
            return _youtube!!
        }
        _youtube = ImageVector.Builder(
            name = "Youtube",
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
        moveTo(12f, 20.5f)
        curveTo(13.8097f, 20.5f, 15.5451f, 20.3212f, 17.1534f, 19.9934f)
        curveTo(19.1623f, 19.5839f, 20.1668f, 19.3791f, 21.0834f, 18.2006f)
        curveTo(22f, 17.0221f, 22f, 15.6693f, 22f, 12.9635f)
        verticalLineTo(11.0365f)
        curveTo(22f, 8.33073f, 22f, 6.97787f, 21.0834f, 5.79937f)
        curveTo(20.1668f, 4.62088f, 19.1623f, 4.41613f, 17.1534f, 4.00662f)
        curveTo(15.5451f, 3.67877f, 13.8097f, 3.5f, 12f, 3.5f)
        curveTo(10.1903f, 3.5f, 8.45489f, 3.67877f, 6.84656f, 4.00662f)
        curveTo(4.83766f, 4.41613f, 3.83321f, 4.62088f, 2.9166f, 5.79937f)
        curveTo(2f, 6.97787f, 2f, 8.33073f, 2f, 11.0365f)
        verticalLineTo(12.9635f)
        curveTo(2f, 15.6693f, 2f, 17.0221f, 2.9166f, 18.2006f)
        curveTo(3.83321f, 19.3791f, 4.83766f, 19.5839f, 6.84656f, 19.9934f)
        curveTo(8.45489f, 20.3212f, 10.1903f, 20.5f, 12f, 20.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.9621f, 12.3129f)
        curveTo(15.8137f, 12.9187f, 15.0241f, 13.3538f, 13.4449f, 14.2241f)
        curveTo(11.7272f, 15.1705f, 10.8684f, 15.6438f, 10.1728f, 15.4615f)
        curveTo(9.9372f, 15.3997f, 9.7202f, 15.2911f, 9.53799f, 15.1438f)
        curveTo(9f, 14.7089f, 9f, 13.8059f, 9f, 12f)
        curveTo(9f, 10.1941f, 9f, 9.29112f, 9.53799f, 8.85618f)
        curveTo(9.7202f, 8.70886f, 9.9372f, 8.60029f, 10.1728f, 8.53854f)
        curveTo(10.8684f, 8.35621f, 11.7272f, 8.82945f, 13.4449f, 9.77593f)
        curveTo(15.0241f, 10.6462f, 15.8137f, 11.0813f, 15.9621f, 11.6871f)
        curveTo(16.0126f, 11.8933f, 16.0126f, 12.1067f, 15.9621f, 12.3129f)
        }
        }.build()

        return _youtube!!
    }

private var _youtube: ImageVector? = null
