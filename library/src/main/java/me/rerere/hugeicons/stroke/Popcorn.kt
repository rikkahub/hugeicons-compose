package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Popcorn: ImageVector
    get() {
        if (_popcorn != null) {
            return _popcorn!!
        }
        _popcorn = ImageVector.Builder(
            name = "Popcorn",
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
        moveTo(5.00342f, 12.001f)
        lineTo(6.03831f, 17.0164f)
        curveTo(6.49989f, 19.2534f, 6.73067f, 20.3719f, 7.55975f, 21.0308f)
        curveTo(9.13581f, 22.2831f, 14.8599f, 22.2871f, 16.441f, 21.0308f)
        curveTo(17.2701f, 20.3719f, 17.5009f, 19.2534f, 17.9625f, 17.0164f)
        lineTo(18.9973f, 12.001f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.0044f, 12.0148f)
        lineTo(14.0044f, 21.999f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.0938f, 2.31253f)
        curveTo(11.4908f, 2.4964f, 11.8312f, 2.8496f, 12.0243f, 3.02872f)
        curveTo(12.2175f, 2.8496f, 12.5092f, 2.49637f, 12.9062f, 2.3125f)
        curveTo(14.4774f, 1.58479f, 16.6099f, 2.17175f, 17.4834f, 3.66401f)
        curveTo(17.8376f, 4.26919f, 18.1149f, 5.10452f, 18.0481f, 5.98859f)
        curveTo(19.2574f, 5.98859f, 20.9317f, 6.89326f, 20.9968f, 8.83838f)
        curveTo(21.0557f, 10.5998f, 20.1509f, 11.3979f, 19.4073f, 11.7759f)
        curveTo(19.0347f, 11.9653f, 18.6108f, 12.0135f, 18.1926f, 12.0135f)
        lineTo(5.80737f, 12.0135f)
        curveTo(5.38915f, 12.0135f, 4.96528f, 11.9653f, 4.59267f, 11.7759f)
        curveTo(3.84906f, 11.3979f, 2.94431f, 10.5998f, 3.00322f, 8.83841f)
        curveTo(3.06828f, 6.89329f, 4.79866f, 6.03205f, 6.00801f, 6.03205f)
        curveTo(5.94113f, 5.14798f, 6.16241f, 4.26922f, 6.51665f, 3.66404f)
        curveTo(7.39012f, 2.17178f, 9.52256f, 1.58482f, 11.0938f, 2.31253f)
        }
        }.build()

        return _popcorn!!
    }

private var _popcorn: ImageVector? = null
