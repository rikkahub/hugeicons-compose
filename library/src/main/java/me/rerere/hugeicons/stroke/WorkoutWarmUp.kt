package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.WorkoutWarmUp: ImageVector
    get() {
        if (_workoutWarmUp != null) {
            return _workoutWarmUp!!
        }
        _workoutWarmUp = ImageVector.Builder(
            name = "WorkoutWarmUp",
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
        moveTo(14.5002f, 4.5f)
        curveTo(14.5002f, 5.32843f, 13.8286f, 6f, 13.0002f, 6f)
        curveTo(12.1717f, 6f, 11.5002f, 5.32843f, 11.5002f, 4.5f)
        curveTo(11.5002f, 3.67157f, 12.1717f, 3f, 13.0002f, 3f)
        curveTo(13.8286f, 3f, 14.5002f, 3.67157f, 14.5002f, 4.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 8.89062f)
        lineTo(13.9777f, 8.29142f)
        moveTo(19f, 21f)
        lineTo(18.5438f, 17.5301f)
        curveTo(18.2903f, 15.6021f, 18.1636f, 14.6381f, 17.4915f, 14.1298f)
        curveTo(16.8194f, 13.6215f, 15.8722f, 13.7731f, 13.9777f, 14.0765f)
        lineTo(12.1402f, 14.3707f)
        moveTo(13.9777f, 8.29142f)
        lineTo(12.2231f, 8.08208f)
        curveTo(11.4204f, 7.98631f, 11.0191f, 7.93843f, 10.7146f, 8.14419f)
        curveTo(10.41f, 8.34995f, 10.299f, 8.74397f, 10.077f, 9.53203f)
        lineTo(9.4087f, 11.904f)
        curveTo(9.02319f, 13.2724f, 8.83044f, 13.9565f, 9.19196f, 14.3707f)
        curveTo(9.55348f, 14.7849f, 10.2465f, 14.674f, 11.6326f, 14.452f)
        lineTo(12.1402f, 14.3707f)
        moveTo(13.9777f, 8.29142f)
        lineTo(12.1402f, 14.3707f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 17f)
        lineTo(9.44721f, 18.1056f)
        curveTo(9.15692f, 18.6862f, 8.68616f, 19.1569f, 8.10557f, 19.4472f)
        lineTo(5f, 21f)
        }
        }.build()

        return _workoutWarmUp!!
    }

private var _workoutWarmUp: ImageVector? = null
