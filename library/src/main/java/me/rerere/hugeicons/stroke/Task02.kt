package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Task02: ImageVector
    get() {
        if (_task02 != null) {
            return _task02!!
        }
        _task02 = ImageVector.Builder(
            name = "Task02",
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
        moveTo(20f, 16f)
        verticalLineTo(8f)
        curveTo(20f, 5.17157f, 20f, 3.75736f, 19.1213f, 2.87868f)
        curveTo(18.2426f, 2f, 16.8284f, 2f, 14f, 2f)
        horizontalLineTo(10f)
        curveTo(7.17157f, 2f, 5.75736f, 2f, 4.87868f, 2.87868f)
        curveTo(4f, 3.75736f, 4f, 5.17157f, 4f, 8f)
        verticalLineTo(16f)
        curveTo(4f, 18.8284f, 4f, 20.2426f, 4.87868f, 21.1213f)
        curveTo(5.75736f, 22f, 7.17157f, 22f, 10f, 22f)
        horizontalLineTo(14f)
        curveTo(16.8284f, 22f, 18.2426f, 22f, 19.1213f, 21.1213f)
        curveTo(20f, 20.2426f, 20f, 18.8284f, 20f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5f, 2f)
        horizontalLineTo(8.5f)
        curveTo(8.5f, 3.41421f, 8.5f, 4.12132f, 8.93934f, 4.56066f)
        curveTo(9.37868f, 5f, 10.0858f, 5f, 11.5f, 5f)
        horizontalLineTo(12.5f)
        curveTo(13.9142f, 5f, 14.6213f, 5f, 15.0607f, 4.56066f)
        curveTo(15.5f, 4.12132f, 15.5f, 3.41421f, 15.5f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 15f)
        horizontalLineTo(12f)
        moveTo(8f, 11f)
        horizontalLineTo(16f)
        }
        }.build()

        return _task02!!
    }

private var _task02: ImageVector? = null
