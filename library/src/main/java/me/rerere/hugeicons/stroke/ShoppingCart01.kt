package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ShoppingCart01: ImageVector
    get() {
        if (_shoppingCart01 != null) {
            return _shoppingCart01!!
        }
        _shoppingCart01 = ImageVector.Builder(
            name = "ShoppingCart01",
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
        moveTo(10.5f, 20.25f)
        curveTo(10.5f, 20.6642f, 10.1642f, 21f, 9.75f, 21f)
        curveTo(9.33579f, 21f, 9f, 20.6642f, 9f, 20.25f)
        curveTo(9f, 19.8358f, 9.33579f, 19.5f, 9.75f, 19.5f)
        curveTo(10.1642f, 19.5f, 10.5f, 19.8358f, 10.5f, 20.25f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 20.25f)
        curveTo(19f, 20.6642f, 18.6642f, 21f, 18.25f, 21f)
        curveTo(17.8358f, 21f, 17.5f, 20.6642f, 17.5f, 20.25f)
        curveTo(17.5f, 19.8358f, 17.8358f, 19.5f, 18.25f, 19.5f)
        curveTo(18.6642f, 19.5f, 19f, 19.8358f, 19f, 20.25f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 3f)
        horizontalLineTo(2.20664f)
        curveTo(3.53124f, 3f, 4.19354f, 3f, 4.6255f, 3.40221f)
        curveTo(5.05746f, 3.80441f, 5.10464f, 4.46503f, 5.19902f, 5.78626f)
        lineTo(5.45035f, 9.30496f)
        curveTo(5.5924f, 11.2936f, 5.66342f, 12.2879f, 5.96476f, 13.0961f)
        curveTo(6.62531f, 14.8677f, 8.08229f, 16.2244f, 9.89648f, 16.757f)
        curveTo(10.7241f, 17f, 11.7267f, 17f, 13.7317f, 17f)
        curveTo(15.8373f, 17f, 16.89f, 17f, 17.7417f, 16.7416f)
        curveTo(19.6593f, 16.1599f, 21.1599f, 14.6593f, 21.7416f, 12.7417f)
        curveTo(22f, 11.89f, 22f, 10.8433f, 22f, 8.75f)
        curveTo(22f, 8.05222f, 22f, 7.70333f, 21.9139f, 7.41943f)
        curveTo(21.72f, 6.78023f, 21.2198f, 6.28002f, 20.5806f, 6.08612f)
        curveTo(20.2967f, 6f, 19.9478f, 6f, 19.25f, 6f)
        horizontalLineTo(5.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 10f)
        verticalLineTo(13f)
        moveTo(11f, 10f)
        verticalLineTo(13f)
        }
        }.build()

        return _shoppingCart01!!
    }

private var _shoppingCart01: ImageVector? = null
