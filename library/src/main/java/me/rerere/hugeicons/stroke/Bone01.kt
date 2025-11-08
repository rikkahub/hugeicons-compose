package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Bone01: ImageVector
    get() {
        if (_bone01 != null) {
            return _bone01!!
        }
        _bone01 = ImageVector.Builder(
            name = "Bone01",
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
        moveTo(17.3997f, 5.83806f)
        curveTo(17.8288f, 5.40901f, 18.3665f, 5.15489f, 18.9243f, 5.07568f)
        moveTo(18.9243f, 5.07568f)
        curveTo(19.7347f, 4.96061f, 20.5874f, 5.21474f, 21.2107f, 5.83806f)
        curveTo(22.2631f, 6.89044f, 22.2631f, 8.59667f, 21.2107f, 9.64905f)
        curveTo(20.3628f, 10.497f, 19.0904f, 10.6617f, 18.0775f, 10.1432f)
        curveTo(17.6635f, 9.93132f, 17.1331f, 9.91564f, 16.8043f, 10.2445f)
        lineTo(10.2445f, 16.8043f)
        curveTo(9.91564f, 17.1331f, 9.93132f, 17.6635f, 10.1432f, 18.0775f)
        curveTo(10.6617f, 19.0904f, 10.497f, 20.3628f, 9.64904f, 21.2107f)
        curveTo(8.59667f, 22.2631f, 6.89044f, 22.2631f, 5.83806f, 21.2107f)
        curveTo(5.21474f, 20.5874f, 4.96061f, 19.7347f, 5.07568f, 18.9243f)
        moveTo(18.9243f, 5.07568f)
        curveTo(19.0394f, 4.26531f, 18.7853f, 3.41261f, 18.1619f, 2.78928f)
        curveTo(17.1096f, 1.73691f, 15.4033f, 1.73691f, 14.351f, 2.78928f)
        curveTo(13.503f, 3.6372f, 13.3383f, 4.90961f, 13.8568f, 5.92247f)
        curveTo(14.0687f, 6.33646f, 14.0844f, 6.86686f, 13.7555f, 7.19572f)
        lineTo(7.19572f, 13.7555f)
        curveTo(6.86686f, 14.0844f, 6.33646f, 14.0687f, 5.92247f, 13.8568f)
        curveTo(4.90961f, 13.3383f, 3.6372f, 13.503f, 2.78928f, 14.351f)
        curveTo(1.73691f, 15.4033f, 1.73691f, 17.1096f, 2.78928f, 18.1619f)
        curveTo(3.4126f, 18.7853f, 4.26532f, 19.0394f, 5.07568f, 18.9243f)
        moveTo(6.60026f, 18.1619f)
        curveTo(6.17121f, 18.591f, 5.63348f, 18.8451f, 5.07568f, 18.9243f)
        }
        }.build()

        return _bone01!!
    }

private var _bone01: ImageVector? = null
