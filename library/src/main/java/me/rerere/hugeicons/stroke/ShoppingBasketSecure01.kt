package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ShoppingBasketSecure01: ImageVector
    get() {
        if (_shoppingBasketSecure01 != null) {
            return _shoppingBasketSecure01!!
        }
        _shoppingBasketSecure01 = ImageVector.Builder(
            name = "ShoppingBasketSecure01",
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
        moveTo(13.5f, 22f)
        horizontalLineTo(10f)
        curveTo(6.70017f, 22f, 5.05025f, 22f, 4.02513f, 20.9749f)
        curveTo(3f, 19.9497f, 3f, 18.2998f, 3f, 15f)
        verticalLineTo(11f)
        curveTo(3f, 9.11438f, 3f, 8.17157f, 3.58579f, 7.58579f)
        curveTo(4.17157f, 7f, 5.11438f, 7f, 7f, 7f)
        horizontalLineTo(15f)
        curveTo(16.8856f, 7f, 17.8284f, 7f, 18.4142f, 7.58579f)
        curveTo(19f, 8.17157f, 19f, 9.11438f, 19f, 11f)
        verticalLineTo(12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 9.5f)
        curveTo(15f, 5.63401f, 13.2091f, 2f, 11f, 2f)
        curveTo(8.79086f, 2f, 7f, 5.63401f, 7f, 9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.2363f, 15.5234f)
        curveTo(19.6055f, 15.1938f, 18.8336f, 15f, 18f, 15f)
        curveTo(17.1664f, 15f, 16.3945f, 15.1938f, 15.7637f, 15.5234f)
        curveTo(15.4544f, 15.685f, 15.2997f, 15.7658f, 15.1499f, 16.0198f)
        curveTo(15f, 16.2739f, 15f, 16.5199f, 15f, 17.0118f)
        verticalLineTo(18.233f)
        curveTo(15f, 20.2222f, 16.5141f, 21.3281f, 17.391f, 21.8018f)
        curveTo(17.6356f, 21.9339f, 17.7578f, 22f, 18f, 22f)
        curveTo(18.2422f, 22f, 18.3644f, 21.9339f, 18.609f, 21.8018f)
        curveTo(19.4859f, 21.3281f, 21f, 20.2222f, 21f, 18.233f)
        lineTo(21f, 17.0119f)
        curveTo(21f, 16.5199f, 21f, 16.2739f, 20.8501f, 16.0198f)
        curveTo(20.7003f, 15.7658f, 20.5456f, 15.685f, 20.2363f, 15.5234f)
        }
        }.build()

        return _shoppingBasketSecure01!!
    }

private var _shoppingBasketSecure01: ImageVector? = null
