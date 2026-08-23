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

val HugeIcons.Instagram: ImageVector
    get() {
        if (_instagram != null) {
            return _instagram!!
        }
        _instagram = ImageVector.Builder(
            name = "Instagram",
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
            moveTo(3f, 12f)
            curveTo(3f, 7.75736f, 3f, 5.63604f, 4.31802f, 4.31802f)
            curveTo(5.63604f, 3f, 7.75736f, 3f, 12f, 3f)
            curveTo(16.2426f, 3f, 18.364f, 3f, 19.682f, 4.31802f)
            curveTo(21f, 5.63604f, 21f, 7.75736f, 21f, 12f)
            curveTo(21f, 16.2426f, 21f, 18.364f, 19.682f, 19.682f)
            curveTo(18.364f, 21f, 16.2426f, 21f, 12f, 21f)
            curveTo(7.75736f, 21f, 5.63604f, 21f, 4.31802f, 19.682f)
            curveTo(3f, 18.364f, 3f, 16.2426f, 3f, 12f)
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
            moveTo(16f, 12f)
            curveTo(16f, 14.2091f, 14.2091f, 16f, 12f, 16f)
            curveTo(9.79086f, 16f, 8f, 14.2091f, 8f, 12f)
            curveTo(8f, 9.79086f, 9.79086f, 8f, 12f, 8f)
            curveTo(14.2091f, 8f, 16f, 9.79086f, 16f, 12f)
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
            moveTo(17.3748f, 6.75024f)
            horizontalLineTo(17.2498f)
            moveTo(17.4998f, 6.75024f)
            curveTo(17.4998f, 6.88832f, 17.3878f, 7.00024f, 17.2498f, 7.00024f)
            curveTo(17.1117f, 7.00024f, 16.9998f, 6.88832f, 16.9998f, 6.75024f)
            curveTo(16.9998f, 6.61217f, 17.1117f, 6.50024f, 17.2498f, 6.50024f)
            curveTo(17.3878f, 6.50024f, 17.4998f, 6.61217f, 17.4998f, 6.75024f)
            close()
        }
        }.build()

        return _instagram!!
    }

private var _instagram: ImageVector? = null
