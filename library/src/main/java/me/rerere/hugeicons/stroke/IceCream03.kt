package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.IceCream03: ImageVector
    get() {
        if (_iceCream03 != null) {
            return _iceCream03!!
        }
        _iceCream03 = ImageVector.Builder(
            name = "IceCream03",
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
        moveTo(12f, 2f)
        curveTo(9.00353f, 2f, 6.31715f, 4.74891f, 7.15597f, 7.78336f)
        curveTo(7.38917f, 8.627f, 6f, 8.96316f, 6f, 9.873f)
        curveTo(6f, 12.5824f, 10.5f, 9.83716f, 10.5f, 12.7868f)
        curveTo(10.5f, 14.4044f, 13f, 14.4044f, 13f, 12.7868f)
        curveTo(13f, 9.62712f, 18f, 12.8244f, 18f, 9.873f)
        curveTo(18f, 8.96316f, 16.6108f, 8.627f, 16.844f, 7.78336f)
        curveTo(17.6828f, 4.74891f, 14.9965f, 2f, 12f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.5f, 11f)
        lineTo(8.32693f, 13.9652f)
        curveTo(9.82073f, 19.3217f, 10.5676f, 22f, 12f, 22f)
        curveTo(13.4324f, 22f, 14.1793f, 19.3217f, 15.6731f, 13.9652f)
        lineTo(16.5f, 11f)
        }
        }.build()

        return _iceCream03!!
    }

private var _iceCream03: ImageVector? = null
