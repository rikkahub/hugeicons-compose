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

val HugeIcons.ShieldOff: ImageVector
    get() {
        if (_shieldOff != null) {
            return _shieldOff!!
        }
        _shieldOff = ImageVector.Builder(
            name = "ShieldOff",
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
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(20.5455f, 14f)
            curveTo(20.8286f, 13.133f, 20.9922f, 12.1945f, 20.9922f, 11.1833f)
            verticalLineTo(8.28029f)
            curveTo(20.9922f, 6.64029f, 20.9922f, 5.82028f, 20.5881f, 5.28529f)
            curveTo(20.184f, 4.75029f, 19.2703f, 4.49056f, 17.4429f, 3.9711f)
            curveTo(16.1944f, 3.6162f, 15.0938f, 3.18863f, 14.2145f, 2.79829f)
            curveTo(13.0156f, 2.2661f, 12.4161f, 2f, 11.9922f, 2f)
            curveTo(11.5682f, 2f, 10.9688f, 2.2661f, 9.7699f, 2.79829f)
            curveTo(9.52703f, 2.9061f, 9.26727f, 3.01676f, 8.99219f, 3.12793f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(17.9922f, 18.1221f)
            curveTo(16.4419f, 19.7483f, 14.6235f, 20.8728f, 13.3982f, 21.5194f)
            curveTo(12.7911f, 21.8398f, 12.4876f, 22f, 11.9922f, 22f)
            curveTo(11.4968f, 22f, 11.1932f, 21.8398f, 10.5861f, 21.5194f)
            curveTo(8.05496f, 20.1836f, 2.99219f, 16.8085f, 2.99219f, 11.1834f)
            verticalLineTo(8.28033f)
            curveTo(2.99219f, 6.64032f, 2.99219f, 5.82032f, 3.3963f, 5.28533f)
            curveTo(3.60583f, 5.00794f, 3.95235f, 4.80455f, 4.49219f, 4.60059f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(1.99219f, 2f)
            lineTo(21.9922f, 22f)
        }
        }.build()

        return _shieldOff!!
    }

private var _shieldOff: ImageVector? = null
