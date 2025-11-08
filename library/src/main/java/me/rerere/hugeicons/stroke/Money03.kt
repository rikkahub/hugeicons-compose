package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Money03: ImageVector
    get() {
        if (_money03 != null) {
            return _money03!!
        }
        _money03 = ImageVector.Builder(
            name = "Money03",
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
        moveTo(14.4998f, 12.001f)
        curveTo(14.4998f, 13.3817f, 13.3805f, 14.501f, 11.9998f, 14.501f)
        curveTo(10.6191f, 14.501f, 9.49982f, 13.3817f, 9.49982f, 12.001f)
        curveTo(9.49982f, 10.6203f, 10.6191f, 9.50098f, 11.9998f, 9.50098f)
        curveTo(13.3805f, 9.50098f, 14.4998f, 10.6203f, 14.4998f, 12.001f)
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

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 9.00098f)
        curveTo(3.95133f, 9.00098f, 5.70483f, 7.40605f, 5.92901f, 5.75514f)
        moveTo(18.5005f, 5.50098f)
        curveTo(18.5005f, 7.54062f, 20.2655f, 9.46997f, 22f, 9.46997f)
        moveTo(22f, 15.001f)
        curveTo(20.1009f, 15.001f, 18.2601f, 16.3112f, 18.102f, 18.0993f)
        moveTo(6.00049f, 18.4971f)
        curveTo(6.00049f, 16.2879f, 4.20963f, 14.4971f, 2.00049f, 14.4971f)
        }
        }.build()

        return _money03!!
    }

private var _money03: ImageVector? = null
