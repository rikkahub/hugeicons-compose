package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BitcoinDatabase: ImageVector
    get() {
        if (_bitcoinDatabase != null) {
            return _bitcoinDatabase!!
        }
        _bitcoinDatabase = ImageVector.Builder(
            name = "BitcoinDatabase",
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
        moveTo(12f, 15f)
        curveTo(7.58172f, 15f, 4f, 13.6569f, 4f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.9375f, 20.6667f)
        lineTo(15.9375f, 15.3333f)
        moveTo(17.5f, 15.3333f)
        verticalLineTo(14f)
        moveTo(17.5f, 22f)
        verticalLineTo(20.6667f)
        moveTo(15.9375f, 18f)
        horizontalLineTo(19.0625f)
        moveTo(19.0625f, 18f)
        curveTo(19.5803f, 18f, 20f, 18.4477f, 20f, 19f)
        verticalLineTo(19.6667f)
        curveTo(20f, 20.219f, 19.5803f, 20.6667f, 19.0625f, 20.6667f)
        horizontalLineTo(15f)
        moveTo(19.0625f, 18f)
        curveTo(19.5803f, 18f, 20f, 17.5523f, 20f, 17f)
        verticalLineTo(16.3333f)
        curveTo(20f, 15.781f, 19.5803f, 15.3333f, 19.0625f, 15.3333f)
        horizontalLineTo(15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 12f)
        verticalLineTo(5f)
        moveTo(12f, 22f)
        curveTo(7.58172f, 22f, 4f, 20.6569f, 4f, 19f)
        verticalLineTo(5f)
        }
        }.build()

        return _bitcoinDatabase!!
    }

private var _bitcoinDatabase: ImageVector? = null
