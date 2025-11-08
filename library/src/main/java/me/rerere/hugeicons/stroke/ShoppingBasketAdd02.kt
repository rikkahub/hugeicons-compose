package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ShoppingBasketAdd02: ImageVector
    get() {
        if (_shoppingBasketAdd02 != null) {
            return _shoppingBasketAdd02!!
        }
        _shoppingBasketAdd02 = ImageVector.Builder(
            name = "ShoppingBasketAdd02",
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
        moveTo(13f, 18f)
        horizontalLineTo(21f)
        moveTo(17f, 22f)
        lineTo(17f, 14f)
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
        moveTo(10f, 22f)
        curveTo(7.71999f, 21.9999f, 6.57085f, 21.9917f, 5.76809f, 21.2752f)
        curveTo(4.95603f, 20.5505f, 4.75097f, 19.3264f, 4.34085f, 16.8781f)
        lineTo(3.17786f, 9.93557f)
        curveTo(2.98869f, 8.8063f, 2.89411f, 8.24167f, 3.18537f, 7.87083f)
        curveTo(3.47662f, 7.5f, 4.01468f, 7.5f, 5.09079f, 7.5f)
        horizontalLineTo(18.9092f)
        curveTo(19.9853f, 7.5f, 20.5234f, 7.5f, 20.8146f, 7.87083f)
        curveTo(21.1059f, 8.24167f, 21.0113f, 8.8063f, 20.8221f, 9.93557f)
        lineTo(20.4763f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.5f, 17.5f)
        horizontalLineTo(10f)
        }
        }.build()

        return _shoppingBasketAdd02!!
    }

private var _shoppingBasketAdd02: ImageVector? = null
