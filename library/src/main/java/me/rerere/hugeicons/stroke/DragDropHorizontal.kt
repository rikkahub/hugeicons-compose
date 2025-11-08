package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.DragDropHorizontal: ImageVector
    get() {
        if (_dragDropHorizontal != null) {
            return _dragDropHorizontal!!
        }
        _dragDropHorizontal = ImageVector.Builder(
            name = "DragDropHorizontal",
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
        moveTo(18f, 8f)
        verticalLineTo(8.00635f)
        moveTo(12f, 8f)
        verticalLineTo(8.00635f)
        moveTo(6f, 8f)
        lineTo(6f, 8.00635f)
        moveTo(18f, 15.9937f)
        verticalLineTo(16f)
        moveTo(12f, 15.9937f)
        verticalLineTo(16f)
        moveTo(6f, 15.9937f)
        lineTo(6f, 16f)
        }
        }.build()

        return _dragDropHorizontal!!
    }

private var _dragDropHorizontal: ImageVector? = null
