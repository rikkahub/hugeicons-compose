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

val HugeIcons.RssConnected01: ImageVector
    get() {
        if (_rssConnected01 != null) {
            return _rssConnected01!!
        }
        _rssConnected01 = ImageVector.Builder(
            name = "RssConnected01",
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
            moveTo(18.5f, 19.5f)
            curveTo(18.5f, 17.3667f, 18.0547f, 15.3374f, 17.2519f, 13.5f)
            moveTo(3.5f, 4.5f)
            curveTo(5.63331f, 4.5f, 7.66261f, 4.94534f, 9.5f, 5.74813f)
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
            moveTo(11.5f, 19.5f)
            curveTo(11.5f, 15.0817f, 7.91828f, 11.5f, 3.5f, 11.5f)
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
            moveTo(4.25f, 19f)
            horizontalLineTo(4f)
            moveTo(4.5f, 19f)
            curveTo(4.5f, 19.2761f, 4.27614f, 19.5f, 4f, 19.5f)
            curveTo(3.72386f, 19.5f, 3.5f, 19.2761f, 3.5f, 19f)
            curveTo(3.5f, 18.7239f, 3.72386f, 18.5f, 4f, 18.5f)
            curveTo(4.27614f, 18.5f, 4.5f, 18.7239f, 4.5f, 19f)
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
            moveTo(12.5f, 8.5f)
            curveTo(12.5f, 8.5f, 13.5f, 8.5f, 14.5f, 10.5f)
            curveTo(14.5f, 10.5f, 17.6765f, 5.5f, 20.5f, 4.5f)
        }
        }.build()

        return _rssConnected01!!
    }

private var _rssConnected01: ImageVector? = null
