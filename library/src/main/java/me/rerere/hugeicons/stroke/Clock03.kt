package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Clock03: ImageVector
    get() {
        if (_clock03 != null) {
            return _clock03!!
        }
        _clock03 = ImageVector.Builder(
            name = "Clock03",
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
        moveTo(18.952f, 8.60639f)
        lineTo(21.4621f, 8.45358f)
        curveTo(19.6628f, 3.70459f, 14.497f, 0.999731f, 9.46037f, 2.34456f)
        curveTo(4.09595f, 3.77692f, 0.909592f, 9.26089f, 2.34343f, 14.5933f)
        curveTo(3.77728f, 19.9258f, 9.28835f, 23.0874f, 14.6528f, 21.6551f)
        curveTo(18.6358f, 20.5916f, 21.418f, 17.2945f, 22f, 13.4842f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 7.99982f)
        verticalLineTo(11.9998f)
        lineTo(14f, 13.9998f)
        }
        }.build()

        return _clock03!!
    }

private var _clock03: ImageVector? = null
