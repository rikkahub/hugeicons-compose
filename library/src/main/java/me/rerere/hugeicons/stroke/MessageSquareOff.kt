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

val HugeIcons.MessageSquareOff: ImageVector
    get() {
        if (_messageSquareOff != null) {
            return _messageSquareOff!!
        }
        _messageSquareOff = ImageVector.Builder(
            name = "MessageSquareOff",
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
            moveTo(1.99585f, 2f)
            lineTo(21.9958f, 22f)
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
            moveTo(6.63647f, 2.64016f)
            curveTo(6.97797f, 2.62133f, 7.34852f, 2.60547f, 7.75251f, 2.58819f)
            curveTo(9.09148f, 2.5309f, 10.5172f, 2.5f, 11.9963f, 2.5f)
            curveTo(13.4754f, 2.5f, 14.9011f, 2.5309f, 16.2401f, 2.58819f)
            curveTo(18.6806f, 2.6926f, 19.9009f, 2.74481f, 20.8662f, 3.71745f)
            curveTo(21.8316f, 4.69009f, 21.8735f, 5.87683f, 21.9572f, 8.2503f)
            curveTo(21.9828f, 8.97679f, 21.9963f, 9.72921f, 21.9963f, 10.5f)
            curveTo(21.9963f, 11.2708f, 21.9828f, 12.0232f, 21.9572f, 12.7497f)
            curveTo(21.8796f, 14.9504f, 21.8379f, 16.1309f, 21.0627f, 17.0664f)
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
            moveTo(3.12592f, 3.71875f)
            curveTo(2.16054f, 4.69139f, 2.11867f, 5.87813f, 2.03494f, 8.2516f)
            curveTo(2.00931f, 8.97809f, 1.99585f, 9.73051f, 1.99585f, 10.5013f)
            curveTo(1.99585f, 11.2721f, 2.00931f, 12.0245f, 2.03494f, 12.751f)
            curveTo(2.11867f, 15.1245f, 2.16054f, 16.3112f, 3.12592f, 17.2838f)
            curveTo(4.0913f, 18.2565f, 5.31154f, 18.3087f, 7.75204f, 18.4131f)
            curveTo(7.833f, 18.4166f, 7.91427f, 18.4199f, 7.99585f, 18.4232f)
            verticalLineTo(20.7714f)
            curveTo(7.99585f, 21.1745f, 8.32264f, 21.5013f, 8.72576f, 21.5013f)
            curveTo(8.90004f, 21.5013f, 9.06858f, 21.4389f, 9.20088f, 21.3255f)
            lineTo(11.3804f, 19.4566f)
            curveTo(11.9283f, 18.9868f, 12.2023f, 18.7519f, 12.5278f, 18.6279f)
            curveTo(12.8534f, 18.5039f, 13.224f, 18.4968f, 13.9652f, 18.4828f)
            curveTo(14.7457f, 18.468f, 15.5057f, 18.4445f, 16.2396f, 18.4131f)
            curveTo(17.0672f, 18.3777f, 17.7546f, 18.3483f, 18.3392f, 18.287f)
        }
        }.build()

        return _messageSquareOff!!
    }

private var _messageSquareOff: ImageVector? = null
