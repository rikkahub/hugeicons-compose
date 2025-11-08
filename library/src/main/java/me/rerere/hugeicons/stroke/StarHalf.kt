package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.StarHalf: ImageVector
    get() {
        if (_starHalf != null) {
            return _starHalf!!
        }
        _starHalf = ImageVector.Builder(
            name = "StarHalf",
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
        moveTo(12f, 2f)
        lineTo(12.0034f, 19.4032f)
        curveTo(11.643f, 19.4025f, 11.2835f, 19.4831f, 11.0123f, 19.6452f)
        lineTo(8.02261f, 21.4296f)
        curveTo(5.87285f, 22.71f, 4.58299f, 21.7623f, 5.14293f, 19.3125f)
        lineTo(5.85285f, 16.2175f)
        curveTo(5.98284f, 15.6327f, 5.75286f, 14.8161f, 5.33291f, 14.3927f)
        lineTo(2.85318f, 11.8925f)
        curveTo(1.38335f, 10.4206f, 1.86329f, 8.92853f, 3.90307f, 8.58575f)
        lineTo(7.09271f, 8.05143f)
        curveTo(7.63266f, 7.9607f, 8.27258f, 7.48687f, 8.51256f, 6.99288f)
        lineTo(10.2724f, 3.44418f)
        curveTo(10.7464f, 2.48314f, 11.3725f, 2.00174f, 12f, 2f)
        moveTo(12f, 2f)
        horizontalLineTo(12.0034f)
        moveTo(15f, 20.8437f)
        lineTo(15.9817f, 21.4296f)
        curveTo(18.1215f, 22.71f, 19.4214f, 21.7522f, 18.8614f, 19.3125f)
        lineTo(18.1515f, 16.2175f)
        curveTo(18.0215f, 15.6327f, 18.2515f, 14.8161f, 18.6714f, 14.3927f)
        lineTo(21.1512f, 11.8925f)
        curveTo(22.611f, 10.4206f, 22.1411f, 8.92853f, 20.1013f, 8.58575f)
        lineTo(16.9116f, 8.05143f)
        curveTo(16.3817f, 7.9607f, 15.7418f, 7.48687f, 15.5018f, 6.99288f)
        lineTo(15f, 5.98101f)
        }
        }.build()

        return _starHalf!!
    }

private var _starHalf: ImageVector? = null
