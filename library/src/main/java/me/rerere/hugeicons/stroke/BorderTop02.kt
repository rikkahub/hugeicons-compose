package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BorderTop02: ImageVector
    get() {
        if (_borderTop02 != null) {
            return _borderTop02!!
        }
        _borderTop02 = ImageVector.Builder(
            name = "BorderTop02",
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
        moveTo(2.75313f, 17.6664f)
        curveTo(2.94642f, 18.7148f, 3.28828f, 19.4863f, 3.89295f, 20.0963f)
        curveTo(4.49762f, 20.7063f, 5.26247f, 21.0511f, 6.30171f, 21.2461f)
        moveTo(2.50666f, 9.99976f)
        curveTo(2.50171f, 10.5893f, 2.50171f, 11.2265f, 2.50171f, 11.9164f)
        curveTo(2.50171f, 12.6063f, 2.50171f, 13.2436f, 2.50666f, 13.8331f)
        moveTo(10.1017f, 21.4948f)
        curveTo(10.6861f, 21.4998f, 11.3178f, 21.4998f, 12.0017f, 21.4998f)
        curveTo(12.6856f, 21.4998f, 13.3173f, 21.4998f, 13.9018f, 21.4948f)
        moveTo(17.7017f, 21.2461f)
        curveTo(18.7409f, 21.0511f, 19.5058f, 20.7063f, 20.1105f, 20.0963f)
        curveTo(20.7151f, 19.4863f, 21.057f, 18.7148f, 21.2503f, 17.6664f)
        moveTo(21.4968f, 9.99976f)
        curveTo(21.5017f, 10.5891f, 21.5017f, 11.2268f, 21.5017f, 11.9164f)
        curveTo(21.5017f, 12.6063f, 21.5017f, 13.2434f, 21.4968f, 13.8329f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.49976f, 6.49988f)
        curveTo(2.69829f, 5.40594f, 3.04945f, 4.60084f, 3.67056f, 3.96434f)
        curveTo(5.09962f, 2.49988f, 7.39967f, 2.49988f, 11.9998f, 2.49988f)
        curveTo(16.5998f, 2.49988f, 18.8999f, 2.49988f, 20.329f, 3.96435f)
        curveTo(20.9501f, 4.60084f, 21.3012f, 5.40594f, 21.4998f, 6.49988f)
        }
        }.build()

        return _borderTop02!!
    }

private var _borderTop02: ImageVector? = null
