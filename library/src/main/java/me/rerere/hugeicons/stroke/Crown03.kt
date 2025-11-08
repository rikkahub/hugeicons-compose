package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Crown03: ImageVector
    get() {
        if (_crown03 != null) {
            return _crown03!!
        }
        _crown03 = ImageVector.Builder(
            name = "Crown03",
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
        moveTo(5f, 20.5f)
        horizontalLineTo(19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.8717f, 17.5f)
        horizontalLineTo(7.1283f)
        curveTo(6.10017f, 17.5f, 5.58611f, 17.5f, 5.19623f, 17.2234f)
        curveTo(4.80634f, 16.9468f, 4.63649f, 16.4616f, 4.29679f, 15.4912f)
        lineTo(2.05123f, 9.07668f)
        curveTo(1.93172f, 8.72325f, 2.02503f, 8.3336f, 2.29225f, 8.07016f)
        curveTo(2.62854f, 7.73864f, 3.15545f, 7.6872f, 3.55117f, 7.94727f)
        lineTo(4.78349f, 8.75718f)
        curveTo(6.02739f, 9.5747f, 6.64935f, 9.98345f, 7.27815f, 9.83488f)
        curveTo(7.90696f, 9.68631f, 8.28019f, 9.04241f, 9.02665f, 7.75461f)
        lineTo(11.2412f, 3.93412f)
        curveTo(11.3968f, 3.66567f, 11.6864f, 3.5f, 12f, 3.5f)
        curveTo(12.3136f, 3.5f, 12.6032f, 3.66567f, 12.7588f, 3.93412f)
        lineTo(14.9733f, 7.75461f)
        curveTo(15.7198f, 9.04241f, 16.093f, 9.68631f, 16.7218f, 9.83488f)
        curveTo(17.3507f, 9.98345f, 17.9726f, 9.5747f, 19.2165f, 8.75718f)
        lineTo(20.4488f, 7.94727f)
        curveTo(20.8445f, 7.6872f, 21.3715f, 7.73864f, 21.7078f, 8.07016f)
        curveTo(21.975f, 8.3336f, 22.0683f, 8.72325f, 21.9488f, 9.07668f)
        lineTo(19.7032f, 15.4912f)
        curveTo(19.3635f, 16.4616f, 19.1937f, 16.9468f, 18.8038f, 17.2234f)
        curveTo(18.4139f, 17.5f, 17.8998f, 17.5f, 16.8717f, 17.5f)
        }
        }.build()

        return _crown03!!
    }

private var _crown03: ImageVector? = null
