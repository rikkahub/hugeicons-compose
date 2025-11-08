package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PulseRectangle01: ImageVector
    get() {
        if (_pulseRectangle01 != null) {
            return _pulseRectangle01!!
        }
        _pulseRectangle01 = ImageVector.Builder(
            name = "PulseRectangle01",
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
        moveTo(5.5f, 12f)
        horizontalLineTo(7.5f)
        lineTo(9f, 9.5f)
        lineTo(10.5f, 14f)
        lineTo(12.5f, 8f)
        lineTo(14.5f, 16f)
        lineTo(16.5f, 12f)
        horizontalLineTo(18.5f)
        }
        }.build()

        return _pulseRectangle01!!
    }

private var _pulseRectangle01: ImageVector? = null
