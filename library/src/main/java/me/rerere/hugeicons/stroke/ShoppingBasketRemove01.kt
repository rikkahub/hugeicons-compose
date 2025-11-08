package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ShoppingBasketRemove01: ImageVector
    get() {
        if (_shoppingBasketRemove01 != null) {
            return _shoppingBasketRemove01!!
        }
        _shoppingBasketRemove01 = ImageVector.Builder(
            name = "ShoppingBasketRemove01",
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
        moveTo(13f, 22f)
        horizontalLineTo(10f)
        curveTo(6.70017f, 22f, 5.05025f, 22f, 4.02513f, 20.9749f)
        curveTo(3f, 19.9497f, 3f, 18.2998f, 3f, 15f)
        verticalLineTo(11f)
        curveTo(3f, 9.11438f, 3f, 8.17157f, 3.58579f, 7.58579f)
        curveTo(4.17157f, 7f, 5.11438f, 7f, 7f, 7f)
        horizontalLineTo(15f)
        curveTo(16.8856f, 7f, 17.8284f, 7f, 18.4142f, 7.58579f)
        curveTo(19f, 8.17157f, 19f, 9.11438f, 19f, 11f)
        verticalLineTo(14f)
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
        moveTo(16f, 17f)
        lineTo(21f, 22f)
        moveTo(16f, 22f)
        lineTo(21f, 17f)
        }
        }.build()

        return _shoppingBasketRemove01!!
    }

private var _shoppingBasketRemove01: ImageVector? = null
