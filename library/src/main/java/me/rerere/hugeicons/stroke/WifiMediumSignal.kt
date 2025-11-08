package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.WifiMediumSignal: ImageVector
    get() {
        if (_wifiMediumSignal != null) {
            return _wifiMediumSignal!!
        }
        _wifiMediumSignal = ImageVector.Builder(
            name = "WifiMediumSignal",
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
        moveTo(20.5126f, 10.7306f)
        lineTo(15.1758f, 18.009f)
        curveTo(13.7137f, 20.003f, 12.9827f, 21f, 12f, 21f)
        curveTo(11.0173f, 21f, 10.2863f, 20.003f, 8.82421f, 18.009f)
        lineTo(3.48742f, 10.7306f)
        curveTo(2.40801f, 9.25847f, 1.86831f, 8.52241f, 2.02741f, 7.57659f)
        curveTo(2.18651f, 6.63078f, 2.81754f, 6.2161f, 4.07962f, 5.38675f)
        curveTo(6.38289f, 3.87318f, 9.0958f, 3f, 12f, 3f)
        curveTo(14.9042f, 3f, 17.6171f, 3.87318f, 19.9204f, 5.38675f)
        curveTo(21.1825f, 6.2161f, 21.8135f, 6.63078f, 21.9726f, 7.57659f)
        curveTo(22.1317f, 8.52241f, 21.592f, 9.25847f, 20.5126f, 10.7306f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 14f)
        curveTo(14.6871f, 11.3333f, 9.31293f, 11.3333f, 5f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 17f)
        curveTo(13.465f, 15.6667f, 10.535f, 15.6667f, 8f, 17f)
        }
        }.build()

        return _wifiMediumSignal!!
    }

private var _wifiMediumSignal: ImageVector? = null
