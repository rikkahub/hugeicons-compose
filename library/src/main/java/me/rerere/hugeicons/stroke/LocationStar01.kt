package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LocationStar01: ImageVector
    get() {
        if (_locationStar01 != null) {
            return _locationStar01!!
        }
        _locationStar01 = ImageVector.Builder(
            name = "LocationStar01",
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
        moveTo(12.6047f, 8.00546f)
        lineTo(13.2206f, 9.24751f)
        curveTo(13.3046f, 9.4204f, 13.5286f, 9.58625f, 13.7175f, 9.618f)
        lineTo(14.8339f, 9.80501f)
        curveTo(15.5478f, 9.92498f, 15.7158f, 10.4472f, 15.2014f, 10.9624f)
        lineTo(14.3335f, 11.8374f)
        curveTo(14.1865f, 11.9856f, 14.106f, 12.2715f, 14.1515f, 12.4761f)
        lineTo(14.4f, 13.5594f)
        curveTo(14.596f, 14.4168f, 14.1445f, 14.7485f, 13.3921f, 14.3004f)
        lineTo(12.3457f, 13.6758f)
        curveTo(12.1567f, 13.5629f, 11.8453f, 13.5629f, 11.6528f, 13.6758f)
        lineTo(10.6064f, 14.3004f)
        curveTo(9.85748f, 14.7485f, 9.40253f, 14.4133f, 9.5985f, 13.5594f)
        lineTo(9.84698f, 12.4761f)
        curveTo(9.89247f, 12.2715f, 9.81198f, 11.9856f, 9.665f, 11.8374f)
        lineTo(8.79709f, 10.9624f)
        curveTo(8.28615f, 10.4472f, 8.45063f, 9.92498f, 9.16455f, 9.80501f)
        lineTo(10.2809f, 9.618f)
        curveTo(10.4664f, 9.58625f, 10.6904f, 9.4204f, 10.7744f, 9.24751f)
        lineTo(11.3903f, 8.00546f)
        curveTo(11.7263f, 7.33151f, 12.2722f, 7.33151f, 12.6047f, 8.00546f)
        }
        }.build()

        return _locationStar01!!
    }

private var _locationStar01: ImageVector? = null
