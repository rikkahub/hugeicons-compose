package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Tsunami: ImageVector
    get() {
        if (_tsunami != null) {
            return _tsunami!!
        }
        _tsunami = ImageVector.Builder(
            name = "Tsunami",
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
        moveTo(7.06641f, 12.0024f)
        curveTo(7.06641f, 12.0024f, 7.06616f, 15.0024f, 9.99951f, 16.0024f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 21.3757f)
        curveTo(20.5547f, 22.1867f, 18.7056f, 22.1867f, 17.2604f, 21.3757f)
        curveTo(16.3889f, 20.878f, 15.2412f, 20.878f, 14.3698f, 21.3757f)
        curveTo(14.3698f, 21.3757f, 14.3486f, 21.3757f, 14.3486f, 21.3941f)
        curveTo(12.9033f, 22.2052f, 11.0542f, 22.2052f, 9.63019f, 21.3941f)
        curveTo(8.73752f, 20.8964f, 7.61105f, 20.8964f, 6.73964f, 21.3941f)
        moveTo(6.73964f, 21.3757f)
        curveTo(5.29436f, 22.1867f, 3.44527f, 22.1867f, 2f, 21.3757f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 7.00244f)
        curveTo(11f, 12.2491f, 15.2533f, 16.5024f, 20.5f, 16.5024f)
        horizontalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.88792f, 6.92656f)
        curveTo(7.25992f, 7.14256f, 7.97992f, 7.68256f, 9.17992f, 7.46656f)
        curveTo(10.6199f, 7.02256f, 11.8009f, 6.65115f, 12.7199f, 7.20256f)
        curveTo(13.6199f, 7.74256f, 14.2199f, 8.22256f, 14.5799f, 7.98256f)
        curveTo(14.7578f, 8.01814f, 15.0555f, 7.33634f, 14.9939f, 6.36256f)
        curveTo(14.9517f, 5.69425f, 14.7207f, 4.8884f, 14.2079f, 4.08256f)
        curveTo(13.9079f, 3.66256f, 13.7148f, 3.51528f, 13.6799f, 3.48256f)
        curveTo(11.7361f, 1.65713f, 8.59877f, 1.35756f, 5.81992f, 3.48256f)
        curveTo(2.69992f, 6.00256f, 2.27992f, 9.18256f, 2.09992f, 10.7426f)
        curveTo(1.79992f, 13.7426f, 2.27992f, 17.1626f, 2.75992f, 19.0226f)
        }
        }.build()

        return _tsunami!!
    }

private var _tsunami: ImageVector? = null
