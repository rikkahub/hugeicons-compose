package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Cylinder04: ImageVector
    get() {
        if (_cylinder04 != null) {
            return _cylinder04!!
        }
        _cylinder04 = ImageVector.Builder(
            name = "Cylinder04",
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
        moveTo(12f, 19f)
        lineTo(9.87868f, 21.1213f)
        moveTo(9.87868f, 21.1213f)
        curveTo(10.4216f, 21.6642f, 11.1716f, 22f, 12f, 22f)
        curveTo(13.6569f, 22f, 15f, 20.6569f, 15f, 19f)
        curveTo(15f, 17.3431f, 13.6569f, 16f, 12f, 16f)
        curveTo(10.3431f, 16f, 9f, 17.3431f, 9f, 19f)
        curveTo(9f, 19.8284f, 9.33579f, 20.5784f, 9.87868f, 21.1213f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 16f)
        horizontalLineTo(14f)
        curveTo(16.8089f, 16f, 18.2134f, 16f, 19.2223f, 15.3259f)
        curveTo(19.659f, 15.034f, 20.034f, 14.659f, 20.3259f, 14.2223f)
        curveTo(21f, 13.2134f, 21f, 11.8089f, 21f, 9f)
        curveTo(21f, 6.19108f, 21f, 4.78661f, 20.3259f, 3.77772f)
        curveTo(20.034f, 3.34096f, 19.659f, 2.96596f, 19.2223f, 2.67412f)
        curveTo(18.2134f, 2f, 16.8089f, 2f, 14f, 2f)
        horizontalLineTo(10f)
        curveTo(7.19108f, 2f, 5.78661f, 2f, 4.77772f, 2.67412f)
        curveTo(4.34096f, 2.96596f, 3.96596f, 3.34096f, 3.67412f, 3.77772f)
        curveTo(3f, 4.78661f, 3f, 6.19108f, 3f, 9f)
        curveTo(3f, 11.8089f, 3f, 13.2134f, 3.67412f, 14.2223f)
        curveTo(3.96596f, 14.659f, 4.34096f, 15.034f, 4.77772f, 15.3259f)
        curveTo(5.78661f, 16f, 7.19108f, 16f, 10f, 16f)
        }
        }.build()

        return _cylinder04!!
    }

private var _cylinder04: ImageVector? = null
