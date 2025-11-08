package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Setting06: ImageVector
    get() {
        if (_setting06 != null) {
            return _setting06!!
        }
        _setting06 = ImageVector.Builder(
            name = "Setting06",
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
        moveTo(20.7906f, 9.15201f)
        curveTo(21.5969f, 10.5418f, 22f, 11.2366f, 22f, 12f)
        curveTo(22f, 12.7634f, 21.5969f, 13.4582f, 20.7906f, 14.848f)
        lineTo(18.8669f, 18.1638f)
        curveTo(18.0638f, 19.548f, 17.6623f, 20.2402f, 17.0019f, 20.6201f)
        curveTo(16.3416f, 21f, 15.5402f, 21f, 13.9373f, 21f)
        lineTo(10.0627f, 21f)
        curveTo(8.45982f, 21f, 7.6584f, 21f, 6.99807f, 20.6201f)
        curveTo(6.33774f, 20.2402f, 5.93619f, 19.548f, 5.13311f, 18.1638f)
        lineTo(3.20942f, 14.848f)
        curveTo(2.40314f, 13.4582f, 2f, 12.7634f, 2f, 12f)
        curveTo(2f, 11.2366f, 2.40314f, 10.5418f, 3.20942f, 9.152f)
        lineTo(5.13311f, 5.83621f)
        curveTo(5.93619f, 4.45196f, 6.33774f, 3.75984f, 6.99807f, 3.37992f)
        curveTo(7.6584f, 3f, 8.45982f, 3f, 10.0627f, 3f)
        lineTo(13.9373f, 3f)
        curveTo(15.5402f, 3f, 16.3416f, 3f, 17.0019f, 3.37992f)
        curveTo(17.6623f, 3.75984f, 18.0638f, 4.45197f, 18.8669f, 5.83622f)
        lineTo(20.7906f, 9.15201f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 8f)
        lineTo(15f, 16f)
        }
        }.build()

        return _setting06!!
    }

private var _setting06: ImageVector? = null
