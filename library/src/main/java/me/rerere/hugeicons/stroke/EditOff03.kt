package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.EditOff03: ImageVector
    get() {
        if (_editOff03 != null) {
            return _editOff03!!
        }
        _editOff03 = ImageVector.Builder(
            name = "EditOff03",
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
        moveTo(14f, 6f)
        lineTo(18f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 3f)
        lineTo(21f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.5236f, 7.52363f)
        lineTo(15.4669f, 3.58027f)
        curveTo(16.2406f, 2.80659f, 17.495f, 2.80658f, 18.2687f, 3.58024f)
        lineTo(20.4197f, 5.73126f)
        curveTo(21.1934f, 6.5049f, 21.1934f, 7.75922f, 20.4198f, 8.53288f)
        lineTo(16.4764f, 12.4764f)
        moveTo(14.4764f, 14.4764f)
        lineTo(9.84119f, 19.1116f)
        curveTo(9.25725f, 19.6956f, 8.50544f, 20.0824f, 7.69086f, 20.2182f)
        lineTo(3f, 21f)
        lineTo(3.78181f, 16.3092f)
        curveTo(3.91757f, 15.4947f, 4.30447f, 14.7429f, 4.88841f, 14.159f)
        lineTo(9.52365f, 9.52365f)
        }
        }.build()

        return _editOff03!!
    }

private var _editOff03: ImageVector? = null
