package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BitcoinTag: ImageVector
    get() {
        if (_bitcoinTag != null) {
            return _bitcoinTag!!
        }
        _bitcoinTag = ImageVector.Builder(
            name = "BitcoinTag",
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
        moveTo(17.5f, 5f)
        curveTo(18.3284f, 5f, 19f, 5.67157f, 19f, 6.5f)
        curveTo(19f, 7.32843f, 18.3284f, 8f, 17.5f, 8f)
        curveTo(16.6716f, 8f, 16f, 7.32843f, 16f, 6.5f)
        curveTo(16f, 5.67157f, 16.6716f, 5f, 17.5f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.77424f, 11.1439f)
        curveTo(1.77109f, 12.2643f, 1.74951f, 13.9546f, 2.67017f, 15.1437f)
        curveTo(4.49712f, 17.5033f, 6.49675f, 19.5029f, 8.85634f, 21.3298f)
        curveTo(10.0454f, 22.2505f, 11.7357f, 22.2289f, 12.8561f, 21.2258f)
        curveTo(15.8979f, 18.5022f, 18.6835f, 15.6559f, 21.3719f, 12.5279f)
        curveTo(21.6377f, 12.2187f, 21.8039f, 11.8397f, 21.8412f, 11.4336f)
        curveTo(22.0062f, 9.63798f, 22.3452f, 4.46467f, 20.9403f, 3.05974f)
        curveTo(19.5353f, 1.65481f, 14.362f, 1.99377f, 12.5664f, 2.15876f)
        curveTo(12.1603f, 2.19608f, 11.7813f, 2.36233f, 11.472f, 2.62811f)
        curveTo(8.34413f, 5.31646f, 5.49782f, 8.10211f, 2.77424f, 11.1439f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.89552f, 13.4478f)
        lineTo(11.7165f, 9.62684f)
        moveTo(12.8358f, 10.7462f)
        lineTo(13.791f, 9.79104f)
        moveTo(8.05972f, 15.5224f)
        lineTo(9.01492f, 14.5672f)
        moveTo(9.80599f, 11.5373f)
        lineTo(12.0448f, 13.7761f)
        moveTo(12.0448f, 13.7761f)
        curveTo(12.4157f, 14.1471f, 12.3957f, 14.7685f, 12f, 15.1642f)
        lineTo(11.5224f, 15.6418f)
        curveTo(11.1267f, 16.0375f, 10.5053f, 16.0575f, 10.1343f, 15.6866f)
        lineTo(7.22388f, 12.7761f)
        moveTo(12.0448f, 13.7761f)
        curveTo(12.4157f, 14.1471f, 13.0372f, 14.127f, 13.4328f, 13.7313f)
        lineTo(13.9105f, 13.2537f)
        curveTo(14.3061f, 12.858f, 14.3262f, 12.2366f, 13.9552f, 11.8656f)
        lineTo(11.0448f, 8.9552f)
        }
        }.build()

        return _bitcoinTag!!
    }

private var _bitcoinTag: ImageVector? = null
