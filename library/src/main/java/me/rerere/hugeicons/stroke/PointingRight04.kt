package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PointingRight04: ImageVector
    get() {
        if (_pointingRight04 != null) {
            return _pointingRight04!!
        }
        _pointingRight04 = ImageVector.Builder(
            name = "PointingRight04",
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
        moveTo(9.5f, 9.916f)
        lineTo(13f, 9.916f)
        moveTo(13f, 9.916f)
        lineTo(19.25f, 9.916f)
        curveTo(20.2165f, 9.916f, 21f, 10.6995f, 21f, 11.666f)
        curveTo(21f, 12.6325f, 20.2165f, 13.416f, 19.25f, 13.416f)
        horizontalLineTo(14f)
        lineTo(13.5224f, 16.493f)
        curveTo(13.2331f, 18.4216f, 13.0885f, 19.386f, 12.6816f, 20.0652f)
        curveTo(12.0094f, 21.1872f, 11f, 22f, 9.52639f, 22f)
        curveTo(8.5f, 22f, 7.8114f, 21.7463f, 5.96127f, 21.1296f)
        curveTo(4.78733f, 20.7383f, 4.20036f, 20.5426f, 3.73571f, 20.2236f)
        curveTo(2.97073f, 19.6983f, 2.4122f, 18.9233f, 2.15576f, 18.0315f)
        curveTo(2f, 17.4898f, 2f, 16.8711f, 2f, 15.6336f)
        lineTo(2f, 14.2287f)
        curveTo(2f, 12.4442f, 2f, 11.552f, 2.33495f, 10.7858f)
        curveTo(2.48627f, 10.4397f, 2.68587f, 10.1167f, 2.92779f, 9.82659f)
        curveTo(3.46326f, 9.18437f, 4.2613f, 8.78535f, 5.85738f, 7.98731f)
        curveTo(7.15171f, 7.34015f, 7.79887f, 7.01657f, 8.46984f, 7.00082f)
        curveTo(8.77244f, 6.99372f, 9.07436f, 7.03246f, 9.36537f, 7.11571f)
        curveTo(10.0106f, 7.30031f, 10.5552f, 7.77678f, 11.6442f, 8.7297f)
        lineTo(13f, 9.916f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 4.5f)
        lineTo(16f, 4.5f)
        moveTo(22f, 4.5f)
        curveTo(22f, 3.79977f, 20.0057f, 2.49153f, 19.5f, 2f)
        moveTo(22f, 4.5f)
        curveTo(22f, 5.20023f, 20.0057f, 6.50847f, 19.5f, 7f)
        }
        }.build()

        return _pointingRight04!!
    }

private var _pointingRight04: ImageVector? = null
