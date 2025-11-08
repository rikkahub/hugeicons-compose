package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BitcoinStore: ImageVector
    get() {
        if (_bitcoinStore != null) {
            return _bitcoinStore!!
        }
        _bitcoinStore = ImageVector.Builder(
            name = "BitcoinStore",
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
        moveTo(6.26565f, 2f)
        horizontalLineTo(17.7343f)
        curveTo(18.3949f, 2.00003f, 19.4903f, 2.09768f, 19.8625f, 3.15228f)
        curveTo(20.084f, 3.78008f, 19.9965f, 4.48455f, 20.2378f, 5.105f)
        curveTo(20.4912f, 5.75665f, 20.8888f, 6.38647f, 21.2743f, 6.954f)
        curveTo(21.6564f, 7.51649f, 22.0964f, 8.12339f, 21.9814f, 8.79383f)
        curveTo(21.8516f, 9.54978f, 21.2457f, 10.2614f, 20.4449f, 10.6395f)
        curveTo(18.8055f, 11.4134f, 16.3808f, 10.9467f, 15.9953f, 8.14559f)
        curveTo(15.6715f, 9.04026f, 14.6798f, 10.9467f, 11.9606f, 10.9467f)
        curveTo(9.24145f, 10.9467f, 8.32846f, 9.04026f, 8.00472f, 8.14559f)
        curveTo(7.61921f, 10.9467f, 5.19448f, 11.4134f, 3.55511f, 10.6395f)
        curveTo(2.75431f, 10.2614f, 2.14841f, 9.54978f, 2.01864f, 8.79383f)
        curveTo(1.90356f, 8.12339f, 2.34357f, 7.51649f, 2.72568f, 6.954f)
        curveTo(3.11122f, 6.38647f, 3.50878f, 5.75665f, 3.76223f, 5.105f)
        curveTo(4.00354f, 4.48455f, 3.91599f, 3.78008f, 4.13753f, 3.15228f)
        curveTo(4.50968f, 2.09768f, 5.60507f, 2.00003f, 6.26565f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.9628f, 20.6646f)
        verticalLineTo(15.3227f)
        moveTo(18.5259f, 15.3227f)
        verticalLineTo(13.9873f)
        moveTo(18.5259f, 22f)
        verticalLineTo(20.6646f)
        moveTo(16.9628f, 17.9937f)
        horizontalLineTo(20.089f)
        moveTo(20.089f, 17.9937f)
        curveTo(20.607f, 17.9937f, 21.0268f, 18.4421f, 21.0268f, 18.9953f)
        verticalLineTo(19.663f)
        curveTo(21.0268f, 20.2162f, 20.607f, 20.6646f, 20.089f, 20.6646f)
        horizontalLineTo(16.0249f)
        moveTo(20.089f, 17.9937f)
        curveTo(20.607f, 17.9937f, 21.0268f, 17.5452f, 21.0268f, 16.9921f)
        verticalLineTo(16.3243f)
        curveTo(21.0268f, 15.7711f, 20.607f, 15.3227f, 20.089f, 15.3227f)
        horizontalLineTo(16.0249f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.02002f, 10.4814f)
        verticalLineTo(14.9886f)
        curveTo(3.02002f, 17.8215f, 3.02002f, 19.2379f, 3.89903f, 20.118f)
        curveTo(4.77805f, 20.9981f, 6.1928f, 20.9981f, 9.02231f, 20.9981f)
        horizontalLineTo(13.0238f)
        }
        }.build()

        return _bitcoinStore!!
    }

private var _bitcoinStore: ImageVector? = null
