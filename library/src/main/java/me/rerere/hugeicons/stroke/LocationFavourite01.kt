package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LocationFavourite01: ImageVector
    get() {
        if (_locationFavourite01 != null) {
            return _locationFavourite01!!
        }
        _locationFavourite01 = ImageVector.Builder(
            name = "LocationFavourite01",
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
        moveTo(13.6177f, 21.367f)
        curveTo(13.1841f, 21.773f, 12.6044f, 22f, 12.0011f, 22f)
        curveTo(11.3978f, 22f, 10.8182f, 21.773f, 10.3845f, 21.367f)
        curveTo(6.41302f, 17.626f, 1.09076f, 13.4469f, 3.68627f, 7.37966f)
        curveTo(5.08963f, 4.09916f, 8.45834f, 2f, 12.0011f, 2f)
        curveTo(15.5439f, 2f, 18.9126f, 4.09916f, 20.316f, 7.37966f)
        curveTo(22.9082f, 13.4393f, 17.599f, 17.6389f, 13.6177f, 21.367f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.3881f, 7.83138f)
        curveTo(10.3267f, 7.28308f, 11.1459f, 7.50404f, 11.638f, 7.856f)
        curveTo(11.8398f, 8.00032f, 11.9406f, 8.07248f, 12f, 8.07248f)
        curveTo(12.0594f, 8.07248f, 12.1602f, 8.00032f, 12.362f, 7.856f)
        curveTo(12.8541f, 7.50404f, 13.6733f, 7.28308f, 14.6119f, 7.83138f)
        curveTo(15.8437f, 8.55098f, 16.1224f, 10.925f, 13.2812f, 12.9278f)
        curveTo(12.74f, 13.3093f, 12.4694f, 13.5f, 12f, 13.5f)
        curveTo(11.5306f, 13.5f, 11.26f, 13.3093f, 10.7188f, 12.9278f)
        curveTo(7.8776f, 10.925f, 8.15632f, 8.55098f, 9.3881f, 7.83138f)
        }
        }.build()

        return _locationFavourite01!!
    }

private var _locationFavourite01: ImageVector? = null
