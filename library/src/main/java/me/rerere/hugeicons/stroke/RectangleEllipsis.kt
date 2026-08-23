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

val HugeIcons.RectangleEllipsis: ImageVector
    get() {
        if (_rectangleEllipsis != null) {
            return _rectangleEllipsis!!
        }
        _rectangleEllipsis = ImageVector.Builder(
            name = "RectangleEllipsis",
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
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(12.1179f, 12f)
            horizontalLineTo(11.9929f)
            moveTo(8.11719f, 12f)
            horizontalLineTo(7.99219f)
            moveTo(16.1172f, 12f)
            horizontalLineTo(15.9922f)
            moveTo(12.2429f, 12f)
            curveTo(12.2429f, 12.1381f, 12.131f, 12.25f, 11.9929f, 12.25f)
            curveTo(11.8549f, 12.25f, 11.7429f, 12.1381f, 11.7429f, 12f)
            curveTo(11.7429f, 11.8619f, 11.8549f, 11.75f, 11.9929f, 11.75f)
            curveTo(12.131f, 11.75f, 12.2429f, 11.8619f, 12.2429f, 12f)
            close()
            moveTo(8.24219f, 12f)
            curveTo(8.24219f, 12.1381f, 8.13026f, 12.25f, 7.99219f, 12.25f)
            curveTo(7.85412f, 12.25f, 7.74219f, 12.1381f, 7.74219f, 12f)
            curveTo(7.74219f, 11.8619f, 7.85412f, 11.75f, 7.99219f, 11.75f)
            curveTo(8.13026f, 11.75f, 8.24219f, 11.8619f, 8.24219f, 12f)
            close()
            moveTo(16.2422f, 12f)
            curveTo(16.2422f, 12.1381f, 16.1303f, 12.25f, 15.9922f, 12.25f)
            curveTo(15.8541f, 12.25f, 15.7422f, 12.1381f, 15.7422f, 12f)
            curveTo(15.7422f, 11.8619f, 15.8541f, 11.75f, 15.9922f, 11.75f)
            curveTo(16.1303f, 11.75f, 16.2422f, 11.8619f, 16.2422f, 12f)
            close()
        }

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

        return _rectangleEllipsis!!
    }

private var _rectangleEllipsis: ImageVector? = null
