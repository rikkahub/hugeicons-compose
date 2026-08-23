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

val HugeIcons.MapPinPen: ImageVector
    get() {
        if (_mapPinPen != null) {
            return _mapPinPen!!
        }
        _mapPinPen = ImageVector.Builder(
            name = "MapPinPen",
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
            moveTo(14f, 10.5f)
            curveTo(14f, 12.1569f, 12.6569f, 13.5f, 11f, 13.5f)
            curveTo(9.34315f, 13.5f, 8f, 12.1569f, 8f, 10.5f)
            curveTo(8f, 8.84315f, 9.34315f, 7.5f, 11f, 7.5f)
            curveTo(12.6569f, 7.5f, 14f, 8.84315f, 14f, 10.5f)
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
            moveTo(14f, 20.5f)
            verticalLineTo(19.3284f)
            curveTo(14f, 18.798f, 14.2107f, 18.2893f, 14.5858f, 17.9142f)
            lineTo(18.6464f, 13.8536f)
            curveTo(18.8728f, 13.6272f, 19.1799f, 13.5f, 19.5f, 13.5f)
            curveTo(19.8201f, 13.5f, 20.1272f, 13.6272f, 20.3536f, 13.8536f)
            lineTo(20.6464f, 14.1464f)
            curveTo(20.8728f, 14.3728f, 21f, 14.6799f, 21f, 15f)
            curveTo(21f, 15.3201f, 20.8728f, 15.6272f, 20.6464f, 15.8536f)
            lineTo(16.5858f, 19.9142f)
            curveTo(16.2107f, 20.2893f, 15.702f, 20.5f, 15.1716f, 20.5f)
            horizontalLineTo(14f)
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
            moveTo(19f, 10.5352f)
            curveTo(18.9998f, 6.09743f, 15.4182f, 2.5f, 11f, 2.5f)
            curveTo(6.58184f, 2.5f, 3.00019f, 6.09743f, 3f, 10.5352f)
            curveTo(3f, 13.0728f, 4f, 15.0462f, 6f, 16.8086f)
            curveTo(7.07535f, 17.7562f, 8.82325f, 19.5313f, 10.0469f, 21.0625f)
            curveTo(10.2798f, 21.354f, 10.6397f, 21.5f, 11f, 21.5f)
        }
        }.build()

        return _mapPinPen!!
    }

private var _mapPinPen: ImageVector? = null
