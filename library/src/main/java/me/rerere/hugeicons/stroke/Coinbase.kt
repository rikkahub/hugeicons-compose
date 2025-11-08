package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Coinbase: ImageVector
    get() {
        if (_coinbase != null) {
            return _coinbase!!
        }
        _coinbase = ImageVector.Builder(
            name = "Coinbase",
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
        moveTo(21f, 11f)
        curveTo(20.501f, 6.50005f, 16.6743f, 3f, 12.0275f, 3f)
        curveTo(7.04177f, 3f, 3f, 7.02944f, 3f, 12f)
        curveTo(3f, 16.9706f, 7.04177f, 21f, 12.0275f, 21f)
        curveTo(16.6743f, 21f, 20.501f, 17.5f, 21f, 13f)
        horizontalLineTo(16.4295f)
        curveTo(15.9734f, 15.004f, 14.1757f, 16.5f, 12.0275f, 16.5f)
        curveTo(9.53466f, 16.5f, 7.51377f, 14.4853f, 7.51377f, 12f)
        curveTo(7.51377f, 9.51472f, 9.53466f, 7.5f, 12.0275f, 7.5f)
        curveTo(14.1757f, 7.5f, 15.9734f, 8.99601f, 16.4295f, 11f)
        horizontalLineTo(21f)
        }
        }.build()

        return _coinbase!!
    }

private var _coinbase: ImageVector? = null
