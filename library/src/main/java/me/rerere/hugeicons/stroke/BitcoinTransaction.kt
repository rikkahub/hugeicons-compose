package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BitcoinTransaction: ImageVector
    get() {
        if (_bitcoinTransaction != null) {
            return _bitcoinTransaction!!
        }
        _bitcoinTransaction = ImageVector.Builder(
            name = "BitcoinTransaction",
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
        moveTo(16.9767f, 19.5f)
        curveTo(19.4017f, 17.8876f, 21f, 15.1305f, 21f, 12f)
        curveTo(21f, 7.02944f, 16.9706f, 3f, 12f, 3f)
        curveTo(11.3126f, 3f, 10.6432f, 3.07706f, 10f, 3.22302f)
        moveTo(16.9767f, 19.5f)
        verticalLineTo(16f)
        moveTo(16.9767f, 19.5f)
        horizontalLineTo(20.5f)
        moveTo(7f, 4.51555f)
        curveTo(4.58803f, 6.13007f, 3f, 8.87958f, 3f, 12f)
        curveTo(3f, 16.9706f, 7.02944f, 21f, 12f, 21f)
        curveTo(12.6874f, 21f, 13.3568f, 20.9229f, 14f, 20.777f)
        moveTo(7f, 4.51555f)
        verticalLineTo(8f)
        moveTo(7f, 4.51555f)
        horizontalLineTo(3.5f)
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

        return _bitcoinTransaction!!
    }

private var _bitcoinTransaction: ImageVector? = null
