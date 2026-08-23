package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PencilOff: ImageVector
    get() {
        if (_pencilOff != null) {
            return _pencilOff!!
        }
        _pencilOff = ImageVector.Builder(
            name = "PencilOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(1.99219f, 2f)
            lineTo(21.9922f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(16.5509f, 11.4392f)
            lineTo(19.1114f, 8.87868f)
            curveTo(19.994f, 7.99612f, 20.4353f, 7.55483f, 20.4841f, 7.01325f)
            curveTo(20.4921f, 6.92372f, 20.4921f, 6.83364f, 20.4841f, 6.74411f)
            curveTo(20.4353f, 6.20253f, 19.994f, 5.76124f, 19.1114f, 4.87868f)
            curveTo(18.2289f, 3.99612f, 17.7876f, 3.55483f, 17.246f, 3.50605f)
            curveTo(17.1565f, 3.49798f, 17.0664f, 3.49798f, 16.9769f, 3.50605f)
            curveTo(16.4353f, 3.55483f, 15.994f, 3.99612f, 15.1114f, 4.87868f)
            lineTo(12.5508f, 7.43934f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(13.9922f, 13.9998f)
            lineTo(9.24932f, 18.7426f)
            curveTo(8.38223f, 19.6097f, 7.94868f, 20.0433f, 7.39737f, 20.2716f)
            curveTo(6.84606f, 20.5f, 6.23293f, 20.5f, 5.00668f, 20.5f)
            horizontalLineTo(3.49196f)
            verticalLineTo(18.9853f)
            curveTo(3.49196f, 17.759f, 3.49196f, 17.1459f, 3.72032f, 16.5946f)
            curveTo(3.94868f, 16.0433f, 4.38223f, 15.6097f, 5.24932f, 14.7426f)
            lineTo(9.99196f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(13.4922f, 6.49902f)
            lineTo(17.4922f, 10.499f)
        }
        }.build()

        return _pencilOff!!
    }

private var _pencilOff: ImageVector? = null
