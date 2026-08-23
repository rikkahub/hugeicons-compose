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

val HugeIcons.Ellipsis: ImageVector
    get() {
        if (_ellipsis != null) {
            return _ellipsis!!
        }
        _ellipsis = ImageVector.Builder(
            name = "Ellipsis",
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
            horizontalLineTo(12.5f)
            moveTo(19f, 12f)
            horizontalLineTo(19.5f)
            moveTo(5f, 12f)
            horizontalLineTo(5.5f)
            moveTo(12f, 13f)
            curveTo(12.5523f, 13f, 13f, 12.5523f, 13f, 12f)
            curveTo(13f, 11.4477f, 12.5523f, 11f, 12f, 11f)
            curveTo(11.4477f, 11f, 11f, 11.4477f, 11f, 12f)
            curveTo(11f, 12.5523f, 11.4477f, 13f, 12f, 13f)
            close()
            moveTo(19f, 13f)
            curveTo(19.5523f, 13f, 20f, 12.5523f, 20f, 12f)
            curveTo(20f, 11.4477f, 19.5523f, 11f, 19f, 11f)
            curveTo(18.4477f, 11f, 18f, 11.4477f, 18f, 12f)
            curveTo(18f, 12.5523f, 18.4477f, 13f, 19f, 13f)
            close()
            moveTo(5f, 13f)
            curveTo(5.55228f, 13f, 6f, 12.5523f, 6f, 12f)
            curveTo(6f, 11.4477f, 5.55228f, 11f, 5f, 11f)
            curveTo(4.44772f, 11f, 4f, 11.4477f, 4f, 12f)
            curveTo(4f, 12.5523f, 4.44772f, 13f, 5f, 13f)
            close()
        }
        }.build()

        return _ellipsis!!
    }

private var _ellipsis: ImageVector? = null
