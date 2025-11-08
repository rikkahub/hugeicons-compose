package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Cardigan: ImageVector
    get() {
        if (_cardigan != null) {
            return _cardigan!!
        }
        _cardigan = ImageVector.Builder(
            name = "Cardigan",
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
        moveTo(6.5f, 16f)
        lineTo(5f, 21f)
        horizontalLineTo(2f)
        lineTo(2.88566f, 7.71504f)
        curveTo(2.95649f, 6.65269f, 3.58507f, 5.70746f, 4.53738f, 5.23131f)
        lineTo(9f, 3f)
        curveTo(10.4175f, 4.59466f, 13.5825f, 4.59466f, 15f, 3f)
        lineTo(19.4626f, 5.23131f)
        curveTo(20.4149f, 5.70746f, 21.0435f, 6.65269f, 21.1143f, 7.71504f)
        lineTo(22f, 21f)
        horizontalLineTo(19f)
        lineTo(17.5f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 9f)
        lineTo(7f, 19f)
        lineTo(8f, 21f)
        horizontalLineTo(16f)
        lineTo(17f, 19f)
        lineTo(18f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.5f, 3.5f)
        curveTo(8.5f, 3.5f, 8.5f, 7.37324f, 11.2949f, 8.73146f)
        curveTo(11.6964f, 8.92661f, 12f, 9.30782f, 12f, 9.7543f)
        verticalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5f, 3.5f)
        curveTo(15.5f, 3.5f, 15.5f, 8f, 12f, 9f)
        }
        }.build()

        return _cardigan!!
    }

private var _cardigan: ImageVector? = null
