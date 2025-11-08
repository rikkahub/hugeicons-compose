package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Queue02: ImageVector
    get() {
        if (_queue02 != null) {
            return _queue02!!
        }
        _queue02 = ImageVector.Builder(
            name = "Queue02",
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
        moveTo(18f, 18f)
        horizontalLineTo(6f)
        curveTo(5.05719f, 18f, 4.58579f, 18f, 4.29289f, 17.7071f)
        curveTo(4f, 17.4142f, 4f, 16.9428f, 4f, 16f)
        curveTo(4f, 15.0572f, 4f, 14.5858f, 4.29289f, 14.2929f)
        curveTo(4.58579f, 14f, 5.05719f, 14f, 6f, 14f)
        horizontalLineTo(18f)
        curveTo(18.9428f, 14f, 19.4142f, 14f, 19.7071f, 14.2929f)
        curveTo(20f, 14.5858f, 20f, 15.0572f, 20f, 16f)
        curveTo(20f, 16.9428f, 20f, 17.4142f, 19.7071f, 17.7071f)
        curveTo(19.4142f, 18f, 18.9428f, 18f, 18f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 10f)
        horizontalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 6f)
        horizontalLineTo(20f)
        }
        }.build()

        return _queue02!!
    }

private var _queue02: ImageVector? = null
