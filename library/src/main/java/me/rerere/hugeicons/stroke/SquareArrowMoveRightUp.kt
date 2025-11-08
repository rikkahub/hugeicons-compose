package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SquareArrowMoveRightUp: ImageVector
    get() {
        if (_squareArrowMoveRightUp != null) {
            return _squareArrowMoveRightUp!!
        }
        _squareArrowMoveRightUp = ImageVector.Builder(
            name = "SquareArrowMoveRightUp",
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
        moveTo(2.5f, 12f)
        curveTo(2.5f, 7.52166f, 2.5f, 5.28249f, 3.89124f, 3.89124f)
        curveTo(5.28249f, 2.5f, 7.52166f, 2.5f, 12f, 2.5f)
        curveTo(16.4783f, 2.5f, 18.7175f, 2.5f, 20.1088f, 3.89124f)
        curveTo(21.5f, 5.28249f, 21.5f, 7.52166f, 21.5f, 12f)
        curveTo(21.5f, 16.4783f, 21.5f, 18.7175f, 20.1088f, 20.1088f)
        curveTo(18.7175f, 21.5f, 16.4783f, 21.5f, 12f, 21.5f)
        curveTo(7.52166f, 21.5f, 5.28249f, 21.5f, 3.89124f, 20.1088f)
        curveTo(2.5f, 18.7175f, 2.5f, 16.4783f, 2.5f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.1746f, 11.3517f)
        curveTo(14.8469f, 10.5618f, 16.2132f, 9.58336f, 15.97f, 9.11886f)
        moveTo(15.97f, 9.11886f)
        curveTo(16.1055f, 8.64518f, 14.7827f, 7.70887f, 14.1716f, 6.99463f)
        moveTo(15.97f, 9.11886f)
        curveTo(13.2147f, 9.06207f, 11.5289f, 9.37785f, 9.90163f, 10.9129f)
        curveTo(8.20681f, 12.5118f, 7.89136f, 14.2372f, 8.02853f, 17.0052f)
        }
        }.build()

        return _squareArrowMoveRightUp!!
    }

private var _squareArrowMoveRightUp: ImageVector? = null
