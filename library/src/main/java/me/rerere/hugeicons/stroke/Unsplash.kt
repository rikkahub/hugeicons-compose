package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Unsplash: ImageVector
    get() {
        if (_unsplash != null) {
            return _unsplash!!
        }
        _unsplash = ImageVector.Builder(
            name = "Unsplash",
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
        moveTo(9.5f, 7.5f)
        verticalLineTo(4.5f)
        horizontalLineTo(14.5f)
        verticalLineTo(7.5f)
        horizontalLineTo(9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 16f)
        verticalLineTo(11f)
        horizontalLineTo(19.5f)
        verticalLineTo(19.5f)
        horizontalLineTo(4.5f)
        verticalLineTo(11f)
        horizontalLineTo(8f)
        verticalLineTo(16f)
        horizontalLineTo(16f)
        }
        }.build()

        return _unsplash!!
    }

private var _unsplash: ImageVector? = null
