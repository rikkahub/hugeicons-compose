package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TradeUp: ImageVector
    get() {
        if (_tradeUp != null) {
            return _tradeUp!!
        }
        _tradeUp = ImageVector.Builder(
            name = "TradeUp",
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
        moveTo(20f, 13f)
        verticalLineTo(8f)
        horizontalLineTo(15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 8f)
        lineTo(15f, 13f)
        curveTo(14.1174f, 13.8826f, 13.6762f, 14.3238f, 13.1346f, 14.3726f)
        curveTo(13.045f, 14.3807f, 12.955f, 14.3807f, 12.8654f, 14.3726f)
        curveTo(12.3238f, 14.3238f, 11.8826f, 13.8826f, 11f, 13f)
        curveTo(10.1174f, 12.1174f, 9.67615f, 11.6762f, 9.13457f, 11.6274f)
        curveTo(9.04504f, 11.6193f, 8.95496f, 11.6193f, 8.86543f, 11.6274f)
        curveTo(8.32385f, 11.6762f, 7.88256f, 12.1174f, 7f, 13f)
        lineTo(4f, 16f)
        }
        }.build()

        return _tradeUp!!
    }

private var _tradeUp: ImageVector? = null
