package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BitcoinUp01: ImageVector
    get() {
        if (_bitcoinUp01 != null) {
            return _bitcoinUp01!!
        }
        _bitcoinUp01 = ImageVector.Builder(
            name = "BitcoinUp01",
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
        moveTo(12f, 8.99988f)
        curveTo(8.41013f, 8.99988f, 5.49998f, 11.91f, 5.49998f, 15.4999f)
        curveTo(5.49998f, 19.0897f, 8.41013f, 21.9999f, 12f, 21.9999f)
        curveTo(15.5898f, 21.9999f, 18.5f, 19.0897f, 18.5f, 15.4999f)
        curveTo(18.5f, 11.91f, 15.5898f, 8.99988f, 12f, 8.99988f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 4.49988f)
        curveTo(14.0085f, 3.99418f, 12.7002f, 1.99988f, 12f, 1.99988f)
        moveTo(9.49999f, 4.49988f)
        curveTo(9.99152f, 3.99418f, 11.2998f, 1.99988f, 12f, 1.99988f)
        moveTo(12f, 1.99988f)
        lineTo(12f, 6.49988f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.4375f, 18.1667f)
        lineTo(10.4375f, 12.8333f)
        moveTo(12f, 12.8333f)
        verticalLineTo(11.5f)
        moveTo(12f, 19.5f)
        verticalLineTo(18.1667f)
        moveTo(10.4375f, 15.5f)
        horizontalLineTo(13.5625f)
        moveTo(13.5625f, 15.5f)
        curveTo(14.0803f, 15.5f, 14.5f, 15.9477f, 14.5f, 16.5f)
        verticalLineTo(17.1667f)
        curveTo(14.5f, 17.719f, 14.0803f, 18.1667f, 13.5625f, 18.1667f)
        horizontalLineTo(9.49999f)
        moveTo(13.5625f, 15.5f)
        curveTo(14.0803f, 15.5f, 14.5f, 15.0523f, 14.5f, 14.5f)
        verticalLineTo(13.8333f)
        curveTo(14.5f, 13.281f, 14.0803f, 12.8333f, 13.5625f, 12.8333f)
        horizontalLineTo(9.49999f)
        }
        }.build()

        return _bitcoinUp01!!
    }

private var _bitcoinUp01: ImageVector? = null
