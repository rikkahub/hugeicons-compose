package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Scissor: ImageVector
    get() {
        if (_scissor != null) {
            return _scissor!!
        }
        _scissor = ImageVector.Builder(
            name = "Scissor",
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
        moveTo(21f, 6f)
        curveTo(21f, 7.65685f, 19.6569f, 9f, 18f, 9f)
        curveTo(16.3431f, 9f, 15f, 7.65685f, 15f, 6f)
        curveTo(15f, 4.34315f, 16.3431f, 3f, 18f, 3f)
        curveTo(19.6569f, 3f, 21f, 4.34315f, 21f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 18f)
        curveTo(21f, 19.6569f, 19.6569f, 21f, 18f, 21f)
        curveTo(16.3431f, 21f, 15f, 19.6569f, 15f, 18f)
        curveTo(15f, 16.3431f, 16.3431f, 15f, 18f, 15f)
        curveTo(19.6569f, 15f, 21f, 16.3431f, 21f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 8f)
        lineTo(3f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.0003f, 16f)
        lineTo(11f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 5.00011f)
        lineTo(8.5f, 10f)
        }
        }.build()

        return _scissor!!
    }

private var _scissor: ImageVector? = null
