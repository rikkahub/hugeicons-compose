package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Fahrenheit: ImageVector
    get() {
        if (_fahrenheit != null) {
            return _fahrenheit!!
        }
        _fahrenheit = ImageVector.Builder(
            name = "Fahrenheit",
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
        moveTo(21f, 4f)
        horizontalLineTo(18f)
        curveTo(15.1716f, 4f, 13.7574f, 4f, 12.8787f, 4.87868f)
        curveTo(12f, 5.75736f, 12f, 7.17157f, 12f, 10f)
        verticalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 12f)
        horizontalLineTo(19f)
        }
        }.build()

        return _fahrenheit!!
    }

private var _fahrenheit: ImageVector? = null
