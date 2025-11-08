package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Fire: ImageVector
    get() {
        if (_fire != null) {
            return _fire!!
        }
        _fire = ImageVector.Builder(
            name = "Fire",
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
        moveTo(13.8561f, 22f)
        curveTo(26.0783f, 19f, 19.2338f, 7f, 10.9227f, 2f)
        curveTo(9.9453f, 5.5f, 8.47838f, 6.5f, 5.54497f, 10f)
        curveTo(1.66121f, 14.6339f, 3.5895f, 20f, 8.96719f, 22f)
        curveTo(8.1524f, 21f, 6.04958f, 18.9008f, 7.5f, 16f)
        curveTo(8f, 15f, 9f, 14f, 8.5f, 12f)
        curveTo(9.47778f, 12.5f, 11.5f, 13f, 12f, 15.5f)
        curveTo(12.8148f, 14.5f, 13.6604f, 12.4f, 12.8783f, 10f)
        curveTo(19f, 14.5f, 16.5f, 19f, 13.8561f, 22f)
        }
        }.build()

        return _fire!!
    }

private var _fire: ImageVector? = null
