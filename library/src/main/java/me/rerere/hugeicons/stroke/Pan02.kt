package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Pan02: ImageVector
    get() {
        if (_pan02 != null) {
            return _pan02!!
        }
        _pan02 = ImageVector.Builder(
            name = "Pan02",
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
        moveTo(20.5556f, 13f)
        horizontalLineTo(9.44444f)
        curveTo(9.19898f, 13f, 9f, 13.2487f, 9f, 13.5556f)
        curveTo(9f, 16.0102f, 10.5919f, 18f, 12.5556f, 18f)
        horizontalLineTo(17.4444f)
        curveTo(19.4081f, 18f, 21f, 16.0102f, 21f, 13.5556f)
        curveTo(21f, 13.2487f, 20.801f, 13f, 20.5556f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 13f)
        lineTo(7f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.36797f, 6.36797f)
        curveTo(2.85859f, 5.87734f, 3.65404f, 5.87734f, 4.14466f, 6.36797f)
        lineTo(6.63203f, 8.85534f)
        curveTo(7.12266f, 9.34596f, 7.12266f, 10.1414f, 6.63203f, 10.632f)
        curveTo(6.14141f, 11.1227f, 5.34596f, 11.1227f, 4.85534f, 10.632f)
        lineTo(2.36797f, 8.14466f)
        curveTo(1.87734f, 7.65404f, 1.87734f, 6.85859f, 2.36797f, 6.36797f)
        }
        }.build()

        return _pan02!!
    }

private var _pan02: ImageVector? = null
