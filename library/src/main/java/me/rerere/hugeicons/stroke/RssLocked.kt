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

val HugeIcons.RssLocked: ImageVector
    get() {
        if (_rssLocked != null) {
            return _rssLocked!!
        }
        _rssLocked = ImageVector.Builder(
            name = "RssLocked",
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
            moveTo(18f, 21f)
            curveTo(18f, 19.2468f, 17.6992f, 17.5639f, 17.1465f, 16f)
            moveTo(3f, 6f)
            curveTo(5.13331f, 6f, 7.16261f, 6.44534f, 9f, 7.24813f)
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
            moveTo(15f, 7f)
            verticalLineTo(5f)
            curveTo(15f, 3.89543f, 15.8954f, 3f, 17f, 3f)
            curveTo(18.1046f, 3f, 19f, 3.89543f, 19f, 5f)
            verticalLineTo(7f)
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
            moveTo(18.5f, 7f)
            horizontalLineTo(15.5f)
            curveTo(14.5654f, 7f, 14.0981f, 7f, 13.75f, 7.20096f)
            curveTo(13.522f, 7.33261f, 13.3326f, 7.52197f, 13.201f, 7.75f)
            curveTo(13f, 8.09808f, 13f, 8.56538f, 13f, 9.5f)
            curveTo(13f, 10.4346f, 13f, 10.9019f, 13.201f, 11.25f)
            curveTo(13.3326f, 11.478f, 13.522f, 11.6674f, 13.75f, 11.799f)
            curveTo(14.0981f, 12f, 14.5654f, 12f, 15.5f, 12f)
            horizontalLineTo(18.5f)
            curveTo(19.4346f, 12f, 19.9019f, 12f, 20.25f, 11.799f)
            curveTo(20.478f, 11.6674f, 20.6674f, 11.478f, 20.799f, 11.25f)
            curveTo(21f, 10.9019f, 21f, 10.4346f, 21f, 9.5f)
            curveTo(21f, 8.56538f, 21f, 8.09808f, 20.799f, 7.75f)
            curveTo(20.6674f, 7.52197f, 20.478f, 7.33261f, 20.25f, 7.20096f)
            curveTo(19.9019f, 7f, 19.4346f, 7f, 18.5f, 7f)
            close()
        }
        }.build()

        return _rssLocked!!
    }

private var _rssLocked: ImageVector? = null
