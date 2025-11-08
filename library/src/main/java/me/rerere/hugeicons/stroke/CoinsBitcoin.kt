package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CoinsBitcoin: ImageVector
    get() {
        if (_coinsBitcoin != null) {
            return _coinsBitcoin!!
        }
        _coinsBitcoin = ImageVector.Builder(
            name = "CoinsBitcoin",
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
        moveTo(14f, 18f)
        curveTo(18.4183f, 18f, 22f, 14.4183f, 22f, 10f)
        curveTo(22f, 5.58172f, 18.4183f, 2f, 14f, 2f)
        curveTo(9.58172f, 2f, 6f, 5.58172f, 6f, 10f)
        curveTo(6f, 14.4183f, 9.58172f, 18f, 14f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.1004f, 11f)
        curveTo(2.4033f, 12.1065f, 2f, 13.4168f, 2f, 14.8212f)
        curveTo(2f, 18.7859f, 5.21417f, 22f, 9.17905f, 22f)
        curveTo(10.5834f, 22f, 11.8935f, 21.5968f, 13f, 20.8998f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 10f)
        horizontalLineTo(15.5f)
        moveTo(12f, 10f)
        verticalLineTo(6.5f)
        horizontalLineTo(14f)
        moveTo(12f, 10f)
        verticalLineTo(13.5f)
        horizontalLineTo(14f)
        moveTo(15.5f, 10f)
        curveTo(16.3284f, 10f, 17f, 9.2165f, 17f, 8.25f)
        curveTo(17f, 7.2835f, 16.3284f, 6.5f, 15.5f, 6.5f)
        horizontalLineTo(14f)
        moveTo(15.5f, 10f)
        curveTo(16.3284f, 10f, 17f, 10.7835f, 17f, 11.75f)
        curveTo(17f, 12.7165f, 16.3284f, 13.5f, 15.5f, 13.5f)
        horizontalLineTo(14f)
        moveTo(14f, 13.5f)
        verticalLineTo(14.5f)
        moveTo(14f, 6.5f)
        verticalLineTo(5.5f)
        }
        }.build()

        return _coinsBitcoin!!
    }

private var _coinsBitcoin: ImageVector? = null
