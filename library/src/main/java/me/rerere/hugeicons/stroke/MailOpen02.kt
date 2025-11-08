package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MailOpen02: ImageVector
    get() {
        if (_mailOpen02 != null) {
            return _mailOpen02!!
        }
        _mailOpen02 = ImageVector.Builder(
            name = "MailOpen02",
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
        moveTo(2.01592f, 14.551f)
        curveTo(2.08186f, 17.5843f, 2.11484f, 19.1009f, 3.24611f, 20.2241f)
        curveTo(4.37738f, 21.3473f, 5.95183f, 21.3862f, 9.10072f, 21.4641f)
        curveTo(11.0393f, 21.512f, 12.9607f, 21.512f, 14.8993f, 21.4641f)
        curveTo(18.0482f, 21.3862f, 19.6226f, 21.3473f, 20.7539f, 20.2241f)
        curveTo(21.8852f, 19.1009f, 21.9181f, 17.5843f, 21.9841f, 14.551f)
        curveTo(22.0164f, 13.0649f, 21.9995f, 11.5934f, 21.9334f, 10.0921f)
        curveTo(21.8924f, 9.15964f, 21.8719f, 8.69341f, 21.6354f, 8.27984f)
        curveTo(21.3989f, 7.86628f, 20.9913f, 7.59935f, 20.176f, 7.0655f)
        lineTo(16.4152f, 4.60286f)
        curveTo(14.2742f, 3.20096f, 13.2038f, 2.5f, 12f, 2.5f)
        curveTo(10.7962f, 2.5f, 9.72577f, 3.20095f, 7.58483f, 4.60286f)
        lineTo(3.82397f, 7.0655f)
        curveTo(3.00869f, 7.59935f, 2.60106f, 7.86628f, 2.36459f, 8.27984f)
        curveTo(2.12812f, 8.69341f, 2.1076f, 9.15965f, 2.06656f, 10.0921f)
        curveTo(2.00049f, 11.5934f, 1.98361f, 13.0649f, 2.01592f, 14.551f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 9.5f)
        lineTo(6.26537f, 12.5896f)
        curveTo(6.73556f, 12.9302f, 7.16587f, 13.2419f, 7.564f, 13.5247f)
        curveTo(8.6401f, 14.2891f, 9.41661f, 14.5f, 10.7362f, 14.5f)
        horizontalLineTo(13.2638f)
        curveTo(14.5834f, 14.5f, 15.3599f, 14.2891f, 16.436f, 13.5247f)
        curveTo(16.8341f, 13.2419f, 17.2644f, 12.9302f, 17.7346f, 12.5896f)
        lineTo(22f, 9.5f)
        }
        }.build()

        return _mailOpen02!!
    }

private var _mailOpen02: ImageVector? = null
