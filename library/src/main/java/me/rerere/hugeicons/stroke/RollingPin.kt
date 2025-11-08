package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.RollingPin: ImageVector
    get() {
        if (_rollingPin != null) {
            return _rollingPin!!
        }
        _rollingPin = ImageVector.Builder(
            name = "RollingPin",
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
        moveTo(18.4368f, 5.56324f)
        curveTo(17.7156f, 4.84207f, 16.9002f, 4.34309f, 16.1458f, 4.10787f)
        curveTo(15.8323f, 4.01011f, 15.6755f, 3.96123f, 15.3675f, 4.03713f)
        curveTo(15.0594f, 4.11302f, 14.8899f, 4.28249f, 14.551f, 4.62141f)
        lineTo(4.62141f, 14.551f)
        curveTo(4.28248f, 14.8899f, 4.11302f, 15.0594f, 4.03713f, 15.3675f)
        curveTo(3.96123f, 15.6755f, 4.01011f, 15.8323f, 4.10787f, 16.1458f)
        curveTo(4.34309f, 16.9002f, 4.84207f, 17.7156f, 5.56324f, 18.4368f)
        curveTo(6.28441f, 19.1579f, 7.0998f, 19.6569f, 7.85419f, 19.8921f)
        curveTo(8.16773f, 19.9899f, 8.3245f, 20.0388f, 8.63255f, 19.9629f)
        curveTo(8.94059f, 19.887f, 9.11005f, 19.7175f, 9.44898f, 19.3786f)
        lineTo(19.3786f, 9.44898f)
        curveTo(19.7175f, 9.11005f, 19.887f, 8.94059f, 19.9629f, 8.63255f)
        curveTo(20.0388f, 8.3245f, 19.9899f, 8.16773f, 19.8921f, 7.85419f)
        curveTo(19.6569f, 7.0998f, 19.1579f, 6.28441f, 18.4368f, 5.56324f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.2904f, 6f)
        curveTo(20.1754f, 5.65327f, 21.1891f, 4.98877f, 21.549f, 4.62887f)
        curveTo(22.1503f, 4.02748f, 22.1503f, 3.05243f, 21.549f, 2.45104f)
        curveTo(20.9476f, 1.84965f, 19.9725f, 1.84965f, 19.3711f, 2.45104f)
        curveTo(19.0112f, 2.81094f, 18.3467f, 3.82465f, 18f, 4.70962f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 19.2904f)
        curveTo(5.65327f, 20.1754f, 4.98877f, 21.1891f, 4.62887f, 21.549f)
        curveTo(4.02748f, 22.1503f, 3.05243f, 22.1503f, 2.45104f, 21.549f)
        curveTo(1.84965f, 20.9476f, 1.84965f, 19.9725f, 2.45104f, 19.3711f)
        curveTo(2.81094f, 19.0112f, 3.82465f, 18.3467f, 4.70962f, 18f)
        }
        }.build()

        return _rollingPin!!
    }

private var _rollingPin: ImageVector? = null
