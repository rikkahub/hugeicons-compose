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

val HugeIcons.ScreenShare: ImageVector
    get() {
        if (_screenShare != null) {
            return _screenShare!!
        }
        _screenShare = ImageVector.Builder(
            name = "ScreenShare",
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
            moveTo(13.9922f, 21f)
            horizontalLineTo(15.9922f)
            moveTo(9.99219f, 21f)
            curveTo(10.8206f, 21f, 11.4922f, 20.3284f, 11.4922f, 19.5f)
            verticalLineTo(17f)
            lineTo(11.9922f, 17f)
            lineTo(12.4922f, 17f)
            verticalLineTo(19.5f)
            curveTo(12.4922f, 20.3284f, 13.1638f, 21f, 13.9922f, 21f)
            moveTo(13.9922f, 21f)
            horizontalLineTo(9.99219f)
            moveTo(9.99219f, 21f)
            horizontalLineTo(7.99219f)
            moveTo(11.9922f, 17f)
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
            moveTo(13.4922f, 12f)
            curveTo(13.4922f, 12f, 15.9922f, 10.1588f, 15.9922f, 9.49998f)
            curveTo(15.9922f, 8.84118f, 13.4922f, 7f, 13.4922f, 7f)
            moveTo(15.4922f, 9.49998f)
            horizontalLineTo(12.4922f)
            curveTo(11.0877f, 9.49998f, 10.3855f, 9.49998f, 9.88103f, 9.83705f)
            curveTo(9.66266f, 9.98296f, 9.47517f, 10.1705f, 9.32926f, 10.3888f)
            curveTo(8.99219f, 10.8933f, 8.99219f, 11.5955f, 8.99219f, 13f)
        }
        }.build()

        return _screenShare!!
    }

private var _screenShare: ImageVector? = null
