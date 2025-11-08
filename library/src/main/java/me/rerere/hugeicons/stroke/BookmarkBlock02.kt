package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BookmarkBlock02: ImageVector
    get() {
        if (_bookmarkBlock02 != null) {
            return _bookmarkBlock02!!
        }
        _bookmarkBlock02 = ImageVector.Builder(
            name = "BookmarkBlock02",
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
        moveTo(19f, 12.5f)
        verticalLineTo(17.9808f)
        curveTo(19f, 20.2867f, 19f, 21.4396f, 18.2272f, 21.8523f)
        curveTo(16.7305f, 22.6515f, 13.9232f, 19.9852f, 12.59f, 19.1824f)
        curveTo(11.8168f, 18.7168f, 11.4302f, 18.484f, 11f, 18.484f)
        curveTo(10.5698f, 18.484f, 10.1832f, 18.7168f, 9.41f, 19.1824f)
        curveTo(8.0768f, 19.9852f, 5.26947f, 22.6515f, 3.77285f, 21.8523f)
        curveTo(3f, 21.4396f, 3f, 20.2867f, 3f, 17.9808f)
        verticalLineTo(9.70753f)
        curveTo(3f, 6.07417f, 3f, 4.25749f, 4.17157f, 3.12875f)
        curveTo(5.23467f, 2.10452f, 6.8857f, 2.00968f, 10f, 2.0009f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.2f, 3.2f)
        lineTo(18.8f, 8.8f)
        moveTo(20f, 6f)
        curveTo(20f, 3.79086f, 18.2091f, 2f, 16f, 2f)
        curveTo(13.7909f, 2f, 12f, 3.79086f, 12f, 6f)
        curveTo(12f, 8.20914f, 13.7909f, 10f, 16f, 10f)
        curveTo(18.2091f, 10f, 20f, 8.20914f, 20f, 6f)
        }
        }.build()

        return _bookmarkBlock02!!
    }

private var _bookmarkBlock02: ImageVector? = null
