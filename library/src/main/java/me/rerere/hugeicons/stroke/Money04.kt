package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Money04: ImageVector
    get() {
        if (_money04 != null) {
            return _money04!!
        }
        _money04 = ImageVector.Builder(
            name = "Money04",
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
        moveTo(14.5f, 12.001f)
        curveTo(14.5f, 13.3817f, 13.3807f, 14.501f, 12f, 14.501f)
        curveTo(10.6193f, 14.501f, 9.5f, 13.3817f, 9.5f, 12.001f)
        curveTo(9.5f, 10.6203f, 10.6193f, 9.50098f, 12f, 9.50098f)
        curveTo(13.3807f, 9.50098f, 14.5f, 10.6203f, 14.5f, 12.001f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.5f, 11.49f)
        verticalLineTo(11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.5f, 12.49f)
        verticalLineTo(12.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 5.00098f)
        curveTo(18.4794f, 5.00098f, 20.1903f, 5.38518f, 21.1329f, 5.6773f)
        curveTo(21.6756f, 5.84549f, 22f, 6.35987f, 22f, 6.92803f)
        verticalLineTo(16.6833f)
        curveTo(22f, 17.7984f, 20.7719f, 18.6374f, 19.6762f, 18.4305f)
        curveTo(18.7361f, 18.253f, 17.5107f, 18.1104f, 16f, 18.1104f)
        curveTo(11.2491f, 18.1104f, 10.1096f, 19.9161f, 3.1448f, 18.3802f)
        curveTo(2.47265f, 18.232f, 2f, 17.6275f, 2f, 16.9392f)
        verticalLineTo(6.92214f)
        curveTo(2f, 5.94628f, 2.92079f, 5.23464f, 3.87798f, 5.42458f)
        curveTo(10.1967f, 6.67844f, 11.4209f, 5.00098f, 16f, 5.00098f)
        }
        }.build()

        return _money04!!
    }

private var _money04: ImageVector? = null
