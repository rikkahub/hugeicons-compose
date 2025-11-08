package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Pen01: ImageVector
    get() {
        if (_pen01 != null) {
            return _pen01!!
        }
        _pen01 = ImageVector.Builder(
            name = "Pen01",
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
        moveTo(3.49977f, 18.9853f)
        verticalLineTo(20.5f)
        horizontalLineTo(5.01449f)
        curveTo(6.24074f, 20.5f, 6.85387f, 20.5f, 7.40518f, 20.2716f)
        curveTo(7.9565f, 20.0433f, 8.39004f, 19.6097f, 9.25713f, 18.7426f)
        lineTo(19.1211f, 8.87868f)
        curveTo(20.0037f, 7.99612f, 20.4449f, 7.55483f, 20.4937f, 7.01325f)
        curveTo(20.5018f, 6.92372f, 20.5018f, 6.83364f, 20.4937f, 6.74411f)
        curveTo(20.4449f, 6.20253f, 20.0037f, 5.76124f, 19.1211f, 4.87868f)
        curveTo(18.2385f, 3.99612f, 17.7972f, 3.55483f, 17.2557f, 3.50605f)
        curveTo(17.1661f, 3.49798f, 17.0761f, 3.49798f, 16.9865f, 3.50605f)
        curveTo(16.4449f, 3.55483f, 16.0037f, 3.99612f, 15.1211f, 4.87868f)
        lineTo(5.25713f, 14.7426f)
        curveTo(4.39004f, 15.6097f, 3.9565f, 16.0433f, 3.72813f, 16.5946f)
        curveTo(3.49977f, 17.1459f, 3.49977f, 17.759f, 3.49977f, 18.9853f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 6.5f)
        lineTo(17.5f, 10.5f)
        }
        }.build()

        return _pen01!!
    }

private var _pen01: ImageVector? = null
