package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.RemoveSquare: ImageVector
    get() {
        if (_removeSquare != null) {
            return _removeSquare!!
        }
        _removeSquare = ImageVector.Builder(
            name = "RemoveSquare",
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
        moveTo(2.5f, 12.0001f)
        curveTo(2.5f, 7.52172f, 2.5f, 5.28255f, 3.89124f, 3.8913f)
        curveTo(5.28249f, 2.50006f, 7.52166f, 2.50006f, 12f, 2.50006f)
        curveTo(16.4783f, 2.50006f, 18.7175f, 2.50006f, 20.1088f, 3.8913f)
        curveTo(21.5f, 5.28255f, 21.5f, 7.52172f, 21.5f, 12.0001f)
        curveTo(21.5f, 16.4784f, 21.5f, 18.7176f, 20.1088f, 20.1088f)
        curveTo(18.7175f, 21.5001f, 16.4783f, 21.5001f, 12f, 21.5001f)
        curveTo(7.52166f, 21.5001f, 5.28249f, 21.5001f, 3.89124f, 20.1088f)
        curveTo(2.5f, 18.7176f, 2.5f, 16.4784f, 2.5f, 12.0001f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 12.0001f)
        lineTo(8f, 12.0001f)
        }
        }.build()

        return _removeSquare!!
    }

private var _removeSquare: ImageVector? = null
