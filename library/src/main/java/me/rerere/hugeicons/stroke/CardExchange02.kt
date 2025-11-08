package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CardExchange02: ImageVector
    get() {
        if (_cardExchange02 != null) {
            return _cardExchange02!!
        }
        _cardExchange02 = ImageVector.Builder(
            name = "CardExchange02",
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
        moveTo(22f, 14.0057f)
        curveTo(22f, 17.3206f, 19.3171f, 20.0017f, 16f, 20.0017f)
        lineTo(16.8571f, 18.2886f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 10.0086f)
        curveTo(2f, 6.69363f, 4.68286f, 4.01257f, 8f, 4.01257f)
        lineTo(7.14286f, 5.72571f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.9658f, 5.52406f)
        horizontalLineTo(21.7723f)
        moveTo(13.4658f, 10.9943f)
        horizontalLineTo(19.4999f)
        curveTo(20.8806f, 10.9943f, 21.9999f, 9.87573f, 21.9999f, 8.49595f)
        verticalLineTo(4.49674f)
        curveTo(21.9999f, 3.11695f, 20.8806f, 1.99841f, 19.4999f, 1.99841f)
        horizontalLineTo(13.4658f)
        curveTo(12.0851f, 1.99841f, 10.9658f, 3.11695f, 10.9658f, 4.49674f)
        verticalLineTo(8.49595f)
        curveTo(10.9658f, 9.87573f, 12.0851f, 10.9943f, 13.4658f, 10.9943f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 16.5314f)
        horizontalLineTo(12.8065f)
        moveTo(4.5f, 22.0016f)
        horizontalLineTo(10.5341f)
        curveTo(11.9148f, 22.0016f, 13.0341f, 20.8831f, 13.0341f, 19.5033f)
        verticalLineTo(15.5041f)
        curveTo(13.0341f, 14.1243f, 11.9148f, 13.0057f, 10.5341f, 13.0057f)
        horizontalLineTo(4.5f)
        curveTo(3.11929f, 13.0057f, 2f, 14.1243f, 2f, 15.5041f)
        verticalLineTo(19.5033f)
        curveTo(2f, 20.8831f, 3.11929f, 22.0016f, 4.5f, 22.0016f)
        }
        }.build()

        return _cardExchange02!!
    }

private var _cardExchange02: ImageVector? = null
