package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SailboatCoastal: ImageVector
    get() {
        if (_sailboatCoastal != null) {
            return _sailboatCoastal!!
        }
        _sailboatCoastal = ImageVector.Builder(
            name = "SailboatCoastal",
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
        moveTo(6f, 18f)
        curveTo(4.59373f, 17.0625f, 3.80546f, 15.9647f, 3.39377f, 14.9482f)
        curveTo(3.10599f, 14.2376f, 2.96211f, 13.8823f, 3.2594f, 13.4411f)
        curveTo(3.55669f, 13f, 4.0378f, 13f, 5f, 13f)
        lineTo(19f, 13f)
        curveTo(19.9622f, 13f, 20.4433f, 13f, 20.7406f, 13.4411f)
        curveTo(21.0379f, 13.8823f, 20.894f, 14.2376f, 20.6062f, 14.9482f)
        curveTo(20.1945f, 15.9647f, 19.4063f, 17.0625f, 18f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.8417f, 3.46469f)
        lineTo(17.9109f, 6.30956f)
        curveTo(18.7796f, 7.50391f, 19.2139f, 8.10108f, 18.896f, 8.55054f)
        curveTo(18.5782f, 9f, 17.7215f, 9f, 16.0082f, 9f)
        lineTo(10.6283f, 9f)
        curveTo(8.44171f, 9f, 7.3484f, 9f, 7.06067f, 8.46141f)
        curveTo(6.77293f, 7.92283f, 7.52225f, 7.27894f, 9.02088f, 5.99117f)
        lineTo(12.3316f, 3.1463f)
        curveTo(13.2563f, 2.35171f, 13.7186f, 1.95441f, 14.2671f, 2.00416f)
        curveTo(14.8156f, 2.05391f, 15.1576f, 2.52417f, 15.8417f, 3.46469f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 13f)
        lineTo(14f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 21f)
        lineTo(22f, 21f)
        }
        }.build()

        return _sailboatCoastal!!
    }

private var _sailboatCoastal: ImageVector? = null
