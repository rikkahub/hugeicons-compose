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

val HugeIcons.EllipsisVertical: ImageVector
    get() {
        if (_ellipsisVertical != null) {
            return _ellipsisVertical!!
        }
        _ellipsisVertical = ImageVector.Builder(
            name = "EllipsisVertical",
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
            moveTo(12f, 12f)
            verticalLineTo(11.5f)
            moveTo(12f, 5f)
            verticalLineTo(4.5f)
            moveTo(12f, 19f)
            verticalLineTo(18.5f)
            moveTo(13f, 12f)
            curveTo(13f, 11.4477f, 12.5523f, 11f, 12f, 11f)
            curveTo(11.4477f, 11f, 11f, 11.4477f, 11f, 12f)
            curveTo(11f, 12.5523f, 11.4477f, 13f, 12f, 13f)
            curveTo(12.5523f, 13f, 13f, 12.5523f, 13f, 12f)
            close()
            moveTo(13f, 5f)
            curveTo(13f, 4.44772f, 12.5523f, 4f, 12f, 4f)
            curveTo(11.4477f, 4f, 11f, 4.44772f, 11f, 5f)
            curveTo(11f, 5.55228f, 11.4477f, 6f, 12f, 6f)
            curveTo(12.5523f, 6f, 13f, 5.55228f, 13f, 5f)
            close()
            moveTo(13f, 19f)
            curveTo(13f, 18.4477f, 12.5523f, 18f, 12f, 18f)
            curveTo(11.4477f, 18f, 11f, 18.4477f, 11f, 19f)
            curveTo(11f, 19.5523f, 11.4477f, 20f, 12f, 20f)
            curveTo(12.5523f, 20f, 13f, 19.5523f, 13f, 19f)
            close()
        }
        }.build()

        return _ellipsisVertical!!
    }

private var _ellipsisVertical: ImageVector? = null
