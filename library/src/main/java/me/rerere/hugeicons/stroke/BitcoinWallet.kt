package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BitcoinWallet: ImageVector
    get() {
        if (_bitcoinWallet != null) {
            return _bitcoinWallet!!
        }
        _bitcoinWallet = ImageVector.Builder(
            name = "BitcoinWallet",
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
        moveTo(16f, 13f)
        curveTo(16f, 13.8284f, 16.6716f, 14.5f, 17.5f, 14.5f)
        curveTo(18.3284f, 14.5f, 19f, 13.8284f, 19f, 13f)
        curveTo(19f, 12.1716f, 18.3284f, 11.5f, 17.5f, 11.5f)
        curveTo(16.6716f, 11.5f, 16f, 12.1716f, 16f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 19f)
        horizontalLineTo(16f)
        curveTo(18.8284f, 19f, 20.2426f, 19f, 21.1213f, 18.1213f)
        curveTo(22f, 17.2426f, 22f, 15.8284f, 22f, 13f)
        verticalLineTo(12f)
        curveTo(22f, 9.17157f, 22f, 7.75736f, 21.1213f, 6.87868f)
        curveTo(20.48f, 6.23738f, 19.5534f, 6.06413f, 18f, 6.01732f)
        moveTo(10f, 6f)
        horizontalLineTo(16f)
        curveTo(16.7641f, 6f, 17.425f, 6f, 18f, 6.01732f)
        moveTo(2f, 10f)
        curveTo(2f, 6.22876f, 2f, 5.34315f, 3.17157f, 4.17157f)
        curveTo(4.34315f, 3f, 6.22876f, 3f, 10f, 3f)
        horizontalLineTo(14.9827f)
        curveTo(15.9308f, 3f, 16.4049f, 3f, 16.7779f, 3.15749f)
        curveTo(17.2579f, 3.36014f, 17.6399f, 3.7421f, 17.8425f, 4.22208f)
        curveTo(18f, 4.5951f, 18f, 5.06917f, 18f, 6.01732f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.125f, 19.5f)
        lineTo(3.125f, 13.5f)
        moveTo(5f, 13.5f)
        verticalLineTo(12f)
        moveTo(5f, 21f)
        verticalLineTo(19.5f)
        moveTo(3.125f, 16.5f)
        horizontalLineTo(6.875f)
        moveTo(6.875f, 16.5f)
        curveTo(7.49632f, 16.5f, 8f, 17.0037f, 8f, 17.625f)
        verticalLineTo(18.375f)
        curveTo(8f, 18.9963f, 7.49632f, 19.5f, 6.875f, 19.5f)
        horizontalLineTo(2f)
        moveTo(6.875f, 16.5f)
        curveTo(7.49632f, 16.5f, 8f, 15.9963f, 8f, 15.375f)
        verticalLineTo(14.625f)
        curveTo(8f, 14.0037f, 7.49632f, 13.5f, 6.875f, 13.5f)
        horizontalLineTo(2f)
        }
        }.build()

        return _bitcoinWallet!!
    }

private var _bitcoinWallet: ImageVector? = null
