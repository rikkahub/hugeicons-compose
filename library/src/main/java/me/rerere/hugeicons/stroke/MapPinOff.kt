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

val HugeIcons.MapPinOff: ImageVector
    get() {
        if (_mapPinOff != null) {
            return _mapPinOff!!
        }
        _mapPinOff = ImageVector.Builder(
            name = "MapPinOff",
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
            moveTo(17.497f, 17.6461f)
            curveTo(16.2646f, 18.9628f, 14.8733f, 20.1884f, 13.6148f, 21.367f)
            curveTo(13.1811f, 21.773f, 12.6014f, 22f, 11.9981f, 22f)
            curveTo(11.3949f, 22f, 10.8152f, 21.773f, 10.3815f, 21.367f)
            curveTo(6.41003f, 17.626f, 1.08777f, 13.4469f, 3.68328f, 7.37966f)
            curveTo(4.01768f, 6.59797f, 4.46367f, 5.63512f, 4.99701f, 5f)
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
            moveTo(6.99701f, 3.48631f)
            curveTo(8.46615f, 2.53477f, 10.21f, 2f, 11.9981f, 2f)
            curveTo(15.5409f, 2f, 18.9096f, 4.09916f, 20.313f, 7.37966f)
            curveTo(21.6573f, 10.5221f, 20.8766f, 13.1643f, 19.2582f, 15.5f)
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
            moveTo(8.99701f, 9f)
            curveTo(8.66226f, 9.53668f, 8.49701f, 10.3209f, 8.49701f, 11f)
            curveTo(8.49701f, 12.933f, 10.064f, 14.5f, 11.997f, 14.5f)
            curveTo(12.6568f, 14.5f, 13.4702f, 14.3174f, 13.997f, 14f)
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
            moveTo(11.497f, 7.53544f)
            curveTo(11.6603f, 7.51209f, 11.8272f, 7.5f, 11.997f, 7.5f)
            curveTo(13.93f, 7.5f, 15.497f, 9.067f, 15.497f, 11f)
            curveTo(15.497f, 11.1698f, 15.4849f, 11.3367f, 15.4616f, 11.5f)
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
            moveTo(1.99701f, 2f)
            lineTo(21.997f, 22f)
        }
        }.build()

        return _mapPinOff!!
    }

private var _mapPinOff: ImageVector? = null
