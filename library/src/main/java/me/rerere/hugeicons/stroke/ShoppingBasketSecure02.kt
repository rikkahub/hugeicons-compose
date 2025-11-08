package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ShoppingBasketSecure02: ImageVector
    get() {
        if (_shoppingBasketSecure02 != null) {
            return _shoppingBasketSecure02!!
        }
        _shoppingBasketSecure02 = ImageVector.Builder(
            name = "ShoppingBasketSecure02",
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
        moveTo(20.5601f, 11.5f)
        lineTo(20.8221f, 9.93557f)
        curveTo(21.0113f, 8.8063f, 21.1059f, 8.24167f, 20.8146f, 7.87083f)
        curveTo(20.5234f, 7.5f, 19.9853f, 7.5f, 18.9092f, 7.5f)
        horizontalLineTo(5.09079f)
        curveTo(4.01468f, 7.5f, 3.47662f, 7.5f, 3.18537f, 7.87083f)
        curveTo(2.89411f, 8.24167f, 2.98869f, 8.8063f, 3.17786f, 9.93557f)
        lineTo(4.34085f, 16.8781f)
        curveTo(4.75097f, 19.3264f, 4.95603f, 20.5505f, 5.76809f, 21.2752f)
        curveTo(6.58014f, 22f, 7.66701f, 22f, 10f, 22f)
        horizontalLineTo(12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 7.5f)
        verticalLineTo(7f)
        curveTo(7f, 4.23858f, 9.23858f, 2f, 12f, 2f)
        curveTo(14.7614f, 2f, 17f, 4.23858f, 17f, 7f)
        verticalLineTo(7.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.5f, 17.5f)
        horizontalLineTo(10.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 17.5f)
        verticalLineTo(15f)
        curveTo(19f, 15f, 17.5f, 14f, 17.5f, 14f)
        curveTo(17.5f, 14f, 16f, 15f, 14f, 15f)
        verticalLineTo(17.5f)
        curveTo(14f, 21f, 17.5f, 22f, 17.5f, 22f)
        curveTo(17.5f, 22f, 21f, 21f, 21f, 17.5f)
        }
        }.build()

        return _shoppingBasketSecure02!!
    }

private var _shoppingBasketSecure02: ImageVector? = null
