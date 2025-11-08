package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ShoppingBagRemove: ImageVector
    get() {
        if (_shoppingBagRemove != null) {
            return _shoppingBagRemove!!
        }
        _shoppingBagRemove = ImageVector.Builder(
            name = "ShoppingBagRemove",
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
        moveTo(8f, 6.5f)
        curveTo(8f, 8.15685f, 9.34315f, 9.5f, 11f, 9.5f)
        curveTo(12.6569f, 9.5f, 14f, 8.15685f, 14f, 6.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 16.5f)
        lineTo(21f, 21.5f)
        moveTo(16f, 21.5f)
        lineTo(21f, 16.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.1084f, 20.5f)
        horizontalLineTo(9.89162f)
        curveTo(6.02422f, 20.5f, 4.09052f, 20.5f, 2.89731f, 19.1594f)
        curveTo(1.70411f, 17.8189f, 1.91058f, 16.0497f, 2.32352f, 12.5113f)
        curveTo(2.6739f, 9.50898f, 3.18586f, 7.25784f, 3.66063f, 5.65851f)
        curveTo(4.04994f, 4.34711f, 4.24459f, 3.69141f, 5.04283f, 3.0957f)
        curveTo(5.84107f, 2.5f, 6.65697f, 2.5f, 8.28876f, 2.5f)
        horizontalLineTo(13.7113f)
        curveTo(15.3431f, 2.5f, 16.159f, 2.5f, 16.9572f, 3.0957f)
        curveTo(17.7554f, 3.69141f, 17.9501f, 4.34711f, 18.3394f, 5.65851f)
        curveTo(18.8142f, 7.25784f, 19.3261f, 9.50898f, 19.6765f, 12.5113f)
        curveTo(19.7169f, 12.8574f, 19.7553f, 13.1865f, 19.7906f, 13.5f)
        }
        }.build()

        return _shoppingBagRemove!!
    }

private var _shoppingBagRemove: ImageVector? = null
