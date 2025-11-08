package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BitcoinFilter: ImageVector
    get() {
        if (_bitcoinFilter != null) {
            return _bitcoinFilter!!
        }
        _bitcoinFilter = ImageVector.Builder(
            name = "BitcoinFilter",
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
        moveTo(6.23433f, 7f)
        curveTo(4.60404f, 7f, 3.7889f, 7f, 3.32795f, 7.49503f)
        curveTo(2.86701f, 7.99006f, 2.96811f, 8.7569f, 3.17033f, 10.2906f)
        curveTo(3.22938f, 10.7385f, 3.3276f, 10.9928f, 3.62734f, 11.3402f)
        curveTo(4.59564f, 12.4627f, 6.36901f, 14.4592f, 8.85746f, 16.2744f)
        curveTo(9.08486f, 16.4402f, 9.23409f, 16.7113f, 9.25927f, 17.0112f)
        curveTo(9.34268f, 18.0054f, 9.42401f, 18.9059f, 9.5007f, 19.71f)
        curveTo(9.62524f, 21.0158f, 9.68751f, 21.6687f, 10.1633f, 21.9159f)
        curveTo(10.639f, 22.163f, 11.2333f, 21.8467f, 12.4219f, 21.2141f)
        lineTo(13.4884f, 20.6465f)
        curveTo(13.9287f, 20.4122f, 14.1489f, 20.295f, 14.2852f, 20.0974f)
        curveTo(14.4216f, 19.8998f, 14.4494f, 19.6615f, 14.5051f, 19.1851f)
        curveTo(14.577f, 18.5699f, 14.6529f, 17.8503f, 14.7307f, 17.0112f)
        curveTo(14.7583f, 16.714f, 14.907f, 16.446f, 15.1326f, 16.2816f)
        curveTo(17.6261f, 14.4642f, 19.403f, 12.4641f, 20.3726f, 11.3402f)
        curveTo(20.6724f, 10.9928f, 20.7706f, 10.7385f, 20.8297f, 10.2906f)
        curveTo(21.0319f, 8.7569f, 21.133f, 7.99006f, 20.672f, 7.49503f)
        curveTo(20.2111f, 7f, 19.396f, 7f, 17.7657f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.625f, 9.5f)
        lineTo(9.625f, 3.5f)
        moveTo(11.5f, 3.5f)
        verticalLineTo(2f)
        moveTo(11.5f, 11f)
        verticalLineTo(9.5f)
        moveTo(9.625f, 6.5f)
        horizontalLineTo(13.375f)
        moveTo(13.375f, 6.5f)
        curveTo(13.9963f, 6.5f, 14.5f, 7.00368f, 14.5f, 7.625f)
        verticalLineTo(8.375f)
        curveTo(14.5f, 8.99632f, 13.9963f, 9.5f, 13.375f, 9.5f)
        horizontalLineTo(8.5f)
        moveTo(13.375f, 6.5f)
        curveTo(13.9963f, 6.5f, 14.5f, 5.99632f, 14.5f, 5.375f)
        verticalLineTo(4.625f)
        curveTo(14.5f, 4.00368f, 13.9963f, 3.5f, 13.375f, 3.5f)
        horizontalLineTo(8.5f)
        }
        }.build()

        return _bitcoinFilter!!
    }

private var _bitcoinFilter: ImageVector? = null
