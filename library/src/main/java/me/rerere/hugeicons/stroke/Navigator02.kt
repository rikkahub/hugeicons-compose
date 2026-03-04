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
        lineTo(3f, 4f)
        moveTo(21f, 20f)
        lineTo(3f, 20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.13478f, 9.66101f)
        curveTo(9.04493f, 10.6709f, 10f, 11.1759f, 10f, 12f)
        curveTo(10f, 12.8241f, 9.04493f, 13.3291f, 7.13478f, 14.339f)
        lineTo(5.83402f, 15.0267f)
        curveTo(4.36705f, 15.8023f, 3.63357f, 16.1901f, 3.2809f, 15.9082f)
        curveTo(3.18609f, 15.8324f, 3.10787f, 15.7325f, 3.05235f, 15.6163f)
        curveTo(2.84587f, 15.1841f, 3.26185f, 14.3908f, 4.09382f, 12.8043f)
        curveTo(4.27836f, 12.4524f, 4.37063f, 12.2764f, 4.38713f, 12.084f)
        curveTo(4.39192f, 12.0281f, 4.39192f, 11.9719f, 4.38713f, 11.916f)
        curveTo(4.37063f, 11.7236f, 4.27836f, 11.5476f, 4.09382f, 11.1957f)
        curveTo(3.26185f, 9.60915f, 2.84587f, 8.81587f, 3.05235f, 8.38372f)
        curveTo(3.10787f, 8.26754f, 3.18609f, 8.16764f, 3.2809f, 8.09184f)
        curveTo(3.63357f, 7.80989f, 4.36705f, 8.19769f, 5.83402f, 8.97329f)
        lineTo(7.13478f, 9.66101f)
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
