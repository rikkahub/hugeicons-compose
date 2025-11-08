package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Napkins02: ImageVector
    get() {
        if (_napkins02 != null) {
            return _napkins02!!
        }
        _napkins02 = ImageVector.Builder(
            name = "Napkins02",
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
        moveTo(17.129f, 9.93457f)
        lineTo(15.5593f, 6.7402f)
        curveTo(14.0063f, 3.5797f, 13.2297f, 1.99945f, 12f, 1.99945f)
        curveTo(10.7703f, 1.99945f, 9.99374f, 3.5797f, 8.44067f, 6.7402f)
        lineTo(6.87095f, 9.93457f)
        curveTo(6.22703f, 11.245f, 5.90506f, 11.9002f, 6.02457f, 12.5651f)
        curveTo(6.14407f, 13.2301f, 6.67308f, 13.7269f, 7.7311f, 14.7207f)
        lineTo(9.30082f, 16.195f)
        curveTo(10.5816f, 17.398f, 11.222f, 17.9995f, 12f, 17.9995f)
        curveTo(12.778f, 17.9995f, 13.4184f, 17.398f, 14.6992f, 16.195f)
        lineTo(16.2689f, 14.7207f)
        curveTo(17.3269f, 13.7269f, 17.8559f, 13.2301f, 17.9754f, 12.5651f)
        curveTo(18.0949f, 11.9002f, 17.773f, 11.245f, 17.129f, 9.93457f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.129f, 13.9346f)
        curveTo(17.773f, 15.245f, 18.0949f, 15.9002f, 17.9754f, 16.5651f)
        curveTo(17.8559f, 17.2301f, 17.3269f, 17.7269f, 16.2689f, 18.7207f)
        lineTo(14.6992f, 20.195f)
        curveTo(13.4184f, 21.398f, 12.778f, 21.9995f, 12f, 21.9995f)
        curveTo(11.222f, 21.9995f, 10.5816f, 21.398f, 9.30082f, 20.195f)
        lineTo(7.7311f, 18.7207f)
        curveTo(6.67308f, 17.7269f, 6.14407f, 17.2301f, 6.02457f, 16.5651f)
        curveTo(5.90506f, 15.9002f, 6.22703f, 15.245f, 6.87095f, 13.9346f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.5f, 9.5f)
        lineTo(12f, 14f)
        lineTo(7.5f, 9.5f)
        }
        }.build()

        return _napkins02!!
    }

private var _napkins02: ImageVector? = null
