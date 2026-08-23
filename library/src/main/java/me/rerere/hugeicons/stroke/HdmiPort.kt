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

val HugeIcons.HdmiPort: ImageVector
    get() {
        if (_hdmiPort != null) {
            return _hdmiPort!!
        }
        _hdmiPort = ImageVector.Builder(
            name = "HdmiPort",
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
            moveTo(7.74674f, 9f)
            horizontalLineTo(16.2533f)
            curveTo(17.4229f, 9f, 18.0078f, 9f, 18.4111f, 9.30841f)
            curveTo(18.5166f, 9.38908f, 18.6109f, 9.48339f, 18.6916f, 9.58889f)
            curveTo(19f, 9.99225f, 19f, 10.5771f, 19f, 11.7467f)
            curveTo(19f, 12.4279f, 19f, 12.7685f, 18.8669f, 13.063f)
            curveTo(18.8313f, 13.1417f, 18.7891f, 13.2171f, 18.7406f, 13.2884f)
            curveTo(18.5589f, 13.5558f, 18.2684f, 13.7336f, 17.6875f, 14.0893f)
            lineTo(16.921f, 14.5586f)
            curveTo(16.5628f, 14.7779f, 16.3837f, 14.8875f, 16.1842f, 14.9438f)
            curveTo(15.9846f, 15f, 15.7746f, 15f, 15.3546f, 15f)
            horizontalLineTo(8.64543f)
            curveTo(8.22541f, 15f, 8.0154f, 15f, 7.81585f, 14.9438f)
            curveTo(7.6163f, 14.8875f, 7.43719f, 14.7779f, 7.07897f, 14.5586f)
            lineTo(6.31252f, 14.0893f)
            curveTo(5.73157f, 13.7336f, 5.4411f, 13.5558f, 5.25941f, 13.2884f)
            curveTo(5.21091f, 13.2171f, 5.16866f, 13.1417f, 5.13312f, 13.063f)
            curveTo(5f, 12.7685f, 5f, 12.4279f, 5f, 11.7467f)
            curveTo(5f, 10.5771f, 5f, 9.99225f, 5.30841f, 9.58889f)
            curveTo(5.38908f, 9.48339f, 5.48339f, 9.38908f, 5.58889f, 9.30841f)
            curveTo(5.99225f, 9f, 6.57708f, 9f, 7.74674f, 9f)
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
            moveTo(8f, 12f)
            horizontalLineTo(16f)
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
            moveTo(2f, 11f)
            curveTo(2f, 8.17157f, 2f, 6.75736f, 2.87868f, 5.87868f)
            curveTo(3.75736f, 5f, 5.17157f, 5f, 8f, 5f)
            horizontalLineTo(16f)
            curveTo(18.8284f, 5f, 20.2426f, 5f, 21.1213f, 5.87868f)
            curveTo(22f, 6.75736f, 22f, 8.17157f, 22f, 11f)
            verticalLineTo(13f)
            curveTo(22f, 15.8284f, 22f, 17.2426f, 21.1213f, 18.1213f)
            curveTo(20.2426f, 19f, 18.8284f, 19f, 16f, 19f)
            horizontalLineTo(8f)
            curveTo(5.17157f, 19f, 3.75736f, 19f, 2.87868f, 18.1213f)
            curveTo(2f, 17.2426f, 2f, 15.8284f, 2f, 13f)
            verticalLineTo(11f)
            close()
        }
        }.build()

        return _hdmiPort!!
    }

private var _hdmiPort: ImageVector? = null
