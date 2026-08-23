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

val HugeIcons.MonitorDown: ImageVector
    get() {
        if (_monitorDown != null) {
            return _monitorDown!!
        }
        _monitorDown = ImageVector.Builder(
            name = "MonitorDown",
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
            moveTo(8.99219f, 10f)
            curveTo(8.99219f, 10f, 11.2017f, 13f, 11.9922f, 13f)
            curveTo(12.7828f, 13f, 14.9922f, 10f, 14.9922f, 10f)
            moveTo(11.9922f, 12.5f)
            verticalLineTo(7f)
        }
        }.build()

        return _monitorDown!!
    }

private var _monitorDown: ImageVector? = null
