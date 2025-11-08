package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Remove02: ImageVector
    get() {
        if (_remove02 != null) {
            return _remove02!!
        }
        _remove02 = ImageVector.Builder(
            name = "Remove02",
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
        moveTo(5.49854f, 10.5f)
        horizontalLineTo(18.5015f)
        curveTo(19.3297f, 10.5f, 20.001f, 11.1717f, 20.0005f, 12f)
        curveTo(19.9999f, 12.8275f, 19.329f, 13.498f, 18.5015f, 13.498f)
        horizontalLineTo(5.49854f)
        curveTo(4.67065f, 13.498f, 3.99951f, 12.8269f, 3.99951f, 11.999f)
        curveTo(3.99951f, 11.1711f, 4.67065f, 10.5f, 5.49854f, 10.5f)
        }
        }.build()

        return _remove02!!
    }

private var _remove02: ImageVector? = null
