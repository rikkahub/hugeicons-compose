package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Bluetooth: ImageVector
    get() {
        if (_bluetooth != null) {
            return _bluetooth!!
        }
        _bluetooth = ImageVector.Builder(
            name = "Bluetooth",
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
        moveTo(11.9994f, 12f)
        verticalLineTo(6.66586f)
        curveTo(11.9994f, 4.80386f, 11.9994f, 3.87286f, 12.5847f, 3.578f)
        curveTo(13.17f, 3.28313f, 13.9092f, 3.84173f, 15.3877f, 4.95893f)
        lineTo(16.0935f, 5.49234f)
        curveTo(17.1288f, 6.27468f, 17.6465f, 6.66586f, 17.6465f, 7.19927f)
        curveTo(17.6465f, 7.73268f, 17.1288f, 8.12386f, 16.0935f, 8.9062f)
        lineTo(11.9994f, 12f)
        moveTo(11.9994f, 12f)
        verticalLineTo(17.3341f)
        curveTo(11.9994f, 19.1961f, 11.9994f, 20.1271f, 12.5847f, 20.422f)
        curveTo(13.17f, 20.7169f, 13.9092f, 20.1583f, 15.3877f, 19.0411f)
        lineTo(16.0935f, 18.5077f)
        curveTo(17.1288f, 17.7253f, 17.6465f, 17.3341f, 17.6465f, 16.8007f)
        curveTo(17.6465f, 16.2673f, 17.1288f, 15.8761f, 16.0935f, 15.0938f)
        lineTo(11.9994f, 12f)
        moveTo(11.9994f, 12f)
        lineTo(5.64648f, 7.19927f)
        moveTo(11.9994f, 12f)
        lineTo(5.64648f, 16.8007f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.9998f, 12f)
        horizontalLineTo(19.0088f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.99981f, 12f)
        horizontalLineTo(5.00879f)
        }
        }.build()

        return _bluetooth!!
    }

private var _bluetooth: ImageVector? = null
