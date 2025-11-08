package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Paypal: ImageVector
    get() {
        if (_paypal != null) {
            return _paypal!!
        }
        _paypal = ImageVector.Builder(
            name = "Paypal",
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
        moveTo(6.29358f, 4.83499f)
        lineTo(4.16511f, 17.6712f)
        curveTo(3.98586f, 18.7522f, 3.89623f, 19.2927f, 4.19427f, 19.6464f)
        curveTo(4.49231f, 20f, 5.03749f, 20f, 6.12785f, 20f)
        horizontalLineTo(6.53027f)
        curveTo(7.35308f, 20f, 7.76448f, 20f, 8.04501f, 19.7555f)
        curveTo(8.32554f, 19.5109f, 8.38372f, 19.1016f, 8.50008f, 18.2828f)
        lineTo(8.96761f, 14.9934f)
        curveTo(9.00457f, 14.7333f, 9.02305f, 14.6033f, 9.05213f, 14.492f)
        curveTo(9.26041f, 13.6948f, 9.93391f, 13.1077f, 10.7485f, 13.0132f)
        curveTo(10.8622f, 13f, 10.9929f, 13f, 11.2543f, 13f)
        horizontalLineTo(12.4163f)
        curveTo(15.5113f, 13f, 18.1943f, 10.8473f, 18.8803f, 7.81384f)
        curveTo(19.5536f, 4.83576f, 17.3016f, 2f, 14.2631f, 2f)
        horizontalLineTo(9.62312f)
        curveTo(8.5093f, 2f, 7.95239f, 2f, 7.51383f, 2.2348f)
        curveTo(7.26304f, 2.36907f, 7.04377f, 2.55577f, 6.87077f, 2.78235f)
        curveTo(6.56824f, 3.17856f, 6.47669f, 3.7307f, 6.29358f, 4.83499f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.24315f, 19.4998f)
        lineTo(8.01451f, 20.8325f)
        curveTo(7.90978f, 21.4429f, 8.38532f, 21.9998f, 9.01128f, 21.9998f)
        horizontalLineTo(11.0018f)
        curveTo(11.4961f, 21.9998f, 11.9179f, 21.6464f, 11.9991f, 21.1642f)
        lineTo(12.7285f, 16.8354f)
        curveTo(12.8098f, 16.3533f, 13.2316f, 15.9998f, 13.7258f, 15.9998f)
        horizontalLineTo(15.5289f)
        curveTo(18.11f, 15.9998f, 20.3448f, 14.2267f, 20.9047f, 11.7345f)
        curveTo(21.2967f, 9.99004f, 20.4437f, 8.30993f, 19f, 7.50098f)
        }
        }.build()

        return _paypal!!
    }

private var _paypal: ImageVector? = null
