package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SquareArrowReload02: ImageVector
    get() {
        if (_squareArrowReload02 != null) {
            return _squareArrowReload02!!
        }
        _squareArrowReload02 = ImageVector.Builder(
            name = "SquareArrowReload02",
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
        moveTo(16.5f, 11.5455f)
        curveTo(16.5f, 9.89921f, 16.4684f, 9.27273f, 14.7f, 9.27273f)
        lineTo(8.74059f, 9.27273f)
        curveTo(7.78727f, 9.27273f, 7.67835f, 9.04753f, 8.27024f, 8.30021f)
        lineTo(9.3f, 7f)
        moveTo(7.5f, 12.4545f)
        curveTo(7.5f, 14.1008f, 7.53158f, 14.7273f, 9.3f, 14.7273f)
        horizontalLineTo(15.2594f)
        curveTo(16.2127f, 14.7273f, 16.3216f, 14.9525f, 15.7298f, 15.6998f)
        lineTo(14.7f, 17f)
        }
        }.build()

        return _squareArrowReload02!!
    }

private var _squareArrowReload02: ImageVector? = null
