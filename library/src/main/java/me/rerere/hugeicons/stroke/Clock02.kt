package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Clock02: ImageVector
    get() {
        if (_clock02 != null) {
            return _clock02!!
        }
        _clock02 = ImageVector.Builder(
            name = "Clock02",
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
        moveTo(5.04798f, 8.60657f)
        lineTo(2.53784f, 8.45376f)
        curveTo(4.33712f, 3.70477f, 9.503f, 0.999914f, 14.5396f, 2.34474f)
        curveTo(19.904f, 3.77711f, 23.0904f, 9.26107f, 21.6565f, 14.5935f)
        curveTo(20.2227f, 19.926f, 14.7116f, 23.0876f, 9.3472f, 21.6553f)
        curveTo(5.36419f, 20.5917f, 2.58192f, 17.2946f, 2f, 13.4844f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 8f)
        verticalLineTo(12f)
        lineTo(14f, 14f)
        }
        }.build()

        return _clock02!!
    }

private var _clock02: ImageVector? = null
