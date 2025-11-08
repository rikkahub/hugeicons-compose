package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BitcoinLock: ImageVector
    get() {
        if (_bitcoinLock != null) {
            return _bitcoinLock!!
        }
        _bitcoinLock = ImageVector.Builder(
            name = "BitcoinLock",
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
        moveTo(4.26781f, 18.8447f)
        curveTo(4.49269f, 20.515f, 5.87613f, 21.8235f, 7.55966f, 21.9009f)
        curveTo(8.97627f, 21.966f, 10.4153f, 22f, 12f, 22f)
        curveTo(13.5847f, 22f, 15.0237f, 21.966f, 16.4403f, 21.9009f)
        curveTo(18.1239f, 21.8235f, 19.5073f, 20.515f, 19.7322f, 18.8447f)
        curveTo(19.879f, 17.7547f, 20f, 16.6376f, 20f, 15.5f)
        curveTo(20f, 14.3624f, 19.879f, 13.2453f, 19.7322f, 12.1553f)
        curveTo(19.5073f, 10.485f, 18.1239f, 9.17649f, 16.4403f, 9.09909f)
        curveTo(15.0237f, 9.03397f, 13.5847f, 9f, 12f, 9f)
        curveTo(10.4153f, 9f, 8.97627f, 9.03397f, 7.55966f, 9.09909f)
        curveTo(5.87613f, 9.17649f, 4.49269f, 10.485f, 4.26781f, 12.1553f)
        curveTo(4.12104f, 13.2453f, 4f, 14.3624f, 4f, 15.5f)
        curveTo(4f, 16.6376f, 4.12104f, 17.7547f, 4.26781f, 18.8447f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.5f, 9f)
        verticalLineTo(6.5f)
        curveTo(7.5f, 4.01472f, 9.51472f, 2f, 12f, 2f)
        curveTo(14.4853f, 2f, 16.5f, 4.01472f, 16.5f, 6.5f)
        verticalLineTo(9f)
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
        horizontalLineTo(9.5f)
        moveTo(13.5625f, 15.5f)
        curveTo(14.0803f, 15.5f, 14.5f, 15.0523f, 14.5f, 14.5f)
        verticalLineTo(13.8333f)
        curveTo(14.5f, 13.281f, 14.0803f, 12.8333f, 13.5625f, 12.8333f)
        horizontalLineTo(9.5f)
        }
        }.build()

        return _bitcoinLock!!
    }

private var _bitcoinLock: ImageVector? = null
