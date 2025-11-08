package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AlphaCircle: ImageVector
    get() {
        if (_alphaCircle != null) {
            return _alphaCircle!!
        }
        _alphaCircle = ImageVector.Builder(
            name = "AlphaCircle",
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
        moveTo(12f, 22f)
        curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
        curveTo(22f, 6.47715f, 17.5228f, 2f, 12f, 2f)
        curveTo(6.47715f, 2f, 2f, 6.47715f, 2f, 12f)
        curveTo(2f, 17.5228f, 6.47715f, 22f, 12f, 22f)
        }
        }.build()

        return _alphaCircle!!
    }

private var _alphaCircle: ImageVector? = null
