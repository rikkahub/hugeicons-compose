package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SquareArrowExpand02: ImageVector
    get() {
        if (_squareArrowExpand02 != null) {
            return _squareArrowExpand02!!
        }
        _squareArrowExpand02 = ImageVector.Builder(
            name = "SquareArrowExpand02",
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
        moveTo(16.5148f, 16.5149f)
        curveTo(17.0896f, 15.9401f, 16.9941f, 13.4982f, 16.9941f, 13.4982f)
        moveTo(16.5148f, 16.5149f)
        curveTo(15.94f, 17.0897f, 13.4981f, 16.994f, 13.4981f, 16.994f)
        moveTo(16.5148f, 16.5149f)
        lineTo(13f, 13f)
        moveTo(7.48506f, 7.48512f)
        curveTo(8.05987f, 6.91031f, 10.5018f, 7.00596f, 10.5018f, 7.00596f)
        moveTo(7.48506f, 7.48512f)
        curveTo(6.91025f, 8.05993f, 7.00598f, 10.5018f, 7.00598f, 10.5018f)
        moveTo(7.48506f, 7.48512f)
        lineTo(11f, 11f)
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

        return _squareArrowExpand02!!
    }

private var _squareArrowExpand02: ImageVector? = null
