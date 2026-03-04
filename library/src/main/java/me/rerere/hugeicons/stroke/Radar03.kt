package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Radar03: ImageVector
    get() {
        if (_radar03 != null) {
            return _radar03!!
        }
        _radar03 = ImageVector.Builder(
            name = "Radar03",
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
        moveTo(12f, 13.5f)
        curveTo(12.8284f, 13.5f, 13.5f, 12.8284f, 13.5f, 12f)
        curveTo(13.5f, 11.1716f, 12.8284f, 10.5f, 12f, 10.5f)
        curveTo(11.1716f, 10.5f, 10.5f, 11.1716f, 10.5f, 12f)
        curveTo(10.5f, 12.8284f, 11.1716f, 13.5f, 12f, 13.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 6f)
        curveTo(8.68629f, 6f, 6f, 8.68629f, 6f, 12f)
        curveTo(6f, 15.3137f, 8.68629f, 18f, 12f, 18f)
        curveTo(15.3137f, 18f, 18f, 15.3137f, 18f, 12f)
        curveTo(18f, 10.3431f, 17.3284f, 8.84315f, 16.2426f, 7.75736f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 2f)
        curveTo(6.47715f, 2f, 2f, 6.47715f, 2f, 12f)
        curveTo(2f, 17.5228f, 6.47715f, 22f, 12f, 22f)
        curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
        curveTo(22f, 9.23858f, 20.8807f, 6.73858f, 19.0711f, 4.92893f)
        lineTo(12f, 12f)
        }
        }.build()

        return _radar03!!
    }

private var _radar03: ImageVector? = null
