package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PineTree: ImageVector
    get() {
        if (_pineTree != null) {
            return _pineTree!!
        }
        _pineTree = ImageVector.Builder(
            name = "PineTree",
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
        moveTo(9.00029f, 18f)
        horizontalLineTo(8.14381f)
        curveTo(6.28118f, 18f, 5.34987f, 18f, 5.06954f, 17.4356f)
        curveTo(4.78921f, 16.8713f, 5.37195f, 16.1695f, 6.53741f, 14.7659f)
        lineTo(8.3946f, 12.5293f)
        curveTo(7.21777f, 12.5293f, 6.62936f, 12.5293f, 6.34654f, 12.3092f)
        curveTo(6.07959f, 12.1015f, 5.93719f, 11.779f, 5.9667f, 11.449f)
        curveTo(5.99796f, 11.0995f, 6.40519f, 10.6892f, 7.21967f, 9.86865f)
        lineTo(9.51513f, 7.55599f)
        curveTo(8.56581f, 7.55599f, 8.09115f, 7.55599f, 7.84713f, 7.41507f)
        curveTo(7.45628f, 7.18937f, 7.26532f, 6.74247f, 7.37756f, 6.31617f)
        curveTo(7.44763f, 6.05f, 7.78408f, 5.72657f, 8.45699f, 5.07971f)
        lineTo(10.6296f, 2.99124f)
        curveTo(11.3177f, 2.32974f, 11.6618f, 1.99899f, 12.0883f, 2f)
        curveTo(12.5148f, 2.00101f, 12.8571f, 2.33339f, 13.5419f, 2.99813f)
        lineTo(15.6736f, 5.06754f)
        curveTo(16.3542f, 5.72818f, 16.6945f, 6.05851f, 16.7616f, 6.33134f)
        curveTo(16.8645f, 6.74982f, 16.6774f, 7.18482f, 16.2977f, 7.40951f)
        curveTo(16.0501f, 7.55599f, 15.5677f, 7.55599f, 14.6029f, 7.55599f)
        lineTo(16.5179f, 9.72481f)
        curveTo(17.3938f, 10.7168f, 17.8317f, 11.2128f, 17.7869f, 11.636f)
        curveTo(17.7636f, 11.8558f, 17.6651f, 12.0619f, 17.5071f, 12.2218f)
        curveTo(17.2029f, 12.5293f, 16.528f, 12.5293f, 15.1783f, 12.5293f)
        lineTo(17.1952f, 14.6725f)
        curveTo(18.5397f, 16.1011f, 19.2119f, 16.8155f, 18.9407f, 17.4077f)
        curveTo(18.6695f, 18f, 17.6701f, 18f, 15.6714f, 18f)
        horizontalLineTo(15.1783f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 14f)
        verticalLineTo(22f)
        }
        }.build()

        return _pineTree!!
    }

private var _pineTree: ImageVector? = null
