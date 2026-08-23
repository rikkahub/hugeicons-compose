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

val HugeIcons.PenOff: ImageVector
    get() {
        if (_penOff != null) {
            return _penOff!!
        }
        _penOff = ImageVector.Builder(
            name = "PenOff",
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
            moveTo(16.9805f, 11.0133f)
            lineTo(19.115f, 8.87868f)
            curveTo(19.9976f, 7.99612f, 20.4389f, 7.55483f, 20.4877f, 7.01325f)
            curveTo(20.4957f, 6.92372f, 20.4957f, 6.83364f, 20.4877f, 6.74411f)
            curveTo(20.4389f, 6.20253f, 19.9976f, 5.76124f, 19.115f, 4.87868f)
            curveTo(18.2325f, 3.99612f, 17.7912f, 3.55483f, 17.2496f, 3.50605f)
            curveTo(17.1601f, 3.49798f, 17.07f, 3.49798f, 16.9805f, 3.50605f)
            curveTo(16.4389f, 3.55483f, 15.9976f, 3.99612f, 15.115f, 4.87868f)
            lineTo(12.9805f, 7.01325f)
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
            moveTo(13.9922f, 14.0002f)
            lineTo(9.24955f, 18.7429f)
            curveTo(8.38246f, 19.61f, 7.94891f, 20.0435f, 7.3976f, 20.2719f)
            curveTo(6.84628f, 20.5002f, 6.23316f, 20.5002f, 5.00691f, 20.5002f)
            horizontalLineTo(3.49219f)
            verticalLineTo(18.9855f)
            curveTo(3.49219f, 17.7593f, 3.49219f, 17.1461f, 3.72055f, 16.5948f)
            curveTo(3.94891f, 16.0435f, 4.38246f, 15.61f, 5.24955f, 14.7429f)
            lineTo(9.99241f, 10f)
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
            moveTo(1.99219f, 2f)
            lineTo(21.9922f, 22f)
        }
        }.build()

        return _penOff!!
    }

private var _penOff: ImageVector? = null
