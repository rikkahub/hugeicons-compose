package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MapPinpoint02: ImageVector
    get() {
        if (_mapPinpoint02 != null) {
            return _mapPinpoint02!!
        }
        _mapPinpoint02 = ImageVector.Builder(
            name = "MapPinpoint02",
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
        moveTo(20f, 9f)
        curveTo(19.1434f, 4.9811f, 14.9912f, 2f, 11.0011f, 2f)
        curveTo(7.45834f, 2f, 4.08963f, 4.09916f, 2.68627f, 7.37966f)
        curveTo(0.090763f, 13.4469f, 5.41302f, 17.626f, 9.38449f, 21.367f)
        curveTo(9.81818f, 21.773f, 10.3978f, 22f, 11.0011f, 22f)
        curveTo(11.5513f, 22f, 12.0819f, 21.8112f, 12.5f, 21.4699f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 9.19621f)
        curveTo(13.3876f, 8.17979f, 12.2732f, 7.5f, 11f, 7.5f)
        curveTo(9.067f, 7.5f, 7.5f, 9.067f, 7.5f, 11f)
        curveTo(7.5f, 12.3962f, 8.31753f, 13.6015f, 9.5f, 14.1632f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 16f)
        horizontalLineTo(17.009f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.8981f, 21.6518f)
        curveTo(17.6572f, 21.8752f, 17.3352f, 22f, 17.0001f, 22f)
        curveTo(16.665f, 22f, 16.343f, 21.8752f, 16.1021f, 21.6518f)
        curveTo(13.8959f, 19.5943f, 10.9394f, 17.2958f, 12.3812f, 13.9588f)
        curveTo(13.1608f, 12.1545f, 15.0321f, 11f, 17.0001f, 11f)
        curveTo(18.9681f, 11f, 20.8394f, 12.1545f, 21.619f, 13.9588f)
        curveTo(23.059f, 17.2916f, 20.1097f, 19.6014f, 17.8981f, 21.6518f)
        }
        }.build()

        return _mapPinpoint02!!
    }

private var _mapPinpoint02: ImageVector? = null
