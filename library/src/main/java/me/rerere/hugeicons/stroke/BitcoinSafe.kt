package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BitcoinSafe: ImageVector
    get() {
        if (_bitcoinSafe != null) {
            return _bitcoinSafe!!
        }
        _bitcoinSafe = ImageVector.Builder(
            name = "BitcoinSafe",
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
        moveTo(11f, 2f)
        horizontalLineTo(13f)
        curveTo(17.2426f, 2f, 19.364f, 2f, 20.682f, 3.31802f)
        curveTo(22f, 4.63604f, 22f, 6.75736f, 22f, 11f)
        curveTo(22f, 15.2426f, 22f, 17.364f, 20.682f, 18.682f)
        curveTo(19.364f, 20f, 17.2426f, 20f, 13f, 20f)
        horizontalLineTo(11f)
        curveTo(6.75736f, 20f, 4.63604f, 20f, 3.31802f, 18.682f)
        curveTo(2f, 17.364f, 2f, 15.2426f, 2f, 11f)
        curveTo(2f, 6.75736f, 2f, 4.63604f, 3.31802f, 3.31802f)
        curveTo(4.63604f, 2f, 6.75736f, 2f, 11f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 15f)
        curveTo(6f, 14.4692f, 6f, 13.6148f, 6f, 11.9062f)
        verticalLineTo(10.0938f)
        curveTo(6f, 8.38516f, 6f, 7.53082f, 7f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 22f)
        verticalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 22f)
        verticalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.9375f, 13.6667f)
        lineTo(12.9375f, 8.33333f)
        moveTo(14.5f, 8.33333f)
        verticalLineTo(7f)
        moveTo(14.5f, 15f)
        verticalLineTo(13.6667f)
        moveTo(12.9375f, 11f)
        horizontalLineTo(16.0625f)
        moveTo(16.0625f, 11f)
        curveTo(16.5803f, 11f, 17f, 11.4477f, 17f, 12f)
        verticalLineTo(12.6667f)
        curveTo(17f, 13.219f, 16.5803f, 13.6667f, 16.0625f, 13.6667f)
        horizontalLineTo(12f)
        moveTo(16.0625f, 11f)
        curveTo(16.5803f, 11f, 17f, 10.5523f, 17f, 10f)
        verticalLineTo(9.33333f)
        curveTo(17f, 8.78105f, 16.5803f, 8.33333f, 16.0625f, 8.33333f)
        horizontalLineTo(12f)
        }
        }.build()

        return _bitcoinSafe!!
    }

private var _bitcoinSafe: ImageVector? = null
