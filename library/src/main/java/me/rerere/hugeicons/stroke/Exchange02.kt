package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Exchange02: ImageVector
    get() {
        if (_exchange02 != null) {
            return _exchange02!!
        }
        _exchange02 = ImageVector.Builder(
            name = "Exchange02",
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
        moveTo(4.125f, 9.5f)
        lineTo(4.125f, 3.5f)
        moveTo(6f, 3.5f)
        verticalLineTo(2f)
        moveTo(6f, 11f)
        verticalLineTo(9.5f)
        moveTo(4.125f, 6.5f)
        horizontalLineTo(7.875f)
        moveTo(7.875f, 6.5f)
        curveTo(8.49632f, 6.5f, 9f, 7.00368f, 9f, 7.625f)
        verticalLineTo(8.375f)
        curveTo(9f, 8.99632f, 8.49632f, 9.5f, 7.875f, 9.5f)
        horizontalLineTo(3f)
        moveTo(7.875f, 6.5f)
        curveTo(8.49632f, 6.5f, 9f, 5.99632f, 9f, 5.375f)
        verticalLineTo(4.625f)
        curveTo(9f, 4.00368f, 8.49632f, 3.5f, 7.875f, 3.5f)
        horizontalLineTo(3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 17.5f)
        lineTo(18f, 13f)
        lineTo(21f, 17.5f)
        moveTo(15f, 17.5f)
        lineTo(18f, 22f)
        lineTo(21f, 17.5f)
        moveTo(15f, 17.5f)
        lineTo(18f, 18.625f)
        lineTo(21f, 17.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 5f)
        curveTo(14.8284f, 5f, 17.2426f, 5f, 18.1213f, 5.7988f)
        curveTo(19f, 6.5976f, 19f, 7.4287f, 19f, 10f)
        lineTo(17f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 19f)
        curveTo(9.17157f, 19f, 6.75736f, 19f, 5.87868f, 18.2012f)
        curveTo(5f, 17.4024f, 5f, 16.5713f, 5f, 14f)
        lineTo(7f, 15f)
        }
        }.build()

        return _exchange02!!
    }

private var _exchange02: ImageVector? = null
