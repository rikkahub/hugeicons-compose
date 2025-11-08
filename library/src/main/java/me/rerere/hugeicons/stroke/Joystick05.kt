package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Joystick05: ImageVector
    get() {
        if (_joystick05 != null) {
            return _joystick05!!
        }
        _joystick05 = ImageVector.Builder(
            name = "Joystick05",
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
        moveTo(15.5f, 5.5f)
        curveTo(15.5f, 7.433f, 13.933f, 9f, 12f, 9f)
        curveTo(10.067f, 9f, 8.5f, 7.433f, 8.5f, 5.5f)
        curveTo(8.5f, 3.567f, 10.067f, 2f, 12f, 2f)
        curveTo(13.933f, 2f, 15.5f, 3.567f, 15.5f, 5.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.7434f, 22f)
        horizontalLineTo(6.25663f)
        curveTo(6.0183f, 22f, 5.89914f, 22f, 5.79878f, 21.9899f)
        curveTo(4.85337f, 21.8943f, 4.10575f, 21.1466f, 4.01015f, 20.2012f)
        curveTo(4f, 20.1009f, 4f, 19.9817f, 4f, 19.7434f)
        curveTo(4f, 19.5979f, 4f, 19.5251f, 4.00332f, 19.4547f)
        curveTo(4.03359f, 18.8111f, 4.27025f, 18.1944f, 4.67826f, 17.6958f)
        curveTo(4.72293f, 17.6412f, 4.7716f, 17.5871f, 4.86894f, 17.479f)
        lineTo(6.21241f, 15.9862f)
        curveTo(7.09274f, 15.0081f, 7.5329f, 14.519f, 8.11557f, 14.2595f)
        curveTo(8.69824f, 14f, 9.35622f, 14f, 10.6722f, 14f)
        horizontalLineTo(13.3278f)
        curveTo(14.6438f, 14f, 15.3018f, 14f, 15.8844f, 14.2595f)
        curveTo(16.4671f, 14.519f, 16.9073f, 15.0081f, 17.7876f, 15.9862f)
        lineTo(19.1311f, 17.479f)
        curveTo(19.2284f, 17.5871f, 19.2771f, 17.6412f, 19.3217f, 17.6958f)
        curveTo(19.7297f, 18.1944f, 19.9664f, 18.8111f, 19.9967f, 19.4547f)
        curveTo(20f, 19.5251f, 20f, 19.5979f, 20f, 19.7434f)
        curveTo(20f, 19.9817f, 20f, 20.1009f, 19.9899f, 20.2012f)
        curveTo(19.8943f, 21.1466f, 19.1466f, 21.8943f, 18.2012f, 21.9899f)
        curveTo(18.1009f, 22f, 17.9817f, 22f, 17.7434f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 19f)
        horizontalLineTo(14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 9f)
        verticalLineTo(16f)
        }
        }.build()

        return _joystick05!!
    }

private var _joystick05: ImageVector? = null
