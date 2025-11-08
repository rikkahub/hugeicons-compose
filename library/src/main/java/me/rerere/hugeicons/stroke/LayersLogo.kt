package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LayersLogo: ImageVector
    get() {
        if (_layersLogo != null) {
            return _layersLogo!!
        }
        _layersLogo = ImageVector.Builder(
            name = "LayersLogo",
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
        moveTo(9.87868f, 20.1214f)
        curveTo(10.7574f, 21.0001f, 12.1716f, 21.0001f, 15f, 21.0001f)
        curveTo(17.8284f, 21.0001f, 19.2426f, 21.0001f, 20.1213f, 20.1214f)
        curveTo(21f, 19.2428f, 21f, 17.8285f, 21f, 15.0001f)
        curveTo(21f, 12.1717f, 21f, 10.7575f, 20.1213f, 9.8788f)
        curveTo(19.2426f, 9.00012f, 17.8284f, 9.00012f, 15f, 9.00012f)
        curveTo(12.1716f, 9.00012f, 10.7574f, 9.00012f, 9.87868f, 9.8788f)
        curveTo(9f, 10.7575f, 9f, 12.1717f, 9f, 15.0001f)
        curveTo(9f, 17.8285f, 9f, 19.2428f, 9.87868f, 20.1214f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.9239f, 9.00012f)
        curveTo(17.828f, 8.02504f, 17.6112f, 7.36869f, 17.1213f, 6.8788f)
        curveTo(16.2426f, 6.00012f, 14.8284f, 6.00012f, 12f, 6.00012f)
        curveTo(9.17157f, 6.00012f, 7.75736f, 6.00012f, 6.87868f, 6.8788f)
        curveTo(6f, 7.75748f, 6f, 9.17169f, 6f, 12.0001f)
        curveTo(6f, 14.8285f, 6f, 16.2428f, 6.87868f, 17.1214f)
        curveTo(7.36857f, 17.6113f, 8.02491f, 17.8281f, 9f, 17.924f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.9239f, 6.00012f)
        curveTo(14.828f, 5.02504f, 14.6112f, 4.36869f, 14.1213f, 3.8788f)
        curveTo(13.2426f, 3.00012f, 11.8284f, 3.00012f, 9f, 3.00012f)
        curveTo(6.17157f, 3.00012f, 4.75736f, 3.00012f, 3.87868f, 3.8788f)
        curveTo(3f, 4.75748f, 3f, 6.17169f, 3f, 9.00012f)
        curveTo(3f, 11.8285f, 3f, 13.2428f, 3.87868f, 14.1214f)
        curveTo(4.36857f, 14.6113f, 5.02491f, 14.8281f, 6f, 14.924f)
        }
        }.build()

        return _layersLogo!!
    }

private var _layersLogo: ImageVector? = null
