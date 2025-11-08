package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SquareArrowLeftDouble: ImageVector
    get() {
        if (_squareArrowLeftDouble != null) {
            return _squareArrowLeftDouble!!
        }
        _squareArrowLeftDouble = ImageVector.Builder(
            name = "SquareArrowLeftDouble",
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
        moveTo(10.8333f, 8f)
        lineTo(8.7891f, 10.1144f)
        curveTo(7.9297f, 11.0033f, 7.5f, 11.4477f, 7.5f, 12f)
        curveTo(7.5f, 12.5523f, 7.9297f, 12.9967f, 8.7891f, 13.8856f)
        lineTo(10.8333f, 16f)
        moveTo(16.5f, 8f)
        lineTo(14.4558f, 10.1144f)
        curveTo(13.5964f, 11.0033f, 13.1667f, 11.4477f, 13.1667f, 12f)
        curveTo(13.1667f, 12.5523f, 13.5964f, 12.9967f, 14.4558f, 13.8856f)
        lineTo(16.5f, 16f)
        }
        }.build()

        return _squareArrowLeftDouble!!
    }

private var _squareArrowLeftDouble: ImageVector? = null
