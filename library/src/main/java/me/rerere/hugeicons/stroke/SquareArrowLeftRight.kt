package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SquareArrowLeftRight: ImageVector
    get() {
        if (_squareArrowLeftRight != null) {
            return _squareArrowLeftRight!!
        }
        _squareArrowLeftRight = ImageVector.Builder(
            name = "SquareArrowLeftRight",
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
        moveTo(8f, 9f)
        lineTo(16f, 9f)
        moveTo(8f, 9f)
        curveTo(8f, 8.21775f, 10f, 7f, 10f, 7f)
        moveTo(8f, 9f)
        curveTo(8f, 9.78225f, 10f, 11f, 10f, 11f)
        moveTo(16f, 15f)
        horizontalLineTo(8f)
        moveTo(16f, 15f)
        curveTo(16f, 14.2178f, 14f, 13f, 14f, 13f)
        moveTo(16f, 15f)
        curveTo(16f, 15.7822f, 14f, 17f, 14f, 17f)
        }
        }.build()

        return _squareArrowLeftRight!!
    }

private var _squareArrowLeftRight: ImageVector? = null
