package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SquareArrowReload01: ImageVector
    get() {
        if (_squareArrowReload01 != null) {
            return _squareArrowReload01!!
        }
        _squareArrowReload01 = ImageVector.Builder(
            name = "SquareArrowReload01",
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
        moveTo(14.7f, 7f)
        lineTo(15.7298f, 8.30021f)
        curveTo(16.3216f, 9.04753f, 16.2127f, 9.27273f, 15.2594f, 9.27273f)
        lineTo(9.3f, 9.27273f)
        curveTo(7.65577f, 9.27273f, 7.5f, 10.1251f, 7.5f, 11.5455f)
        moveTo(9.3f, 17f)
        lineTo(8.27024f, 15.6998f)
        curveTo(7.67835f, 14.9525f, 7.78727f, 14.7273f, 8.74059f, 14.7273f)
        horizontalLineTo(14.7f)
        curveTo(16.3442f, 14.7273f, 16.5f, 13.875f, 16.5f, 12.4545f)
        }

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
        }.build()

        return _squareArrowReload01!!
    }

private var _squareArrowReload01: ImageVector? = null
