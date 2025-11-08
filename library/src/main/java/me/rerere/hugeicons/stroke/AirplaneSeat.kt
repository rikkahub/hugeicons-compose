package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AirplaneSeat: ImageVector
    get() {
        if (_airplaneSeat != null) {
            return _airplaneSeat!!
        }
        _airplaneSeat = ImageVector.Builder(
            name = "AirplaneSeat",
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
        moveTo(8.48169f, 18f)
        horizontalLineTo(17.9722f)
        curveTo(19.0921f, 18f, 20f, 17.1077f, 20f, 16.0071f)
        curveTo(20f, 14.5f, 17.9722f, 14.0141f, 17.9722f, 14.0141f)
        curveTo(17.9722f, 14.0141f, 14.2844f, 12.5964f, 10f, 14f)
        curveTo(10f, 14f, 9.86099f, 8.87274f, 7.70985f, 3.17067f)
        curveTo(7.28543f, 2.04566f, 5.90119f, 1.66155f, 4.88539f, 2.3271f)
        curveTo(4.21507f, 2.7663f, 3.8807f, 3.55966f, 4.0387f, 4.33605f)
        lineTo(6.49327f, 16.3979f)
        curveTo(6.68283f, 17.3295f, 7.51507f, 18f, 8.48169f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.5f, 10.5f)
        horizontalLineTo(18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 18f)
        lineTo(13f, 22f)
        moveTo(13f, 22f)
        horizontalLineTo(8f)
        moveTo(13f, 22f)
        horizontalLineTo(18f)
        }
        }.build()

        return _airplaneSeat!!
    }

private var _airplaneSeat: ImageVector? = null
