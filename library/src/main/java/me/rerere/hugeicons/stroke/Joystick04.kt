package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Joystick04: ImageVector
    get() {
        if (_joystick04 != null) {
            return _joystick04!!
        }
        _joystick04 = ImageVector.Builder(
            name = "Joystick04",
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
        moveTo(9.32486f, 12f)
        curveTo(9.15779f, 12.0809f, 8.98076f, 12.1675f, 8.79195f, 12.2599f)
        lineTo(7.26844f, 13.0053f)
        curveTo(5.75615f, 13.7452f, 5f, 14.1152f, 5f, 14.575f)
        curveTo(5f, 15.0347f, 5.75615f, 15.4047f, 7.26844f, 16.1446f)
        lineTo(8.79195f, 16.8901f)
        curveTo(10.3042f, 17.63f, 11.0604f, 18f, 12f, 18f)
        curveTo(12.9396f, 18f, 13.6958f, 17.63f, 15.2081f, 16.8901f)
        lineTo(16.7316f, 16.1446f)
        curveTo(18.2439f, 15.4047f, 19f, 15.0347f, 19f, 14.575f)
        curveTo(19f, 14.1152f, 18.2439f, 13.7452f, 16.7316f, 13.0053f)
        lineTo(15.2081f, 12.2599f)
        curveTo(15.0192f, 12.1675f, 14.8422f, 12.0809f, 14.6751f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 14.5f)
        verticalLineTo(18.2667f)
        curveTo(19f, 18.7678f, 18.2439f, 19.1711f, 16.7316f, 19.9776f)
        lineTo(15.2081f, 20.7902f)
        curveTo(13.6958f, 21.5967f, 12.9396f, 22f, 12f, 22f)
        curveTo(11.0604f, 22f, 10.3042f, 21.5967f, 8.79195f, 20.7902f)
        lineTo(7.26844f, 19.9776f)
        curveTo(5.75615f, 19.1711f, 5f, 18.7678f, 5f, 18.2667f)
        verticalLineTo(14.5f)
        }

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
        moveTo(12f, 9f)
        verticalLineTo(14.5f)
        }
        }.build()

        return _joystick04!!
    }

private var _joystick04: ImageVector? = null
