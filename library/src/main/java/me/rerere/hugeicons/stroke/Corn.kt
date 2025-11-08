package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Corn: ImageVector
    get() {
        if (_corn != null) {
            return _corn!!
        }
        _corn = ImageVector.Builder(
            name = "Corn",
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
        moveTo(3.88481f, 20.1321f)
        curveTo(5.98804f, 22.2096f, 9.86304f, 21.7503f, 12.5399f, 19.1062f)
        curveTo(15.5988f, 16.0847f, 17.1823f, 15.1788f, 18.2931f, 14.5591f)
        curveTo(18.5175f, 14.434f, 18.5733f, 14.1229f, 18.3912f, 13.9429f)
        curveTo(14.7824f, 10.3783f, 8.75783f, 13.0463f, 8.10703f, 17.75f)
        moveTo(3.88481f, 20.1321f)
        lineTo(2.5f, 21.5f)
        moveTo(3.88481f, 20.1321f)
        curveTo(1.78158f, 18.0546f, 2.24717f, 14.2277f, 4.92401f, 11.5836f)
        curveTo(5.77111f, 10.956f, 7.39551f, 9.17678f, 7.65754f, 6.77425f)
        curveTo(7.68407f, 6.53098f, 7.99311f, 6.40789f, 8.16826f, 6.5809f)
        curveTo(9.47265f, 7.86934f, 10.1241f, 9.55848f, 10.1227f, 11.2472f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.5917f, 13f)
        curveTo(19.9418f, 9.37568f, 22.5321f, 4.72423f, 21.0791f, 3.04556f)
        curveTo(19.3481f, 1.04574f, 14.0084f, 4.93844f, 10f, 8.33662f)
        }
        }.build()

        return _corn!!
    }

private var _corn: ImageVector? = null
