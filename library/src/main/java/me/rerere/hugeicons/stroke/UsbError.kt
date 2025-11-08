package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.UsbError: ImageVector
    get() {
        if (_usbError != null) {
            return _usbError!!
        }
        _usbError = ImageVector.Builder(
            name = "UsbError",
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
        moveTo(13.9744f, 10.5014f)
        curveTo(13.9564f, 9.26104f, 13.8647f, 8.55783f, 13.3941f, 8.08606f)
        curveTo(12.8096f, 7.5f, 11.8688f, 7.5f, 9.9872f, 7.5f)
        horizontalLineTo(7.99147f)
        curveTo(6.10987f, 7.5f, 5.16907f, 7.5f, 4.58454f, 8.08606f)
        curveTo(4f, 8.67212f, 4f, 9.61538f, 4f, 11.5019f)
        verticalLineTo(17.0045f)
        curveTo(4f, 17.9342f, 4f, 18.3991f, 4.0767f, 18.7857f)
        curveTo(4.39165f, 20.3732f, 5.6294f, 21.6141f, 7.21277f, 21.9299f)
        curveTo(7.42647f, 21.9725f, 7.66416f, 21.9915f, 7.99147f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.4812f, 7.5f)
        verticalLineTo(5.5f)
        curveTo(12.4812f, 4.09554f, 12.4812f, 3.39331f, 12.1448f, 2.88886f)
        curveTo(11.9992f, 2.67048f, 11.8121f, 2.48298f, 11.5942f, 2.33706f)
        curveTo(11.0908f, 2f, 10.3901f, 2f, 8.98863f, 2f)
        curveTo(7.58716f, 2f, 6.88643f, 2f, 6.38306f, 2.33706f)
        curveTo(6.16514f, 2.48298f, 5.97804f, 2.67048f, 5.83243f, 2.88886f)
        curveTo(5.49609f, 3.39331f, 5.49609f, 4.09554f, 5.49609f, 5.5f)
        verticalLineTo(7.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.5f, 4.5f)
        horizontalLineTo(9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.9749f, 16.3512f)
        verticalLineTo(17.6428f)
        moveTo(14.9664f, 19.7497f)
        horizontalLineTo(14.9867f)
        moveTo(12.0081f, 22f)
        horizontalLineTo(17.8922f)
        curveTo(19.4603f, 22f, 20.545f, 20.2711f, 19.7132f, 18.939f)
        lineTo(18.2734f, 16.3859f)
        lineTo(16.7687f, 14.0064f)
        curveTo(15.9478f, 12.6918f, 14.037f, 12.6918f, 13.216f, 14.0064f)
        curveTo(12.8693f, 14.5617f, 12.2678f, 15.4549f, 11.7237f, 16.3859f)
        curveTo(11.4242f, 16.8982f, 11.1379f, 17.4117f, 10.9025f, 17.8424f)
        curveTo(10.5052f, 18.5697f, 9.95895f, 19.2975f, 10.0134f, 20.1249f)
        curveTo(10.0786f, 21.1158f, 10.8867f, 22f, 12.0081f, 22f)
        }
        }.build()

        return _usbError!!
    }

private var _usbError: ImageVector? = null
