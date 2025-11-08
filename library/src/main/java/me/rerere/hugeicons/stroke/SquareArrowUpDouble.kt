package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SquareArrowUpDouble: ImageVector
    get() {
        if (_squareArrowUpDouble != null) {
            return _squareArrowUpDouble!!
        }
        _squareArrowUpDouble = ImageVector.Builder(
            name = "SquareArrowUpDouble",
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
        moveTo(16f, 10.8333f)
        lineTo(13.8856f, 8.7891f)
        curveTo(12.9967f, 7.9297f, 12.5523f, 7.5f, 12f, 7.5f)
        curveTo(11.4477f, 7.5f, 11.0033f, 7.9297f, 10.1144f, 8.7891f)
        lineTo(8f, 10.8333f)
        moveTo(16f, 16.5f)
        lineTo(13.8856f, 14.4558f)
        curveTo(12.9967f, 13.5964f, 12.5523f, 13.1667f, 12f, 13.1667f)
        curveTo(11.4477f, 13.1667f, 11.0033f, 13.5964f, 10.1144f, 14.4558f)
        lineTo(8f, 16.5f)
        }
        }.build()

        return _squareArrowUpDouble!!
    }

private var _squareArrowUpDouble: ImageVector? = null
