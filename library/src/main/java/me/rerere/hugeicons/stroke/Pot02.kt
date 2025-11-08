package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Pot02: ImageVector
    get() {
        if (_pot02 != null) {
            return _pot02!!
        }
        _pot02 = ImageVector.Builder(
            name = "Pot02",
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
        moveTo(2f, 10f)
        horizontalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 10f)
        lineTo(4.50393f, 15.5432f)
        curveTo(4.73952f, 18.1348f, 4.85732f, 19.4305f, 5.71663f, 20.2153f)
        curveTo(6.57594f, 21f, 7.87705f, 21f, 10.4793f, 21f)
        horizontalLineTo(13.5207f)
        curveTo(16.1229f, 21f, 17.4241f, 21f, 18.2834f, 20.2153f)
        curveTo(19.1427f, 19.4305f, 19.2605f, 18.1348f, 19.4961f, 15.5432f)
        lineTo(20f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 8f)
        lineTo(9f, 6.64955f)
        moveTo(9f, 6.64955f)
        lineTo(15f, 5.02901f)
        moveTo(9f, 6.64955f)
        lineTo(9.20561f, 4.9118f)
        curveTo(9.28082f, 4.27624f, 9.73232f, 3.75086f, 10.3457f, 3.5852f)
        lineTo(12.3146f, 3.05342f)
        curveTo(12.9279f, 2.88776f, 13.5796f, 3.11519f, 13.9599f, 3.62771f)
        lineTo(15f, 5.02901f)
        moveTo(15f, 5.02901f)
        lineTo(20f, 3.67856f)
        }
        }.build()

        return _pot02!!
    }

private var _pot02: ImageVector? = null
