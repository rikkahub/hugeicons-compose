package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.RepeatOne02: ImageVector
    get() {
        if (_repeatOne02 != null) {
            return _repeatOne02!!
        }
        _repeatOne02 = ImageVector.Builder(
            name = "RepeatOne02",
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
        moveTo(22f, 10f)
        lineTo(22f, 3.36905f)
        curveTo(22f, 3.06549f, 21.7178f, 2.89221f, 21.52f, 3.07435f)
        lineTo(20f, 4.47421f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.3884f, 3f)
        lineTo(15.3913f, 3.97574f)
        curveTo(15.8393f, 4.41165f, 16.0633f, 4.62961f, 15.9844f, 4.81481f)
        curveTo(15.9056f, 5f, 15.5888f, 5f, 14.9552f, 5f)
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
        curveTo(18.2499f, 19f, 21.2943f, 16.6452f, 22f, 13.5f)
        }
        }.build()

        return _repeatOne02!!
    }

private var _repeatOne02: ImageVector? = null
