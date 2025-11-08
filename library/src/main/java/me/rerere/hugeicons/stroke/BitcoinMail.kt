package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BitcoinMail: ImageVector
    get() {
        if (_bitcoinMail != null) {
            return _bitcoinMail!!
        }
        _bitcoinMail = ImageVector.Builder(
            name = "BitcoinMail",
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
        moveTo(5.00035f, 7f)
        lineTo(3.78154f, 7.81253f)
        curveTo(2.90783f, 8.39501f, 2.47097f, 8.68625f, 2.23422f, 9.13041f)
        curveTo(1.99747f, 9.57457f, 1.99923f, 10.0966f, 2.00273f, 11.1406f)
        curveTo(2.00696f, 12.3975f, 2.01864f, 13.6782f, 2.05099f, 14.9741f)
        curveTo(2.12773f, 18.0487f, 2.16611f, 19.586f, 3.29651f, 20.7164f)
        curveTo(4.42691f, 21.8469f, 5.98497f, 21.8858f, 9.10108f, 21.9637f)
        curveTo(11.0397f, 22.0121f, 12.9611f, 22.0121f, 14.8996f, 21.9637f)
        curveTo(18.0158f, 21.8858f, 19.5738f, 21.8469f, 20.7042f, 20.7164f)
        curveTo(21.8346f, 19.586f, 21.873f, 18.0487f, 21.9497f, 14.9741f)
        curveTo(21.9821f, 13.6782f, 21.9937f, 12.3975f, 21.998f, 11.1406f)
        curveTo(22.0015f, 10.0966f, 22.0032f, 9.57456f, 21.7665f, 9.13041f)
        curveTo(21.5297f, 8.68625f, 21.0929f, 8.39501f, 20.2191f, 7.81253f)
        lineTo(19.0003f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 10f)
        lineTo(8.91302f, 14.1478f)
        curveTo(10.417f, 15.0502f, 11.169f, 15.5014f, 12f, 15.5014f)
        curveTo(12.831f, 15.5014f, 13.583f, 15.0502f, 15.087f, 14.1478f)
        lineTo(22f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.99997f, 12f)
        verticalLineTo(6f)
        curveTo(4.99997f, 4.11438f, 4.99997f, 3.17157f, 5.58576f, 2.58579f)
        curveTo(6.17154f, 2f, 7.11435f, 2f, 8.99997f, 2f)
        horizontalLineTo(15f)
        curveTo(16.8856f, 2f, 17.8284f, 2f, 18.4142f, 2.58579f)
        curveTo(19f, 3.17157f, 19f, 4.11438f, 19f, 6f)
        verticalLineTo(12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.4375f, 11.1667f)
        lineTo(10.4375f, 5.83333f)
        moveTo(12f, 5.83333f)
        verticalLineTo(4.5f)
        moveTo(12f, 12.5f)
        verticalLineTo(11.1667f)
        moveTo(10.4375f, 8.5f)
        horizontalLineTo(13.5625f)
        moveTo(13.5625f, 8.5f)
        curveTo(14.0803f, 8.5f, 14.5f, 8.94772f, 14.5f, 9.5f)
        verticalLineTo(10.1667f)
        curveTo(14.5f, 10.719f, 14.0803f, 11.1667f, 13.5625f, 11.1667f)
        horizontalLineTo(9.5f)
        moveTo(13.5625f, 8.5f)
        curveTo(14.0803f, 8.5f, 14.5f, 8.05228f, 14.5f, 7.5f)
        verticalLineTo(6.83333f)
        curveTo(14.5f, 6.28105f, 14.0803f, 5.83333f, 13.5625f, 5.83333f)
        horizontalLineTo(9.5f)
        }
        }.build()

        return _bitcoinMail!!
    }

private var _bitcoinMail: ImageVector? = null
