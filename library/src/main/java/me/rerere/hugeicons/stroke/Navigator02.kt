package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Navigator02: ImageVector
    get() {
        if (_navigator02 != null) {
            return _navigator02!!
        }
        _navigator02 = ImageVector.Builder(
            name = "Navigator02",
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
        moveTo(21f, 4f)
        lineTo(2.99997f, 4f)
        moveTo(21f, 20f)
        lineTo(2.99997f, 20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.13475f, 9.66101f)
        curveTo(9.0449f, 10.6709f, 9.99997f, 11.1759f, 9.99997f, 12f)
        curveTo(9.99997f, 12.8241f, 9.0449f, 13.3291f, 7.13475f, 14.339f)
        lineTo(5.83399f, 15.0267f)
        curveTo(4.36702f, 15.8023f, 3.63353f, 16.1901f, 3.28087f, 15.9082f)
        curveTo(3.18606f, 15.8324f, 3.10784f, 15.7325f, 3.05232f, 15.6163f)
        curveTo(2.84584f, 15.1841f, 3.26182f, 14.3908f, 4.09379f, 12.8043f)
        curveTo(4.27833f, 12.4524f, 4.37059f, 12.2764f, 4.3871f, 12.084f)
        curveTo(4.39189f, 12.0281f, 4.39189f, 11.9719f, 4.3871f, 11.916f)
        curveTo(4.3706f, 11.7236f, 4.27833f, 11.5476f, 4.09379f, 11.1957f)
        curveTo(3.26182f, 9.60915f, 2.84584f, 8.81587f, 3.05232f, 8.38372f)
        curveTo(3.10784f, 8.26754f, 3.18606f, 8.16764f, 3.28087f, 8.09184f)
        curveTo(3.63353f, 7.80989f, 4.36702f, 8.19769f, 5.83399f, 8.97329f)
        lineTo(7.13475f, 9.66101f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 12f)
        lineTo(19f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 12f)
        lineTo(13f, 12f)
        }
        }.build()

        return _navigator02!!
    }

private var _navigator02: ImageVector? = null
