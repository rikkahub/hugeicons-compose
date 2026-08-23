package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.RectangleVertical: ImageVector
    get() {
        if (_rectangleVertical != null) {
            return _rectangleVertical!!
        }
        _rectangleVertical = ImageVector.Builder(
            name = "RectangleVertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(11.9922f, 2f)
            curveTo(14.7925f, 2f, 16.1926f, 2f, 17.2621f, 2.54497f)
            curveTo(18.203f, 3.02433f, 18.9679f, 3.78924f, 19.4472f, 4.73005f)
            curveTo(19.9922f, 5.79961f, 19.9922f, 7.19974f, 19.9922f, 10f)
            lineTo(19.9922f, 14f)
            curveTo(19.9922f, 16.8003f, 19.9922f, 18.2004f, 19.4472f, 19.27f)
            curveTo(18.9679f, 20.2108f, 18.2029f, 20.9757f, 17.2621f, 21.455f)
            curveTo(16.1926f, 22f, 14.7924f, 22f, 11.9922f, 22f)
            curveTo(9.19192f, 22f, 7.79179f, 22f, 6.72223f, 21.455f)
            curveTo(5.78142f, 20.9757f, 5.01652f, 20.2108f, 4.53715f, 19.27f)
            curveTo(3.99219f, 18.2004f, 3.99219f, 16.8003f, 3.99219f, 14f)
            lineTo(3.99219f, 10f)
            curveTo(3.99219f, 7.19974f, 3.99219f, 5.79961f, 4.53716f, 4.73005f)
            curveTo(5.01652f, 3.78924f, 5.78142f, 3.02433f, 6.72223f, 2.54497f)
            curveTo(7.79179f, 2f, 9.19192f, 2f, 11.9922f, 2f)
            close()
        }
        }.build()

        return _rectangleVertical!!
    }

private var _rectangleVertical: ImageVector? = null
