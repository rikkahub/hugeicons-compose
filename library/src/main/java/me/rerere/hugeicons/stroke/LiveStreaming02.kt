package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LiveStreaming02: ImageVector
    get() {
        if (_liveStreaming02 != null) {
            return _liveStreaming02!!
        }
        _liveStreaming02 = ImageVector.Builder(
            name = "LiveStreaming02",
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
        moveTo(7.5f, 8f)
        curveTo(6.5f, 9f, 6f, 10.5f, 6f, 12f)
        curveTo(6f, 13.5f, 6.5f, 15f, 7.5f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.5f, 6f)
        curveTo(3f, 7.5f, 2f, 9.5f, 2f, 12f)
        curveTo(2f, 14.5f, 3f, 16.5f, 4.5f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.5f, 16f)
        curveTo(17.5f, 15f, 18f, 13.5f, 18f, 12f)
        curveTo(18f, 10.5f, 17.5f, 9f, 16.5f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.5f, 18f)
        curveTo(21f, 16.5f, 22f, 14.5f, 22f, 12f)
        curveTo(22f, 9.5f, 21f, 7.5f, 19.5f, 6f)
        }
        }.build()

        return _liveStreaming02!!
    }

private var _liveStreaming02: ImageVector? = null
