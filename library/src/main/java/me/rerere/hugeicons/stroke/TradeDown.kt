package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TradeDown: ImageVector
    get() {
        if (_tradeDown != null) {
            return _tradeDown!!
        }
        _tradeDown = ImageVector.Builder(
            name = "TradeDown",
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
        moveTo(20f, 11f)
        verticalLineTo(16f)
        horizontalLineTo(15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 16f)
        lineTo(15f, 11f)
        curveTo(14.1174f, 10.1174f, 13.6762f, 9.67615f, 13.1346f, 9.62737f)
        curveTo(13.045f, 9.6193f, 12.955f, 9.6193f, 12.8654f, 9.62737f)
        curveTo(12.3238f, 9.67615f, 11.8826f, 10.1174f, 11f, 11f)
        curveTo(10.1174f, 11.8826f, 9.67615f, 12.3238f, 9.13457f, 12.3726f)
        curveTo(9.04504f, 12.3807f, 8.95496f, 12.3807f, 8.86543f, 12.3726f)
        curveTo(8.32385f, 12.3238f, 7.88256f, 11.8826f, 7f, 11f)
        lineTo(4f, 8f)
        }
        }.build()

        return _tradeDown!!
    }

private var _tradeDown: ImageVector? = null
