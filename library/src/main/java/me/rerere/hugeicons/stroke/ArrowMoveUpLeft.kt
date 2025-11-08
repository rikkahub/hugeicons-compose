package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowMoveUpLeft: ImageVector
    get() {
        if (_arrowMoveUpLeft != null) {
            return _arrowMoveUpLeft!!
        }
        _arrowMoveUpLeft = ImageVector.Builder(
            name = "ArrowMoveUpLeft",
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
        moveTo(20f, 21f)
        verticalLineTo(18.9231f)
        curveTo(20f, 16.9221f, 20f, 15.9217f, 19.8547f, 15.0846f)
        curveTo(19.0547f, 10.4765f, 15.0934f, 6.86243f, 10.0426f, 6.13259f)
        curveTo(9.12509f, 6f, 7.19318f, 6f, 5f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 3f)
        curveTo(6.39316f, 3.58984f, 4f, 5.15973f, 4f, 6f)
        curveTo(4f, 6.84027f, 6.39316f, 8.41016f, 7f, 9f)
        }
        }.build()

        return _arrowMoveUpLeft!!
    }

private var _arrowMoveUpLeft: ImageVector? = null
