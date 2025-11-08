package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.WifiConnected01: ImageVector
    get() {
        if (_wifiConnected01 != null) {
            return _wifiConnected01!!
        }
        _wifiConnected01 = ImageVector.Builder(
            name = "WifiConnected01",
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
        moveTo(12f, 20.5f)
        curveTo(11.0173f, 20.5f, 10.2863f, 19.503f, 8.82421f, 17.509f)
        lineTo(3.48742f, 9.73059f)
        curveTo(2.40801f, 8.25847f, 1.86831f, 7.52241f, 2.02741f, 6.57659f)
        curveTo(2.18651f, 5.63078f, 2.81754f, 5.2161f, 4.07962f, 4.38675f)
        curveTo(6.38289f, 2.87318f, 9.0958f, 2f, 12f, 2f)
        curveTo(14.9042f, 2f, 17.6171f, 2.87318f, 19.9204f, 4.38675f)
        curveTo(21.1825f, 5.2161f, 21.8135f, 5.63078f, 21.9726f, 6.57659f)
        curveTo(22.1317f, 7.52241f, 21.592f, 8.25847f, 20.5126f, 9.73059f)
        lineTo(16f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 13f)
        curveTo(14.6871f, 10.3333f, 9.31293f, 10.3333f, 5f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 10f)
        curveTo(15.4548f, 6f, 8.54519f, 6f, 3f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 16f)
        curveTo(13.465f, 14.6667f, 10.535f, 14.6667f, 8f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 19f)
        curveTo(14f, 19f, 15f, 19f, 16f, 21f)
        curveTo(16f, 21f, 19.1765f, 16f, 22f, 15f)
        }
        }.build()

        return _wifiConnected01!!
    }

private var _wifiConnected01: ImageVector? = null
