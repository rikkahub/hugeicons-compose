package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AlphaSquare: ImageVector
    get() {
        if (_alphaSquare != null) {
            return _alphaSquare!!
        }
        _alphaSquare = ImageVector.Builder(
            name = "AlphaSquare",
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
        moveTo(15.0011f, 8f)
        curveTo(15.1077f, 8.8641f, 15.0011f, 10.2323f, 14.6013f, 11.8284f)
        curveTo(14.2548f, 12.9686f, 13.1621f, 16.2569f, 10.3236f, 15.9809f)
        curveTo(7.87156f, 15.6569f, 6.84544f, 13.2566f, 7.01868f, 11.6844f)
        curveTo(7.08531f, 10.3643f, 8.07145f, 8.036f, 10.6967f, 8f)
        curveTo(13.0554f, 8.20402f, 13.6551f, 10.2082f, 13.9883f, 11.9004f)
        curveTo(14.3481f, 13.4606f, 14.3081f, 14.2287f, 14.9078f, 15.2968f)
        curveTo(15.2676f, 15.8849f, 15.9472f, 16.1009f, 16.4936f, 15.9569f)
        curveTo(16.9334f, 15.7769f, 17f, 15.3928f, 17f, 15.1048f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.5f, 12f)
        curveTo(2.5f, 7.52166f, 2.5f, 5.28249f, 3.89124f, 3.89124f)
        curveTo(5.28249f, 2.5f, 7.52166f, 2.5f, 12f, 2.5f)
        curveTo(16.4783f, 2.5f, 18.7175f, 2.5f, 20.1088f, 3.89124f)
        curveTo(21.5f, 5.28249f, 21.5f, 7.52166f, 21.5f, 12f)
        curveTo(21.5f, 16.4783f, 21.5f, 18.7175f, 20.1088f, 20.1088f)
        curveTo(18.7175f, 21.5f, 16.4783f, 21.5f, 12f, 21.5f)
        curveTo(7.52166f, 21.5f, 5.28249f, 21.5f, 3.89124f, 20.1088f)
        curveTo(2.5f, 18.7175f, 2.5f, 16.4783f, 2.5f, 12f)
        }
        }.build()

        return _alphaSquare!!
    }

private var _alphaSquare: ImageVector? = null
