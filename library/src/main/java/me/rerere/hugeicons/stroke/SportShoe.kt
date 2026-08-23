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

val HugeIcons.SportShoe: ImageVector
    get() {
        if (_sportShoe != null) {
            return _sportShoe!!
        }
        _sportShoe = ImageVector.Builder(
            name = "SportShoe",
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
            moveTo(3.49219f, 19.5f)
            horizontalLineTo(16.9922f)
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
            moveTo(19.8754f, 19.5f)
            horizontalLineTo(14.7262f)
            curveTo(13.1634f, 19.5f, 12.382f, 19.5f, 11.6742f, 19.2106f)
            curveTo(10.9663f, 18.9212f, 10.3991f, 18.3698f, 9.26455f, 17.2671f)
            lineTo(4.56523f, 12.6992f)
            curveTo(3.67719f, 11.8361f, 3.23316f, 11.4044f, 3.0798f, 10.8925f)
            curveTo(2.96835f, 10.5204f, 2.96312f, 10.1234f, 3.06473f, 9.74842f)
            curveTo(3.20456f, 9.23239f, 3.63706f, 8.78864f, 4.50205f, 7.90115f)
            lineTo(7.34589f, 4.98332f)
            curveTo(8.35217f, 3.95085f, 10.0728f, 4.68208f, 10.0728f, 6.14221f)
            curveTo(10.0728f, 6.82539f, 10.4858f, 7.43691f, 11.1093f, 7.67679f)
            lineTo(13.2847f, 8.5138f)
            curveTo(13.7411f, 8.68941f, 14.0435f, 9.13707f, 14.0435f, 9.63719f)
            curveTo(14.0435f, 11.3873f, 14.7211f, 13.0657f, 15.9272f, 14.3032f)
            lineTo(16.1434f, 14.525f)
            curveTo(16.3878f, 14.7758f, 16.7194f, 14.9167f, 17.0651f, 14.9167f)
            horizontalLineTo(17.6419f)
            curveTo(17.9876f, 14.9167f, 18.1605f, 14.9167f, 18.3061f, 14.9315f)
            curveTo(19.72f, 15.0743f, 20.8386f, 16.2221f, 20.9778f, 17.6728f)
            curveTo(20.9922f, 17.8221f, 20.9922f, 17.9995f, 20.9922f, 18.3542f)
            curveTo(20.9922f, 18.4724f, 20.9922f, 18.5315f, 20.9874f, 18.5813f)
            curveTo(20.941f, 19.0649f, 20.5681f, 19.4475f, 20.0968f, 19.4951f)
            curveTo(20.0483f, 19.5f, 19.9907f, 19.5f, 19.8754f, 19.5f)
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
            moveTo(4.99219f, 8.5f)
            lineTo(10.4922f, 14f)
        }
        }.build()

        return _sportShoe!!
    }

private var _sportShoe: ImageVector? = null
