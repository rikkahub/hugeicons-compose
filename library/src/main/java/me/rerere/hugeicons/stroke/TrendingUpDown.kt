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

val HugeIcons.TrendingUpDown: ImageVector
    get() {
        if (_trendingUpDown != null) {
            return _trendingUpDown!!
        }
        _trendingUpDown = ImageVector.Builder(
            name = "TrendingUpDown",
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
            moveTo(3f, 14.001f)
            lineTo(7f, 10.001f)
            curveTo(7.88256f, 9.11841f, 8.32385f, 8.67713f, 8.86543f, 8.62835f)
            curveTo(8.95496f, 8.62028f, 9.04504f, 8.62028f, 9.13457f, 8.62835f)
            curveTo(9.67615f, 8.67713f, 10.1174f, 9.11841f, 11f, 10.001f)
            curveTo(11.8826f, 10.8835f, 12.3238f, 11.3248f, 12.8654f, 11.3736f)
            curveTo(12.955f, 11.3817f, 13.045f, 11.3817f, 13.1346f, 11.3736f)
            curveTo(13.6762f, 11.3248f, 14.1174f, 10.8835f, 15f, 10.001f)
            lineTo(20f, 5.00098f)
            moveTo(16f, 15.001f)
            lineTo(20f, 19.001f)
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
            moveTo(16f, 19.7244f)
            curveTo(16f, 19.7244f, 20.101f, 20.3467f, 20.7234f, 19.7244f)
            curveTo(21.3458f, 19.102f, 20.7234f, 15.001f, 20.7234f, 15.001f)
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
            moveTo(16f, 4.27682f)
            curveTo(16f, 4.27682f, 20.101f, 3.6545f, 20.7234f, 4.27685f)
            curveTo(21.3458f, 4.8992f, 20.7234f, 9.00024f, 20.7234f, 9.00024f)
        }
        }.build()

        return _trendingUpDown!!
    }

private var _trendingUpDown: ImageVector? = null
