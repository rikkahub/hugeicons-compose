package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BitcoinReceive: ImageVector
    get() {
        if (_bitcoinReceive != null) {
            return _bitcoinReceive!!
        }
        _bitcoinReceive = ImageVector.Builder(
            name = "BitcoinReceive",
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
        moveTo(2f, 4.8f)
        horizontalLineTo(9f)
        curveTo(10.6569f, 4.8f, 12f, 6.41177f, 12f, 8.4f)
        curveTo(12f, 10.3882f, 10.6569f, 12f, 9f, 12f)
        moveTo(9f, 12f)
        curveTo(10.6569f, 12f, 12f, 13.6118f, 12f, 15.6f)
        curveTo(12f, 17.5882f, 10.6569f, 19.2f, 9f, 19.2f)
        horizontalLineTo(2f)
        moveTo(9f, 12f)
        horizontalLineTo(3f)
        moveTo(2.83333f, 4.8f)
        verticalLineTo(19.2f)
        moveTo(4.5f, 3f)
        verticalLineTo(4.8f)
        moveTo(8.66667f, 3f)
        verticalLineTo(4.8f)
        moveTo(4.5f, 19.2f)
        verticalLineTo(21f)
        moveTo(8.66667f, 19.2f)
        verticalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 12f)
        horizontalLineTo(22f)
        moveTo(14.5f, 12f)
        curveTo(14.5f, 12.7002f, 16.4943f, 14.0085f, 17f, 14.5f)
        moveTo(14.5f, 12f)
        curveTo(14.5f, 11.2998f, 16.4943f, 9.99153f, 17f, 9.5f)
        }
        }.build()

        return _bitcoinReceive!!
    }

private var _bitcoinReceive: ImageVector? = null
