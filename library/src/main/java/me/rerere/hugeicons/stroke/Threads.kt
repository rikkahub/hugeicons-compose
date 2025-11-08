package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Threads: ImageVector
    get() {
        if (_threads != null) {
            return _threads!!
        }
        _threads = ImageVector.Builder(
            name = "Threads",
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
        moveTo(19.25f, 8.50488f)
        curveTo(17.6729f, 2.63804f, 12.25f, 3.00452f, 12.25f, 3.00452f)
        curveTo(12.25f, 3.00452f, 4.75f, 2.50512f, 4.75f, 12f)
        curveTo(4.75f, 21.4949f, 12.25f, 20.9955f, 12.25f, 20.9955f)
        curveTo(12.25f, 20.9955f, 16.7077f, 21.2924f, 18.75f, 17.0782f)
        curveTo(19.4167f, 15.2204f, 19.25f, 11.5049f, 12.75f, 11.5049f)
        curveTo(12.75f, 11.5049f, 9.75f, 11.5049f, 9.75f, 14.0049f)
        curveTo(9.75f, 14.9812f, 10.75f, 16.0049f, 12.25f, 16.0049f)
        curveTo(13.75f, 16.0049f, 15.4212f, 14.9777f, 15.75f, 13.0049f)
        curveTo(16.75f, 7.00488f, 11.25f, 6.50488f, 9.75f, 9.00488f)
        }
        }.build()

        return _threads!!
    }

private var _threads: ImageVector? = null
