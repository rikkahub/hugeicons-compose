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

val HugeIcons.EthernetPort: ImageVector
    get() {
        if (_ethernetPort != null) {
            return _ethernetPort!!
        }
        _ethernetPort = ImageVector.Builder(
            name = "EthernetPort",
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
            moveTo(16f, 4f)
            horizontalLineTo(8f)
            curveTo(5.17157f, 4f, 3.75736f, 4f, 2.87868f, 4.87868f)
            curveTo(2f, 5.75736f, 2f, 7.17157f, 2f, 10f)
            verticalLineTo(12.5f)
            curveTo(2f, 13.8978f, 2f, 14.5967f, 2.22836f, 15.1481f)
            curveTo(2.53284f, 15.8831f, 3.11687f, 16.4672f, 3.85195f, 16.7716f)
            curveTo(4.40326f, 17f, 5.10218f, 17f, 6.5f, 17f)
            lineTo(7.20092f, 17.8411f)
            curveTo(8.08561f, 18.9027f, 8.52795f, 19.4335f, 9.13266f, 19.7168f)
            curveTo(9.73737f, 20f, 10.4283f, 20f, 11.8102f, 20f)
            horizontalLineTo(12.1898f)
            curveTo(13.5717f, 20f, 14.2626f, 20f, 14.8673f, 19.7168f)
            curveTo(15.4721f, 19.4335f, 15.9144f, 18.9027f, 16.7991f, 17.8411f)
            lineTo(17.5f, 17f)
            curveTo(18.8978f, 17f, 19.5967f, 17f, 20.1481f, 16.7716f)
            curveTo(20.8831f, 16.4672f, 21.4672f, 15.8831f, 21.7716f, 15.1481f)
            curveTo(22f, 14.5967f, 22f, 13.8978f, 22f, 12.5f)
            verticalLineTo(10f)
            curveTo(22f, 7.17157f, 22f, 5.75736f, 21.1213f, 4.87868f)
            curveTo(20.2426f, 4f, 18.8284f, 4f, 16f, 4f)
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
            moveTo(6f, 8f)
            verticalLineTo(11f)
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
            moveTo(10f, 8f)
            verticalLineTo(11f)
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
            moveTo(14f, 8f)
            verticalLineTo(11f)
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
            moveTo(18f, 8f)
            verticalLineTo(11f)
        }
        }.build()

        return _ethernetPort!!
    }

private var _ethernetPort: ImageVector? = null
