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

val HugeIcons.ZodiacPisces: ImageVector
    get() {
        if (_zodiacPisces != null) {
            return _zodiacPisces!!
        }
        _zodiacPisces = ImageVector.Builder(
            name = "ZodiacPisces",
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
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(17.9999f, 3f)
            curveTo(16.1296f, 5.42035f, 14.9999f, 8.56402f, 14.9999f, 12f)
            curveTo(14.9999f, 15.436f, 16.1296f, 18.5797f, 17.9999f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(5.99994f, 21f)
            curveTo(7.87026f, 18.5797f, 8.99994f, 15.436f, 8.99994f, 12f)
            curveTo(8.99994f, 8.56402f, 7.87026f, 5.42035f, 5.99994f, 3f)
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
            moveTo(18.9999f, 12f)
            lineTo(4.99994f, 12f)
        }
        }.build()

        return _zodiacPisces!!
    }

private var _zodiacPisces: ImageVector? = null
