package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BitcoinShopping: ImageVector
    get() {
        if (_bitcoinShopping != null) {
            return _bitcoinShopping!!
        }
        _bitcoinShopping = ImageVector.Builder(
            name = "BitcoinShopping",
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
        moveTo(4.30064f, 17.1912f)
        lineTo(3.16042f, 10.2591f)
        curveTo(2.98802f, 9.21103f, 2.90182f, 8.68698f, 3.17785f, 8.34349f)
        curveTo(3.45388f, 8f, 3.96121f, 8f, 4.97587f, 8f)
        horizontalLineTo(19.0241f)
        curveTo(20.0388f, 8f, 20.5461f, 8f, 20.8221f, 8.34349f)
        curveTo(21.0982f, 8.68698f, 21.012f, 9.21103f, 20.8396f, 10.2591f)
        lineTo(19.6994f, 17.1912f)
        curveTo(19.3214f, 19.4888f, 19.1325f, 20.6376f, 18.361f, 21.3188f)
        curveTo(17.5894f, 22f, 16.4773f, 22f, 14.253f, 22f)
        horizontalLineTo(9.74699f)
        curveTo(7.5227f, 22f, 6.41055f, 22f, 5.63904f, 21.3188f)
        curveTo(4.86752f, 20.6376f, 4.67856f, 19.4888f, 4.30064f, 17.1912f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.4375f, 17.6667f)
        lineTo(10.4375f, 12.3333f)
        moveTo(12f, 12.3333f)
        verticalLineTo(11f)
        moveTo(12f, 19f)
        verticalLineTo(17.6667f)
        moveTo(10.4375f, 15f)
        horizontalLineTo(13.5625f)
        moveTo(13.5625f, 15f)
        curveTo(14.0803f, 15f, 14.5f, 15.4477f, 14.5f, 16f)
        verticalLineTo(16.6667f)
        curveTo(14.5f, 17.219f, 14.0803f, 17.6667f, 13.5625f, 17.6667f)
        horizontalLineTo(9.5f)
        moveTo(13.5625f, 15f)
        curveTo(14.0803f, 15f, 14.5f, 14.5523f, 14.5f, 14f)
        verticalLineTo(13.3333f)
        curveTo(14.5f, 12.781f, 14.0803f, 12.3333f, 13.5625f, 12.3333f)
        horizontalLineTo(9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 8f)
        curveTo(17f, 4.68629f, 15.5f, 2f, 12f, 2f)
        curveTo(8.5f, 2f, 7f, 4.68629f, 7f, 8f)
        }
        }.build()

        return _bitcoinShopping!!
    }

private var _bitcoinShopping: ImageVector? = null
