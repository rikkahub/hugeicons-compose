package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ShoppingCartAdd02: ImageVector
    get() {
        if (_shoppingCartAdd02 != null) {
            return _shoppingCartAdd02!!
        }
        _shoppingCartAdd02 = ImageVector.Builder(
            name = "ShoppingCartAdd02",
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
        horizontalLineTo(6.5f)
        moveTo(22f, 6f)
        horizontalLineTo(19.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.5f, 6f)
        horizontalLineTo(16.5f)
        moveTo(13f, 9.5f)
        verticalLineTo(2.5f)
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

        return _shoppingCartAdd02!!
    }

private var _shoppingCartAdd02: ImageVector? = null
