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

val HugeIcons.Flickr: ImageVector
    get() {
        if (_flickr != null) {
            return _flickr!!
        }
        _flickr = ImageVector.Builder(
            name = "Flickr",
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
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(22f, 12f)
            arcTo(10f, 10f, 0f, true, false, 2f, 12f)
            arcTo(10f, 10f, 0f, true, false, 22f, 12f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(10.5f, 12f)
            curveTo(10.5f, 13.3807f, 9.38071f, 14.5f, 8f, 14.5f)
            curveTo(6.61929f, 14.5f, 5.5f, 13.3807f, 5.5f, 12f)
            curveTo(5.5f, 10.6193f, 6.61929f, 9.5f, 8f, 9.5f)
            curveTo(9.38071f, 9.5f, 10.5f, 10.6193f, 10.5f, 12f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(18.5f, 12f)
            curveTo(18.5f, 13.3807f, 17.3807f, 14.5f, 16f, 14.5f)
            curveTo(14.6193f, 14.5f, 13.5f, 13.3807f, 13.5f, 12f)
            curveTo(13.5f, 10.6193f, 14.6193f, 9.5f, 16f, 9.5f)
            curveTo(17.3807f, 9.5f, 18.5f, 10.6193f, 18.5f, 12f)
            close()
        }
        }.build()

        return _flickr!!
    }

private var _flickr: ImageVector? = null
