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

val HugeIcons.MessageSquarePlus: ImageVector
    get() {
        if (_messageSquarePlus != null) {
            return _messageSquarePlus!!
        }
        _messageSquarePlus = ImageVector.Builder(
            name = "MessageSquarePlus",
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
            moveTo(1.99634f, 10.5f)
            curveTo(1.99634f, 9.72921f, 2.0098f, 8.97679f, 2.03543f, 8.2503f)
            curveTo(2.11916f, 5.87683f, 2.16103f, 4.69009f, 3.12641f, 3.71745f)
            curveTo(4.09178f, 2.74481f, 5.31203f, 2.6926f, 7.75254f, 2.58819f)
            curveTo(9.09151f, 2.5309f, 10.5172f, 2.5f, 11.9963f, 2.5f)
            curveTo(13.4754f, 2.5f, 14.9012f, 2.5309f, 16.2401f, 2.58819f)
            curveTo(18.6806f, 2.6926f, 19.9009f, 2.74481f, 20.8663f, 3.71745f)
            curveTo(21.8316f, 4.69009f, 21.8735f, 5.87683f, 21.9572f, 8.2503f)
            curveTo(21.9829f, 8.97679f, 21.9963f, 9.72921f, 21.9963f, 10.5f)
            curveTo(21.9963f, 11.2708f, 21.9829f, 12.0232f, 21.9572f, 12.7497f)
            curveTo(21.8735f, 15.1232f, 21.8316f, 16.3099f, 20.8663f, 17.2826f)
            curveTo(19.9009f, 18.2552f, 18.6806f, 18.3074f, 16.24f, 18.4118f)
            curveTo(15.5061f, 18.4432f, 14.7462f, 18.4667f, 13.9656f, 18.4815f)
            curveTo(13.2245f, 18.4955f, 12.8539f, 18.5026f, 12.5283f, 18.6266f)
            curveTo(12.2028f, 18.7506f, 11.9288f, 18.9855f, 11.3809f, 19.4553f)
            lineTo(9.20137f, 21.3242f)
            curveTo(9.06907f, 21.4376f, 8.90053f, 21.5f, 8.72625f, 21.5f)
            curveTo(8.32313f, 21.5f, 7.99634f, 21.1732f, 7.99634f, 20.7701f)
            verticalLineTo(18.4219f)
            curveTo(7.91476f, 18.4186f, 7.83348f, 18.4153f, 7.75253f, 18.4118f)
            curveTo(5.31203f, 18.3074f, 4.09178f, 18.2552f, 3.12641f, 17.2825f)
            curveTo(2.16103f, 16.3099f, 2.11916f, 15.1232f, 2.03543f, 12.7497f)
            curveTo(2.0098f, 12.0232f, 1.99634f, 11.2708f, 1.99634f, 10.5f)
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
            moveTo(15.4963f, 10.5f)
            horizontalLineTo(8.49634f)
            moveTo(11.9963f, 7f)
            verticalLineTo(14f)
        }
        }.build()

        return _messageSquarePlus!!
    }

private var _messageSquarePlus: ImageVector? = null
