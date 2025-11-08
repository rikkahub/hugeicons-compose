package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SquareArrowMoveDownRight: ImageVector
    get() {
        if (_squareArrowMoveDownRight != null) {
            return _squareArrowMoveDownRight!!
        }
        _squareArrowMoveDownRight = ImageVector.Builder(
            name = "SquareArrowMoveDownRight",
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
        moveTo(14.1746f, 12.6482f)
        curveTo(14.8469f, 13.4381f, 16.2132f, 14.4165f, 15.97f, 14.881f)
        moveTo(15.97f, 14.881f)
        curveTo(16.1055f, 15.3547f, 14.7827f, 16.291f, 14.1716f, 17.0052f)
        moveTo(15.97f, 14.881f)
        curveTo(13.2147f, 14.9378f, 11.5289f, 14.622f, 9.90163f, 13.0869f)
        curveTo(8.20681f, 11.4881f, 7.89136f, 9.76265f, 8.02853f, 6.99463f)
        }
        }.build()

        return _squareArrowMoveDownRight!!
    }

private var _squareArrowMoveDownRight: ImageVector? = null
