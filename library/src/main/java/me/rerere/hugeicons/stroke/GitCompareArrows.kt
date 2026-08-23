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

val HugeIcons.GitCompareArrows: ImageVector
    get() {
        if (_gitCompareArrows != null) {
            return _gitCompareArrows!!
        }
        _gitCompareArrows = ImageVector.Builder(
            name = "GitCompareArrows",
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
            moveTo(5f, 9.00098f)
            curveTo(6.65685f, 9.00098f, 8f, 7.65783f, 8f, 6.00098f)
            curveTo(8f, 4.34412f, 6.65685f, 3.00098f, 5f, 3.00098f)
            curveTo(3.34315f, 3.00098f, 2f, 4.34412f, 2f, 6.00098f)
            curveTo(2f, 7.65783f, 3.34315f, 9.00098f, 5f, 9.00098f)
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
            moveTo(12f, 6.00146f)
            horizontalLineTo(14f)
            curveTo(15.8692f, 6.00146f, 16.8038f, 6.00146f, 17.5f, 6.40339f)
            curveTo(17.9561f, 6.66669f, 18.3348f, 7.04541f, 18.5981f, 7.50146f)
            curveTo(19f, 8.19762f, 19f, 9.13223f, 19f, 11.0015f)
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
            moveTo(19f, 21.001f)
            curveTo(20.6569f, 21.001f, 22f, 19.6578f, 22f, 18.001f)
            curveTo(22f, 16.3441f, 20.6569f, 15.001f, 19f, 15.001f)
            curveTo(17.3431f, 15.001f, 16f, 16.3441f, 16f, 18.001f)
            curveTo(16f, 19.6578f, 17.3431f, 21.001f, 19f, 21.001f)
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
            moveTo(12f, 18.002f)
            horizontalLineTo(10f)
            curveTo(8.13077f, 18.002f, 7.19615f, 18.002f, 6.5f, 17.6f)
            curveTo(6.04394f, 17.3367f, 5.66523f, 16.958f, 5.40192f, 16.502f)
            curveTo(5f, 15.8058f, 5f, 14.8712f, 5f, 13.002f)
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
            moveTo(9.00002f, 15.001f)
            curveTo(9.00002f, 15.001f, 12f, 17.2104f, 12f, 18.001f)
            curveTo(12f, 18.7916f, 9f, 21.001f, 9f, 21.001f)
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
            moveTo(15f, 9.00195f)
            curveTo(15f, 9.00195f, 12f, 6.79249f, 12f, 6.00193f)
            curveTo(12f, 5.21137f, 15f, 3.00195f, 15f, 3.00195f)
        }
        }.build()

        return _gitCompareArrows!!
    }

private var _gitCompareArrows: ImageVector? = null
