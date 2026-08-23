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

val HugeIcons.MessageSquareLock: ImageVector
    get() {
        if (_messageSquareLock != null) {
            return _messageSquareLock!!
        }
        _messageSquareLock = ImageVector.Builder(
            name = "MessageSquareLock",
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
            moveTo(1.99609f, 10.5f)
            curveTo(1.99609f, 9.72921f, 2.00956f, 8.97679f, 2.03519f, 8.2503f)
            curveTo(2.11892f, 5.87683f, 2.16078f, 4.69009f, 3.12616f, 3.71745f)
            curveTo(4.09154f, 2.74481f, 5.31179f, 2.6926f, 7.75229f, 2.58819f)
            curveTo(9.09126f, 2.5309f, 10.517f, 2.5f, 11.9961f, 2.5f)
            curveTo(13.4752f, 2.5f, 14.9009f, 2.5309f, 16.2399f, 2.58819f)
            curveTo(18.6804f, 2.6926f, 19.9006f, 2.74481f, 20.866f, 3.71745f)
            curveTo(21.8314f, 4.69009f, 21.8733f, 5.87683f, 21.957f, 8.2503f)
            curveTo(21.9826f, 8.97679f, 21.9961f, 9.72921f, 21.9961f, 10.5f)
            curveTo(21.9961f, 11.2708f, 21.9826f, 12.0232f, 21.957f, 12.7497f)
            curveTo(21.8733f, 15.1232f, 21.8314f, 16.3099f, 20.866f, 17.2826f)
            curveTo(19.9006f, 18.2552f, 18.6804f, 18.3074f, 16.2398f, 18.4118f)
            curveTo(15.5059f, 18.4432f, 14.7459f, 18.4667f, 13.9654f, 18.4815f)
            curveTo(13.2242f, 18.4955f, 12.8537f, 18.5026f, 12.5281f, 18.6266f)
            curveTo(12.2025f, 18.7506f, 11.9285f, 18.9855f, 11.3806f, 19.4553f)
            lineTo(9.20113f, 21.3242f)
            curveTo(9.06882f, 21.4376f, 8.90029f, 21.5f, 8.726f, 21.5f)
            curveTo(8.32289f, 21.5f, 7.99609f, 21.1732f, 7.99609f, 20.7701f)
            verticalLineTo(18.4219f)
            curveTo(7.91451f, 18.4186f, 7.83324f, 18.4153f, 7.75229f, 18.4118f)
            curveTo(5.31179f, 18.3074f, 4.09154f, 18.2552f, 3.12616f, 17.2825f)
            curveTo(2.16078f, 16.3099f, 2.11892f, 15.1232f, 2.03519f, 12.7497f)
            curveTo(2.00956f, 12.0232f, 1.99609f, 11.2708f, 1.99609f, 10.5f)
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
            moveTo(9.99609f, 10f)
            verticalLineTo(8.5f)
            curveTo(9.99609f, 7.39543f, 10.8915f, 6.5f, 11.9961f, 6.5f)
            curveTo(13.1007f, 6.5f, 13.9961f, 7.39543f, 13.9961f, 8.5f)
            verticalLineTo(10f)
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
            moveTo(13.9961f, 10f)
            horizontalLineTo(9.99609f)
            curveTo(9.16767f, 10f, 8.49609f, 10.6716f, 8.49609f, 11.5f)
            verticalLineTo(13f)
            curveTo(8.49609f, 13.8284f, 9.16767f, 14.5f, 9.99609f, 14.5f)
            horizontalLineTo(13.9961f)
            curveTo(14.8245f, 14.5f, 15.4961f, 13.8284f, 15.4961f, 13f)
            verticalLineTo(11.5f)
            curveTo(15.4961f, 10.6716f, 14.8245f, 10f, 13.9961f, 10f)
            close()
        }
        }.build()

        return _messageSquareLock!!
    }

private var _messageSquareLock: ImageVector? = null
