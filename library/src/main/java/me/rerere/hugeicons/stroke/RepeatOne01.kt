package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.RepeatOne01: ImageVector
    get() {
        if (_repeatOne01 != null) {
            return _repeatOne01!!
        }
        _repeatOne01 = ImageVector.Builder(
            name = "RepeatOne01",
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
        moveTo(16.3884f, 3f)
        lineTo(17.3913f, 3.97574f)
        curveTo(17.8393f, 4.41165f, 18.0633f, 4.62961f, 17.9844f, 4.81481f)
        curveTo(17.9056f, 5f, 17.5888f, 5f, 16.9552f, 5f)
        horizontalLineTo(9.19422f)
        curveTo(5.22096f, 5f, 2f, 8.13401f, 2f, 12f)
        curveTo(2f, 13.4872f, 2.47668f, 14.8662f, 3.2895f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.61156f, 21f)
        lineTo(6.60875f, 20.0243f)
        curveTo(6.16074f, 19.5883f, 5.93673f, 19.3704f, 6.01557f, 19.1852f)
        curveTo(6.09441f, 19f, 6.4112f, 19f, 7.04478f, 19f)
        horizontalLineTo(14.8058f)
        curveTo(18.779f, 19f, 22f, 15.866f, 22f, 12f)
        curveTo(22f, 10.5128f, 21.5233f, 9.13383f, 20.7105f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 15f)
        lineTo(13f, 9.31633f)
        curveTo(13f, 9.05613f, 12.7178f, 8.90761f, 12.52f, 9.06373f)
        lineTo(11f, 10.2636f)
        }
        }.build()

        return _repeatOne01!!
    }

private var _repeatOne01: ImageVector? = null
