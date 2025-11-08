package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ShoppingBasket01: ImageVector
    get() {
        if (_shoppingBasket01 != null) {
            return _shoppingBasket01!!
        }
        _shoppingBasket01 = ImageVector.Builder(
            name = "ShoppingBasket01",
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
        moveTo(8f, 7f)
        horizontalLineTo(16f)
        curveTo(17.8856f, 7f, 18.8284f, 7f, 19.4142f, 7.58579f)
        curveTo(20f, 8.17157f, 20f, 9.11438f, 20f, 11f)
        verticalLineTo(15f)
        curveTo(20f, 18.2998f, 20f, 19.9497f, 18.9749f, 20.9749f)
        curveTo(17.9497f, 22f, 16.2998f, 22f, 13f, 22f)
        horizontalLineTo(11f)
        curveTo(7.70017f, 22f, 6.05025f, 22f, 5.02513f, 20.9749f)
        curveTo(4f, 19.9497f, 4f, 18.2998f, 4f, 15f)
        verticalLineTo(11f)
        curveTo(4f, 9.11438f, 4f, 8.17157f, 4.58579f, 7.58579f)
        curveTo(5.17157f, 7f, 6.11438f, 7f, 8f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 9.5f)
        curveTo(16f, 5.63401f, 14.2091f, 2f, 12f, 2f)
        curveTo(9.79086f, 2f, 8f, 5.63401f, 8f, 9.5f)
        }
        }.build()

        return _shoppingBasket01!!
    }

private var _shoppingBasket01: ImageVector? = null
