package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ShoppingBagCheck: ImageVector
    get() {
        if (_shoppingBagCheck != null) {
            return _shoppingBagCheck!!
        }
        _shoppingBagCheck = ImageVector.Builder(
            name = "ShoppingBagCheck",
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
        moveTo(20.1765f, 12.5113f)
        curveTo(19.8261f, 9.50898f, 19.3142f, 7.25784f, 18.8394f, 5.65851f)
        curveTo(18.4501f, 4.34711f, 18.2554f, 3.69141f, 17.4572f, 3.0957f)
        curveTo(16.659f, 2.5f, 15.8431f, 2.5f, 14.2113f, 2.5f)
        horizontalLineTo(8.78876f)
        curveTo(7.15697f, 2.5f, 6.34107f, 2.5f, 5.54283f, 3.0957f)
        curveTo(4.74459f, 3.69141f, 4.54994f, 4.34711f, 4.16063f, 5.65851f)
        curveTo(3.68586f, 7.25784f, 3.1739f, 9.50898f, 2.82352f, 12.5113f)
        curveTo(2.41058f, 16.0497f, 2.20411f, 17.8189f, 3.39731f, 19.1594f)
        curveTo(4.59052f, 20.5f, 6.52422f, 20.5f, 10.3916f, 20.5f)
        horizontalLineTo(11.6084f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.5f, 6.5f)
        curveTo(8.5f, 8.15685f, 9.84315f, 9.5f, 11.5f, 9.5f)
        curveTo(13.1569f, 9.5f, 14.5f, 8.15685f, 14.5f, 6.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 19.5f)
        curveTo(14.5f, 19.5f, 15.5f, 19.5f, 16.5f, 21.5f)
        curveTo(16.5f, 21.5f, 18.6765f, 16.5f, 21.5f, 15.5f)
        }
        }.build()

        return _shoppingBagCheck!!
    }

private var _shoppingBagCheck: ImageVector? = null
