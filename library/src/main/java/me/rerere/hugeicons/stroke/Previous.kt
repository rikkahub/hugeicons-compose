package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Previous: ImageVector
    get() {
        if (_previous != null) {
            return _previous!!
        }
        _previous = ImageVector.Builder(
            name = "Previous",
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
        moveTo(8.06492f, 12.6258f)
        curveTo(8.31931f, 13.8374f, 9.67295f, 14.7077f, 12.3802f, 16.4481f)
        curveTo(15.3247f, 18.3411f, 16.797f, 19.2876f, 17.9895f, 18.9229f)
        curveTo(18.3934f, 18.7994f, 18.7654f, 18.5823f, 19.0777f, 18.2876f)
        curveTo(20f, 17.4178f, 20f, 15.6118f, 20f, 12f)
        curveTo(20f, 8.38816f, 20f, 6.58224f, 19.0777f, 5.71235f)
        curveTo(18.7654f, 5.41773f, 18.3934f, 5.20057f, 17.9895f, 5.07707f)
        curveTo(16.797f, 4.71243f, 15.3247f, 5.6589f, 12.3802f, 7.55186f)
        curveTo(9.67295f, 9.29233f, 8.31931f, 10.1626f, 8.06492f, 11.3742f)
        curveTo(7.97836f, 11.7865f, 7.97836f, 12.2135f, 8.06492f, 12.6258f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 4f)
        lineTo(4f, 20f)
        }
        }.build()

        return _previous!!
    }

private var _previous: ImageVector? = null
