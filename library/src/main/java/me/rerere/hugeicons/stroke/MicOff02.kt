package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MicOff02: ImageVector
    get() {
        if (_micOff02 != null) {
            return _micOff02!!
        }
        _micOff02 = ImageVector.Builder(
            name = "MicOff02",
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
        moveTo(2f, 2f)
        lineTo(22f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 11f)
        curveTo(4f, 15.4183f, 7.58172f, 19f, 12f, 19f)
        moveTo(12f, 19f)
        curveTo(13.9545f, 19f, 15.7454f, 18.2991f, 17.1348f, 17.1348f)
        moveTo(12f, 19f)
        verticalLineTo(22f)
        moveTo(12f, 22f)
        horizontalLineTo(15f)
        moveTo(12f, 22f)
        horizontalLineTo(9f)
        moveTo(20f, 11f)
        curveTo(20f, 12.6514f, 19.4996f, 14.1859f, 18.6422f, 15.4603f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 6.98f)
        verticalLineTo(11f)
        curveTo(7f, 13.7614f, 9.23858f, 16f, 12f, 16f)
        curveTo(13.1354f, 16f, 14.1647f, 15.6096f, 15.004f, 14.972f)
        moveTo(16.4387f, 13.244f)
        curveTo(16.7973f, 12.5545f, 17f, 11.8309f, 17f, 11f)
        verticalLineTo(6.98f)
        curveTo(17f, 4.21858f, 14.7614f, 2f, 12f, 2f)
        curveTo(10.1312f, 2f, 8.53009f, 2.96527f, 7.672f, 4.484f)
        }
        }.build()

        return _micOff02!!
    }

private var _micOff02: ImageVector? = null
