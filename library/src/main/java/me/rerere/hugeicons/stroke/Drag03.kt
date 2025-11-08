package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Drag03: ImageVector
    get() {
        if (_drag03 != null) {
            return _drag03!!
        }
        _drag03 = ImageVector.Builder(
            name = "Drag03",
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
        moveTo(7.36734f, 12.171f)
        lineTo(9.50123f, 14f)
        verticalLineTo(4.25f)
        curveTo(9.50123f, 3.2835f, 10.2847f, 2.5f, 11.2512f, 2.5f)
        curveTo(12.2177f, 2.5f, 13.0012f, 3.2835f, 13.0012f, 4.25f)
        verticalLineTo(9.5f)
        lineTo(15.9891f, 9.97757f)
        curveTo(17.9177f, 10.2669f, 18.8821f, 10.4115f, 19.5613f, 10.8184f)
        curveTo(20.6833f, 11.4906f, 21.4961f, 12.5f, 21.4961f, 13.9736f)
        curveTo(21.4961f, 15f, 21.2424f, 15.6886f, 20.6257f, 17.5387f)
        curveTo(20.2344f, 18.7127f, 20.0387f, 19.2996f, 19.7197f, 19.7643f)
        curveTo(19.1944f, 20.5293f, 18.4194f, 21.0878f, 17.5276f, 21.3442f)
        curveTo(16.9859f, 21.5f, 16.3672f, 21.5f, 15.1297f, 21.5f)
        horizontalLineTo(14.0808f)
        curveTo(12.4356f, 21.5f, 11.613f, 21.5f, 10.8807f, 21.1981f)
        curveTo(10.7494f, 21.144f, 10.621f, 21.0829f, 10.4962f, 21.0151f)
        curveTo(9.80014f, 20.6371f, 9.28143f, 19.9987f, 8.244f, 18.7219f)
        lineTo(4.8855f, 14.5883f)
        curveTo(4.36941f, 13.9531f, 4.36596f, 13.0441f, 4.87723f, 12.405f)
        curveTo(5.49174f, 11.6369f, 6.62046f, 11.5308f, 7.36734f, 12.171f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 4.5f)
        lineTo(16f, 4.5f)
        moveTo(20f, 4.5f)
        curveTo(20f, 5.06018f, 18.5057f, 6.10678f, 18f, 6.5f)
        moveTo(20f, 4.5f)
        curveTo(20f, 3.93982f, 18.5057f, 2.89322f, 18f, 2.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.5f, 4.5f)
        lineTo(6.5f, 4.5f)
        moveTo(2.5f, 4.5f)
        curveTo(2.5f, 3.93982f, 3.9943f, 2.89322f, 4.5f, 2.5f)
        moveTo(2.5f, 4.5f)
        curveTo(2.5f, 5.06018f, 3.9943f, 6.10678f, 4.5f, 6.5f)
        }
        }.build()

        return _drag03!!
    }

private var _drag03: ImageVector? = null
