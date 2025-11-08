package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Vimeo: ImageVector
    get() {
        if (_vimeo != null) {
            return _vimeo!!
        }
        _vimeo = ImageVector.Builder(
            name = "Vimeo",
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
        moveTo(21.3459f, 4.65406f)
        curveTo(19.0372f, 2.82124f, 15.4614f, 5.64316f, 14.5961f, 7.12694f)
        curveTo(15.8974f, 7.43176f, 18.5f, 7.54313f, 16f, 12.0276f)
        curveTo(15f, 13.6885f, 12.7f, 15.8145f, 11.5f, 11.0311f)
        curveTo(10f, 5.05175f, 10f, 0.567257f, 2f, 7.54313f)
        curveTo(2.47556f, 8.4911f, 3.76645f, 8.5883f, 4.74116f, 8.17029f)
        curveTo(5.62781f, 7.79005f, 6.54267f, 7.94136f, 7f, 9.53652f)
        curveTo(8f, 13.0245f, 8.5f, 19.9866f, 12f, 19.9866f)
        curveTo(15.6345f, 20.4812f, 24.461f, 7.12711f, 21.3459f, 4.65406f)
        }
        }.build()

        return _vimeo!!
    }

private var _vimeo: ImageVector? = null
