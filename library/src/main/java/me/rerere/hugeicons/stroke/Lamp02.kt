package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Lamp02: ImageVector
    get() {
        if (_lamp02 != null) {
            return _lamp02!!
        }
        _lamp02 = ImageVector.Builder(
            name = "Lamp02",
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
        moveTo(19.9244f, 12.102f)
        curveTo(20.3882f, 11.4385f, 18.588f, 9.20647f, 18.0742f, 8.81246f)
        curveTo(17.6051f, 8.45281f, 17f, 8.27446f, 15.7896f, 7.91776f)
        curveTo(14.5811f, 7.56161f, 13.2866f, 7f, 12f, 7f)
        curveTo(10.7134f, 7f, 9.41894f, 7.56161f, 8.21043f, 7.91776f)
        curveTo(7.00005f, 8.27446f, 6.39486f, 8.45281f, 5.92582f, 8.81246f)
        curveTo(5.41197f, 9.20647f, 3.61181f, 11.4385f, 4.07564f, 12.102f)
        curveTo(4.96428f, 13.3732f, 19.1407f, 13.2231f, 19.9244f, 12.102f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.9999f, 13f)
        curveTo(8.9999f, 14.6569f, 10.343f, 16f, 11.9999f, 16f)
        curveTo(13.6568f, 16f, 14.9999f, 14.6569f, 14.9999f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.0001f, 20f)
        verticalLineTo(22f)
        moveTo(14.9999f, 19f)
        lineTo(16.9999f, 20.4999f)
        moveTo(8.9999f, 19f)
        lineTo(6.9999f, 20.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.9999f, 7f)
        verticalLineTo(2f)
        }
        }.build()

        return _lamp02!!
    }

private var _lamp02: ImageVector? = null
