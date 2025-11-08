package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowMoveDownRight: ImageVector
    get() {
        if (_arrowMoveDownRight != null) {
            return _arrowMoveDownRight!!
        }
        _arrowMoveDownRight = ImageVector.Builder(
            name = "ArrowMoveDownRight",
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
        moveTo(4f, 3f)
        verticalLineTo(5.07692f)
        curveTo(4f, 7.07786f, 4f, 8.07833f, 4.14533f, 8.91545f)
        curveTo(4.94529f, 13.5235f, 8.90656f, 17.1376f, 13.9574f, 17.8674f)
        curveTo(14.8749f, 18f, 16.8068f, 18f, 19f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 21f)
        curveTo(17.6068f, 20.4102f, 20f, 18.8403f, 20f, 18f)
        curveTo(20f, 17.1597f, 17.6068f, 15.5898f, 17f, 15f)
        }
        }.build()

        return _arrowMoveDownRight!!
    }

private var _arrowMoveDownRight: ImageVector? = null
