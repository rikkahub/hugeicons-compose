package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CrownMinus: ImageVector
    get() {
        if (_crownMinus != null) {
            return _crownMinus!!
        }
        _crownMinus = ImageVector.Builder(
            name = "CrownMinus",
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
        moveTo(21.5f, 3f)
        lineTo(16.5f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 21f)
        horizontalLineTo(19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.8717f, 18f)
        horizontalLineTo(7.1283f)
        curveTo(6.10017f, 18f, 5.58611f, 18f, 5.19623f, 17.7234f)
        curveTo(4.80634f, 17.4468f, 4.63649f, 16.9616f, 4.29679f, 15.9912f)
        lineTo(2.05123f, 9.57668f)
        curveTo(1.93172f, 9.22325f, 2.02503f, 8.8336f, 2.29225f, 8.57016f)
        curveTo(2.62854f, 8.23864f, 3.15545f, 8.1872f, 3.55117f, 8.44727f)
        lineTo(4.78349f, 9.25718f)
        curveTo(6.02739f, 10.0747f, 6.64935f, 10.4835f, 7.27815f, 10.3349f)
        curveTo(7.90696f, 10.1863f, 8.28019f, 9.54241f, 9.02665f, 8.25461f)
        lineTo(11.2412f, 4.43412f)
        curveTo(11.3968f, 4.16567f, 11.6864f, 4f, 12f, 4f)
        curveTo(12.3136f, 4f, 12.6032f, 4.16567f, 12.7588f, 4.43412f)
        lineTo(14.9733f, 8.25461f)
        curveTo(15.7198f, 9.54241f, 16.093f, 10.1863f, 16.7218f, 10.3349f)
        curveTo(17.3507f, 10.4835f, 17.9726f, 10.0747f, 19.2165f, 9.25718f)
        lineTo(20.4488f, 8.44727f)
        curveTo(20.8445f, 8.1872f, 21.3715f, 8.23864f, 21.7078f, 8.57016f)
        curveTo(21.975f, 8.8336f, 22.0683f, 9.22325f, 21.9488f, 9.57668f)
        lineTo(19.7032f, 15.9912f)
        curveTo(19.3635f, 16.9616f, 19.1937f, 17.4468f, 18.8038f, 17.7234f)
        curveTo(18.4139f, 18f, 17.8998f, 18f, 16.8717f, 18f)
        }
        }.build()

        return _crownMinus!!
    }

private var _crownMinus: ImageVector? = null
