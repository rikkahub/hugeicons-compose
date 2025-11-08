package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LocationCheck01: ImageVector
    get() {
        if (_locationCheck01 != null) {
            return _locationCheck01!!
        }
        _locationCheck01 = ImageVector.Builder(
            name = "LocationCheck01",
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
        moveTo(9f, 11.8333f)
        curveTo(9f, 11.8333f, 9.875f, 11.8333f, 10.75f, 13.5f)
        curveTo(10.75f, 13.5f, 13.5294f, 9.33333f, 16f, 8.5f)
        }
        }.build()

        return _locationCheck01!!
    }

private var _locationCheck01: ImageVector? = null
