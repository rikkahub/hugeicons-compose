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

val HugeIcons.RectangleGoggles: ImageVector
    get() {
        if (_rectangleGoggles != null) {
            return _rectangleGoggles!!
        }
        _rectangleGoggles = ImageVector.Builder(
            name = "RectangleGoggles",
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
            moveTo(1.99219f, 12.9403f)
            verticalLineTo(12f)
            curveTo(1.99219f, 9.65442f, 1.99219f, 8.48164f, 2.61213f, 7.67372f)
            curveTo(2.77173f, 7.46572f, 2.95791f, 7.27954f, 3.1659f, 7.11994f)
            curveTo(3.97382f, 6.5f, 5.14661f, 6.5f, 7.49219f, 6.5f)
            horizontalLineTo(16.4922f)
            curveTo(18.8378f, 6.5f, 20.0105f, 6.5f, 20.8185f, 7.11994f)
            curveTo(21.0265f, 7.27954f, 21.2126f, 7.46572f, 21.3722f, 7.67372f)
            curveTo(21.9922f, 8.48164f, 21.9922f, 9.65442f, 21.9922f, 12f)
            verticalLineTo(12.9403f)
            curveTo(21.9922f, 14.3942f, 21.9922f, 15.1212f, 21.7455f, 15.6912f)
            curveTo(21.4425f, 16.3917f, 20.8839f, 16.9503f, 20.1834f, 17.2534f)
            curveTo(19.6133f, 17.5f, 18.8864f, 17.5f, 17.4325f, 17.5f)
            horizontalLineTo(17.2444f)
            curveTo(16.6147f, 17.5f, 16.2999f, 17.5f, 16.0079f, 17.4414f)
            curveTo(15.4282f, 17.3252f, 14.8958f, 17.0403f, 14.4775f, 16.6224f)
            curveTo(14.2668f, 16.4119f, 14.0922f, 16.15f, 13.7429f, 15.6261f)
            curveTo(13.2966f, 14.9566f, 13.0734f, 14.6218f, 12.823f, 14.4552f)
            curveTo(12.3197f, 14.1205f, 11.6647f, 14.1205f, 11.1614f, 14.4552f)
            curveTo(10.911f, 14.6218f, 10.6878f, 14.9566f, 10.2415f, 15.6261f)
            curveTo(9.89221f, 16.15f, 9.71758f, 16.4119f, 9.50688f, 16.6224f)
            curveTo(9.0886f, 17.0403f, 8.55618f, 17.3252f, 7.97648f, 17.4414f)
            curveTo(7.68446f, 17.5f, 7.36965f, 17.5f, 6.74002f, 17.5f)
            horizontalLineTo(6.5519f)
            curveTo(5.09799f, 17.5f, 4.37103f, 17.5f, 3.80095f, 17.2534f)
            curveTo(3.1005f, 16.9503f, 2.54188f, 16.3917f, 2.23883f, 15.6912f)
            curveTo(1.99219f, 15.1212f, 1.99219f, 14.3942f, 1.99219f, 12.9403f)
            close()
        }
        }.build()

        return _rectangleGoggles!!
    }

private var _rectangleGoggles: ImageVector? = null
