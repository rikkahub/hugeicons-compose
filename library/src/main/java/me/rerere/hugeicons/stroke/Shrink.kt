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

val HugeIcons.Shrink: ImageVector
    get() {
        if (_shrink != null) {
            return _shrink!!
        }
        _shrink = ImageVector.Builder(
            name = "Shrink",
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
            moveTo(14.2224f, 17.9944f)
            curveTo(14.2119f, 17.2445f, 13.6966f, 14.761f, 14.2231f, 14.2344f)
            curveTo(14.7497f, 13.708f, 17.2324f, 14.2245f, 17.9821f, 14.2352f)
            moveTo(20.9922f, 20.9978f)
            lineTo(14.6074f, 14.6144f)
        }

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
            moveTo(9.76223f, 17.9943f)
            curveTo(9.77273f, 17.2444f, 10.288f, 14.7608f, 9.76144f, 14.2343f)
            curveTo(9.2349f, 13.7079f, 6.75219f, 14.2244f, 6.00248f, 14.2351f)
            moveTo(2.99243f, 20.9977f)
            lineTo(9.37721f, 14.6143f)
        }

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
            moveTo(6.00008f, 9.76109f)
            curveTo(6.74982f, 9.77066f, 9.23335f, 10.2829f, 9.75907f, 9.75561f)
            curveTo(10.2847f, 9.22828f, 9.76527f, 6.74557f, 9.75359f, 5.99568f)
            moveTo(9.36958f, 9.36718f)
            lineTo(2.99438f, 3.0022f)
        }

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
            moveTo(17.9842f, 9.76109f)
            curveTo(17.2345f, 9.77066f, 14.751f, 10.2829f, 14.2253f, 9.75561f)
            curveTo(13.6996f, 9.22828f, 14.2191f, 6.74557f, 14.2307f, 5.99568f)
            moveTo(14.6147f, 9.36718f)
            lineTo(20.9899f, 3.0022f)
        }
        }.build()

        return _shrink!!
    }

private var _shrink: ImageVector? = null
