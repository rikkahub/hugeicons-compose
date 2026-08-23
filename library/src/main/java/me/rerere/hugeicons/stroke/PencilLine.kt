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

val HugeIcons.PencilLine: ImageVector
    get() {
        if (_pencilLine != null) {
            return _pencilLine!!
        }
        _pencilLine = ImageVector.Builder(
            name = "PencilLine",
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
            moveTo(3.49196f, 18.9853f)
            verticalLineTo(20.5f)
            horizontalLineTo(5.00668f)
            curveTo(6.23293f, 20.5f, 6.84606f, 20.5f, 7.39737f, 20.2716f)
            curveTo(7.94868f, 20.0433f, 8.38223f, 19.6097f, 9.24932f, 18.7426f)
            lineTo(19.1133f, 8.87868f)
            curveTo(19.9958f, 7.99612f, 20.4371f, 7.55483f, 20.4859f, 7.01325f)
            curveTo(20.494f, 6.92372f, 20.494f, 6.83364f, 20.4859f, 6.74411f)
            curveTo(20.4371f, 6.20253f, 19.9958f, 5.76124f, 19.1133f, 4.87868f)
            curveTo(18.2307f, 3.99612f, 17.7894f, 3.55483f, 17.2479f, 3.50605f)
            curveTo(17.1583f, 3.49798f, 17.0682f, 3.49798f, 16.9787f, 3.50605f)
            curveTo(16.4371f, 3.55483f, 15.9958f, 3.99612f, 15.1133f, 4.87868f)
            lineTo(5.24932f, 14.7426f)
            curveTo(4.38223f, 15.6097f, 3.94868f, 16.0433f, 3.72032f, 16.5946f)
            curveTo(3.49196f, 17.1459f, 3.49196f, 17.759f, 3.49196f, 18.9853f)
            close()
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
            moveTo(12.4922f, 20.5f)
            horizontalLineTo(20.4922f)
        }
        }.build()

        return _pencilLine!!
    }

private var _pencilLine: ImageVector? = null
