package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Next: ImageVector
    get() {
        if (_next != null) {
            return _next!!
        }
        _next = ImageVector.Builder(
            name = "Next",
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
        moveTo(15.9351f, 12.6258f)
        curveTo(15.6807f, 13.8374f, 14.327f, 14.7077f, 11.6198f, 16.4481f)
        curveTo(8.67528f, 18.3411f, 7.20303f, 19.2876f, 6.01052f, 18.9229f)
        curveTo(5.60662f, 18.7994f, 5.23463f, 18.5823f, 4.92227f, 18.2876f)
        curveTo(4f, 17.4178f, 4f, 15.6118f, 4f, 12f)
        curveTo(4f, 8.38816f, 4f, 6.58224f, 4.92227f, 5.71235f)
        curveTo(5.23463f, 5.41773f, 5.60662f, 5.20057f, 6.01052f, 5.07707f)
        curveTo(7.20304f, 4.71243f, 8.67528f, 5.6589f, 11.6198f, 7.55186f)
        curveTo(14.327f, 9.29233f, 15.6807f, 10.1626f, 15.9351f, 11.3742f)
        curveTo(16.0216f, 11.7865f, 16.0216f, 12.2135f, 15.9351f, 12.6258f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 5f)
        verticalLineTo(19f)
        }
        }.build()

        return _next!!
    }

private var _next: ImageVector? = null
