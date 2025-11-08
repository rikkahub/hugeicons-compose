package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TaskRemove02: ImageVector
    get() {
        if (_taskRemove02 != null) {
            return _taskRemove02!!
        }
        _taskRemove02 = ImageVector.Builder(
            name = "TaskRemove02",
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
        moveTo(19.25f, 14f)
        verticalLineTo(8f)
        curveTo(19.25f, 5.17157f, 19.25f, 3.75736f, 18.3713f, 2.87868f)
        curveTo(17.4926f, 2f, 16.0784f, 2f, 13.25f, 2f)
        horizontalLineTo(9.25f)
        curveTo(6.42157f, 2f, 5.00736f, 2f, 4.12868f, 2.87868f)
        curveTo(3.25f, 3.75736f, 3.25f, 5.17157f, 3.25f, 8f)
        verticalLineTo(16f)
        curveTo(3.25f, 18.8284f, 3.25f, 20.2426f, 4.12868f, 21.1213f)
        curveTo(5.00736f, 22f, 6.42157f, 22f, 9.25f, 22f)
        horizontalLineTo(13.25f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.75f, 2f)
        horizontalLineTo(7.75f)
        curveTo(7.75f, 3.41421f, 7.75f, 4.12132f, 8.18934f, 4.56066f)
        curveTo(8.62868f, 5f, 9.33579f, 5f, 10.75f, 5f)
        horizontalLineTo(11.75f)
        curveTo(13.1642f, 5f, 13.8713f, 5f, 14.3107f, 4.56066f)
        curveTo(14.75f, 4.12132f, 14.75f, 3.41421f, 14.75f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.25f, 15f)
        horizontalLineTo(11.25f)
        moveTo(7.25f, 11f)
        horizontalLineTo(15.25f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.25f, 17f)
        lineTo(18.75f, 19.5f)
        moveTo(18.75f, 19.5f)
        lineTo(16.25f, 22f)
        moveTo(18.75f, 19.5f)
        lineTo(21.25f, 22f)
        moveTo(18.75f, 19.5f)
        lineTo(16.25f, 17f)
        }
        }.build()

        return _taskRemove02!!
    }

private var _taskRemove02: ImageVector? = null
