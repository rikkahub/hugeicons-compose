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

val HugeIcons.MessageSquareDot: ImageVector
    get() {
        if (_messageSquareDot != null) {
            return _messageSquareDot!!
        }
        _messageSquareDot = ImageVector.Builder(
            name = "MessageSquareDot",
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
            moveTo(13.9654f, 2.51851f)
            curveTo(13.3219f, 2.50631f, 12.6645f, 2.5f, 11.9961f, 2.5f)
            curveTo(10.517f, 2.5f, 9.09126f, 2.5309f, 7.75229f, 2.58819f)
            curveTo(5.31179f, 2.6926f, 4.09154f, 2.74481f, 3.12616f, 3.71745f)
            curveTo(2.16078f, 4.69009f, 2.11892f, 5.87683f, 2.03519f, 8.2503f)
            curveTo(2.00956f, 8.97679f, 1.99609f, 9.72921f, 1.99609f, 10.5f)
            curveTo(1.99609f, 11.2708f, 2.00956f, 12.0232f, 2.03519f, 12.7497f)
            curveTo(2.11892f, 15.1232f, 2.16078f, 16.3099f, 3.12616f, 17.2825f)
            curveTo(4.09154f, 18.2552f, 5.31179f, 18.3074f, 7.75229f, 18.4118f)
            curveTo(7.83324f, 18.4153f, 7.91451f, 18.4186f, 7.99609f, 18.4219f)
            verticalLineTo(20.7701f)
            curveTo(7.99609f, 21.1732f, 8.32289f, 21.5f, 8.726f, 21.5f)
            curveTo(8.90029f, 21.5f, 9.06882f, 21.4376f, 9.20113f, 21.3242f)
            lineTo(11.3806f, 19.4553f)
            curveTo(11.9285f, 18.9855f, 12.2025f, 18.7506f, 12.5281f, 18.6266f)
            curveTo(12.8537f, 18.5026f, 13.2242f, 18.4955f, 13.9654f, 18.4815f)
            curveTo(14.7459f, 18.4667f, 15.5059f, 18.4432f, 16.2398f, 18.4118f)
            curveTo(18.6804f, 18.3074f, 19.9006f, 18.2552f, 20.866f, 17.2826f)
            curveTo(21.8314f, 16.3099f, 21.8733f, 15.1232f, 21.957f, 12.7497f)
            curveTo(21.9826f, 12.0232f, 21.9961f, 11.2708f, 21.9961f, 10.5f)
            curveTo(21.9961f, 10.3324f, 21.9955f, 10.1657f, 21.9942f, 10f)
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
            moveTo(21.9961f, 5f)
            curveTo(21.9961f, 6.38071f, 20.8768f, 7.5f, 19.4961f, 7.5f)
            curveTo(18.1154f, 7.5f, 16.9961f, 6.38071f, 16.9961f, 5f)
            curveTo(16.9961f, 3.61929f, 18.1154f, 2.5f, 19.4961f, 2.5f)
            curveTo(20.8768f, 2.5f, 21.9961f, 3.61929f, 21.9961f, 5f)
            close()
        }
        }.build()

        return _messageSquareDot!!
    }

private var _messageSquareDot: ImageVector? = null
