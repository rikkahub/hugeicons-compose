package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.GreenHouse: ImageVector
    get() {
        if (_greenHouse != null) {
            return _greenHouse!!
        }
        _greenHouse = ImageVector.Builder(
            name = "GreenHouse",
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
        moveTo(12.551f, 13.6081f)
        curveTo(11.0316f, 15.2407f, 5.21031f, 18.0107f, 7.02784f, 21.0275f)
        curveTo(7.68071f, 22.1111f, 9.56024f, 22f, 10.8612f, 22f)
        horizontalLineTo(13.1388f)
        curveTo(16.5537f, 22f, 18.2611f, 22f, 19.429f, 21.0286f)
        curveTo(20.5969f, 20.0572f, 20.8471f, 18.4289f, 21.3476f, 15.1724f)
        lineTo(21.6486f, 13.2135f)
        curveTo(22.0016f, 10.9162f, 22.1781f, 9.76763f, 21.7438f, 8.74938f)
        curveTo(21.3095f, 7.73112f, 20.346f, 7.03443f, 18.4189f, 5.64106f)
        lineTo(16.979f, 4.6f)
        curveTo(14.5817f, 2.86667f, 13.3831f, 2f, 12f, 2f)
        curveTo(10.6169f, 2f, 9.41829f, 2.86667f, 7.02099f, 4.6f)
        lineTo(5.58114f, 5.64106f)
        curveTo(3.65403f, 7.03443f, 2.69047f, 7.73112f, 2.25617f, 8.74938f)
        curveTo(1.82186f, 9.76763f, 1.99837f, 10.9162f, 2.35139f, 13.2135f)
        lineTo(2.65243f, 15.1724f)
        curveTo(3.00843f, 17.489f, 3.23781f, 18.9817f, 3.76102f, 20f)
        moveTo(12.1801f, 18.1259f)
        curveTo(14.5484f, 17.6674f, 16.1708f, 16.2098f, 16.9339f, 13.855f)
        curveTo(17.7983f, 11.1881f, 16.6267f, 7.88376f, 13.6752f, 7.11938f)
        curveTo(13.6752f, 7.11938f, 14.5852f, 8.20421f, 13.9973f, 9.15585f)
        curveTo(12.864f, 11.1955f, 9.62452f, 10.5174f, 8.32535f, 13.1165f)
        curveTo(7.56032f, 14.5675f, 7.79225f, 16.285f, 8.89383f, 17.3563f)
        curveTo(9.58602f, 18.0294f, 11.0428f, 18.3461f, 12.1801f, 18.1259f)
        }
        }.build()

        return _greenHouse!!
    }

private var _greenHouse: ImageVector? = null
