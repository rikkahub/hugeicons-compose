package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Thread: ImageVector
    get() {
        if (_thread != null) {
            return _thread!!
        }
        _thread = ImageVector.Builder(
            name = "Thread",
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
        moveTo(4.5f, 7.5f)
        horizontalLineTo(16.5f)
        curveTo(18.3856f, 7.5f, 19.3284f, 7.5f, 19.9142f, 8.08579f)
        curveTo(20.5f, 8.67157f, 20.5f, 9.61438f, 20.5f, 11.5f)
        verticalLineTo(12.5f)
        moveTo(16.5f, 10.5f)
        horizontalLineTo(4.5f)
        moveTo(16.5f, 13.5f)
        horizontalLineTo(4.5f)
        moveTo(16.5f, 16.5f)
        horizontalLineTo(4.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.4999f, 19.5002f)
        horizontalLineTo(5.49988f)
        curveTo(4.39531f, 19.5002f, 3.49988f, 20.3956f, 3.49988f, 21.5002f)
        horizontalLineTo(17.4999f)
        curveTo(17.4999f, 20.3956f, 16.6044f, 19.5002f, 15.4999f, 19.5002f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.49988f, 4.49969f)
        lineTo(15.4999f, 4.49969f)
        curveTo(16.6044f, 4.49969f, 17.4999f, 3.60426f, 17.4999f, 2.49969f)
        lineTo(3.49988f, 2.49969f)
        curveTo(3.49988f, 3.60426f, 4.39531f, 4.49969f, 5.49988f, 4.49969f)
        }
        }.build()

        return _thread!!
    }

private var _thread: ImageVector? = null
