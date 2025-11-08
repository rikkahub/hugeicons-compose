package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TaskAdd01: ImageVector
    get() {
        if (_taskAdd01 != null) {
            return _taskAdd01!!
        }
        _taskAdd01 = ImageVector.Builder(
            name = "TaskAdd01",
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
        moveTo(13.498f, 2f)
        horizontalLineTo(8.49805f)
        curveTo(7.66962f, 2f, 6.99805f, 2.67157f, 6.99805f, 3.5f)
        curveTo(6.99805f, 4.32843f, 7.66962f, 5f, 8.49805f, 5f)
        horizontalLineTo(13.498f)
        curveTo(14.3265f, 5f, 14.998f, 4.32843f, 14.998f, 3.5f)
        curveTo(14.998f, 2.67157f, 14.3265f, 2f, 13.498f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.99805f, 15f)
        horizontalLineTo(10.4266f)
        moveTo(6.99805f, 11f)
        horizontalLineTo(14.998f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.998f, 12.9995f)
        lineTo(18.9981f, 9.48263f)
        curveTo(18.9981f, 6.65424f, 18.9981f, 5.24004f, 18.1194f, 4.36137f)
        curveTo(17.4781f, 3.72007f, 16.5515f, 3.54681f, 14.9981f, 3.5f)
        moveTo(13.998f, 21.9995f)
        lineTo(8.99805f, 21.9995f)
        curveTo(6.16963f, 21.9995f, 4.75541f, 21.9995f, 3.87674f, 21.1208f)
        curveTo(2.99806f, 20.2421f, 2.99805f, 18.8279f, 2.99805f, 15.9995f)
        lineTo(2.99806f, 9.48269f)
        curveTo(2.99805f, 6.65425f, 2.99805f, 5.24004f, 3.87673f, 4.36136f)
        curveTo(4.51802f, 3.72007f, 5.44456f, 3.54681f, 6.99795f, 3.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.998f, 19f)
        horizontalLineTo(17.998f)
        moveTo(17.998f, 19f)
        horizontalLineTo(14.998f)
        moveTo(17.998f, 19f)
        verticalLineTo(22f)
        moveTo(17.998f, 19f)
        verticalLineTo(16f)
        }
        }.build()

        return _taskAdd01!!
    }

private var _taskAdd01: ImageVector? = null
