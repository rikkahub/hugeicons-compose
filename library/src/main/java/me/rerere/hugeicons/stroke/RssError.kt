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

val HugeIcons.RssError: ImageVector
    get() {
        if (_rssError != null) {
            return _rssError!!
        }
        _rssError = ImageVector.Builder(
            name = "RssError",
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
            moveTo(11f, 21f)
            curveTo(11f, 16.5817f, 7.41828f, 13f, 3f, 13f)
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
            moveTo(3.75f, 20.5f)
            horizontalLineTo(3.5f)
            moveTo(4f, 20.5f)
            curveTo(4f, 20.7761f, 3.77614f, 21f, 3.5f, 21f)
            curveTo(3.22386f, 21f, 3f, 20.7761f, 3f, 20.5f)
            curveTo(3f, 20.2239f, 3.22386f, 20f, 3.5f, 20f)
            curveTo(3.77614f, 20f, 4f, 20.2239f, 4f, 20.5f)
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
            moveTo(16f, 10f)
            horizontalLineTo(16.009f)
            moveTo(16f, 7.5f)
            verticalLineTo(5.5f)
            moveTo(21f, 8f)
            curveTo(21f, 10.7614f, 18.7614f, 13f, 16f, 13f)
            curveTo(13.2386f, 13f, 11f, 10.7614f, 11f, 8f)
            curveTo(11f, 5.23858f, 13.2386f, 3f, 16f, 3f)
            curveTo(18.7614f, 3f, 21f, 5.23858f, 21f, 8f)
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
            moveTo(18f, 21f)
            curveTo(18f, 19.6148f, 17.8122f, 18.2734f, 17.4608f, 17f)
            moveTo(3f, 6f)
            curveTo(4.38521f, 6f, 5.72656f, 6.18777f, 7f, 6.53923f)
        }
        }.build()

        return _rssError!!
    }

private var _rssError: ImageVector? = null
