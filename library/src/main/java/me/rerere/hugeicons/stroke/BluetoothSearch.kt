package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BluetoothSearch: ImageVector
    get() {
        if (_bluetoothSearch != null) {
            return _bluetoothSearch!!
        }
        _bluetoothSearch = ImageVector.Builder(
            name = "BluetoothSearch",
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
        moveTo(8.77349f, 11.5f)
        curveTo(8.8749f, 7.08726f, 8.48911f, 3.78672f, 9.15201f, 3.18692f)
        curveTo(9.21537f, 3.12959f, 9.28932f, 3.08325f, 9.36678f, 3.04779f)
        curveTo(10.2369f, 2.64938f, 12.688f, 4.83294f, 14.2923f, 6.22156f)
        curveTo(14.5558f, 6.44968f, 14.5742f, 6.85339f, 14.3152f, 7.08672f)
        curveTo(13.1694f, 8.11876f, 10.8318f, 9.95773f, 8.77349f, 11.5f)
        moveTo(8.77349f, 11.5f)
        lineTo(2.51051f, 16.2903f)
        moveTo(8.77349f, 11.5f)
        curveTo(8.8749f, 15.9127f, 8.48911f, 19.2133f, 9.15201f, 19.8131f)
        curveTo(9.21537f, 19.8704f, 9.28942f, 19.9168f, 9.36688f, 19.9523f)
        curveTo(9.74875f, 20.127f, 10.435f, 19.8046f, 11.2205f, 19.2705f)
        moveTo(2.5f, 6.72564f)
        lineTo(11.4146f, 13.5528f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.6322f, 19.1589f)
        lineTo(21.5f, 21f)
        moveTo(20.7074f, 16.5964f)
        curveTo(20.7074f, 18.5826f, 19.094f, 20.1928f, 17.1037f, 20.1928f)
        curveTo(15.1134f, 20.1928f, 13.5f, 18.5826f, 13.5f, 16.5964f)
        curveTo(13.5f, 14.6102f, 15.1134f, 13f, 17.1037f, 13f)
        curveTo(19.094f, 13f, 20.7074f, 14.6102f, 20.7074f, 16.5964f)
        }
        }.build()

        return _bluetoothSearch!!
    }

private var _bluetoothSearch: ImageVector? = null
