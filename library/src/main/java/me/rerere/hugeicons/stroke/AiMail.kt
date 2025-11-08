package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AiMail: ImageVector
    get() {
        if (_aiMail != null) {
            return _aiMail!!
        }
        _aiMail = ImageVector.Builder(
            name = "AiMail",
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
        moveTo(4.99998f, 12f)
        verticalLineTo(6f)
        curveTo(4.99998f, 4.11438f, 4.99998f, 3.17157f, 5.58577f, 2.58579f)
        curveTo(6.17156f, 2f, 7.11437f, 2f, 8.99998f, 2f)
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
        moveTo(8f, 10f)
        lineTo(9.61165f, 5.39528f)
        curveTo(9.69427f, 5.15922f, 9.92623f, 5f, 10.1875f, 5f)
        curveTo(10.4488f, 5f, 10.6807f, 5.15922f, 10.7633f, 5.39528f)
        lineTo(12.375f, 10f)
        moveTo(15f, 5f)
        verticalLineTo(10f)
        moveTo(8.875f, 8.33333f)
        horizontalLineTo(11.5f)
        }
        }.build()

        return _aiMail!!
    }

private var _aiMail: ImageVector? = null
