package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ChatGpt: ImageVector
    get() {
        if (_chatGpt != null) {
            return _chatGpt!!
        }
        _chatGpt = ImageVector.Builder(
            name = "ChatGpt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.7453f, 14.85f)
        lineTo(6.90436f, 12f)
        verticalLineTo(7f)
        curveTo(6.90436f, 4.79086f, 8.72949f, 3f, 10.9809f, 3f)
        curveTo(12.3782f, 3f, 13.6113f, 3.6898f, 14.3458f, 4.74128f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.59961f, 19.1791f)
        curveTo(10.3266f, 20.2757f, 11.5866f, 21.0008f, 13.0192f, 21.0008f)
        curveTo(15.2707f, 21.0008f, 17.0958f, 19.21f, 17.0958f, 17.0008f)
        verticalLineTo(12.0008f)
        lineTo(12.1612f, 9.0957f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.45166f, 13.5f)
        lineTo(9.45123f, 7.66938f)
        lineTo(13.8642f, 5.16938f)
        curveTo(15.814f, 4.06481f, 18.3072f, 4.72031f, 19.4329f, 6.63348f)
        curveTo(20.1593f, 7.86806f, 20.1388f, 9.32466f, 19.5089f, 10.4995f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.48963f, 13.4993f)
        curveTo(3.8595f, 14.6742f, 3.83887f, 16.131f, 4.56539f, 17.3657f)
        curveTo(5.6911f, 19.2789f, 8.18428f, 19.9344f, 10.1341f, 18.8298f)
        lineTo(14.5471f, 16.3298f)
        lineTo(14.643f, 10.7344f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.0959f, 17.6309f)
        curveTo(18.4415f, 17.5734f, 19.7295f, 16.8634f, 20.4529f, 15.634f)
        curveTo(21.5786f, 13.7209f, 20.9106f, 11.2745f, 18.9608f, 10.1699f)
        lineTo(14.5478f, 7.66992f)
        lineTo(9.48907f, 10.4255f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.90454f, 6.36938f)
        curveTo(5.55865f, 6.42662f, 4.27032f, 7.13672f, 3.54684f, 8.3663f)
        curveTo(2.42113f, 10.2795f, 3.08917f, 12.7258f, 5.03896f, 13.8304f)
        lineTo(9.45196f, 16.3304f)
        lineTo(14.5f, 13.5807f)
        }
        }.build()

        return _chatGpt!!
    }

private var _chatGpt: ImageVector? = null
