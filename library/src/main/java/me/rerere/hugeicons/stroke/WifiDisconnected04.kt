package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.WifiDisconnected04: ImageVector
    get() {
        if (_wifiDisconnected04 != null) {
            return _wifiDisconnected04!!
        }
        _wifiDisconnected04 = ImageVector.Builder(
            name = "WifiDisconnected04",
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
        moveTo(12f, 21f)
        curveTo(11.0173f, 21f, 10.2863f, 20.003f, 8.82421f, 18.009f)
        lineTo(3.48742f, 10.7306f)
        curveTo(2.40801f, 9.25847f, 1.86831f, 8.52241f, 2.02741f, 7.57659f)
        curveTo(2.18651f, 6.63078f, 2.81754f, 6.2161f, 4.07962f, 5.38675f)
        curveTo(6.38289f, 3.87318f, 9.0958f, 3f, 12f, 3f)
        curveTo(14.9042f, 3f, 17.6171f, 3.87318f, 19.9204f, 5.38675f)
        curveTo(21.1825f, 6.2161f, 21.8135f, 6.63078f, 21.9726f, 7.57659f)
        curveTo(22.1317f, 8.52241f, 21.592f, 9.25847f, 20.5126f, 10.7306f)
        lineTo(19f, 12.6988f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.0002f, 15f)
        lineTo(15.0002f, 21f)
        moveTo(21.0002f, 21f)
        lineTo(15.0002f, 15f)
        }
        }.build()

        return _wifiDisconnected04!!
    }

private var _wifiDisconnected04: ImageVector? = null
