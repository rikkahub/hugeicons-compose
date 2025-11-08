package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BitcoinInvoice: ImageVector
    get() {
        if (_bitcoinInvoice != null) {
            return _bitcoinInvoice!!
        }
        _bitcoinInvoice = ImageVector.Builder(
            name = "BitcoinInvoice",
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
        moveTo(20.016f, 2f)
        curveTo(18.9026f, 2f, 18f, 4.68629f, 18f, 8f)
        horizontalLineTo(20.016f)
        curveTo(20.9876f, 8f, 21.4734f, 8f, 21.7741f, 7.66455f)
        curveTo(22.0749f, 7.32909f, 22.0225f, 6.88733f, 21.9178f, 6.00381f)
        curveTo(21.6414f, 3.67143f, 20.8943f, 2f, 20.016f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 8.05426f)
        verticalLineTo(18.6458f)
        curveTo(18f, 20.1575f, 18f, 20.9133f, 17.538f, 21.2108f)
        curveTo(16.7831f, 21.6971f, 15.6161f, 20.6774f, 15.0291f, 20.3073f)
        curveTo(14.5441f, 20.0014f, 14.3017f, 19.8485f, 14.0325f, 19.8397f)
        curveTo(13.7417f, 19.8301f, 13.4949f, 19.9768f, 12.9709f, 20.3073f)
        lineTo(11.06f, 21.5124f)
        curveTo(10.5445f, 21.8374f, 10.2868f, 22f, 10f, 22f)
        curveTo(9.71321f, 22f, 9.45546f, 21.8374f, 8.94f, 21.5124f)
        lineTo(7.02913f, 20.3073f)
        curveTo(6.54415f, 20.0014f, 6.30166f, 19.8485f, 6.03253f, 19.8397f)
        curveTo(5.74172f, 19.8301f, 5.49493f, 19.9768f, 4.97087f, 20.3073f)
        curveTo(4.38395f, 20.6774f, 3.21687f, 21.6971f, 2.46195f, 21.2108f)
        curveTo(2f, 20.9133f, 2f, 20.1575f, 2f, 18.6458f)
        verticalLineTo(8.05426f)
        curveTo(2f, 5.20025f, 2f, 3.77325f, 2.87868f, 2.88663f)
        curveTo(3.75736f, 2f, 5.17157f, 2f, 8f, 2f)
        horizontalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.125f, 13.5f)
        lineTo(8.125f, 7.5f)
        moveTo(10f, 7.5f)
        verticalLineTo(6f)
        moveTo(10f, 15f)
        verticalLineTo(13.5f)
        moveTo(8.125f, 10.5f)
        horizontalLineTo(11.875f)
        moveTo(11.875f, 10.5f)
        curveTo(12.4963f, 10.5f, 13f, 11.0037f, 13f, 11.625f)
        verticalLineTo(12.375f)
        curveTo(13f, 12.9963f, 12.4963f, 13.5f, 11.875f, 13.5f)
        horizontalLineTo(7f)
        moveTo(11.875f, 10.5f)
        curveTo(12.4963f, 10.5f, 13f, 9.99632f, 13f, 9.375f)
        verticalLineTo(8.625f)
        curveTo(13f, 8.00368f, 12.4963f, 7.5f, 11.875f, 7.5f)
        horizontalLineTo(7f)
        }
        }.build()

        return _bitcoinInvoice!!
    }

private var _bitcoinInvoice: ImageVector? = null
