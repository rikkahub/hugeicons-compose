package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BookmarkBlock01: ImageVector
    get() {
        if (_bookmarkBlock01 != null) {
            return _bookmarkBlock01!!
        }
        _bookmarkBlock01 = ImageVector.Builder(
            name = "BookmarkBlock01",
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
        moveTo(14.1667f, 7.83333f)
        lineTo(18.8333f, 3.16667f)
        moveTo(20f, 5.5f)
        curveTo(20f, 7.433f, 18.433f, 9f, 16.5f, 9f)
        curveTo(14.567f, 9f, 13f, 7.433f, 13f, 5.5f)
        curveTo(13f, 3.567f, 14.567f, 2f, 16.5f, 2f)
        curveTo(18.433f, 2f, 20f, 3.567f, 20f, 5.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
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
        curveTo(5.29018f, 2.05103f, 7.05974f, 2.00231f, 10.5f, 2.0001f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.5f, 7f)
        horizontalLineTo(10f)
        }
        }.build()

        return _bookmarkBlock01!!
    }

private var _bookmarkBlock01: ImageVector? = null
