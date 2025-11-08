package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SquareArrowHorizontal: ImageVector
    get() {
        if (_squareArrowHorizontal != null) {
            return _squareArrowHorizontal!!
        }
        _squareArrowHorizontal = ImageVector.Builder(
            name = "SquareArrowHorizontal",
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
        moveTo(6f, 12f)
        horizontalLineTo(18f)
        moveTo(6f, 12f)
        curveTo(6f, 11.2998f, 7.9943f, 9.99153f, 8.5f, 9.5f)
        moveTo(6f, 12f)
        curveTo(6f, 12.7002f, 7.9943f, 14.0085f, 8.5f, 14.5f)
        moveTo(18f, 12f)
        curveTo(18f, 11.2998f, 16.0057f, 9.99153f, 15.5f, 9.5f)
        moveTo(18f, 12f)
        curveTo(18f, 12.7002f, 16.0057f, 14.0085f, 15.5f, 14.5f)
        }
        }.build()

        return _squareArrowHorizontal!!
    }

private var _squareArrowHorizontal: ImageVector? = null
