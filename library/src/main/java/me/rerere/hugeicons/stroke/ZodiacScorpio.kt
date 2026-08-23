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

val HugeIcons.ZodiacScorpio: ImageVector
    get() {
        if (_zodiacScorpio != null) {
            return _zodiacScorpio!!
        }
        _zodiacScorpio = ImageVector.Builder(
            name = "ZodiacScorpio",
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
            moveTo(2f, 3.99999f)
            curveTo(3.65685f, 3.99998f, 5f, 5.34312f, 5f, 6.99997f)
            verticalLineTo(17f)
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
            moveTo(5f, 17f)
            verticalLineTo(6.5f)
            curveTo(5f, 5.11929f, 6.11929f, 4f, 7.5f, 4f)
            curveTo(8.88071f, 4f, 10f, 5.11929f, 10f, 6.5f)
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
            moveTo(10f, 17f)
            verticalLineTo(6.5f)
            curveTo(10f, 5.11929f, 11.1193f, 4f, 12.5f, 4f)
            curveTo(13.8807f, 4f, 15f, 5.11929f, 15f, 6.5f)
            verticalLineTo(15f)
            curveTo(15f, 16.1046f, 15.8954f, 17f, 17f, 17f)
            lineTo(22f, 17f)
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
            moveTo(19f, 14f)
            curveTo(19f, 14f, 22.006f, 16.2139f, 22.006f, 17.006f)
            curveTo(22.006f, 17.7981f, 19f, 20.0119f, 19f, 20.0119f)
        }
        }.build()

        return _zodiacScorpio!!
    }

private var _zodiacScorpio: ImageVector? = null
