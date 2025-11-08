package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Inequality01: ImageVector
    get() {
        if (_inequality01 != null) {
            return _inequality01!!
        }
        _inequality01 = ImageVector.Builder(
            name = "Inequality01",
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
        moveTo(3f, 20f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 16f)
        horizontalLineTo(6.83782f)
        curveTo(4.45713f, 16f, 3.26678f, 16f, 3.03483f, 15.3728f)
        curveTo(2.80288f, 14.7455f, 3.73716f, 14.0531f, 5.60572f, 12.6682f)
        lineTo(17.3015f, 4f)
        }
        }.build()

        return _inequality01!!
    }

private var _inequality01: ImageVector? = null
