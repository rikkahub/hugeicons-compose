package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BookmarkCheck01: ImageVector
    get() {
        if (_bookmarkCheck01 != null) {
            return _bookmarkCheck01!!
        }
        _bookmarkCheck01 = ImageVector.Builder(
            name = "BookmarkCheck01",
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
        moveTo(4f, 17.9808f)
        verticalLineTo(9.70753f)
        curveTo(4f, 6.07416f, 4f, 4.25748f, 5.17157f, 3.12874f)
        curveTo(6.34315f, 2f, 8.22876f, 2f, 12f, 2f)
        curveTo(15.7712f, 2f, 17.6569f, 2f, 18.8284f, 3.12874f)
        curveTo(20f, 4.25748f, 20f, 6.07416f, 20f, 9.70753f)
        verticalLineTo(17.9808f)
        curveTo(20f, 20.2867f, 20f, 21.4396f, 19.2272f, 21.8523f)
        curveTo(17.7305f, 22.6514f, 14.9232f, 19.9852f, 13.59f, 19.1824f)
        curveTo(12.8168f, 18.7168f, 12.4302f, 18.484f, 12f, 18.484f)
        curveTo(11.5698f, 18.484f, 11.1832f, 18.7168f, 10.41f, 19.1824f)
        curveTo(9.0768f, 19.9852f, 6.26947f, 22.6514f, 4.77285f, 21.8523f)
        curveTo(4f, 21.4396f, 4f, 20.2867f, 4f, 17.9808f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 13.7143f)
        curveTo(10f, 13.7143f, 11f, 14.2357f, 11.5f, 15f)
        curveTo(11.5f, 15f, 13f, 12f, 15f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 7f)
        horizontalLineTo(20f)
        }
        }.build()

        return _bookmarkCheck01!!
    }

private var _bookmarkCheck01: ImageVector? = null
