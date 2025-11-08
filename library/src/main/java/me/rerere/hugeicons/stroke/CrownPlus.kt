package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CrownPlus: ImageVector
    get() {
        if (_crownPlus != null) {
            return _crownPlus!!
        }
        _crownPlus = ImageVector.Builder(
            name = "CrownPlus",
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
        moveTo(18.5f, 2f)
        verticalLineTo(7f)
        moveTo(21f, 4.5f)
        lineTo(16f, 4.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 22f)
        horizontalLineTo(19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.8717f, 19f)
        horizontalLineTo(7.1283f)
        curveTo(6.10017f, 19f, 5.58611f, 19f, 5.19623f, 18.7234f)
        curveTo(4.80634f, 18.4468f, 4.63649f, 17.9616f, 4.29679f, 16.9912f)
        lineTo(2.05123f, 10.5767f)
        curveTo(1.93172f, 10.2233f, 2.02503f, 9.8336f, 2.29225f, 9.57016f)
        curveTo(2.62854f, 9.23864f, 3.15545f, 9.1872f, 3.55117f, 9.44727f)
        lineTo(4.78349f, 10.2572f)
        curveTo(6.02739f, 11.0747f, 6.64935f, 11.4835f, 7.27815f, 11.3349f)
        curveTo(7.90696f, 11.1863f, 8.28019f, 10.5424f, 9.02665f, 9.25461f)
        lineTo(11.2412f, 5.43412f)
        curveTo(11.3968f, 5.16567f, 11.6864f, 5f, 12f, 5f)
        curveTo(12.3136f, 5f, 12.6032f, 5.16567f, 12.7588f, 5.43412f)
        lineTo(14.9733f, 9.25461f)
        curveTo(15.7198f, 10.5424f, 16.093f, 11.1863f, 16.7218f, 11.3349f)
        curveTo(17.3507f, 11.4835f, 17.9726f, 11.0747f, 19.2165f, 10.2572f)
        lineTo(20.4488f, 9.44727f)
        curveTo(20.8445f, 9.1872f, 21.3715f, 9.23864f, 21.7078f, 9.57016f)
        curveTo(21.975f, 9.8336f, 22.0683f, 10.2233f, 21.9488f, 10.5767f)
        lineTo(19.7032f, 16.9912f)
        curveTo(19.3635f, 17.9616f, 19.1937f, 18.4468f, 18.8038f, 18.7234f)
        curveTo(18.4139f, 19f, 17.8998f, 19f, 16.8717f, 19f)
        }
        }.build()

        return _crownPlus!!
    }

private var _crownPlus: ImageVector? = null
