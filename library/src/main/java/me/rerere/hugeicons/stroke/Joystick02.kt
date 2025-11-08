package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Joystick02: ImageVector
    get() {
        if (_joystick02 != null) {
            return _joystick02!!
        }
        _joystick02 = ImageVector.Builder(
            name = "Joystick02",
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
        moveTo(12f, 9f)
        lineTo(12f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 17f)
        horizontalLineTo(8f)
        lineTo(8.27758f, 16.3754f)
        curveTo(8.79f, 15.2225f, 9.04621f, 14.646f, 9.54325f, 14.323f)
        curveTo(10.0403f, 14f, 10.6711f, 14f, 11.9328f, 14f)
        horizontalLineTo(12.0672f)
        curveTo(13.3289f, 14f, 13.9597f, 14f, 14.4567f, 14.323f)
        curveTo(14.9538f, 14.646f, 15.21f, 15.2225f, 15.7224f, 16.3754f)
        lineTo(16f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.189f, 22f)
        horizontalLineTo(6.99519f)
        curveTo(6.08792f, 22f, 5.63428f, 22f, 5.37813f, 21.7472f)
        curveTo(5.16606f, 21.538f, 5.03017f, 21.223f, 5.00302f, 20.8777f)
        curveTo(4.97022f, 20.4606f, 5.20535f, 19.9541f, 5.67559f, 18.941f)
        curveTo(6.00825f, 18.2243f, 6.17458f, 17.866f, 6.4039f, 17.6075f)
        curveTo(6.59695f, 17.3899f, 6.82135f, 17.2249f, 7.06392f, 17.1221f)
        curveTo(7.35206f, 17f, 7.67298f, 17f, 8.3148f, 17f)
        horizontalLineTo(15.845f)
        curveTo(16.4947f, 17f, 16.8196f, 17f, 17.1075f, 17.1219f)
        curveTo(17.4079f, 17.249f, 17.6795f, 17.4712f, 17.8982f, 17.7687f)
        curveTo(18.1078f, 18.0537f, 18.2495f, 18.4354f, 18.533f, 19.1989f)
        curveTo(18.863f, 20.0876f, 19.0281f, 20.532f, 18.9961f, 20.8934f)
        curveTo(18.963f, 21.2677f, 18.8023f, 21.6026f, 18.5588f, 21.8048f)
        curveTo(18.3237f, 22f, 17.9455f, 22f, 17.189f, 22f)
        }
        }.build()

        return _joystick02!!
    }

private var _joystick02: ImageVector? = null
