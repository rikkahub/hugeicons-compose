package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SquareArrowDownDouble: ImageVector
    get() {
        if (_squareArrowDownDouble != null) {
            return _squareArrowDownDouble!!
        }
        _squareArrowDownDouble = ImageVector.Builder(
            name = "SquareArrowDownDouble",
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
        moveTo(8f, 13.1667f)
        lineTo(10.1144f, 15.2109f)
        curveTo(11.0033f, 16.0703f, 11.4477f, 16.5f, 12f, 16.5f)
        curveTo(12.5523f, 16.5f, 12.9967f, 16.0703f, 13.8856f, 15.2109f)
        lineTo(16f, 13.1667f)
        moveTo(8f, 7.5f)
        lineTo(10.1144f, 9.54423f)
        curveTo(11.0033f, 10.4036f, 11.4477f, 10.8333f, 12f, 10.8333f)
        curveTo(12.5523f, 10.8333f, 12.9967f, 10.4036f, 13.8856f, 9.54423f)
        lineTo(16f, 7.5f)
        }
        }.build()

        return _squareArrowDownDouble!!
    }

private var _squareArrowDownDouble: ImageVector? = null
