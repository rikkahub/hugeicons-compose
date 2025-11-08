package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MouseLeftClick02: ImageVector
    get() {
        if (_mouseLeftClick02 != null) {
            return _mouseLeftClick02!!
        }
        _mouseLeftClick02 = ImageVector.Builder(
            name = "MouseLeftClick02",
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
        moveTo(10f, 2.09084f)
        curveTo(10.6655f, 2.02383f, 11.3389f, 2f, 12f, 2f)
        curveTo(12.9247f, 2f, 13.8373f, 2.07762f, 14.7349f, 2.1882f)
        curveTo(17.1758f, 2.48893f, 19.0694f, 4.51965f, 19.2593f, 6.91118f)
        curveTo(19.3909f, 8.56832f, 19.5f, 10.268f, 19.5f, 12f)
        curveTo(19.5f, 13.732f, 19.3909f, 15.4317f, 19.2593f, 17.0888f)
        curveTo(19.0694f, 19.4803f, 17.1758f, 21.511f, 14.7349f, 21.8118f)
        curveTo(13.8373f, 21.9223f, 12.9247f, 22f, 12f, 22f)
        curveTo(11.0752f, 22f, 10.1626f, 21.9223f, 9.26502f, 21.8118f)
        curveTo(6.82417f, 21.511f, 4.93047f, 19.4803f, 4.74061f, 17.0888f)
        curveTo(4.60903f, 15.4317f, 4.5f, 13.732f, 4.5f, 12f)
        curveTo(4.5f, 11.3283f, 4.5164f, 10.6614f, 4.54415f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 2f)
        lineTo(12f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 11f)
        horizontalLineTo(19f)
        }
        }.build()

        return _mouseLeftClick02!!
    }

private var _mouseLeftClick02: ImageVector? = null
