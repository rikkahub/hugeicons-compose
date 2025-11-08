package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Forward01: ImageVector
    get() {
        if (_forward01 != null) {
            return _forward01!!
        }
        _forward01 = ImageVector.Builder(
            name = "Forward01",
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
        moveTo(19.9351f, 12.6258f)
        curveTo(19.6807f, 13.8374f, 18.327f, 14.7077f, 15.6198f, 16.4481f)
        curveTo(12.6753f, 18.3411f, 11.203f, 19.2876f, 10.0105f, 18.9229f)
        curveTo(9.60662f, 18.7994f, 9.23463f, 18.5823f, 8.92227f, 18.2876f)
        curveTo(8f, 17.4178f, 8f, 15.6118f, 8f, 12f)
        curveTo(8f, 8.38816f, 8f, 6.58224f, 8.92227f, 5.71235f)
        curveTo(9.23463f, 5.41773f, 9.60662f, 5.20057f, 10.0105f, 5.07707f)
        curveTo(11.203f, 4.71243f, 12.6753f, 5.6589f, 15.6198f, 7.55186f)
        curveTo(18.327f, 9.29233f, 19.6807f, 10.1626f, 19.9351f, 11.3742f)
        curveTo(20.0216f, 11.7865f, 20.0216f, 12.2135f, 19.9351f, 12.6258f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 5f)
        lineTo(4f, 19f)
        }
        }.build()

        return _forward01!!
    }

private var _forward01: ImageVector? = null
