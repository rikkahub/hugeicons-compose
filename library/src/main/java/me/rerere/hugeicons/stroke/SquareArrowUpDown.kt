package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SquareArrowUpDown: ImageVector
    get() {
        if (_squareArrowUpDown != null) {
            return _squareArrowUpDown!!
        }
        _squareArrowUpDown = ImageVector.Builder(
            name = "SquareArrowUpDown",
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
        moveTo(9f, 8f)
        verticalLineTo(16f)
        moveTo(9f, 8f)
        curveTo(8.20516f, 8f, 7f, 10f, 7f, 10f)
        moveTo(9f, 8f)
        curveTo(9.78225f, 8f, 11f, 10f, 11f, 10f)
        moveTo(15f, 16f)
        verticalLineTo(8f)
        moveTo(15f, 16f)
        curveTo(14.2178f, 16f, 13f, 14f, 13f, 14f)
        moveTo(15f, 16f)
        curveTo(15.7822f, 16f, 17f, 14f, 17f, 14f)
        }
        }.build()

        return _squareArrowUpDown!!
    }

private var _squareArrowUpDown: ImageVector? = null
