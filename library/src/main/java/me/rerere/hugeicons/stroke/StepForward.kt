package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.StepForward: ImageVector
    get() {
        if (_stepForward != null) {
            return _stepForward!!
        }
        _stepForward = ImageVector.Builder(
            name = "StepForward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(19.9273f, 12.6258f)
            curveTo(19.6729f, 13.8374f, 18.3192f, 14.7077f, 15.6119f, 16.4481f)
            curveTo(12.6675f, 18.3411f, 11.1952f, 19.2876f, 10.0027f, 18.9229f)
            curveTo(9.59881f, 18.7994f, 9.22681f, 18.5823f, 8.91445f, 18.2876f)
            curveTo(7.99219f, 17.4178f, 7.99219f, 15.6118f, 7.99219f, 12f)
            curveTo(7.99219f, 8.38816f, 7.99219f, 6.58224f, 8.91445f, 5.71235f)
            curveTo(9.22681f, 5.41773f, 9.59881f, 5.20057f, 10.0027f, 5.07707f)
            curveTo(11.1952f, 4.71243f, 12.6675f, 5.6589f, 15.6119f, 7.55186f)
            curveTo(18.3192f, 9.29233f, 19.6729f, 10.1626f, 19.9273f, 11.3742f)
            curveTo(20.0138f, 11.7865f, 20.0138f, 12.2135f, 19.9273f, 12.6258f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(3.99219f, 5f)
            verticalLineTo(19f)
        }
        }.build()

        return _stepForward!!
    }

private var _stepForward: ImageVector? = null
