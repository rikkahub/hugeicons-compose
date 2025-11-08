package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Sausage: ImageVector
    get() {
        if (_sausage != null) {
            return _sausage!!
        }
        _sausage = ImageVector.Builder(
            name = "Sausage",
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
        moveTo(12f, 5.66697f)
        lineTo(12f, 7.5f)
        moveTo(22f, 3f)
        lineTo(20f, 5.5f)
        lineTo(22f, 6.19982f)
        moveTo(2f, 3f)
        lineTo(4f, 5.5f)
        lineTo(2f, 6.19982f)
        moveTo(15f, 5.22532f)
        lineTo(15.5f, 7f)
        moveTo(8.99995f, 5.22532f)
        lineTo(8.5f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 11f)
        curveTo(14.5024f, 11f, 16.863f, 10.2715f, 18.9424f, 8.98155f)
        curveTo(20.0441f, 8.29811f, 20.3027f, 6.61406f, 19.6351f, 5.36009f)
        curveTo(18.9013f, 3.98186f, 17.3452f, 3.67998f, 16.092f, 4.32364f)
        curveTo(14.836f, 4.96875f, 13.4528f, 5.32591f, 12f, 5.32591f)
        curveTo(10.5472f, 5.32591f, 9.16398f, 4.96875f, 7.90796f, 4.32364f)
        curveTo(6.65477f, 3.67998f, 5.0987f, 3.98186f, 4.36491f, 5.36008f)
        curveTo(3.69726f, 6.61406f, 3.95591f, 8.29811f, 5.05764f, 8.98155f)
        curveTo(7.13702f, 10.2715f, 9.49759f, 11f, 12f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 15.667f)
        verticalLineTo(17.2664f)
        moveTo(12f, 15.667f)
        curveTo(13.04f, 15.667f, 14.0463f, 15.513f, 15f, 15.2253f)
        moveTo(12f, 15.667f)
        curveTo(10.9599f, 15.667f, 9.95362f, 15.513f, 8.99995f, 15.2253f)
        moveTo(3.92872f, 15.6991f)
        curveTo(3.22294f, 16.8777f, 3.49636f, 18.4605f, 4.66103f, 19.1029f)
        curveTo(6.8592f, 20.3153f, 9.35461f, 21f, 12f, 21f)
        curveTo(14.6453f, 21f, 17.1408f, 20.3153f, 19.3389f, 19.1029f)
        curveTo(20.5036f, 18.4605f, 20.777f, 16.8777f, 20.0712f, 15.6991f)
        moveTo(3.92872f, 15.6991f)
        curveTo(4.70444f, 14.4037f, 6.3494f, 14.12f, 7.67417f, 14.7249f)
        curveTo(8.10277f, 14.9207f, 8.54538f, 15.0882f, 8.99995f, 15.2253f)
        moveTo(3.92872f, 15.6991f)
        lineTo(2f, 13f)
        moveTo(3.92872f, 15.6991f)
        lineTo(2f, 16.1998f)
        moveTo(20.0712f, 15.6991f)
        curveTo(19.2955f, 14.4037f, 17.6505f, 14.12f, 16.3258f, 14.7249f)
        curveTo(15.8972f, 14.9207f, 15.4546f, 15.0882f, 15f, 15.2253f)
        moveTo(20.0712f, 15.6991f)
        lineTo(22f, 16.1998f)
        moveTo(20.0712f, 15.667f)
        lineTo(22f, 13f)
        moveTo(15f, 15.2253f)
        lineTo(15.5f, 16.7331f)
        moveTo(8.99995f, 15.2253f)
        lineTo(8.5f, 16.7331f)
        }
        }.build()

        return _sausage!!
    }

private var _sausage: ImageVector? = null
