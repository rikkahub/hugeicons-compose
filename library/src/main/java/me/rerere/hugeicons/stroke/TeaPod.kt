package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TeaPod: ImageVector
    get() {
        if (_teaPod != null) {
            return _teaPod!!
        }
        _teaPod = ImageVector.Builder(
            name = "TeaPod",
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
        moveTo(19.0063f, 10.005f)
        verticalLineTo(6.5038f)
        curveTo(19.0063f, 4.01763f, 16.9835f, 2.0022f, 14.4881f, 2.0022f)
        curveTo(11.9928f, 2.0022f, 9.96997f, 4.01763f, 9.96997f, 6.5038f)
        verticalLineTo(10.005f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.488f, 9.00468f)
        verticalLineTo(7.50415f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.16958f, 11.1285f)
        lineTo(6.65238f, 16.903f)
        curveTo(6.69082f, 16.9525f, 6.71276f, 17.0127f, 6.71512f, 17.0753f)
        lineTo(6.80491f, 19.4596f)
        curveTo(6.83613f, 20.2884f, 7.41233f, 20.9974f, 8.21953f, 21.2002f)
        lineTo(8.46708f, 21.2624f)
        curveTo(12.4487f, 22.2628f, 16.6198f, 22.242f, 20.5912f, 21.202f)
        curveTo(21.3686f, 20.9984f, 21.9164f, 20.3061f, 21.9338f, 19.5054f)
        lineTo(21.9942f, 16.7139f)
        curveTo(22.0796f, 12.7815f, 20.8064f, 11.9342f, 20.1836f, 11.3632f)
        curveTo(18.7421f, 10.0416f, 16.5969f, 9.72382f, 14.5369f, 9.72382f)
        curveTo(10.9645f, 9.72382f, 9.24461f, 10.7395f, 8.44615f, 11.4301f)
        curveTo(8.27084f, 11.5817f, 8.0179f, 11.618f, 7.81808f, 11.5003f)
        lineTo(3.84377f, 9.15827f)
        curveTo(3.49819f, 8.95462f, 3.05477f, 9.03649f, 2.80537f, 9.34999f)
        lineTo(2.17546f, 10.1418f)
        curveTo(1.946f, 10.4302f, 1.94358f, 10.8374f, 2.16958f, 11.1285f)
        }
        }.build()

        return _teaPod!!
    }

private var _teaPod: ImageVector? = null
