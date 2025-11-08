package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Function: ImageVector
    get() {
        if (_function != null) {
            return _function!!
        }
        _function = ImageVector.Builder(
            name = "Function",
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
        moveTo(5f, 19f)
        curveTo(5.26413f, 19.9564f, 5.79671f, 21f, 7.18729f, 21f)
        curveTo(9.59365f, 21f, 10.1952f, 19f, 12f, 12f)
        curveTo(13.8048f, 5f, 14.4064f, 3f, 16.8127f, 3f)
        curveTo(18.2033f, 3f, 18.7359f, 4.04358f, 19f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 10f)
        horizontalLineTo(17f)
        }
        }.build()

        return _function!!
    }

private var _function: ImageVector? = null
