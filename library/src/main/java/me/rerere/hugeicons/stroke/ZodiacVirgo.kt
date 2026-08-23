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

val HugeIcons.ZodiacVirgo: ImageVector
    get() {
        if (_zodiacVirgo != null) {
            return _zodiacVirgo!!
        }
        _zodiacVirgo = ImageVector.Builder(
            name = "ZodiacVirgo",
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
            moveTo(6f, 17f)
            verticalLineTo(6.99998f)
            curveTo(6f, 5.34313f, 4.65685f, 3.99999f, 3f, 4f)
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
            moveTo(6f, 17f)
            verticalLineTo(6.5f)
            curveTo(6f, 5.11929f, 7.11929f, 4f, 8.5f, 4f)
            curveTo(9.88071f, 4f, 11f, 5.11929f, 11f, 6.5f)
            verticalLineTo(16.4828f)
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
            moveTo(11f, 17f)
            verticalLineTo(6.5f)
            curveTo(11f, 5.11929f, 12.1193f, 4f, 13.5f, 4f)
            curveTo(14.8807f, 4f, 16f, 5.11929f, 16f, 6.5f)
            verticalLineTo(15f)
            curveTo(16f, 17.7614f, 18.2386f, 20f, 21f, 20f)
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
            moveTo(16f, 14f)
            verticalLineTo(11.5f)
            curveTo(16f, 10.1193f, 17.1193f, 9f, 18.5f, 9f)
            curveTo(19.8807f, 9f, 21f, 10.1206f, 21f, 11.5013f)
            verticalLineTo(14.9998f)
            curveTo(21f, 17.7612f, 18.7614f, 20f, 16f, 20f)
        }
        }.build()

        return _zodiacVirgo!!
    }

private var _zodiacVirgo: ImageVector? = null
