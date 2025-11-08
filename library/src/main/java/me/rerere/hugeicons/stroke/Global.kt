package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Global: ImageVector
    get() {
        if (_global != null) {
            return _global!!
        }
        _global = ImageVector.Builder(
            name = "Global",
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
        moveTo(22f, 12f)
        curveTo(22f, 6.47715f, 17.5228f, 2f, 12f, 2f)
        curveTo(6.47715f, 2f, 2f, 6.47715f, 2f, 12f)
        curveTo(2f, 17.5228f, 6.47715f, 22f, 12f, 22f)
        curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 5.69899f)
        curveTo(19.0653f, 5.76636f, 17.8681f, 6.12824f, 17.0379f, 7.20277f)
        curveTo(15.5385f, 9.14361f, 14.039f, 9.30556f, 13.0394f, 8.65861f)
        curveTo(11.5399f, 7.6882f, 12.8f, 6.11636f, 11.0401f, 5.26215f)
        curveTo(9.89313f, 4.70542f, 9.73321f, 3.19045f, 10.3716f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 11f)
        curveTo(2.7625f, 11.6621f, 3.83046f, 12.2682f, 5.08874f, 12.2682f)
        curveTo(7.68843f, 12.2682f, 8.20837f, 12.7649f, 8.20837f, 14.7518f)
        curveTo(8.20837f, 16.7387f, 8.20837f, 16.7387f, 8.72831f, 18.2288f)
        curveTo(9.06651f, 19.1981f, 9.18472f, 20.1674f, 8.5106f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 13.4523f)
        curveTo(21.1129f, 12.9411f, 20f, 12.7308f, 18.8734f, 13.5405f)
        curveTo(16.7177f, 15.0898f, 15.2314f, 13.806f, 14.5619f, 15.0889f)
        curveTo(13.5765f, 16.9775f, 17.0957f, 17.5711f, 14f, 22f)
        }
        }.build()

        return _global!!
    }

private var _global: ImageVector? = null
