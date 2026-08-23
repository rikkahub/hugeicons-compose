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

val HugeIcons.Grid3x3: ImageVector
    get() {
        if (_grid3x3 != null) {
            return _grid3x3!!
        }
        _grid3x3 = ImageVector.Builder(
            name = "Grid3x3",
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
            moveTo(9.00034f, 3.50019f)
            verticalLineTo(20.5311f)
            moveTo(15.0003f, 3.03125f)
            verticalLineTo(20.5311f)
            moveTo(20.5f, 15f)
            lineTo(3.5f, 15f)
            moveTo(20.5f, 9f)
            lineTo(3.5f, 9.00004f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(4.31802f, 19.682f)
            curveTo(5.63604f, 21f, 7.75736f, 21f, 12f, 21f)
            curveTo(16.2426f, 21f, 18.364f, 21f, 19.682f, 19.682f)
            curveTo(21f, 18.364f, 21f, 16.2426f, 21f, 12f)
            curveTo(21f, 7.75736f, 21f, 5.63604f, 19.682f, 4.31802f)
            curveTo(18.364f, 3f, 16.2426f, 3f, 12f, 3f)
            curveTo(7.75736f, 3f, 5.63604f, 3f, 4.31802f, 4.31802f)
            curveTo(3f, 5.63604f, 3f, 7.75736f, 3f, 12f)
            curveTo(3f, 16.2426f, 3f, 18.364f, 4.31802f, 19.682f)
            close()
        }
        }.build()

        return _grid3x3!!
    }

private var _grid3x3: ImageVector? = null
