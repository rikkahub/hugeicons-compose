package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SquareArrowMoveLeftUp: ImageVector
    get() {
        if (_squareArrowMoveLeftUp != null) {
            return _squareArrowMoveLeftUp!!
        }
        _squareArrowMoveLeftUp = ImageVector.Builder(
            name = "SquareArrowMoveLeftUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(2.5f, 12f)
            curveTo(2.5f, 7.52166f, 2.5f, 5.28249f, 3.89124f, 3.89124f)
            curveTo(5.28249f, 2.5f, 7.52166f, 2.5f, 12f, 2.5f)
            curveTo(16.4783f, 2.5f, 18.7175f, 2.5f, 20.1088f, 3.89124f)
            curveTo(21.5f, 5.28249f, 21.5f, 7.52166f, 21.5f, 12f)
            curveTo(21.5f, 16.4783f, 21.5f, 18.7175f, 20.1088f, 20.1088f)
            curveTo(18.7175f, 21.5f, 16.4783f, 21.5f, 12f, 21.5f)
            curveTo(7.52166f, 21.5f, 5.28249f, 21.5f, 3.89124f, 20.1088f)
            curveTo(2.5f, 18.7175f, 2.5f, 16.4783f, 2.5f, 12f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(9.82506f, 11.3518f)
            curveTo(9.15268f, 10.5619f, 7.78642f, 9.58348f, 8.02962f, 9.11899f)
            moveTo(8.02962f, 9.11899f)
            curveTo(7.89414f, 8.64531f, 9.21696f, 7.709f, 9.82805f, 6.99475f)
            moveTo(8.02962f, 9.11899f)
            curveTo(10.7849f, 9.06219f, 12.4707f, 9.37797f, 14.098f, 10.913f)
            curveTo(15.7928f, 12.5119f, 16.1083f, 14.2373f, 15.9711f, 17.0053f)
        }
        }.build()

        return _squareArrowMoveLeftUp!!
    }

private var _squareArrowMoveLeftUp: ImageVector? = null
