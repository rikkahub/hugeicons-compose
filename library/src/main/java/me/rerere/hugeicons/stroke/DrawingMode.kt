package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.DrawingMode: ImageVector
    get() {
        if (_drawingMode != null) {
            return _drawingMode!!
        }
        _drawingMode = ImageVector.Builder(
            name = "DrawingMode",
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
        moveTo(16f, 9f)
        curveTo(16f, 5.13401f, 12.866f, 2f, 9f, 2f)
        curveTo(5.13401f, 2f, 2f, 5.13401f, 2f, 9f)
        curveTo(2f, 12.866f, 5.13401f, 16f, 9f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 9f)
        horizontalLineTo(15f)
        curveTo(12.1716f, 9f, 10.7574f, 9f, 9.87868f, 9.87868f)
        curveTo(9f, 10.7574f, 9f, 12.1716f, 9f, 15f)
        verticalLineTo(16f)
        curveTo(9f, 18.8284f, 9f, 20.2426f, 9.87868f, 21.1213f)
        curveTo(10.7574f, 22f, 12.1716f, 22f, 15f, 22f)
        horizontalLineTo(16f)
        curveTo(18.8284f, 22f, 20.2426f, 22f, 21.1213f, 21.1213f)
        curveTo(22f, 20.2426f, 22f, 18.8284f, 22f, 16f)
        verticalLineTo(15f)
        curveTo(22f, 12.1716f, 22f, 10.7574f, 21.1213f, 9.87868f)
        curveTo(20.2426f, 9f, 18.8284f, 9f, 16f, 9f)
        }
        }.build()

        return _drawingMode!!
    }

private var _drawingMode: ImageVector? = null
