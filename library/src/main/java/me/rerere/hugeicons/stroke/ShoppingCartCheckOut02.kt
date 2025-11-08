package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ShoppingCartCheckOut02: ImageVector
    get() {
        if (_shoppingCartCheckOut02 != null) {
            return _shoppingCartCheckOut02!!
        }
        _shoppingCartCheckOut02 = ImageVector.Builder(
            name = "ShoppingCartCheckOut02",
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
        horizontalLineTo(8f)
        moveTo(22f, 6f)
        horizontalLineTo(19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 5.5f)
        curveTo(11.4915f, 4.9943f, 12.7998f, 3f, 13.5f, 3f)
        moveTo(16f, 5.5f)
        curveTo(15.5085f, 4.9943f, 14.2002f, 3f, 13.5f, 3f)
        moveTo(13.5f, 3f)
        verticalLineTo(11f)
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

        return _shoppingCartCheckOut02!!
    }

private var _shoppingCartCheckOut02: ImageVector? = null
