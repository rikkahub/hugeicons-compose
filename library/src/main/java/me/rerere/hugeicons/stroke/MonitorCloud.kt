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

val HugeIcons.MonitorCloud: ImageVector
    get() {
        if (_monitorCloud != null) {
            return _monitorCloud!!
        }
        _monitorCloud = ImageVector.Builder(
            name = "MonitorCloud",
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
            moveTo(13.9922f, 9f)
            curveTo(13.9922f, 7.89543f, 13.0968f, 7f, 11.9922f, 7f)
            curveTo(10.8876f, 7f, 9.99219f, 7.89543f, 9.99219f, 9f)
            horizontalLineTo(9.49219f)
            curveTo(8.38762f, 9f, 7.49219f, 9.89543f, 7.49219f, 11f)
            curveTo(7.49219f, 12.1046f, 8.38762f, 13f, 9.49219f, 13f)
            horizontalLineTo(14.4922f)
            curveTo(15.5968f, 13f, 16.4922f, 12.1046f, 16.4922f, 11f)
            curveTo(16.4922f, 9.89543f, 15.5968f, 9f, 14.4922f, 9f)
            horizontalLineTo(13.9922f)
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
        }.build()

        return _monitorCloud!!
    }

private var _monitorCloud: ImageVector? = null
