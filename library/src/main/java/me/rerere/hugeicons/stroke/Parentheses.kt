package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Parentheses: ImageVector
    get() {
        if (_parentheses != null) {
            return _parentheses!!
        }
        _parentheses = ImageVector.Builder(
            name = "Parentheses",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(5.99219f, 3f)
            curveTo(3.58119f, 4.93486f, 1.99219f, 8.24345f, 1.99219f, 12f)
            curveTo(1.99219f, 15.7565f, 3.58119f, 19.0651f, 5.99219f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(17.9922f, 3f)
            curveTo(20.4032f, 4.93486f, 21.9922f, 8.24345f, 21.9922f, 12f)
            curveTo(21.9922f, 15.7565f, 20.4032f, 19.0651f, 17.9922f, 21f)
        }
        }.build()

        return _parentheses!!
    }

private var _parentheses: ImageVector? = null
