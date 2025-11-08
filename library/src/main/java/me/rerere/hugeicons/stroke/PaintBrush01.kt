package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PaintBrush01: ImageVector
    get() {
        if (_paintBrush01 != null) {
            return _paintBrush01!!
        }
        _paintBrush01 = ImageVector.Builder(
            name = "PaintBrush01",
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
        moveTo(3.89089f, 20.8727f)
        lineTo(3f, 21f)
        lineTo(3.12727f, 20.1091f)
        curveTo(3.32086f, 18.754f, 3.41765f, 18.0764f, 3.71832f, 17.4751f)
        curveTo(4.01899f, 16.8738f, 4.50296f, 16.3898f, 5.47091f, 15.4218f)
        lineTo(16.9827f, 3.91009f)
        curveTo(17.4062f, 3.48654f, 17.618f, 3.27476f, 17.8464f, 3.16155f)
        curveTo(18.2811f, 2.94615f, 18.7914f, 2.94615f, 19.2261f, 3.16155f)
        curveTo(19.4546f, 3.27476f, 19.6663f, 3.48654f, 20.0899f, 3.91009f)
        curveTo(20.5135f, 4.33365f, 20.7252f, 4.54543f, 20.8385f, 4.77389f)
        curveTo(21.0539f, 5.20856f, 21.0539f, 5.71889f, 20.8385f, 6.15356f)
        curveTo(20.7252f, 6.38201f, 20.5135f, 6.59379f, 20.0899f, 7.01735f)
        lineTo(8.57816f, 18.5291f)
        curveTo(7.61022f, 19.497f, 7.12625f, 19.981f, 6.52491f, 20.2817f)
        curveTo(5.92357f, 20.5823f, 5.246f, 20.6791f, 3.89089f, 20.8727f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 15f)
        lineTo(9f, 18f)
        moveTo(8.5f, 12.5f)
        lineTo(11.5f, 15.5f)
        }
        }.build()

        return _paintBrush01!!
    }

private var _paintBrush01: ImageVector? = null
