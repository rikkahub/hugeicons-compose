package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ShoppingBasketCheckOut02: ImageVector
    get() {
        if (_shoppingBasketCheckOut02 != null) {
            return _shoppingBasketCheckOut02!!
        }
        _shoppingBasketCheckOut02 = ImageVector.Builder(
            name = "ShoppingBasketCheckOut02",
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
        horizontalLineTo(10.0796f)
        curveTo(7.74664f, 22f, 6.58014f, 22f, 5.76809f, 21.2752f)
        curveTo(4.95603f, 20.5505f, 4.75097f, 19.3264f, 4.34085f, 16.8781f)
        lineTo(3.17786f, 9.93557f)
        curveTo(2.98869f, 8.8063f, 2.89411f, 8.24167f, 3.18537f, 7.87083f)
        curveTo(3.47662f, 7.5f, 4.01468f, 7.5f, 5.09079f, 7.5f)
        horizontalLineTo(18.9092f)
        curveTo(19.9853f, 7.5f, 20.5234f, 7.5f, 20.8146f, 7.87083f)
        curveTo(21.1059f, 8.24167f, 21.0113f, 8.8063f, 20.8221f, 9.93557f)
        lineTo(20.5601f, 11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 19.5f)
        curveTo(16.4915f, 20.0057f, 17.7998f, 22f, 18.5f, 22f)
        moveTo(21f, 19.5f)
        curveTo(20.5085f, 20.0057f, 19.2002f, 22f, 18.5f, 22f)
        moveTo(18.5f, 22f)
        verticalLineTo(14f)
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
        horizontalLineTo(13f)
        }
        }.build()

        return _shoppingBasketCheckOut02!!
    }

private var _shoppingBasketCheckOut02: ImageVector? = null
