package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.RssConnected01: ImageVector
    get() {
        if (_rssConnected01 != null) {
            return _rssConnected01!!
        }
        _rssConnected01 = ImageVector.Builder(
            name = "RssConnected01",
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
        moveTo(12.9915f, 21f)
        curveTo(13.7121f, 21f, 13.9925f, 20.9956f, 13.9925f, 20.9956f)
        curveTo(17.4088f, 20.971f, 19.2922f, 20.8099f, 20.5342f, 19.7552f)
        curveTo(22f, 18.5104f, 22f, 16.5069f, 22f, 12.5f)
        curveTo(22f, 11.1094f, 22f, 9.96004f, 21.9387f, 9f)
        moveTo(11.9906f, 4f)
        curveTo(7.27213f, 4f, 4.91289f, 4f, 3.44705f, 5.2448f)
        curveTo(2.32426f, 6.19827f, 2.0615f, 7.59687f, 2f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 7f)
        curveTo(14f, 7f, 15f, 7f, 16f, 9f)
        curveTo(16f, 9f, 19.1765f, 4f, 22f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.98242f, 20f)
        horizontalLineTo(2.9914f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 16.2349f)
        curveTo(4.49328f, 16.2349f, 6.77053f, 18.5f, 6.77053f, 20.9996f)
        moveTo(10f, 20.9996f)
        curveTo(10f, 16.5f, 5.99511f, 13f, 2.04522f, 13f)
        }
        }.build()

        return _rssConnected01!!
    }

private var _rssConnected01: ImageVector? = null
