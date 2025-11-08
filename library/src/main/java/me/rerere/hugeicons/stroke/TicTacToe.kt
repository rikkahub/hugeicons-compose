package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TicTacToe: ImageVector
    get() {
        if (_ticTacToe != null) {
            return _ticTacToe!!
        }
        _ticTacToe = ImageVector.Builder(
            name = "TicTacToe",
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
        moveTo(12f, 2f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 12f)
        lineTo(2f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 18.5f)
        curveTo(8f, 19.8807f, 6.88071f, 21f, 5.5f, 21f)
        curveTo(4.11929f, 21f, 3f, 19.8807f, 3f, 18.5f)
        curveTo(3f, 17.1193f, 4.11929f, 16f, 5.5f, 16f)
        curveTo(6.88071f, 16f, 8f, 17.1193f, 8f, 18.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 3f)
        lineTo(21f, 8f)
        moveTo(21f, 3f)
        lineTo(16f, 8f)
        }
        }.build()

        return _ticTacToe!!
    }

private var _ticTacToe: ImageVector? = null
