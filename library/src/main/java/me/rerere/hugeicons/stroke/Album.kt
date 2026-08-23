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

val HugeIcons.Album: ImageVector
    get() {
        if (_album != null) {
            return _album!!
        }
        _album = ImageVector.Builder(
            name = "Album",
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
            moveTo(12f, 21f)
            horizontalLineTo(12f)
            horizontalLineTo(12f)
            curveTo(16.2426f, 21f, 18.364f, 21f, 19.682f, 19.682f)
            curveTo(21f, 18.364f, 21f, 16.2426f, 21f, 12f)
            verticalLineTo(12f)
            verticalLineTo(12f)
            curveTo(21f, 7.75735f, 21f, 5.63604f, 19.682f, 4.31802f)
            curveTo(18.364f, 3f, 16.2426f, 3f, 12f, 3f)
            curveTo(7.75736f, 3f, 5.63604f, 3f, 4.31802f, 4.31802f)
            curveTo(3f, 5.63604f, 3f, 7.75736f, 3f, 12f)
            curveTo(3f, 16.2426f, 3f, 18.364f, 4.31802f, 19.682f)
            curveTo(5.63604f, 21f, 7.75735f, 21f, 12f, 21f)
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
            moveTo(11f, 3f)
            verticalLineTo(7.73804f)
            curveTo(11f, 9.73938f, 11f, 10.74f, 11.4835f, 10.9617f)
            curveTo(11.9669f, 11.1833f, 12.5183f, 10.4354f, 13.6211f, 8.93958f)
            curveTo(13.8092f, 8.68441f, 14.1908f, 8.68432f, 14.3789f, 8.93949f)
            curveTo(15.4817f, 10.4353f, 16.0331f, 11.1833f, 16.5165f, 10.9616f)
            curveTo(17f, 10.74f, 17f, 9.73933f, 17f, 7.73797f)
            verticalLineTo(3.5f)
        }
        }.build()

        return _album!!
    }

private var _album: ImageVector? = null
