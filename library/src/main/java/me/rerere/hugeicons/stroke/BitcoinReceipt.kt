package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BitcoinReceipt: ImageVector
    get() {
        if (_bitcoinReceipt != null) {
            return _bitcoinReceipt!!
        }
        _bitcoinReceipt = ImageVector.Builder(
            name = "BitcoinReceipt",
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
        moveTo(10.125f, 13.5f)
        lineTo(10.125f, 7.5f)
        moveTo(12f, 7.5f)
        verticalLineTo(6f)
        moveTo(12f, 15f)
        verticalLineTo(13.5f)
        moveTo(10.125f, 10.5f)
        horizontalLineTo(13.875f)
        moveTo(13.875f, 10.5f)
        curveTo(14.4963f, 10.5f, 15f, 11.0037f, 15f, 11.625f)
        verticalLineTo(12.375f)
        curveTo(15f, 12.9963f, 14.4963f, 13.5f, 13.875f, 13.5f)
        horizontalLineTo(9f)
        moveTo(13.875f, 10.5f)
        curveTo(14.4963f, 10.5f, 15f, 9.99632f, 15f, 9.375f)
        verticalLineTo(8.625f)
        curveTo(15f, 8.00368f, 14.4963f, 7.5f, 13.875f, 7.5f)
        horizontalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.94f, 21.5124f)
        lineTo(9.02913f, 20.3073f)
        curveTo(8.54415f, 20.0014f, 8.30166f, 19.8485f, 8.03253f, 19.8397f)
        curveTo(7.74172f, 19.8301f, 7.49493f, 19.9768f, 6.97087f, 20.3073f)
        curveTo(6.38395f, 20.6774f, 5.21687f, 21.6971f, 4.46195f, 21.2108f)
        curveTo(4f, 20.9133f, 4f, 20.1575f, 4f, 18.6458f)
        verticalLineTo(8.00002f)
        curveTo(4f, 5.17158f, 4f, 3.75736f, 4.82699f, 2.87868f)
        curveTo(5.65399f, 2f, 6.98501f, 2f, 9.64706f, 2f)
        horizontalLineTo(14.3529f)
        curveTo(17.015f, 2f, 18.346f, 2f, 19.173f, 2.87868f)
        curveTo(20f, 3.75736f, 20f, 5.17158f, 20f, 8.00002f)
        verticalLineTo(18.6458f)
        curveTo(20f, 20.1575f, 20f, 20.9133f, 19.538f, 21.2108f)
        curveTo(18.7831f, 21.6971f, 17.6161f, 20.6774f, 17.0291f, 20.3073f)
        curveTo(16.5441f, 20.0014f, 16.3017f, 19.8485f, 16.0325f, 19.8397f)
        curveTo(15.7417f, 19.8301f, 15.4949f, 19.9768f, 14.9709f, 20.3073f)
        lineTo(13.06f, 21.5124f)
        curveTo(12.5445f, 21.8374f, 12.2868f, 22f, 12f, 22f)
        curveTo(11.7132f, 22f, 11.4554f, 21.8374f, 10.94f, 21.5124f)
        }
        }.build()

        return _bitcoinReceipt!!
    }

private var _bitcoinReceipt: ImageVector? = null
