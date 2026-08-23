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

val HugeIcons.BookmarkX: ImageVector
    get() {
        if (_bookmarkX != null) {
            return _bookmarkX!!
        }
        _bookmarkX = ImageVector.Builder(
            name = "BookmarkX",
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
            moveTo(20.5f, 2.5f)
            lineTo(14.5f, 8.5f)
            moveTo(14.5f, 2.5f)
            lineTo(20.5f, 8.5f)
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
            moveTo(19f, 11.5f)
            verticalLineTo(17.9808f)
            curveTo(19f, 20.2867f, 19f, 21.4396f, 18.2272f, 21.8523f)
            curveTo(16.7305f, 22.6514f, 13.9232f, 19.9852f, 12.59f, 19.1824f)
            curveTo(11.8168f, 18.7168f, 11.4302f, 18.484f, 11f, 18.484f)
            curveTo(10.5698f, 18.484f, 10.1832f, 18.7168f, 9.41f, 19.1824f)
            curveTo(8.0768f, 19.9852f, 5.26947f, 22.6514f, 3.77285f, 21.8523f)
            curveTo(3f, 21.4396f, 3f, 20.2867f, 3f, 17.9808f)
            verticalLineTo(9.70753f)
            curveTo(3f, 6.07416f, 3f, 4.25748f, 4.17157f, 3.12874f)
            curveTo(5.34315f, 2f, 7.22876f, 2f, 11f, 2f)
        }
        }.build()

        return _bookmarkX!!
    }

private var _bookmarkX: ImageVector? = null
