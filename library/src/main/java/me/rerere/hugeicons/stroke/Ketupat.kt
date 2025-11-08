package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Ketupat: ImageVector
    get() {
        if (_ketupat != null) {
            return _ketupat!!
        }
        _ketupat = ImageVector.Builder(
            name = "Ketupat",
            defaultWidth = 25.dp,
            defaultHeight = 24.dp,
            viewportWidth = 25f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.2749f, 9.6488f)
        lineTo(16.3493f, 7.72321f)
        curveTo(14.5338f, 5.90774f, 13.6261f, 5f, 12.4981f, 5f)
        curveTo(11.3701f, 5f, 10.4624f, 5.90774f, 8.64691f, 7.72321f)
        lineTo(6.72131f, 9.6488f)
        curveTo(4.90584f, 11.4643f, 3.99811f, 12.372f, 3.99811f, 13.5f)
        curveTo(3.99811f, 14.628f, 4.90584f, 15.5357f, 6.72131f, 17.3512f)
        lineTo(8.64691f, 19.2768f)
        curveTo(10.4624f, 21.0923f, 11.3701f, 22f, 12.4981f, 22f)
        curveTo(13.6261f, 22f, 14.5338f, 21.0923f, 16.3493f, 19.2768f)
        lineTo(18.2749f, 17.3512f)
        curveTo(20.0904f, 15.5357f, 20.9981f, 14.628f, 20.9981f, 13.5f)
        curveTo(20.9981f, 12.372f, 20.0904f, 11.4643f, 18.2749f, 9.6488f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.2481f, 8.75f)
        lineTo(12.4981f, 13.5f)
        moveTo(12.4981f, 13.5f)
        lineTo(7.74811f, 18.25f)
        moveTo(12.4981f, 13.5f)
        lineTo(7.74811f, 8.75f)
        moveTo(12.4981f, 13.5f)
        lineTo(17.2481f, 18.25f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5f, 2f)
        curveTo(13.1f, 2.24f, 12.5f, 4.3f, 12.5f, 5f)
        curveTo(12.3333f, 4.4f, 11.5f, 3.2f, 9.5f, 3.2f)
        }
        }.build()

        return _ketupat!!
    }

private var _ketupat: ImageVector? = null
