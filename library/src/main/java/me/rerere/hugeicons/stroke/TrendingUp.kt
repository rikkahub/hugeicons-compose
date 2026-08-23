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

val HugeIcons.TrendingUp: ImageVector
    get() {
        if (_trendingUp != null) {
            return _trendingUp!!
        }
        _trendingUp = ImageVector.Builder(
            name = "TrendingUp",
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
            moveTo(3f, 7f)
            lineTo(7f, 11f)
            curveTo(7.88256f, 11.8826f, 8.32385f, 12.3238f, 8.86543f, 12.3726f)
            curveTo(8.95496f, 12.3807f, 9.04504f, 12.3807f, 9.13457f, 12.3726f)
            curveTo(9.67615f, 12.3238f, 10.1174f, 11.8826f, 11f, 11f)
            curveTo(11.8826f, 10.1174f, 12.3238f, 9.67615f, 12.8654f, 9.62737f)
            curveTo(12.955f, 9.6193f, 13.045f, 9.6193f, 13.1346f, 9.62737f)
            curveTo(13.6762f, 9.67615f, 14.1174f, 10.1174f, 15f, 11f)
            lineTo(20f, 16f)
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
            moveTo(20.7234f, 12f)
            curveTo(20.7234f, 12f, 21.3457f, 16.101f, 20.7234f, 16.7234f)
            curveTo(20.101f, 17.3458f, 16f, 16.7234f, 16f, 16.7234f)
        }
        }.build()

        return _trendingUp!!
    }

private var _trendingUp: ImageVector? = null
