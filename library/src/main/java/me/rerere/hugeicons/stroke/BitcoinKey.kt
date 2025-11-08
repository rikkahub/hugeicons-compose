package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BitcoinKey: ImageVector
    get() {
        if (_bitcoinKey != null) {
            return _bitcoinKey!!
        }
        _bitcoinKey = ImageVector.Builder(
            name = "BitcoinKey",
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
        moveTo(8.5f, 2f)
        curveTo(5.73858f, 2f, 3.5f, 4.23858f, 3.5f, 7f)
        curveTo(3.5f, 8.85071f, 4.5055f, 10.4666f, 6f, 11.3311f)
        verticalLineTo(17.8431f)
        curveTo(6f, 18.6606f, 6f, 19.0694f, 6.15224f, 19.4369f)
        curveTo(6.30448f, 19.8045f, 6.59351f, 20.0935f, 7.17157f, 20.6716f)
        lineTo(8.5f, 22f)
        lineTo(10.6082f, 19.8918f)
        curveTo(10.7054f, 19.7946f, 10.7541f, 19.7459f, 10.7944f, 19.6932f)
        curveTo(10.9003f, 19.5547f, 10.9682f, 19.3909f, 10.9912f, 19.218f)
        curveTo(11f, 19.1522f, 11f, 19.0834f, 11f, 18.9459f)
        curveTo(11f, 18.8346f, 11f, 18.779f, 10.9941f, 18.7249f)
        curveTo(10.9786f, 18.5831f, 10.933f, 18.4463f, 10.8603f, 18.3236f)
        curveTo(10.8326f, 18.2768f, 10.7992f, 18.2323f, 10.7325f, 18.1433f)
        lineTo(9.5f, 16.5f)
        lineTo(10.2f, 15.5667f)
        curveTo(10.5965f, 15.038f, 10.7947f, 14.7737f, 10.8974f, 14.4658f)
        curveTo(11f, 14.1579f, 11f, 13.8275f, 11f, 13.1667f)
        verticalLineTo(11.3311f)
        curveTo(12.4945f, 10.4666f, 13.5f, 8.85071f, 13.5f, 7f)
        curveTo(13.5f, 4.23858f, 11.2614f, 2f, 8.5f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.5f, 7f)
        horizontalLineTo(8.50898f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.625f, 19.5f)
        lineTo(15.625f, 13.5f)
        moveTo(17.5f, 13.5f)
        verticalLineTo(12f)
        moveTo(17.5f, 21f)
        verticalLineTo(19.5f)
        moveTo(15.625f, 16.5f)
        horizontalLineTo(19.375f)
        moveTo(19.375f, 16.5f)
        curveTo(19.9963f, 16.5f, 20.5f, 17.0037f, 20.5f, 17.625f)
        verticalLineTo(18.375f)
        curveTo(20.5f, 18.9963f, 19.9963f, 19.5f, 19.375f, 19.5f)
        horizontalLineTo(14.5f)
        moveTo(19.375f, 16.5f)
        curveTo(19.9963f, 16.5f, 20.5f, 15.9963f, 20.5f, 15.375f)
        verticalLineTo(14.625f)
        curveTo(20.5f, 14.0037f, 19.9963f, 13.5f, 19.375f, 13.5f)
        horizontalLineTo(14.5f)
        }
        }.build()

        return _bitcoinKey!!
    }

private var _bitcoinKey: ImageVector? = null
