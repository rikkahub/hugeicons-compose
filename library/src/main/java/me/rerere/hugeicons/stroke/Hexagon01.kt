package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Hexagon01: ImageVector
    get() {
        if (_hexagon01 != null) {
            return _hexagon01!!
        }
        _hexagon01 = ImageVector.Builder(
            name = "Hexagon01",
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
        moveTo(8.88231f, 3.32966f)
        curveTo(10.4038f, 2.44322f, 11.1646f, 2f, 12f, 2f)
        curveTo(12.8354f, 2f, 13.5962f, 2.44322f, 15.1177f, 3.32966f)
        lineTo(17.8823f, 4.94031f)
        curveTo(19.4038f, 5.82675f, 20.1646f, 6.26997f, 20.5823f, 7f)
        curveTo(21f, 7.73003f, 21f, 8.61647f, 21f, 10.3894f)
        verticalLineTo(13.6106f)
        curveTo(21f, 15.3835f, 21f, 16.27f, 20.5823f, 17f)
        curveTo(20.1646f, 17.73f, 19.4038f, 18.1733f, 17.8823f, 19.0597f)
        lineTo(15.1177f, 20.6703f)
        curveTo(13.5962f, 21.5568f, 12.8354f, 22f, 12f, 22f)
        curveTo(11.1646f, 22f, 10.4038f, 21.5568f, 8.88231f, 20.6703f)
        lineTo(6.11769f, 19.0597f)
        curveTo(4.59615f, 18.1733f, 3.83538f, 17.73f, 3.41769f, 17f)
        curveTo(3f, 16.27f, 3f, 15.3835f, 3f, 13.6106f)
        verticalLineTo(10.3894f)
        curveTo(3f, 8.61647f, 3f, 7.73003f, 3.41769f, 7f)
        curveTo(3.83538f, 6.26997f, 4.59615f, 5.82675f, 6.11769f, 4.94031f)
        lineTo(8.88231f, 3.32966f)
        }
        }.build()

        return _hexagon01!!
    }

private var _hexagon01: ImageVector? = null
