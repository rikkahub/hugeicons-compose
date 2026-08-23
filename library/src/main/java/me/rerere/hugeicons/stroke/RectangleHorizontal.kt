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

val HugeIcons.RectangleHorizontal: ImageVector
    get() {
        if (_rectangleHorizontal != null) {
            return _rectangleHorizontal!!
        }
        _rectangleHorizontal = ImageVector.Builder(
            name = "RectangleHorizontal",
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
            moveTo(1.99219f, 12f)
            curveTo(1.99219f, 9.19974f, 1.99219f, 7.79961f, 2.53715f, 6.73005f)
            curveTo(3.01652f, 5.78924f, 3.78142f, 5.02433f, 4.72223f, 4.54497f)
            curveTo(5.79179f, 4f, 7.19192f, 4f, 9.99219f, 4f)
            horizontalLineTo(13.9922f)
            curveTo(16.7924f, 4f, 18.1926f, 4f, 19.2621f, 4.54497f)
            curveTo(20.203f, 5.02433f, 20.9679f, 5.78924f, 21.4472f, 6.73005f)
            curveTo(21.9922f, 7.79961f, 21.9922f, 9.19974f, 21.9922f, 12f)
            curveTo(21.9922f, 14.8003f, 21.9922f, 16.2004f, 21.4472f, 17.27f)
            curveTo(20.9679f, 18.2108f, 20.203f, 18.9757f, 19.2621f, 19.455f)
            curveTo(18.1926f, 20f, 16.7925f, 20f, 13.9922f, 20f)
            horizontalLineTo(9.99219f)
            curveTo(7.19192f, 20f, 5.79179f, 20f, 4.72223f, 19.455f)
            curveTo(3.78142f, 18.9757f, 3.01652f, 18.2108f, 2.53715f, 17.27f)
            curveTo(1.99219f, 16.2004f, 1.99219f, 14.8003f, 1.99219f, 12f)
            close()
        }
        }.build()

        return _rectangleHorizontal!!
    }

private var _rectangleHorizontal: ImageVector? = null
