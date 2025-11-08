package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CurvyUpDownDirection: ImageVector
    get() {
        if (_curvyUpDownDirection != null) {
            return _curvyUpDownDirection!!
        }
        _curvyUpDownDirection = ImageVector.Builder(
            name = "CurvyUpDownDirection",
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
        moveTo(13.0135f, 19.9962f)
        curveTo(13.0135f, 19.9962f, 11.5441f, 21.9976f, 11.0172f, 21.9985f)
        curveTo(10.4902f, 21.9994f, 9.01411f, 20.003f, 9.01411f, 20.003f)
        moveTo(14.9863f, 3.99552f)
        curveTo(14.9863f, 3.99552f, 13.5101f, 2.00008f, 12.9832f, 2.00098f)
        curveTo(12.4562f, 2.00188f, 10.9869f, 4.00237f, 10.9869f, 4.00237f)
        moveTo(12.851f, 2.22593f)
        curveTo(13.1433f, 3.63634f, 13.2603f, 6.2807f, 10.8092f, 7.59471f)
        curveTo(9.94673f, 8.13922f, 8.50078f, 8.03987f, 6.85542f, 8.04268f)
        curveTo(6.18478f, 8.07762f, 4.96565f, 8.65084f, 4.99871f, 10.0822f)
        curveTo(5.03176f, 11.5135f, 6.20852f, 11.9815f, 6.79277f, 12.0366f)
        lineTo(16.9018f, 12.0193f)
        curveTo(17.7533f, 12.0033f, 18.9994f, 12.4946f, 19.002f, 14.0102f)
        curveTo(19.0045f, 15.4898f, 17.6936f, 16.0713f, 16.7099f, 15.9453f)
        curveTo(14.0457f, 15.6042f, 11.2552f, 16.4168f, 11.017f, 19.9156f)
        lineTo(11.0206f, 21.9985f)
        }
        }.build()

        return _curvyUpDownDirection!!
    }

private var _curvyUpDownDirection: ImageVector? = null
