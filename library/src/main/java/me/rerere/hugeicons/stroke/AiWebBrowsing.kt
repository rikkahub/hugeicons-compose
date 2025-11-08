package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AiWebBrowsing: ImageVector
    get() {
        if (_aiWebBrowsing != null) {
            return _aiWebBrowsing!!
        }
        _aiWebBrowsing = ImageVector.Builder(
            name = "AiWebBrowsing",
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
        moveTo(11.5379f, 8.32172f)
        curveTo(11.6966f, 7.89276f, 12.3034f, 7.89276f, 12.4621f, 8.32172f)
        lineTo(13.1735f, 10.2443f)
        curveTo(13.2733f, 10.514f, 13.486f, 10.7267f, 13.7557f, 10.8265f)
        lineTo(15.6783f, 11.5379f)
        curveTo(16.1072f, 11.6966f, 16.1072f, 12.3034f, 15.6783f, 12.4621f)
        lineTo(13.7557f, 13.1735f)
        curveTo(13.486f, 13.2733f, 13.2733f, 13.486f, 13.1735f, 13.7557f)
        lineTo(12.4621f, 15.6783f)
        curveTo(12.3034f, 16.1072f, 11.6966f, 16.1072f, 11.5379f, 15.6783f)
        lineTo(10.8265f, 13.7557f)
        curveTo(10.7267f, 13.486f, 10.514f, 13.2733f, 10.2443f, 13.1735f)
        lineTo(8.32172f, 12.4621f)
        curveTo(7.89276f, 12.3034f, 7.89276f, 11.6966f, 8.32172f, 11.5379f)
        lineTo(10.2443f, 10.8265f)
        curveTo(10.514f, 10.7267f, 10.7267f, 10.514f, 10.8265f, 10.2443f)
        lineTo(11.5379f, 8.32172f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 8f)
        curveTo(8.67327f, 4.46819f, 10.2109f, 2f, 12f, 2f)
        curveTo(13.7891f, 2f, 15.3267f, 4.46819f, 16f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 16f)
        curveTo(8.67327f, 19.5318f, 10.2109f, 22f, 12f, 22f)
        curveTo(13.7891f, 22f, 15.3267f, 19.5318f, 16f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 12f)
        horizontalLineTo(4.5f)
        moveTo(22f, 12f)
        horizontalLineTo(19.5f)
        }
        }.build()

        return _aiWebBrowsing!!
    }

private var _aiWebBrowsing: ImageVector? = null
