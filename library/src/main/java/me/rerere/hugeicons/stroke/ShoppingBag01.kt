package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ShoppingBag01: ImageVector
    get() {
        if (_shoppingBag01 != null) {
            return _shoppingBag01!!
        }
        _shoppingBag01 = ImageVector.Builder(
            name = "ShoppingBag01",
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
        moveTo(3.32349f, 13.0113f)
        curveTo(3.67387f, 10.009f, 4.18582f, 7.75784f, 4.6606f, 6.15851f)
        curveTo(5.04991f, 4.84711f, 5.24456f, 4.19141f, 6.0428f, 3.5957f)
        curveTo(6.84104f, 3f, 7.65694f, 3f, 9.28873f, 3f)
        horizontalLineTo(14.7112f)
        curveTo(16.343f, 3f, 17.1589f, 3f, 17.9572f, 3.5957f)
        curveTo(18.7554f, 4.19141f, 18.9501f, 4.84711f, 19.3394f, 6.15851f)
        curveTo(19.8142f, 7.75784f, 20.3261f, 10.009f, 20.6765f, 13.0113f)
        curveTo(21.0894f, 16.5497f, 21.2959f, 18.3189f, 20.1027f, 19.6594f)
        curveTo(18.9095f, 21f, 16.9758f, 21f, 13.1084f, 21f)
        horizontalLineTo(10.8916f)
        curveTo(7.02419f, 21f, 5.09049f, 21f, 3.89728f, 19.6594f)
        curveTo(2.70408f, 18.3189f, 2.91055f, 16.5497f, 3.32349f, 13.0113f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.99997f, 7f)
        curveTo(8.99997f, 8.65685f, 10.3431f, 10f, 12f, 10f)
        curveTo(13.6568f, 10f, 15f, 8.65685f, 15f, 7f)
        }
        }.build()

        return _shoppingBag01!!
    }

private var _shoppingBag01: ImageVector? = null
