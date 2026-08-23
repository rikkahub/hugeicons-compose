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

val HugeIcons.TouchpadOff: ImageVector
    get() {
        if (_touchpadOff != null) {
            return _touchpadOff!!
        }
        _touchpadOff = ImageVector.Builder(
            name = "TouchpadOff",
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
            moveTo(9.00093f, 4.00093f)
            curveTo(9.31843f, 4f, 9.65115f, 4f, 10f, 4f)
            horizontalLineTo(14f)
            curveTo(17.7712f, 4f, 19.6569f, 4f, 20.8284f, 5.17157f)
            curveTo(22f, 6.34315f, 22f, 8.22876f, 22f, 12f)
            curveTo(22f, 14.126f, 22f, 15.6527f, 21.7901f, 16.7901f)
            moveTo(4.41421f, 4.41421f)
            curveTo(3.91912f, 4.58579f, 3.51472f, 4.82843f, 3.17157f, 5.17157f)
            curveTo(2f, 6.34315f, 2f, 8.22876f, 2f, 12f)
            curveTo(2f, 15.7712f, 2f, 17.6569f, 3.17157f, 18.8284f)
            curveTo(4.34315f, 20f, 6.22876f, 20f, 10f, 20f)
            horizontalLineTo(14f)
            curveTo(16.6667f, 20f, 18.3905f, 20f, 19.5858f, 19.5858f)
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
            moveTo(2f, 14f)
            horizontalLineTo(14f)
            moveTo(22f, 14f)
            horizontalLineTo(19f)
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
            moveTo(12f, 14f)
            verticalLineTo(20f)
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
            moveTo(2f, 2f)
            lineTo(22f, 22f)
        }
        }.build()

        return _touchpadOff!!
    }

private var _touchpadOff: ImageVector? = null
