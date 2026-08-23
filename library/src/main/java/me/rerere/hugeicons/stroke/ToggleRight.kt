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

val HugeIcons.ToggleRight: ImageVector
    get() {
        if (_toggleRight != null) {
            return _toggleRight!!
        }
        _toggleRight = ImageVector.Builder(
            name = "ToggleRight",
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
            moveTo(13f, 12f)
            curveTo(13f, 13.6569f, 14.3431f, 15f, 16f, 15f)
            curveTo(17.6569f, 15f, 19f, 13.6569f, 19f, 12f)
            curveTo(19f, 10.3431f, 17.6569f, 9f, 16f, 9f)
            curveTo(14.3431f, 9f, 13f, 10.3431f, 13f, 12f)
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
            moveTo(8f, 6f)
            horizontalLineTo(16f)
            curveTo(19.3137f, 6f, 22f, 8.68629f, 22f, 12f)
            curveTo(22f, 15.3137f, 19.3137f, 18f, 16f, 18f)
            horizontalLineTo(8f)
            curveTo(4.68629f, 18f, 2f, 15.3137f, 2f, 12f)
            curveTo(2f, 8.68629f, 4.68629f, 6f, 8f, 6f)
            close()
        }
        }.build()

        return _toggleRight!!
    }

private var _toggleRight: ImageVector? = null
