package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BitcoinDown01: ImageVector
    get() {
        if (_bitcoinDown01 != null) {
            return _bitcoinDown01!!
        }
        _bitcoinDown01 = ImageVector.Builder(
            name = "BitcoinDown01",
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
        moveTo(12f, 2f)
        curveTo(8.41015f, 2f, 5.5f, 4.91015f, 5.5f, 8.5f)
        curveTo(5.5f, 12.0898f, 8.41015f, 15f, 12f, 15f)
        curveTo(15.5898f, 15f, 18.5f, 12.0899f, 18.5f, 8.5f)
        curveTo(18.5f, 4.91015f, 15.5898f, 2f, 12f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.5f, 19.5f)
        curveTo(9.99153f, 20.0057f, 11.2998f, 22f, 12f, 22f)
        moveTo(14.5f, 19.5f)
        curveTo(14.0085f, 20.0057f, 12.7002f, 22f, 12f, 22f)
        moveTo(12f, 22f)
        verticalLineTo(17.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.4375f, 11.1667f)
        lineTo(10.4375f, 5.83333f)
        moveTo(12f, 5.83333f)
        verticalLineTo(4.5f)
        moveTo(12f, 12.5f)
        verticalLineTo(11.1667f)
        moveTo(10.4375f, 8.5f)
        horizontalLineTo(13.5625f)
        moveTo(13.5625f, 8.5f)
        curveTo(14.0803f, 8.5f, 14.5f, 8.94772f, 14.5f, 9.5f)
        verticalLineTo(10.1667f)
        curveTo(14.5f, 10.719f, 14.0803f, 11.1667f, 13.5625f, 11.1667f)
        horizontalLineTo(9.5f)
        moveTo(13.5625f, 8.5f)
        curveTo(14.0803f, 8.5f, 14.5f, 8.05228f, 14.5f, 7.5f)
        verticalLineTo(6.83333f)
        curveTo(14.5f, 6.28105f, 14.0803f, 5.83333f, 13.5625f, 5.83333f)
        horizontalLineTo(9.5f)
        }
        }.build()

        return _bitcoinDown01!!
    }

private var _bitcoinDown01: ImageVector? = null
