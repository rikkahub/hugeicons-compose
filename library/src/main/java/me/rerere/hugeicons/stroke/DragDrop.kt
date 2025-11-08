package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.DragDrop: ImageVector
    get() {
        if (_dragDrop != null) {
            return _dragDrop!!
        }
        _dragDrop = ImageVector.Builder(
            name = "DragDrop",
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
        moveTo(6f, 6f)
        horizontalLineTo(6.00634f)
        moveTo(6f, 12f)
        horizontalLineTo(6.00634f)
        moveTo(6f, 18f)
        horizontalLineTo(6.00634f)
        moveTo(11.9968f, 6f)
        horizontalLineTo(12.0032f)
        moveTo(11.9968f, 12f)
        horizontalLineTo(12.0032f)
        moveTo(11.9968f, 18f)
        horizontalLineTo(12.0032f)
        moveTo(17.9937f, 6f)
        horizontalLineTo(18f)
        moveTo(17.9937f, 12f)
        horizontalLineTo(18f)
        moveTo(17.9937f, 18f)
        horizontalLineTo(18f)
        }
        }.build()

        return _dragDrop!!
    }

private var _dragDrop: ImageVector? = null
