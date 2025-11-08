package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Rectangular: ImageVector
    get() {
        if (_rectangular != null) {
            return _rectangular!!
        }
        _rectangular = ImageVector.Builder(
            name = "Rectangular",
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
        moveTo(2f, 12f)
        curveTo(2f, 9.19974f, 2f, 7.79961f, 2.54497f, 6.73005f)
        curveTo(3.02433f, 5.78924f, 3.78924f, 5.02433f, 4.73005f, 4.54497f)
        curveTo(5.79961f, 4f, 7.19974f, 4f, 10f, 4f)
        horizontalLineTo(14f)
        curveTo(16.8003f, 4f, 18.2004f, 4f, 19.27f, 4.54497f)
        curveTo(20.2108f, 5.02433f, 20.9757f, 5.78924f, 21.455f, 6.73005f)
        curveTo(22f, 7.79961f, 22f, 9.19974f, 22f, 12f)
        curveTo(22f, 14.8003f, 22f, 16.2004f, 21.455f, 17.27f)
        curveTo(20.9757f, 18.2108f, 20.2108f, 18.9757f, 19.27f, 19.455f)
        curveTo(18.2004f, 20f, 16.8003f, 20f, 14f, 20f)
        horizontalLineTo(10f)
        curveTo(7.19974f, 20f, 5.79961f, 20f, 4.73005f, 19.455f)
        curveTo(3.78924f, 18.9757f, 3.02433f, 18.2108f, 2.54497f, 17.27f)
        curveTo(2f, 16.2004f, 2f, 14.8003f, 2f, 12f)
        }
        }.build()

        return _rectangular!!
    }

private var _rectangular: ImageVector? = null
