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

val HugeIcons.Champion: ImageVector
    get() {
        if (_champion != null) {
            return _champion!!
        }
        _champion = ImageVector.Builder(
            name = "Champion",
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
            moveTo(13.0004f, 16.9995f)
            curveTo(12.9967f, 18.8613f, 13.8631f, 19.8565f, 14.7895f, 20.7919f)
            curveTo(14.9216f, 20.9253f, 14.9965f, 21.105f, 14.9965f, 21.2927f)
            curveTo(14.9965f, 21.6835f, 14.6796f, 22.0004f, 14.2887f, 22.0004f)
            horizontalLineTo(9.70419f)
            curveTo(9.31332f, 22.0004f, 8.99646f, 21.6835f, 8.99646f, 21.2927f)
            curveTo(8.99646f, 21.105f, 9.07133f, 20.9253f, 9.20342f, 20.7919f)
            curveTo(10.1299f, 19.8565f, 10.9967f, 18.8613f, 11.0004f, 16.9995f)
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
            moveTo(18.0668f, 3.99951f)
            horizontalLineTo(19.5668f)
            curveTo(20.671f, 3.99951f, 21.5922f, 4.89546f, 21.4921f, 5.99518f)
            curveTo(21.2546f, 8.60305f, 20.19f, 12.3569f, 16.0004f, 13.4995f)
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
            moveTo(5.93312f, 3.99951f)
            horizontalLineTo(4.43312f)
            curveTo(3.32885f, 3.99951f, 2.40769f, 4.89546f, 2.50783f, 5.99518f)
            curveTo(2.74531f, 8.60305f, 3.80988f, 12.3569f, 7.99953f, 13.4995f)
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
            moveTo(12.0881f, 16.9995f)
            curveTo(16.0144f, 16.9995f, 17.6206f, 9.25521f, 17.9947f, 4.02001f)
            curveTo(18.0741f, 2.90913f, 17.1609f, 1.99951f, 16.0318f, 1.99951f)
            horizontalLineTo(7.96852f)
            curveTo(6.83985f, 1.99951f, 5.92573f, 2.90839f, 6.00422f, 4.01895f)
            curveTo(6.37529f, 9.26941f, 7.97514f, 16.9995f, 11.832f, 16.9995f)
            horizontalLineTo(12.0881f)
            close()
        }
        }.build()

        return _champion!!
    }

private var _champion: ImageVector? = null
