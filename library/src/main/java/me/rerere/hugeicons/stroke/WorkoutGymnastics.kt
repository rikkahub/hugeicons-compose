package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.WorkoutGymnastics: ImageVector
    get() {
        if (_workoutGymnastics != null) {
            return _workoutGymnastics!!
        }
        _workoutGymnastics = ImageVector.Builder(
            name = "WorkoutGymnastics",
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
        moveTo(6.99639f, 9.5013f)
        curveTo(6.99639f, 10.3272f, 6.32519f, 10.9967f, 5.49722f, 10.9967f)
        curveTo(4.66925f, 10.9967f, 3.99805f, 10.3272f, 3.99805f, 9.5013f)
        curveTo(3.99805f, 8.67539f, 4.66925f, 8.00586f, 5.49722f, 8.00586f)
        curveTo(6.32519f, 8.00586f, 6.99639f, 8.67539f, 6.99639f, 9.5013f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.96586f, 3f)
        lineTo(9.82439f, 8.77139f)
        curveTo(9.85322f, 8.96518f, 9.86769f, 9.16082f, 9.86769f, 9.35673f)
        verticalLineTo(9.4375f)
        curveTo(9.86769f, 9.64662f, 9.84571f, 9.85516f, 9.80209f, 10.0597f)
        lineTo(9.75228f, 10.2933f)
        curveTo(9.73524f, 10.3732f, 9.70843f, 10.4507f, 9.67245f, 10.5241f)
        lineTo(6.99197f, 15.989f)
        moveTo(10.4242f, 8.75435f)
        lineTo(15.9422f, 11.0591f)
        lineTo(16.5007f, 11.3014f)
        curveTo(16.8389f, 11.4481f, 17.0967f, 11.7338f, 17.2076f, 12.0846f)
        lineTo(20.002f, 20.999f)
        moveTo(9.5094f, 11.9597f)
        lineTo(14.6342f, 13.9708f)
        moveTo(14.6342f, 13.9708f)
        lineTo(12.0185f, 20.8732f)
        moveTo(14.6342f, 13.9708f)
        lineTo(16.8165f, 11.806f)
        }
        }.build()

        return _workoutGymnastics!!
    }

private var _workoutGymnastics: ImageVector? = null
