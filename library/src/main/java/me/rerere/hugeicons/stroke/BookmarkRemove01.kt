package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BookmarkRemove01: ImageVector
    get() {
        if (_bookmarkRemove01 != null) {
            return _bookmarkRemove01!!
        }
        _bookmarkRemove01 = ImageVector.Builder(
            name = "BookmarkRemove01",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 2f)
        curveTo(7.22876f, 2f, 5.34315f, 2f, 4.17157f, 3.12874f)
        curveTo(3f, 4.25748f, 3f, 6.07416f, 3f, 9.70753f)
        verticalLineTo(17.9808f)
        curveTo(3f, 20.2867f, 3f, 21.4396f, 3.77285f, 21.8523f)
        curveTo(5.26947f, 22.6514f, 8.0768f, 19.9852f, 9.41f, 19.1824f)
        curveTo(10.1832f, 18.7168f, 10.5698f, 18.484f, 11f, 18.484f)
        curveTo(11.4302f, 18.484f, 11.8168f, 18.7168f, 12.59f, 19.1824f)
        curveTo(13.9232f, 19.9852f, 16.7305f, 22.6514f, 18.2272f, 21.8523f)
        curveTo(19f, 21.4396f, 19f, 20.2867f, 19f, 17.9808f)
        verticalLineTo(11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.5f, 7f)
        horizontalLineTo(11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 2f)
        lineTo(14f, 8.99954f)
        moveTo(21f, 9f)
        lineTo(14f, 2.00046f)
        }
        }.build()

        return _bookmarkRemove01!!
    }

private var _bookmarkRemove01: ImageVector? = null
