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

val HugeIcons.SquareSquare: ImageVector
    get() {
        if (_squareSquare != null) {
            return _squareSquare!!
        }
        _squareSquare = ImageVector.Builder(
            name = "SquareSquare",
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
            moveTo(12f, 21f)
            horizontalLineTo(12f)
            horizontalLineTo(12f)
            curveTo(16.2426f, 21f, 18.364f, 21f, 19.682f, 19.682f)
            curveTo(21f, 18.364f, 21f, 16.2426f, 21f, 12f)
            verticalLineTo(12f)
            verticalLineTo(12f)
            curveTo(21f, 7.75735f, 21f, 5.63604f, 19.682f, 4.31802f)
            curveTo(18.364f, 3f, 16.2426f, 3f, 12f, 3f)
            curveTo(7.75736f, 3f, 5.63604f, 3f, 4.31802f, 4.31802f)
            curveTo(3f, 5.63604f, 3f, 7.75736f, 3f, 12f)
            curveTo(3f, 16.2426f, 3f, 18.364f, 4.31802f, 19.682f)
            curveTo(5.63604f, 21f, 7.75735f, 21f, 12f, 21f)
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
            moveTo(15.7275f, 9.36502f)
            curveTo(16f, 9.8998f, 16f, 10.5999f, 16f, 12f)
            curveTo(16f, 13.4001f, 16f, 14.1002f, 15.7275f, 14.635f)
            curveTo(15.4878f, 15.1054f, 15.1054f, 15.4878f, 14.635f, 15.7275f)
            curveTo(14.1002f, 16f, 13.4001f, 16f, 12f, 16f)
            curveTo(10.5999f, 16f, 9.8998f, 16f, 9.36502f, 15.7275f)
            curveTo(8.89462f, 15.4878f, 8.51217f, 15.1054f, 8.27248f, 14.635f)
            curveTo(8f, 14.1002f, 8f, 13.4001f, 8f, 12f)
            curveTo(8f, 10.5999f, 8f, 9.8998f, 8.27248f, 9.36502f)
            curveTo(8.51217f, 8.89462f, 8.89462f, 8.51217f, 9.36502f, 8.27248f)
            curveTo(9.8998f, 8f, 10.5999f, 8f, 12f, 8f)
            curveTo(13.4001f, 8f, 14.1002f, 8f, 14.635f, 8.27248f)
            curveTo(15.1054f, 8.51217f, 15.4878f, 8.89462f, 15.7275f, 9.36502f)
            close()
        }
        }.build()

        return _squareSquare!!
    }

private var _squareSquare: ImageVector? = null
