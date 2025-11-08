package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ShippingCenter: ImageVector
    get() {
        if (_shippingCenter != null) {
            return _shippingCenter!!
        }
        _shippingCenter = ImageVector.Builder(
            name = "ShippingCenter",
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
        moveTo(6f, 9f)
        curveTo(6f, 6.17157f, 6f, 4.75736f, 6.87868f, 3.87868f)
        curveTo(7.75736f, 3f, 9.17157f, 3f, 12f, 3f)
        curveTo(14.8284f, 3f, 16.2426f, 3f, 17.1213f, 3.87868f)
        curveTo(18f, 4.75736f, 18f, 6.17157f, 18f, 9f)
        curveTo(18f, 11.8284f, 18f, 13.2426f, 17.1213f, 14.1213f)
        curveTo(16.2426f, 15f, 14.8284f, 15f, 12f, 15f)
        curveTo(9.17157f, 15f, 7.75736f, 15f, 6.87868f, 14.1213f)
        curveTo(6f, 13.2426f, 6f, 11.8284f, 6f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.9955f, 18f)
        horizontalLineTo(12.0045f)
        moveTo(7f, 18f)
        horizontalLineTo(7.00897f)
        moveTo(16.991f, 18f)
        horizontalLineTo(17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.5f, 6f)
        horizontalLineTo(13.5f)
        }
        }.build()

        return _shippingCenter!!
    }

private var _shippingCenter: ImageVector? = null
