package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.WifiNoSignal: ImageVector
    get() {
        if (_wifiNoSignal != null) {
            return _wifiNoSignal!!
        }
        _wifiNoSignal = ImageVector.Builder(
            name = "WifiNoSignal",
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
        moveTo(20.5126f, 10.8011f)
        lineTo(15.1758f, 17.6752f)
        curveTo(13.7137f, 19.5584f, 12.9827f, 20.5f, 12f, 20.5f)
        curveTo(11.0173f, 20.5f, 10.2863f, 19.5584f, 8.82421f, 17.6752f)
        lineTo(3.48742f, 10.8011f)
        curveTo(2.40801f, 9.41078f, 1.86831f, 8.71561f, 2.02741f, 7.82234f)
        curveTo(2.18651f, 6.92907f, 2.81754f, 6.53743f, 4.07962f, 5.75415f)
        curveTo(6.38289f, 4.32467f, 9.0958f, 3.5f, 12f, 3.5f)
        curveTo(14.9042f, 3.5f, 17.6171f, 4.32467f, 19.9204f, 5.75415f)
        curveTo(21.1825f, 6.53743f, 21.8135f, 6.92907f, 21.9726f, 7.82234f)
        curveTo(22.1317f, 8.71561f, 21.592f, 9.41078f, 20.5126f, 10.8011f)
        }
        }.build()

        return _wifiNoSignal!!
    }

private var _wifiNoSignal: ImageVector? = null
