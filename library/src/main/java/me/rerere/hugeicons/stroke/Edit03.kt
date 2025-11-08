package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Edit03: ImageVector
    get() {
        if (_edit03 != null) {
            return _edit03!!
        }
        _edit03 = ImageVector.Builder(
            name = "Edit03",
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
        moveTo(3.78181f, 16.3092f)
        lineTo(3f, 21f)
        lineTo(7.69086f, 20.2182f)
        curveTo(8.50544f, 20.0825f, 9.25725f, 19.6956f, 9.84119f, 19.1116f)
        lineTo(20.4198f, 8.53288f)
        curveTo(21.1934f, 7.75922f, 21.1934f, 6.5049f, 20.4197f, 5.73126f)
        lineTo(18.2687f, 3.58024f)
        curveTo(17.495f, 2.80658f, 16.2406f, 2.80659f, 15.4669f, 3.58027f)
        lineTo(4.88841f, 14.159f)
        curveTo(4.30447f, 14.7429f, 3.91757f, 15.4947f, 3.78181f, 16.3092f)
        }

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
        }.build()

        return _edit03!!
    }

private var _edit03: ImageVector? = null
