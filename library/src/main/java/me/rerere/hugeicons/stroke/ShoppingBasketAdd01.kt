package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ShoppingBasketAdd01: ImageVector
    get() {
        if (_shoppingBasketAdd01 != null) {
            return _shoppingBasketAdd01!!
        }
        _shoppingBasketAdd01 = ImageVector.Builder(
            name = "ShoppingBasketAdd01",
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
        moveTo(13.25f, 22f)
        horizontalLineTo(10.25f)
        curveTo(6.95017f, 22f, 5.30025f, 22f, 4.27513f, 20.9749f)
        curveTo(3.25f, 19.9497f, 3.25f, 18.2998f, 3.25f, 15f)
        verticalLineTo(11f)
        curveTo(3.25f, 9.11438f, 3.25f, 8.17157f, 3.83579f, 7.58579f)
        curveTo(4.42157f, 7f, 5.36438f, 7f, 7.25f, 7f)
        horizontalLineTo(15.25f)
        curveTo(17.1356f, 7f, 18.0784f, 7f, 18.6642f, 7.58579f)
        curveTo(19.25f, 8.17157f, 19.25f, 9.11438f, 19.25f, 11f)
        verticalLineTo(13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.25f, 9.5f)
        curveTo(15.25f, 5.63401f, 13.4591f, 2f, 11.25f, 2f)
        curveTo(9.04086f, 2f, 7.25f, 5.63401f, 7.25f, 9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.25f, 19f)
        horizontalLineTo(21.25f)
        moveTo(18.25f, 22f)
        verticalLineTo(16f)
        }
        }.build()

        return _shoppingBasketAdd01!!
    }

private var _shoppingBasketAdd01: ImageVector? = null
