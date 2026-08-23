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

val HugeIcons.MousePointerOff: ImageVector
    get() {
        if (_mousePointerOff != null) {
            return _mousePointerOff!!
        }
        _mousePointerOff = ImageVector.Builder(
            name = "MousePointerOff",
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
            moveTo(15.7419f, 7.25809f)
            lineTo(16.3363f, 7.49069f)
            curveTo(19.8163f, 8.85243f, 21.5563f, 9.53329f, 21.4986f, 10.6133f)
            curveTo(21.4409f, 11.6934f, 19.625f, 12.1886f, 15.9933f, 13.1791f)
            curveTo(14.9119f, 13.474f, 14.3712f, 13.6215f, 13.9963f, 13.9963f)
            curveTo(13.6215f, 14.3712f, 13.474f, 14.9119f, 13.1791f, 15.9933f)
            curveTo(12.1886f, 19.625f, 11.6934f, 21.4409f, 10.6133f, 21.4986f)
            curveTo(9.53329f, 21.5563f, 8.85243f, 19.8163f, 7.49069f, 16.3363f)
            lineTo(7.25809f, 15.7419f)
            moveTo(5.85184f, 12.1482f)
            lineTo(5.12973f, 10.3028f)
            curveTo(3.70405f, 6.65934f, 2.99121f, 4.83764f, 3.91442f, 3.91442f)
            curveTo(4.83764f, 2.99121f, 6.65934f, 3.70405f, 10.3028f, 5.12973f)
            lineTo(12.1482f, 5.85184f)
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
            moveTo(20.5f, 2.5f)
            lineTo(2.5f, 20.5f)
        }
        }.build()

        return _mousePointerOff!!
    }

private var _mousePointerOff: ImageVector? = null
