package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BitcoinWithdraw: ImageVector
    get() {
        if (_bitcoinWithdraw != null) {
            return _bitcoinWithdraw!!
        }
        _bitcoinWithdraw = ImageVector.Builder(
            name = "BitcoinWithdraw",
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
        moveTo(18.9349f, 13.9453f)
        lineTo(18.2646f, 10.2968f)
        curveTo(17.9751f, 8.72096f, 17.8303f, 7.93303f, 17.257f, 7.46651f)
        curveTo(16.6837f, 7f, 15.8602f, 7f, 14.2132f, 7f)
        horizontalLineTo(9.78685f)
        curveTo(8.1398f, 7f, 7.31628f, 7f, 6.74298f, 7.46651f)
        curveTo(6.16968f, 7.93303f, 6.02492f, 8.72096f, 5.73538f, 10.2968f)
        lineTo(5.06506f, 13.9453f)
        curveTo(4.46408f, 17.2162f, 4.16359f, 18.8517f, 5.08889f, 19.9259f)
        curveTo(6.01419f, 21f, 7.72355f, 21f, 11.1423f, 21f)
        horizontalLineTo(12.8577f)
        curveTo(16.2765f, 21f, 17.9858f, 21f, 18.9111f, 19.9259f)
        curveTo(19.8364f, 18.8517f, 19.5359f, 17.2162f, 18.9349f, 13.9453f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.4375f, 16.6667f)
        lineTo(10.4375f, 11.3333f)
        moveTo(12f, 11.3333f)
        verticalLineTo(10f)
        moveTo(12f, 18f)
        verticalLineTo(16.6667f)
        moveTo(10.4375f, 14f)
        horizontalLineTo(13.5625f)
        moveTo(13.5625f, 14f)
        curveTo(14.0803f, 14f, 14.5f, 14.4477f, 14.5f, 15f)
        verticalLineTo(15.6667f)
        curveTo(14.5f, 16.219f, 14.0803f, 16.6667f, 13.5625f, 16.6667f)
        horizontalLineTo(9.5f)
        moveTo(13.5625f, 14f)
        curveTo(14.0803f, 14f, 14.5f, 13.5523f, 14.5f, 13f)
        verticalLineTo(12.3333f)
        curveTo(14.5f, 11.781f, 14.0803f, 11.3333f, 13.5625f, 11.3333f)
        horizontalLineTo(9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 11f)
        curveTo(21.1568f, 10.9209f, 21.2931f, 10.8212f, 21.4142f, 10.6955f)
        curveTo(22f, 10.0875f, 22f, 9.10893f, 22f, 7.15176f)
        curveTo(22f, 5.1946f, 22f, 4.21602f, 21.4142f, 3.60801f)
        curveTo(20.8284f, 3f, 19.8856f, 3f, 18f, 3f)
        lineTo(6f, 3f)
        curveTo(4.11438f, 3f, 3.17157f, 3f, 2.58579f, 3.60801f)
        curveTo(2f, 4.21602f, 2f, 5.1946f, 2f, 7.15176f)
        curveTo(2f, 9.10893f, 2f, 10.0875f, 2.58579f, 10.6955f)
        curveTo(2.70688f, 10.8212f, 2.84322f, 10.9209f, 3f, 11f)
        }
        }.build()

        return _bitcoinWithdraw!!
    }

private var _bitcoinWithdraw: ImageVector? = null
