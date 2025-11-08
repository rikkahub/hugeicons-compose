package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Pyramid: ImageVector
    get() {
        if (_pyramid != null) {
            return _pyramid!!
        }
        _pyramid = ImageVector.Builder(
            name = "Pyramid",
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
        moveTo(12f, 2f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.8692f, 13.6759f)
        lineTo(21.9887f, 17.5864f)
        moveTo(21.9887f, 17.5864f)
        lineTo(21.9944f, 17.5895f)
        moveTo(21.9887f, 17.5864f)
        curveTo(22.0642f, 17.1494f, 21.7569f, 16.6584f, 21.1866f, 15.7472f)
        lineTo(13.7843f, 3.91929f)
        curveTo(12.9835f, 2.63976f, 12.5831f, 2f, 12f, 2f)
        curveTo(11.4169f, 2f, 11.0165f, 2.63976f, 10.2157f, 3.91929f)
        lineTo(2.81338f, 15.7472f)
        curveTo(2.24312f, 16.6584f, 1.93582f, 17.1494f, 2.01127f, 17.5864f)
        moveTo(21.9887f, 17.5864f)
        curveTo(21.9824f, 17.6232f, 21.9733f, 17.6597f, 21.9614f, 17.696f)
        curveTo(21.8087f, 18.1627f, 21.267f, 18.3791f, 20.1838f, 18.8118f)
        lineTo(12.7814f, 21.7688f)
        curveTo(12.3956f, 21.9229f, 12.2026f, 22f, 12f, 22f)
        curveTo(11.7974f, 22f, 11.6045f, 21.9229f, 11.2186f, 21.7688f)
        lineTo(3.8162f, 18.8118f)
        curveTo(2.73296f, 18.3791f, 2.19134f, 18.1627f, 2.0386f, 17.696f)
        curveTo(2.02672f, 17.6597f, 2.01764f, 17.6232f, 2.01127f, 17.5864f)
        moveTo(2.00558f, 17.5895f)
        lineTo(2.01127f, 17.5864f)
        moveTo(2.01127f, 17.5864f)
        lineTo(9.13079f, 13.6759f)
        }
        }.build()

        return _pyramid!!
    }

private var _pyramid: ImageVector? = null
