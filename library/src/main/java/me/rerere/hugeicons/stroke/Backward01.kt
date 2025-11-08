package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Backward01: ImageVector
    get() {
        if (_backward01 != null) {
            return _backward01!!
        }
        _backward01 = ImageVector.Builder(
            name = "Backward01",
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
        moveTo(4.06492f, 12.6258f)
        curveTo(4.31931f, 13.8374f, 5.67295f, 14.7077f, 8.38024f, 16.4481f)
        curveTo(11.3247f, 18.3411f, 12.797f, 19.2876f, 13.9895f, 18.9229f)
        curveTo(14.3934f, 18.7994f, 14.7654f, 18.5823f, 15.0777f, 18.2876f)
        curveTo(16f, 17.4178f, 16f, 15.6118f, 16f, 12f)
        curveTo(16f, 8.38816f, 16f, 6.58224f, 15.0777f, 5.71235f)
        curveTo(14.7654f, 5.41773f, 14.3934f, 5.20057f, 13.9895f, 5.07707f)
        curveTo(12.797f, 4.71243f, 11.3247f, 5.6589f, 8.38024f, 7.55186f)
        curveTo(5.67295f, 9.29233f, 4.31931f, 10.1626f, 4.06492f, 11.3742f)
        curveTo(3.97836f, 11.7865f, 3.97836f, 12.2135f, 4.06492f, 12.6258f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 5f)
        verticalLineTo(19f)
        }
        }.build()

        return _backward01!!
    }

private var _backward01: ImageVector? = null
