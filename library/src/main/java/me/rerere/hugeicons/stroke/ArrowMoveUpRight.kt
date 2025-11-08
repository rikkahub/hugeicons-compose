package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowMoveUpRight: ImageVector
    get() {
        if (_arrowMoveUpRight != null) {
            return _arrowMoveUpRight!!
        }
        _arrowMoveUpRight = ImageVector.Builder(
            name = "ArrowMoveUpRight",
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
        moveTo(4f, 21f)
        verticalLineTo(18.9231f)
        curveTo(4f, 16.9221f, 4f, 15.9217f, 4.14533f, 15.0846f)
        curveTo(4.94529f, 10.4765f, 8.90656f, 6.86243f, 13.9574f, 6.13259f)
        curveTo(14.8749f, 6f, 16.8068f, 6f, 19f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 3f)
        curveTo(17.6068f, 3.58984f, 20f, 5.15973f, 20f, 6f)
        curveTo(20f, 6.84027f, 17.6068f, 8.41016f, 17f, 9f)
        }
        }.build()

        return _arrowMoveUpRight!!
    }

private var _arrowMoveUpRight: ImageVector? = null
