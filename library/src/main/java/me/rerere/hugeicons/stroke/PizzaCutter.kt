package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PizzaCutter: ImageVector
    get() {
        if (_pizzaCutter != null) {
            return _pizzaCutter!!
        }
        _pizzaCutter = ImageVector.Builder(
            name = "PizzaCutter",
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
        moveTo(18.0079f, 7.00648f)
        lineTo(18.0016f, 7.00013f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.8284f, 9.82843f)
        curveTo(19.2663f, 11.3905f, 16.7337f, 11.3905f, 15.1716f, 9.82843f)
        curveTo(13.6095f, 8.26633f, 13.6095f, 5.73367f, 15.1716f, 4.17157f)
        curveTo(16.7337f, 2.60948f, 19.2663f, 2.60948f, 20.8284f, 4.17157f)
        curveTo(22.3905f, 5.73367f, 22.3905f, 8.26633f, 20.8284f, 9.82843f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.83987f, 20.2031f)
        curveTo(3.9597f, 21.2656f, 5.77529f, 21.2656f, 6.89512f, 20.2031f)
        curveTo(7.48089f, 19.6473f, 7.76025f, 18.9108f, 7.7332f, 18.1827f)
        curveTo(7.72646f, 18.0014f, 7.78437f, 17.8202f, 7.91493f, 17.6963f)
        lineTo(10.661f, 15.0907f)
        curveTo(10.8334f, 14.9272f, 11.0887f, 14.8998f, 11.3071f, 14.9902f)
        curveTo(12.3445f, 15.4194f, 13.6057f, 15.3298f, 14.6155f, 15.105f)
        curveTo(15.1172f, 14.9933f, 15.1194f, 14.3649f, 14.672f, 14.1221f)
        curveTo(14.066f, 13.7932f, 13.4955f, 13.3832f, 12.978f, 12.8922f)
        curveTo(12.3251f, 12.2727f, 11.8081f, 11.5731f, 11.4271f, 10.8266f)
        curveTo(11.023f, 10.0349f, 9.85237f, 9.70148f, 9.19682f, 10.3235f)
        lineTo(2.83987f, 16.3553f)
        curveTo(1.72004f, 17.4178f, 1.72004f, 19.1405f, 2.83987f, 20.2031f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 8.5f)
        lineTo(11.5f, 10.5f)
        moveTo(16f, 11f)
        lineTo(13.5f, 13f)
        }
        }.build()

        return _pizzaCutter!!
    }

private var _pizzaCutter: ImageVector? = null
