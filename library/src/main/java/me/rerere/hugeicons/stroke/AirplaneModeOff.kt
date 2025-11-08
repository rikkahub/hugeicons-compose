package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AirplaneModeOff: ImageVector
    get() {
        if (_airplaneModeOff != null) {
            return _airplaneModeOff!!
        }
        _airplaneModeOff = ImageVector.Builder(
            name = "AirplaneModeOff",
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
        moveTo(13.1795f, 13.8261f)
        lineTo(12.9201f, 16.1149f)
        curveTo(12.8261f, 16.9448f, 12.779f, 17.3598f, 12.915f, 17.7398f)
        curveTo(13.2335f, 18.63f, 14.3149f, 19.3591f, 14.9753f, 20.0066f)
        curveTo(15.3403f, 20.3644f, 15.7386f, 21.3934f, 15.3224f, 21.8613f)
        curveTo(15.0655f, 22.1503f, 14.6481f, 21.9157f, 14.3609f, 21.803f)
        lineTo(11.5952f, 20.7184f)
        curveTo(11.2645f, 20.5887f, 11.0991f, 20.5239f, 10.9255f, 20.5239f)
        curveTo(10.7519f, 20.5239f, 10.5865f, 20.5887f, 10.2558f, 20.7184f)
        lineTo(7.49016f, 21.803f)
        curveTo(7.20291f, 21.9157f, 6.78553f, 22.1503f, 6.52858f, 21.8613f)
        curveTo(6.11239f, 21.3934f, 6.51073f, 20.3644f, 6.87572f, 20.0066f)
        curveTo(7.53614f, 19.3591f, 8.61751f, 18.63f, 8.936f, 17.7398f)
        curveTo(9.07199f, 17.3598f, 9.02496f, 16.9448f, 8.93091f, 16.1149f)
        lineTo(8.67153f, 13.8261f)
        lineTo(2.89514f, 15.1587f)
        curveTo(2.29655f, 15.2968f, 1.99982f, 15.1155f, 2f, 14.4391f)
        curveTo(2.00033f, 13.1971f, 2.39739f, 12.537f, 3.40543f, 11.9183f)
        lineTo(6.6995f, 9.89656f)
        curveTo(7.25228f, 9.55783f, 7.52868f, 9.38846f, 7.71947f, 9.15616f)
        curveTo(7.99925f, 8.81552f, 8f, 8f, 8f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.50006f, 4f)
        curveTo(8.97205f, 3.18656f, 9.71858f, 2.43508f, 10.4364f, 2.11845f)
        curveTo(10.7944f, 1.96052f, 11.2051f, 1.96052f, 11.5631f, 2.11845f)
        curveTo(12.7264f, 2.63158f, 13.8804f, 4.28671f, 14.0089f, 5.49686f)
        curveTo(14.1331f, 6.66595f, 13.3999f, 8.15082f, 14.2325f, 9.15616f)
        curveTo(14.4248f, 9.38846f, 14.7035f, 9.55783f, 15.2609f, 9.89656f)
        lineTo(18.5827f, 11.9182f)
        curveTo(19.5993f, 12.5369f, 19.9998f, 13.1973f, 19.9998f, 14.4395f)
        curveTo(19.9998f, 14.9429f, 19.5001f, 15.5f, 19.5001f, 15.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 2f)
        lineTo(22f, 22f)
        }
        }.build()

        return _airplaneModeOff!!
    }

private var _airplaneModeOff: ImageVector? = null
