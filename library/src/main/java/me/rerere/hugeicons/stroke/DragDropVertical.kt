package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.DragDropVertical: ImageVector
    get() {
        if (_dragDropVertical != null) {
            return _dragDropVertical!!
        }
        _dragDropVertical = ImageVector.Builder(
            name = "DragDropVertical",
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
        moveTo(8f, 6f)
        horizontalLineTo(8.00635f)
        moveTo(8f, 12f)
        horizontalLineTo(8.00635f)
        moveTo(8f, 18f)
        horizontalLineTo(8.00635f)
        moveTo(15.9937f, 6f)
        horizontalLineTo(16f)
        moveTo(15.9937f, 12f)
        horizontalLineTo(16f)
        moveTo(15.9937f, 18f)
        horizontalLineTo(16f)
        }
        }.build()

        return _dragDropVertical!!
    }

private var _dragDropVertical: ImageVector? = null
