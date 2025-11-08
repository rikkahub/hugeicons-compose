package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BitcoinTarget: ImageVector
    get() {
        if (_bitcoinTarget != null) {
            return _bitcoinTarget!!
        }
        _bitcoinTarget = ImageVector.Builder(
            name = "BitcoinTarget",
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
        moveTo(20.5f, 11.9998f)
        curveTo(20.5f, 7.3054f, 16.6944f, 3.49982f, 12f, 3.49982f)
        curveTo(7.30558f, 3.49982f, 3.5f, 7.3054f, 3.5f, 11.9998f)
        curveTo(3.5f, 16.6942f, 7.30558f, 20.4998f, 12f, 20.4998f)
        curveTo(16.6944f, 20.4998f, 20.5f, 16.6942f, 20.5f, 11.9998f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 2f)
        verticalLineTo(5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 12f)
        lineTo(19f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 19f)
        lineTo(12f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 12f)
        horizontalLineTo(2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.4375f, 14.6667f)
        lineTo(10.4375f, 9.33333f)
        moveTo(12f, 9.33333f)
        verticalLineTo(8f)
        moveTo(12f, 16f)
        verticalLineTo(14.6667f)
        moveTo(10.4375f, 12f)
        horizontalLineTo(13.5625f)
        moveTo(13.5625f, 12f)
        curveTo(14.0803f, 12f, 14.5f, 12.4477f, 14.5f, 13f)
        verticalLineTo(13.6667f)
        curveTo(14.5f, 14.219f, 14.0803f, 14.6667f, 13.5625f, 14.6667f)
        horizontalLineTo(9.5f)
        moveTo(13.5625f, 12f)
        curveTo(14.0803f, 12f, 14.5f, 11.5523f, 14.5f, 11f)
        verticalLineTo(10.3333f)
        curveTo(14.5f, 9.78105f, 14.0803f, 9.33333f, 13.5625f, 9.33333f)
        horizontalLineTo(9.5f)
        }
        }.build()

        return _bitcoinTarget!!
    }

private var _bitcoinTarget: ImageVector? = null
