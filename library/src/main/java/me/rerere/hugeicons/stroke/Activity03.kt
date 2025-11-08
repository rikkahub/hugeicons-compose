package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Activity03: ImageVector
    get() {
        if (_activity03 != null) {
            return _activity03!!
        }
        _activity03 = ImageVector.Builder(
            name = "Activity03",
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
        moveTo(4.31802f, 19.682f)
        curveTo(3f, 18.364f, 3f, 16.2426f, 3f, 12f)
        curveTo(3f, 7.75736f, 3f, 5.63604f, 4.31802f, 4.31802f)
        curveTo(5.63604f, 3f, 7.75736f, 3f, 12f, 3f)
        curveTo(16.2426f, 3f, 18.364f, 3f, 19.682f, 4.31802f)
        curveTo(21f, 5.63604f, 21f, 7.75736f, 21f, 12f)
        curveTo(21f, 16.2426f, 21f, 18.364f, 19.682f, 19.682f)
        curveTo(18.364f, 21f, 16.2426f, 21f, 12f, 21f)
        curveTo(7.75736f, 21f, 5.63604f, 21f, 4.31802f, 19.682f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 12f)
        horizontalLineTo(8.5f)
        lineTo(10.5f, 8f)
        lineTo(13.5f, 16f)
        lineTo(15.5f, 12f)
        horizontalLineTo(18f)
        }
        }.build()

        return _activity03!!
    }

private var _activity03: ImageVector? = null
