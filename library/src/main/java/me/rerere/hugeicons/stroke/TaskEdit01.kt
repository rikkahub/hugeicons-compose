package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TaskEdit01: ImageVector
    get() {
        if (_taskEdit01 != null) {
            return _taskEdit01!!
        }
        _taskEdit01 = ImageVector.Builder(
            name = "TaskEdit01",
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
        moveTo(13.5f, 2f)
        horizontalLineTo(8.5f)
        curveTo(7.67157f, 2f, 7f, 2.67157f, 7f, 3.5f)
        curveTo(7f, 4.32843f, 7.67157f, 5f, 8.5f, 5f)
        horizontalLineTo(13.5f)
        curveTo(14.3284f, 5f, 15f, 4.32843f, 15f, 3.5f)
        curveTo(15f, 2.67157f, 14.3284f, 2f, 13.5f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 15f)
        horizontalLineTo(10.4286f)
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
        moveTo(19f, 11.9995f)
        lineTo(19f, 9.48263f)
        curveTo(19f, 6.65424f, 19f, 5.24004f, 18.1213f, 4.36137f)
        curveTo(17.48f, 3.72007f, 16.5535f, 3.54681f, 15f, 3.5f)
        moveTo(11f, 21.9995f)
        lineTo(9f, 21.9995f)
        curveTo(6.17158f, 21.9995f, 4.75737f, 21.9995f, 3.87869f, 21.1208f)
        curveTo(3.00001f, 20.2421f, 3.00001f, 18.8279f, 3f, 15.9995f)
        lineTo(3.00001f, 9.48269f)
        curveTo(3.00001f, 6.65425f, 3f, 5.24004f, 3.87868f, 4.36136f)
        curveTo(4.51997f, 3.72007f, 5.44651f, 3.54681f, 6.9999f, 3.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.7367f, 21.6527f)
        lineTo(14f, 22f)
        lineTo(14.3473f, 20.2633f)
        curveTo(14.4179f, 19.9106f, 14.5913f, 19.5866f, 14.8456f, 19.3323f)
        lineTo(18.9111f, 15.2668f)
        curveTo(19.2668f, 14.9111f, 19.8437f, 14.9111f, 20.1995f, 15.2668f)
        lineTo(20.7332f, 15.8005f)
        curveTo(21.0889f, 16.1563f, 21.0889f, 16.7332f, 20.7332f, 17.0889f)
        lineTo(16.6677f, 21.1544f)
        curveTo(16.4134f, 21.4087f, 16.0894f, 21.5821f, 15.7367f, 21.6527f)
        }
        }.build()

        return _taskEdit01!!
    }

private var _taskEdit01: ImageVector? = null
