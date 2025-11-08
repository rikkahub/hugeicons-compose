package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LocationOffline02: ImageVector
    get() {
        if (_locationOffline02 != null) {
            return _locationOffline02!!
        }
        _locationOffline02 = ImageVector.Builder(
            name = "LocationOffline02",
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
        moveTo(17.5f, 17.6461f)
        curveTo(16.2676f, 18.9628f, 14.8763f, 20.1884f, 13.6177f, 21.367f)
        curveTo(13.1841f, 21.773f, 12.6044f, 22f, 12.0011f, 22f)
        curveTo(11.3978f, 22f, 10.8182f, 21.773f, 10.3845f, 21.367f)
        curveTo(6.41302f, 17.626f, 1.09076f, 13.4469f, 3.68627f, 7.37966f)
        curveTo(4.02067f, 6.59797f, 4.46666f, 5.63512f, 5f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 3.48631f)
        curveTo(8.46914f, 2.53477f, 10.213f, 2f, 12.0011f, 2f)
        curveTo(15.5439f, 2f, 18.9126f, 4.09916f, 20.316f, 7.37966f)
        curveTo(21.6603f, 10.5221f, 20.8796f, 13.1643f, 19.2612f, 15.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 2f)
        lineTo(22f, 22f)
        }
        }.build()

        return _locationOffline02!!
    }

private var _locationOffline02: ImageVector? = null
