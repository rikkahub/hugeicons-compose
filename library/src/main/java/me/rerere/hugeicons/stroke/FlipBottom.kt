package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FlipBottom: ImageVector
    get() {
        if (_flipBottom != null) {
            return _flipBottom!!
        }
        _flipBottom = ImageVector.Builder(
            name = "FlipBottom",
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
        moveTo(14.3332f, 1.99997f)
        lineTo(9.66657f, 1.99997f)
        moveTo(20.9849f, 7.49997f)
        curveTo(21.0021f, 7.99959f, 21.0029f, 8.49988f, 21.0014f, 8.99997f)
        moveTo(3.01506f, 7.49997f)
        curveTo(2.99791f, 7.99959f, 2.99703f, 8.49988f, 2.99852f, 8.99997f)
        moveTo(20.4629f, 4.74529f)
        curveTo(19.9788f, 3.78695f, 19.1975f, 3.00861f, 18.2369f, 2.52815f)
        moveTo(5.82027f, 2.49997f)
        curveTo(4.83351f, 2.97787f, 4.03077f, 3.76798f, 3.53707f, 4.74529f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.495f, 12f)
        curveTo(20.453f, 12f, 20.993f, 12.6377f, 20.993f, 14.5f)
        curveTo(20.993f, 17.0317f, 21.243f, 19.9536f, 18.7448f, 21.3971f)
        curveTo(17.7013f, 22f, 16.3005f, 22f, 13.4988f, 22f)
        lineTo(10.5011f, 22f)
        curveTo(7.69945f, 22f, 6.29861f, 22f, 5.25519f, 21.3971f)
        curveTo(2.757f, 19.9536f, 3.00692f, 17.0316f, 3.00692f, 14.5f)
        curveTo(3.00692f, 12.5404f, 3.6442f, 12f, 5.50499f, 12f)
        lineTo(18.495f, 12f)
        }
        }.build()

        return _flipBottom!!
    }

private var _flipBottom: ImageVector? = null
