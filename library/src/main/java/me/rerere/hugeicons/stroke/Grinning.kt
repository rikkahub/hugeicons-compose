package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Grinning: ImageVector
    get() {
        if (_grinning != null) {
            return _grinning!!
        }
        _grinning = ImageVector.Builder(
            name = "Grinning",
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
        moveTo(21.8f, 10f)
        curveTo(21.9311f, 10.6462f, 22f, 11.3151f, 22f, 12f)
        curveTo(22f, 17.5228f, 17.5228f, 22f, 12f, 22f)
        curveTo(6.47715f, 22f, 2f, 17.5228f, 2f, 12f)
        curveTo(2f, 6.47715f, 6.47715f, 2f, 12f, 2f)
        curveTo(13.2313f, 2f, 14.4107f, 2.22255f, 15.5f, 2.62961f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 15f)
        curveTo(8.91212f, 16.2144f, 10.3643f, 17f, 12f, 17f)
        curveTo(13.6357f, 17f, 15.0879f, 16.2144f, 16f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.5176f, 2f)
        lineTo(17.7168f, 3.78512f)
        curveTo(16.7498f, 4.76031f, 16.7665f, 6.33054f, 17.7335f, 7.28921f)
        curveTo(18.7173f, 8.24788f, 20.3012f, 8.23135f, 21.2683f, 7.27268f)
        curveTo(22.252f, 6.29749f, 22.2353f, 4.72724f, 21.2683f, 3.76857f)
        lineTo(19.5176f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 9f)
        curveTo(8.42317f, 9.31737f, 9.19208f, 9.70974f, 9.28942f, 10.3412f)
        curveTo(9.29507f, 10.3778f, 9.2989f, 10.4148f, 9.30089f, 10.4519f)
        curveTo(9.32383f, 10.8805f, 9.01424f, 11.2537f, 8.39506f, 12f)
        moveTo(16f, 9f)
        curveTo(15.5768f, 9.31738f, 14.8079f, 9.70974f, 14.7106f, 10.3412f)
        curveTo(14.7049f, 10.3778f, 14.7011f, 10.4148f, 14.6991f, 10.4519f)
        curveTo(14.6762f, 10.8805f, 14.9858f, 11.2537f, 15.6049f, 12f)
        }
        }.build()

        return _grinning!!
    }

private var _grinning: ImageVector? = null
