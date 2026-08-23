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

val HugeIcons.SkipForward: ImageVector
    get() {
        if (_skipForward != null) {
            return _skipForward!!
        }
        _skipForward = ImageVector.Builder(
            name = "SkipForward",
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
            moveTo(15.9273f, 12.6258f)
            curveTo(15.6729f, 13.8374f, 14.3192f, 14.7077f, 11.6119f, 16.4481f)
            curveTo(8.66747f, 18.3411f, 7.19522f, 19.2876f, 6.0027f, 18.9229f)
            curveTo(5.59881f, 18.7994f, 5.22681f, 18.5823f, 4.91445f, 18.2876f)
            curveTo(3.99219f, 17.4178f, 3.99219f, 15.6118f, 3.99219f, 12f)
            curveTo(3.99219f, 8.38816f, 3.99219f, 6.58224f, 4.91445f, 5.71235f)
            curveTo(5.22681f, 5.41773f, 5.59881f, 5.20057f, 6.0027f, 5.07707f)
            curveTo(7.19522f, 4.71243f, 8.66746f, 5.6589f, 11.6119f, 7.55186f)
            curveTo(14.3192f, 9.29233f, 15.6729f, 10.1626f, 15.9273f, 11.3742f)
            curveTo(16.0138f, 11.7865f, 16.0138f, 12.2135f, 15.9273f, 12.6258f)
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
            moveTo(19.9922f, 5f)
            verticalLineTo(19f)
        }
        }.build()

        return _skipForward!!
    }

private var _skipForward: ImageVector? = null
