package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CheckmarkSquare04: ImageVector
    get() {
        if (_checkmarkSquare04 != null) {
            return _checkmarkSquare04!!
        }
        _checkmarkSquare04 = ImageVector.Builder(
            name = "CheckmarkSquare04",
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
        moveTo(15f, 2.5f)
        horizontalLineTo(12f)
        curveTo(7.52166f, 2.5f, 5.28249f, 2.5f, 3.89124f, 3.89124f)
        curveTo(2.5f, 5.28249f, 2.5f, 7.52166f, 2.5f, 12f)
        curveTo(2.5f, 16.4783f, 2.5f, 18.7175f, 3.89124f, 20.1088f)
        curveTo(5.28249f, 21.5f, 7.52166f, 21.5f, 12f, 21.5f)
        curveTo(16.4783f, 21.5f, 18.7175f, 21.5f, 20.1088f, 20.1088f)
        curveTo(21.5f, 18.7175f, 21.5f, 16.4783f, 21.5f, 12f)
        verticalLineTo(10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.5f, 10f)
        lineTo(12f, 13.5f)
        lineTo(21.0002f, 3.5f)
        }
        }.build()

        return _checkmarkSquare04!!
    }

private var _checkmarkSquare04: ImageVector? = null
