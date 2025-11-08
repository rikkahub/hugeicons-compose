package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SquareArrowExpand01: ImageVector
    get() {
        if (_squareArrowExpand01 != null) {
            return _squareArrowExpand01!!
        }
        _squareArrowExpand01 = ImageVector.Builder(
            name = "SquareArrowExpand01",
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
        moveTo(7.4852f, 16.5149f)
        curveTo(6.9104f, 15.9401f, 7.00595f, 13.4982f, 7.00595f, 13.4982f)
        moveTo(7.4852f, 16.5149f)
        curveTo(8.06001f, 17.0897f, 10.5019f, 16.994f, 10.5019f, 16.994f)
        moveTo(7.4852f, 16.5149f)
        lineTo(11f, 13f)
        moveTo(16.5149f, 7.48512f)
        curveTo(15.9401f, 6.91031f, 13.4982f, 7.00596f, 13.4982f, 7.00596f)
        moveTo(16.5149f, 7.48512f)
        curveTo(17.0897f, 8.05993f, 16.994f, 10.5018f, 16.994f, 10.5018f)
        moveTo(16.5149f, 7.48512f)
        lineTo(13f, 11f)
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

        return _squareArrowExpand01!!
    }

private var _squareArrowExpand01: ImageVector? = null
