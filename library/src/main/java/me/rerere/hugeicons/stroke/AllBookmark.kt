package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AllBookmark: ImageVector
    get() {
        if (_allBookmark != null) {
            return _allBookmark!!
        }
        _allBookmark = ImageVector.Builder(
            name = "AllBookmark",
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
        moveTo(3f, 17.9808f)
        verticalLineTo(12.7075f)
        curveTo(3f, 9.07416f, 3f, 7.25748f, 4.09835f, 6.12874f)
        curveTo(5.1967f, 5f, 6.96447f, 5f, 10.5f, 5f)
        curveTo(14.0355f, 5f, 15.8033f, 5f, 16.9017f, 6.12874f)
        curveTo(18f, 7.25748f, 18f, 9.07416f, 18f, 12.7075f)
        verticalLineTo(17.9808f)
        curveTo(18f, 20.2867f, 18f, 21.4396f, 17.2755f, 21.8523f)
        curveTo(15.8724f, 22.6514f, 13.2405f, 19.9852f, 11.9906f, 19.1824f)
        curveTo(11.2657f, 18.7168f, 10.9033f, 18.484f, 10.5f, 18.484f)
        curveTo(10.0967f, 18.484f, 9.73425f, 18.7168f, 9.00938f, 19.1824f)
        curveTo(7.7595f, 19.9852f, 5.12763f, 22.6514f, 3.72454f, 21.8523f)
        curveTo(3f, 21.4396f, 3f, 20.2867f, 3f, 17.9808f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 2f)
        horizontalLineTo(11f)
        curveTo(15.714f, 2f, 18.0711f, 2f, 19.5355f, 3.46447f)
        curveTo(21f, 4.92893f, 21f, 7.28595f, 21f, 12f)
        verticalLineTo(18f)
        }
        }.build()

        return _allBookmark!!
    }

private var _allBookmark: ImageVector? = null
