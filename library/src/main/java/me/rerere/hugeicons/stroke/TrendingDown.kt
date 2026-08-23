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

val HugeIcons.TrendingDown: ImageVector
    get() {
        if (_trendingDown != null) {
            return _trendingDown!!
        }
        _trendingDown = ImageVector.Builder(
            name = "TrendingDown",
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
            moveTo(3f, 17f)
            lineTo(7f, 13f)
            curveTo(7.88256f, 12.1174f, 8.32385f, 11.6762f, 8.86543f, 11.6274f)
            curveTo(8.95496f, 11.6193f, 9.04504f, 11.6193f, 9.13457f, 11.6274f)
            curveTo(9.67615f, 11.6762f, 10.1174f, 12.1174f, 11f, 13f)
            curveTo(11.8826f, 13.8826f, 12.3238f, 14.3238f, 12.8654f, 14.3726f)
            curveTo(12.955f, 14.3807f, 13.045f, 14.3807f, 13.1346f, 14.3726f)
            curveTo(13.6762f, 14.3238f, 14.1174f, 13.8826f, 15f, 13f)
            lineTo(20f, 8f)
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
            moveTo(16f, 7.27657f)
            curveTo(16f, 7.27657f, 20.101f, 6.65426f, 20.7234f, 7.27661f)
            curveTo(21.3458f, 7.89896f, 20.7234f, 12f, 20.7234f, 12f)
        }
        }.build()

        return _trendingDown!!
    }

private var _trendingDown: ImageVector? = null
