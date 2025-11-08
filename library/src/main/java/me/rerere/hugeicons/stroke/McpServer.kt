package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.McpServer: ImageVector
    get() {
        if (_mcpServer != null) {
            return _mcpServer!!
        }
        _mcpServer = ImageVector.Builder(
            name = "McpServer",
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
        moveTo(3.49994f, 11.7501f)
        lineTo(11.6717f, 3.57855f)
        curveTo(12.7762f, 2.47398f, 14.5672f, 2.47398f, 15.6717f, 3.57855f)
        curveTo(16.7762f, 4.68312f, 16.7762f, 6.47398f, 15.6717f, 7.57855f)
        moveTo(15.6717f, 7.57855f)
        lineTo(9.49994f, 13.7501f)
        moveTo(15.6717f, 7.57855f)
        curveTo(16.7762f, 6.47398f, 18.5672f, 6.47398f, 19.6717f, 7.57855f)
        curveTo(20.7762f, 8.68312f, 20.7762f, 10.474f, 19.6717f, 11.5785f)
        lineTo(12.7072f, 18.543f)
        curveTo(12.3167f, 18.9335f, 12.3167f, 19.5667f, 12.7072f, 19.9572f)
        lineTo(13.9999f, 21.2499f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.4999f, 9.74921f)
        lineTo(11.3282f, 15.921f)
        curveTo(10.2237f, 17.0255f, 8.43272f, 17.0255f, 7.32823f, 15.921f)
        curveTo(6.22373f, 14.8164f, 6.22373f, 13.0255f, 7.32823f, 11.921f)
        lineTo(13.4999f, 5.74939f)
        }
        }.build()

        return _mcpServer!!
    }

private var _mcpServer: ImageVector? = null
