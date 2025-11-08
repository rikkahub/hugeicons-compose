package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BitcoinMind: ImageVector
    get() {
        if (_bitcoinMind != null) {
            return _bitcoinMind!!
        }
        _bitcoinMind = ImageVector.Builder(
            name = "BitcoinMind",
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
        moveTo(15.5f, 22f)
        verticalLineTo(21.5f)
        curveTo(15.5f, 20.3954f, 16.4321f, 19.5005f, 17.4223f, 19.011f)
        curveTo(18.3846f, 18.5354f, 19.1943f, 17.7511f, 19.2965f, 16.8313f)
        lineTo(19.5f, 15f)
        lineTo(21.5f, 14f)
        lineTo(19f, 10.25f)
        curveTo(19f, 5.69365f, 15.3063f, 2f, 10.75f, 2f)
        curveTo(6.19365f, 2f, 2.5f, 5.69365f, 2.5f, 10.25f)
        curveTo(2.5f, 13.0379f, 3.88283f, 15.5028f, 6f, 16.9962f)
        moveTo(6f, 16.9962f)
        verticalLineTo(22f)
        moveTo(6f, 16.9962f)
        curveTo(6.75065f, 17.5257f, 7.59362f, 17.9331f, 8.5f, 18.1895f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.9375f, 12.6667f)
        lineTo(8.9375f, 7.33333f)
        moveTo(10.5f, 7.33333f)
        verticalLineTo(6f)
        moveTo(10.5f, 14f)
        verticalLineTo(12.6667f)
        moveTo(8.9375f, 10f)
        horizontalLineTo(12.0625f)
        moveTo(12.0625f, 10f)
        curveTo(12.5803f, 10f, 13f, 10.4477f, 13f, 11f)
        verticalLineTo(11.6667f)
        curveTo(13f, 12.219f, 12.5803f, 12.6667f, 12.0625f, 12.6667f)
        horizontalLineTo(8f)
        moveTo(12.0625f, 10f)
        curveTo(12.5803f, 10f, 13f, 9.55228f, 13f, 9f)
        verticalLineTo(8.33333f)
        curveTo(13f, 7.78105f, 12.5803f, 7.33333f, 12.0625f, 7.33333f)
        horizontalLineTo(8f)
        }
        }.build()

        return _bitcoinMind!!
    }

private var _bitcoinMind: ImageVector? = null
