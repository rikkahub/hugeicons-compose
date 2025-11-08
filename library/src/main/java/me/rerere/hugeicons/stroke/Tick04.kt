package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Tick04: ImageVector
    get() {
        if (_tick04 != null) {
            return _tick04!!
        }
        _tick04 = ImageVector.Builder(
            name = "Tick04",
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
        moveTo(21.8606f, 5.39176f)
        curveTo(22.2875f, 6.49635f, 21.6888f, 7.2526f, 20.5301f, 7.99754f)
        curveTo(19.5951f, 8.5986f, 18.4039f, 9.24975f, 17.1417f, 10.363f)
        curveTo(15.9044f, 11.4543f, 14.6968f, 12.7687f, 13.6237f, 14.0625f)
        curveTo(12.5549f, 15.351f, 11.6465f, 16.586f, 11.0046f, 17.5005f)
        curveTo(10.5898f, 18.0914f, 10.011f, 18.9729f, 10.011f, 18.9729f)
        curveTo(9.60281f, 19.6187f, 8.86895f, 20.0096f, 8.08206f, 19.9998f)
        curveTo(7.295f, 19.99f, 6.57208f, 19.5812f, 6.18156f, 18.9251f)
        curveTo(5.18328f, 17.248f, 4.41296f, 16.5857f, 4.05891f, 16.3478f)
        curveTo(3.11158f, 15.7112f, 2f, 15.6171f, 2f, 14.1335f)
        curveTo(2f, 12.9554f, 2.99489f, 12.0003f, 4.22216f, 12.0003f)
        curveTo(5.08862f, 12.0323f, 5.89398f, 12.373f, 6.60756f, 12.8526f)
        curveTo(7.06369f, 13.1591f, 7.54689f, 13.5645f, 8.04948f, 14.0981f)
        curveTo(8.63934f, 13.2936f, 9.35016f, 12.3653f, 10.147f, 11.4047f)
        curveTo(11.3042f, 10.0097f, 12.6701f, 8.51309f, 14.1349f, 7.22116f)
        curveTo(15.5748f, 5.95115f, 17.2396f, 4.76235f, 19.0042f, 4.13381f)
        curveTo(20.1549f, 3.72397f, 21.4337f, 4.28718f, 21.8606f, 5.39176f)
        }
        }.build()

        return _tick04!!
    }

private var _tick04: ImageVector? = null
