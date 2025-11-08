package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Angel: ImageVector
    get() {
        if (_angel != null) {
            return _angel!!
        }
        _angel = ImageVector.Builder(
            name = "Angel",
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
        moveTo(3.07818f, 7.5f)
        curveTo(2.38865f, 8.85588f, 2f, 10.39f, 2f, 12.0148f)
        curveTo(2f, 17.5295f, 6.47715f, 22f, 12f, 22f)
        curveTo(17.5228f, 22f, 22f, 17.5295f, 22f, 12.0148f)
        curveTo(22f, 10.39f, 21.6114f, 8.85588f, 20.9218f, 7.5f)
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
        moveTo(7f, 10.5f)
        curveTo(7f, 9.67154f, 7.67157f, 8.99997f, 8.5f, 8.99997f)
        curveTo(9.32843f, 8.99997f, 10f, 9.67154f, 10f, 10.5f)
        moveTo(14f, 10.4999f)
        curveTo(14f, 9.67151f, 14.6716f, 8.99994f, 15.5f, 8.99994f)
        curveTo(16.3284f, 8.99994f, 17f, 9.67151f, 17f, 10.4999f)
        }
        }.build()

        return _angel!!
    }

private var _angel: ImageVector? = null
