package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.WifiDisconnected02: ImageVector
    get() {
        if (_wifiDisconnected02 != null) {
            return _wifiDisconnected02!!
        }
        _wifiDisconnected02 = ImageVector.Builder(
            name = "WifiDisconnected02",
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
        moveTo(14.5002f, 15f)
        lineTo(9.50016f, 20f)
        moveTo(14.5002f, 20f)
        lineTo(9.50016f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.5f, 13f)
        curveTo(14.7324f, 9f, 9.5f, 9f, 5.5f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 8f)
        curveTo(8.31579f, 2.66669f, 15.6842f, 2.66668f, 22f, 7.99989f)
        }
        }.build()

        return _wifiDisconnected02!!
    }

private var _wifiDisconnected02: ImageVector? = null
