package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Clock04: ImageVector
    get() {
        if (_clock04 != null) {
            return _clock04!!
        }
        _clock04 = ImageVector.Builder(
            name = "Clock04",
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
        moveTo(12f, 22f)
        curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
        curveTo(22f, 6.47715f, 17.5228f, 2f, 12f, 2f)
        curveTo(7.52232f, 2f, 3.77426f, 4.94289f, 2.5f, 9f)
        horizontalLineTo(5f)
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

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 12f)
        curveTo(2f, 12.3373f, 2.0152f, 12.6709f, 2.04494f, 13f)
        moveTo(9f, 22f)
        curveTo(8.6584f, 21.8876f, 8.32471f, 21.7564f, 8f, 21.6078f)
        moveTo(3.20939f, 17f)
        curveTo(3.01655f, 16.6284f, 2.84453f, 16.2433f, 2.69497f, 15.8462f)
        moveTo(4.83122f, 19.3065f)
        curveTo(5.1369f, 19.6358f, 5.46306f, 19.9441f, 5.80755f, 20.2292f)
        }
        }.build()

        return _clock04!!
    }

private var _clock04: ImageVector? = null
