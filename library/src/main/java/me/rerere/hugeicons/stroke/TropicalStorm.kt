package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TropicalStorm: ImageVector
    get() {
        if (_tropicalStorm != null) {
            return _tropicalStorm!!
        }
        _tropicalStorm = ImageVector.Builder(
            name = "TropicalStorm",
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
        moveTo(17.4467f, 7.85654f)
        lineTo(16.2793f, 6.41593f)
        lineTo(20.2108f, 3.84728f)
        curveTo(7.2706f, 1.80329f, 5.34287f, 9.75047f, 5.26372f, 10.1067f)
        lineTo(5.25607f, 10.141f)
        lineTo(5.24414f, 10.1882f)
        curveTo(4.96941f, 11.2032f, 4.94505f, 12.2707f, 5.17302f, 13.3048f)
        curveTo(5.40099f, 14.3388f, 5.87492f, 15.3104f, 6.55663f, 16.1413f)
        lineTo(7.72397f, 17.5819f)
        lineTo(3.78906f, 20.1526f)
        curveTo(16.7291f, 22.2089f, 18.66f, 14.2479f, 18.7394f, 13.8911f)
        lineTo(18.747f, 13.8568f)
        lineTo(18.7589f, 13.8095f)
        curveTo(19.0337f, 12.7945f, 19.0581f, 11.7271f, 18.8302f, 10.6931f)
        curveTo(18.6022f, 9.65908f, 18.1284f, 8.68748f, 17.4467f, 7.85654f)
        }
        }.build()

        return _tropicalStorm!!
    }

private var _tropicalStorm: ImageVector? = null
