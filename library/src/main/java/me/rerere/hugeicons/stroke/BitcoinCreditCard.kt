package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BitcoinCreditCard: ImageVector
    get() {
        if (_bitcoinCreditCard != null) {
            return _bitcoinCreditCard!!
        }
        _bitcoinCreditCard = ImageVector.Builder(
            name = "BitcoinCreditCard",
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
        moveTo(22f, 11f)
        curveTo(22f, 7.46252f, 22f, 5.69377f, 20.9472f, 4.5129f)
        curveTo(20.7788f, 4.32403f, 20.5932f, 4.14935f, 20.3925f, 3.99087f)
        curveTo(19.1379f, 3f, 17.2586f, 3f, 13.5f, 3f)
        horizontalLineTo(10.5f)
        curveTo(6.74142f, 3f, 4.86213f, 3f, 3.60746f, 3.99087f)
        curveTo(3.40678f, 4.14935f, 3.22119f, 4.32403f, 3.0528f, 4.5129f)
        curveTo(2f, 5.69377f, 2f, 7.46252f, 2f, 11f)
        curveTo(2f, 14.5375f, 2f, 16.3062f, 3.0528f, 17.4871f)
        curveTo(3.22119f, 17.676f, 3.40678f, 17.8506f, 3.60746f, 18.0091f)
        curveTo(4.86213f, 19f, 6.74142f, 19f, 10.5f, 19f)
        horizontalLineTo(12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 8f)
        horizontalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.125f, 19.5f)
        lineTo(16.125f, 13.5f)
        moveTo(18f, 13.5f)
        verticalLineTo(12f)
        moveTo(18f, 21f)
        verticalLineTo(19.5f)
        moveTo(16.125f, 16.5f)
        horizontalLineTo(19.875f)
        moveTo(19.875f, 16.5f)
        curveTo(20.4963f, 16.5f, 21f, 17.0037f, 21f, 17.625f)
        verticalLineTo(18.375f)
        curveTo(21f, 18.9963f, 20.4963f, 19.5f, 19.875f, 19.5f)
        horizontalLineTo(15f)
        moveTo(19.875f, 16.5f)
        curveTo(20.4963f, 16.5f, 21f, 15.9963f, 21f, 15.375f)
        verticalLineTo(14.625f)
        curveTo(21f, 14.0037f, 20.4963f, 13.5f, 19.875f, 13.5f)
        horizontalLineTo(15f)
        }
        }.build()

        return _bitcoinCreditCard!!
    }

private var _bitcoinCreditCard: ImageVector? = null
