package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TaskAdd02: ImageVector
    get() {
        if (_taskAdd02 != null) {
            return _taskAdd02!!
        }
        _taskAdd02 = ImageVector.Builder(
            name = "TaskAdd02",
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
        moveTo(19f, 13f)
        verticalLineTo(8f)
        curveTo(19f, 5.17157f, 19f, 3.75736f, 18.1213f, 2.87868f)
        curveTo(17.2426f, 2f, 15.8284f, 2f, 13f, 2f)
        horizontalLineTo(9f)
        curveTo(6.17157f, 2f, 4.75736f, 2f, 3.87868f, 2.87868f)
        curveTo(3f, 3.75736f, 3f, 5.17157f, 3f, 8f)
        verticalLineTo(16f)
        curveTo(3f, 18.8284f, 3f, 20.2426f, 3.87868f, 21.1213f)
        curveTo(4.75736f, 22f, 6.17157f, 22f, 9f, 22f)
        horizontalLineTo(14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 2f)
        horizontalLineTo(7.5f)
        curveTo(7.5f, 3.41421f, 7.5f, 4.12132f, 7.93934f, 4.56066f)
        curveTo(8.37868f, 5f, 9.08579f, 5f, 10.5f, 5f)
        horizontalLineTo(11.5f)
        curveTo(12.9142f, 5f, 13.6213f, 5f, 14.0607f, 4.56066f)
        curveTo(14.5f, 4.12132f, 14.5f, 3.41421f, 14.5f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 15f)
        horizontalLineTo(11f)
        moveTo(7f, 11f)
        horizontalLineTo(15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 19f)
        horizontalLineTo(18f)
        moveTo(18f, 19f)
        horizontalLineTo(15f)
        moveTo(18f, 19f)
        verticalLineTo(22f)
        moveTo(18f, 19f)
        verticalLineTo(16f)
        }
        }.build()

        return _taskAdd02!!
    }

private var _taskAdd02: ImageVector? = null
