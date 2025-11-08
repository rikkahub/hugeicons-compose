package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ShoppingCartFavorite02: ImageVector
    get() {
        if (_shoppingCartFavorite02 != null) {
            return _shoppingCartFavorite02!!
        }
        _shoppingCartFavorite02 = ImageVector.Builder(
            name = "ShoppingCartFavorite02",
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
        moveTo(8f, 16f)
        lineTo(16.7201f, 15.2733f)
        curveTo(19.4486f, 15.046f, 20.0611f, 14.45f, 20.3635f, 11.7289f)
        lineTo(21f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 6f)
        horizontalLineTo(7f)
        moveTo(22f, 6f)
        horizontalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.515f, 2.38661f)
        curveTo(11.5876f, 1.74692f, 12.5238f, 2.00471f, 13.0863f, 2.41534f)
        curveTo(13.3169f, 2.58371f, 13.4322f, 2.66789f, 13.5f, 2.66789f)
        curveTo(13.5678f, 2.66789f, 13.6831f, 2.58371f, 13.9137f, 2.41534f)
        curveTo(14.4762f, 2.00471f, 15.4124f, 1.74692f, 16.485f, 2.38661f)
        curveTo(17.8928f, 3.22614f, 18.2113f, 5.99578f, 14.9642f, 8.33242f)
        curveTo(14.3457f, 8.77747f, 14.0365f, 9f, 13.5f, 9f)
        curveTo(12.9635f, 9f, 12.6543f, 8.77747f, 12.0358f, 8.33242f)
        curveTo(8.78869f, 5.99578f, 9.10723f, 3.22614f, 10.515f, 2.38661f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 20f)
        lineTo(15f, 20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 2f)
        horizontalLineTo(2.966f)
        curveTo(3.91068f, 2f, 4.73414f, 2.62459f, 4.96326f, 3.51493f)
        lineTo(7.93852f, 15.0765f)
        curveTo(8.08887f, 15.6608f, 7.9602f, 16.2797f, 7.58824f, 16.7616f)
        lineTo(6.63213f, 18f)
        }
        }.build()

        return _shoppingCartFavorite02!!
    }

private var _shoppingCartFavorite02: ImageVector? = null
