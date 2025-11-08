package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.WorkoutKicking: ImageVector
    get() {
        if (_workoutKicking != null) {
            return _workoutKicking!!
        }
        _workoutKicking = ImageVector.Builder(
            name = "WorkoutKicking",
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
        moveTo(7f, 5.5f)
        curveTo(7f, 6.32843f, 6.32843f, 7f, 5.5f, 7f)
        curveTo(4.67157f, 7f, 4f, 6.32843f, 4f, 5.5f)
        curveTo(4f, 4.67157f, 4.67157f, 4f, 5.5f, 4f)
        curveTo(6.32843f, 4f, 7f, 4.67157f, 7f, 5.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.94848f, 14f)
        horizontalLineTo(8.13896f)
        curveTo(7.326f, 14f, 6.91951f, 14f, 6.63846f, 13.763f)
        curveTo(6.3574f, 13.526f, 6.29058f, 13.127f, 6.15693f, 12.3288f)
        lineTo(6.08019f, 11.8705f)
        curveTo(6.00839f, 11.4417f, 5.97249f, 11.2273f, 6.02497f, 11.0231f)
        curveTo(6.07746f, 10.8188f, 6.21238f, 10.6479f, 6.48221f, 10.3061f)
        lineTo(7.73131f, 8.72371f)
        moveTo(9.78571f, 6f)
        lineTo(8.69731f, 7.5f)
        lineTo(7.73131f, 8.72371f)
        moveTo(9.78571f, 6f)
        lineTo(11.9625f, 3f)
        moveTo(9.78571f, 6f)
        lineTo(14.2859f, 9.5f)
        moveTo(14.2859f, 9.5f)
        lineTo(20f, 3f)
        moveTo(14.2859f, 9.5f)
        lineTo(12.9672f, 12.5f)
        moveTo(7.73131f, 8.72371f)
        lineTo(12.9672f, 12.5f)
        moveTo(12.9672f, 12.5f)
        verticalLineTo(21f)
        }
        }.build()

        return _workoutKicking!!
    }

private var _workoutKicking: ImageVector? = null
