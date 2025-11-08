package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TextSquare: ImageVector
    get() {
        if (_textSquare != null) {
            return _textSquare!!
        }
        _textSquare = ImageVector.Builder(
            name = "TextSquare",
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
        moveTo(6.99892f, 9.5f)
        curveTo(6.75828f, 7.50503f, 7.91475f, 7.09687f, 11.9989f, 7f)
        moveTo(11.9989f, 7f)
        curveTo(16.1223f, 7.10058f, 17.3402f, 7.59829f, 16.9989f, 9.5f)
        moveTo(11.9989f, 7f)
        verticalLineTo(17f)
        moveTo(9.99892f, 17f)
        horizontalLineTo(13.9989f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.89124f, 3.89124f)
        curveTo(2.5f, 5.28249f, 2.5f, 7.52166f, 2.5f, 12f)
        curveTo(2.5f, 16.4783f, 2.5f, 18.7175f, 3.89124f, 20.1088f)
        curveTo(5.28249f, 21.5f, 7.52166f, 21.5f, 12f, 21.5f)
        curveTo(16.4783f, 21.5f, 18.7175f, 21.5f, 20.1088f, 20.1088f)
        curveTo(21.5f, 18.7175f, 21.5f, 16.4783f, 21.5f, 12f)
        curveTo(21.5f, 7.52166f, 21.5f, 5.28249f, 20.1088f, 3.89124f)
        curveTo(18.7175f, 2.5f, 16.4783f, 2.5f, 12f, 2.5f)
        curveTo(7.52166f, 2.5f, 5.28249f, 2.5f, 3.89124f, 3.89124f)
        }
        }.build()

        return _textSquare!!
    }

private var _textSquare: ImageVector? = null
