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

val HugeIcons.MonitorCog: ImageVector
    get() {
        if (_monitorCog != null) {
            return _monitorCog!!
        }
        _monitorCog = ImageVector.Builder(
            name = "MonitorCog",
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
            moveTo(15.9922f, 21f)
            horizontalLineTo(13.9922f)
            horizontalLineTo(9.99219f)
            horizontalLineTo(7.99219f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(10.4922f, 21f)
            verticalLineTo(17f)
            moveTo(13.4922f, 17f)
            verticalLineTo(21f)
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
            moveTo(15.9922f, 3f)
            horizontalLineTo(7.99219f)
            curveTo(5.16376f, 3f, 3.74955f, 3f, 2.87087f, 3.87868f)
            curveTo(1.99219f, 4.75736f, 1.99219f, 6.17157f, 1.99219f, 9f)
            verticalLineTo(11f)
            curveTo(1.99219f, 13.8284f, 1.99219f, 15.2426f, 2.87087f, 16.1213f)
            curveTo(3.74955f, 17f, 5.16376f, 17f, 7.99219f, 17f)
            horizontalLineTo(15.9922f)
            curveTo(18.8206f, 17f, 20.2348f, 17f, 21.1135f, 16.1213f)
            curveTo(21.9922f, 15.2426f, 21.9922f, 13.8284f, 21.9922f, 11f)
            verticalLineTo(9f)
            curveTo(21.9922f, 6.17157f, 21.9922f, 4.75736f, 21.1135f, 3.87868f)
            curveTo(20.2348f, 3f, 18.8206f, 3f, 15.9922f, 3f)
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
            moveTo(11.9922f, 12f)
            lineTo(11.9922f, 13.5f)
            moveTo(11.9922f, 12f)
            curveTo(12.7292f, 12f, 13.3731f, 11.6013f, 13.72f, 11.0079f)
            moveTo(11.9922f, 12f)
            curveTo(11.2552f, 12f, 10.6113f, 11.6013f, 10.2643f, 11.0079f)
            moveTo(11.9922f, 8f)
            lineTo(11.9922f, 6.5f)
            moveTo(11.9922f, 8f)
            curveTo(12.7292f, 8f, 13.3731f, 8.39866f, 13.72f, 8.99209f)
            moveTo(10.2643f, 11.0079f)
            curveTo(10.0913f, 10.712f, 9.99219f, 10.3676f, 9.99219f, 10f)
            curveTo(9.99219f, 9.63244f, 10.0913f, 9.28804f, 10.2644f, 8.99209f)
            curveTo(10.6113f, 8.39865f, 11.2552f, 8f, 11.9922f, 8f)
            moveTo(14.9922f, 8.25f)
            lineTo(13.72f, 8.99209f)
            moveTo(8.99219f, 11.75f)
            lineTo(10.2643f, 11.0079f)
            moveTo(14.9922f, 11.75f)
            lineTo(13.72f, 11.0079f)
            moveTo(8.99219f, 8.25f)
            lineTo(10.2644f, 8.99209f)
            moveTo(13.72f, 11.0079f)
            curveTo(13.893f, 10.7119f, 13.9922f, 10.3676f, 13.9922f, 10f)
            curveTo(13.9922f, 9.63244f, 13.893f, 9.28805f, 13.72f, 8.99209f)
        }
        }.build()

        return _monitorCog!!
    }

private var _monitorCog: ImageVector? = null
