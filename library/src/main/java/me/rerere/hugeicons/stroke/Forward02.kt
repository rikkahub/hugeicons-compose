package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Forward02: ImageVector
    get() {
        if (_forward02 != null) {
            return _forward02!!
        }
        _forward02 = ImageVector.Builder(
            name = "Forward02",
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
        moveTo(21.8371f, 12.9178f)
        curveTo(21.5547f, 13.6884f, 20.7014f, 14.3047f, 18.9948f, 15.5372f)
        curveTo(16.6677f, 17.218f, 15.5041f, 18.0583f, 14.5312f, 17.9969f)
        curveTo(13.7882f, 17.9499f, 13.0976f, 17.6007f, 12.6223f, 17.0315f)
        curveTo(12f, 16.2863f, 12f, 14.8575f, 12f, 12f)
        curveTo(12f, 9.14246f, 12f, 7.71369f, 12.6223f, 6.96846f)
        curveTo(13.0976f, 6.39933f, 13.7882f, 6.0501f, 14.5312f, 6.00315f)
        curveTo(15.5041f, 5.94167f, 16.6677f, 6.78203f, 18.9948f, 8.46275f)
        curveTo(20.7014f, 9.6953f, 21.5547f, 10.3116f, 21.8371f, 11.0822f)
        curveTo(22.0543f, 11.675f, 22.0543f, 12.325f, 21.8371f, 12.9178f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.8371f, 12.9178f)
        curveTo(11.5547f, 13.6884f, 10.7014f, 14.3047f, 8.99482f, 15.5372f)
        curveTo(6.66769f, 17.218f, 5.50413f, 18.0583f, 4.5312f, 17.9969f)
        curveTo(3.78818f, 17.9499f, 3.09758f, 17.6007f, 2.62232f, 17.0315f)
        curveTo(2f, 16.2863f, 2f, 14.8575f, 2f, 12f)
        curveTo(2f, 9.14246f, 2f, 7.71369f, 2.62232f, 6.96846f)
        curveTo(3.09758f, 6.39933f, 3.78818f, 6.0501f, 4.5312f, 6.00315f)
        curveTo(5.50413f, 5.94167f, 6.66769f, 6.78203f, 8.99482f, 8.46275f)
        curveTo(10.7014f, 9.6953f, 11.5547f, 10.3116f, 11.8371f, 11.0822f)
        curveTo(12.0543f, 11.675f, 12.0543f, 12.325f, 11.8371f, 12.9178f)
        }
        }.build()

        return _forward02!!
    }

private var _forward02: ImageVector? = null
