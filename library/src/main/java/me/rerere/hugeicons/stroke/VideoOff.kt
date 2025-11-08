package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.VideoOff: ImageVector
    get() {
        if (_videoOff != null) {
            return _videoOff!!
        }
        _videoOff = ImageVector.Builder(
            name = "VideoOff",
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
        moveTo(2.00189f, 1.99988f)
        lineTo(21.9772f, 21.9999f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.8516f, 16.8677f)
        curveTo(16.7224f, 17.8061f, 16.4665f, 18.4668f, 15.9595f, 18.9744f)
        curveTo(14.9356f, 19.9996f, 13.2877f, 19.9996f, 9.992f, 19.9996f)
        horizontalLineTo(8.99323f)
        curveTo(5.69749f, 19.9996f, 4.04961f, 19.9996f, 3.02575f, 18.9744f)
        curveTo(2.00189f, 17.9493f, 2.00189f, 16.2994f, 2.00189f, 12.9996f)
        verticalLineTo(10.9996f)
        curveTo(2.00189f, 7.69971f, 2.00189f, 6.04979f, 3.02575f, 5.02466f)
        curveTo(3.36827f, 4.68172f, 3.78062f, 4.45351f, 4.30114f, 4.30164f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.23627f, 4.0004f)
        curveTo(8.47815f, 3.99988f, 8.72995f, 3.99988f, 8.99217f, 3.99988f)
        horizontalLineTo(9.99093f)
        curveTo(13.2867f, 3.99988f, 14.9346f, 3.99988f, 15.9584f, 5.02501f)
        curveTo(16.9822f, 6.05013f, 16.9822f, 7.70005f, 16.9822f, 10.9999f)
        verticalLineTo(12.7573f)
        moveTo(16.9822f, 9.2313f)
        lineTo(19.3018f, 7.52901f)
        curveTo(20.7729f, 6.54061f, 21.4489f, 7.17184f, 21.6674f, 7.64835f)
        curveTo(22.1191f, 8.92801f, 21.9768f, 11.3935f, 21.9768f, 14.5416f)
        curveTo(21.8703f, 16.5549f, 21.5952f, 16.7718f, 21.3137f, 16.9938f)
        lineTo(21.3107f, 16.9961f)
        }
        }.build()

        return _videoOff!!
    }

private var _videoOff: ImageVector? = null
