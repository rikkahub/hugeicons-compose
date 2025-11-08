package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Sword02: ImageVector
    get() {
        if (_sword02 != null) {
            return _sword02!!
        }
        _sword02 = ImageVector.Builder(
            name = "Sword02",
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
        moveTo(5.06066f, 21.0607f)
        curveTo(4.47487f, 21.6464f, 3.52513f, 21.6464f, 2.93934f, 21.0607f)
        curveTo(2.35355f, 20.4749f, 2.35355f, 19.5251f, 2.93934f, 18.9393f)
        curveTo(3.52513f, 18.3536f, 4.47487f, 18.3536f, 5.06066f, 18.9393f)
        curveTo(5.64645f, 19.5251f, 5.64645f, 20.4749f, 5.06066f, 21.0607f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 16f)
        lineTo(5.5f, 18.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.5f, 16.5f)
        lineTo(20.0733f, 7.20318f)
        curveTo(20.3506f, 6.96283f, 20.5445f, 6.64067f, 20.627f, 6.28308f)
        lineTo(21.5f, 2.5f)
        lineTo(17.7169f, 3.37302f)
        curveTo(17.3593f, 3.45554f, 17.0372f, 3.64942f, 16.7968f, 3.92675f)
        lineTo(7.5f, 14.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 13f)
        horizontalLineTo(4.57157f)
        curveTo(5.10201f, 13f, 5.61071f, 13.2107f, 5.98579f, 13.5858f)
        lineTo(10.4142f, 18.0142f)
        curveTo(10.7893f, 18.3893f, 11f, 18.898f, 11f, 19.4284f)
        verticalLineTo(20f)
        }
        }.build()

        return _sword02!!
    }

private var _sword02: ImageVector? = null
