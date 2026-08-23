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

val HugeIcons.Rss: ImageVector
    get() {
        if (_rss != null) {
            return _rss!!
        }
        _rss = ImageVector.Builder(
            name = "Rss",
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
            moveTo(19.5f, 19.5f)
            curveTo(19.5f, 11.2157f, 12.7843f, 4.5f, 4.5f, 4.5f)
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
            moveTo(12.5f, 19.5f)
            curveTo(12.5f, 15.0817f, 8.91828f, 11.5f, 4.5f, 11.5f)
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
            moveTo(5.25f, 19f)
            horizontalLineTo(5f)
            moveTo(5.5f, 19f)
            curveTo(5.5f, 19.2761f, 5.27614f, 19.5f, 5f, 19.5f)
            curveTo(4.72386f, 19.5f, 4.5f, 19.2761f, 4.5f, 19f)
            curveTo(4.5f, 18.7239f, 4.72386f, 18.5f, 5f, 18.5f)
            curveTo(5.27614f, 18.5f, 5.5f, 18.7239f, 5.5f, 19f)
            close()
        }
        }.build()

        return _rss!!
    }

private var _rss: ImageVector? = null
