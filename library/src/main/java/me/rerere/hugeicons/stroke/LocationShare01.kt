package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LocationShare01: ImageVector
    get() {
        if (_locationShare01 != null) {
            return _locationShare01!!
        }
        _locationShare01 = ImageVector.Builder(
            name = "LocationShare01",
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
        moveTo(21.1677f, 7f)
        curveTo(22.2774f, 9.54466f, 22.2774f, 12.4569f, 21.1677f, 15.0015f)
        moveTo(2.83226f, 15.0015f)
        curveTo(1.72258f, 12.4569f, 1.72258f, 9.54466f, 2.83226f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.3472f, 19.9619f)
        curveTo(12.9858f, 20.3071f, 12.5028f, 20.5f, 12.0002f, 20.5f)
        curveTo(11.4975f, 20.5f, 11.0145f, 20.3071f, 10.6531f, 19.9619f)
        curveTo(7.34389f, 16.7821f, 2.90913f, 13.2299f, 5.07183f, 8.07272f)
        curveTo(6.24118f, 5.28428f, 9.04815f, 3.5f, 12.0002f, 3.5f)
        curveTo(14.9522f, 3.5f, 17.7591f, 5.28428f, 18.9285f, 8.07272f)
        curveTo(21.0885f, 13.2234f, 16.6646f, 16.793f, 13.3472f, 19.9619f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 11f)
        curveTo(15f, 12.6569f, 13.6569f, 14f, 12f, 14f)
        curveTo(10.3431f, 14f, 9f, 12.6569f, 9f, 11f)
        curveTo(9f, 9.34315f, 10.3431f, 8f, 12f, 8f)
        curveTo(13.6569f, 8f, 15f, 9.34315f, 15f, 11f)
        }
        }.build()

        return _locationShare01!!
    }

private var _locationShare01: ImageVector? = null
