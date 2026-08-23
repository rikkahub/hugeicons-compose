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

val HugeIcons.SquareActivity: ImageVector
    get() {
        if (_squareActivity != null) {
            return _squareActivity!!
        }
        _squareActivity = ImageVector.Builder(
            name = "SquareActivity",
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
            moveTo(4.31021f, 19.682f)
            curveTo(2.99219f, 18.364f, 2.99219f, 16.2426f, 2.99219f, 12f)
            curveTo(2.99219f, 7.75736f, 2.99219f, 5.63604f, 4.31021f, 4.31802f)
            curveTo(5.62823f, 3f, 7.74955f, 3f, 11.9922f, 3f)
            curveTo(16.2348f, 3f, 18.3561f, 3f, 19.6742f, 4.31802f)
            curveTo(20.9922f, 5.63604f, 20.9922f, 7.75736f, 20.9922f, 12f)
            curveTo(20.9922f, 16.2426f, 20.9922f, 18.364f, 19.6742f, 19.682f)
            curveTo(18.3561f, 21f, 16.2348f, 21f, 11.9922f, 21f)
            curveTo(7.74955f, 21f, 5.62823f, 21f, 4.31021f, 19.682f)
            close()
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
            moveTo(5.99219f, 12f)
            horizontalLineTo(8.49219f)
            lineTo(10.4922f, 8f)
            lineTo(13.4922f, 16f)
            lineTo(15.4922f, 12f)
            horizontalLineTo(17.9922f)
        }
        }.build()

        return _squareActivity!!
    }

private var _squareActivity: ImageVector? = null
