package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.WifiConnected02: ImageVector
    get() {
        if (_wifiConnected02 != null) {
            return _wifiConnected02!!
        }
        _wifiConnected02 = ImageVector.Builder(
            name = "WifiConnected02",
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
        moveTo(18.5f, 11.5f)
        curveTo(14.7324f, 8.16667f, 9.5f, 8.16667f, 5.5f, 11.5f)
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

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 18.0001f)
        curveTo(9f, 18.0001f, 10f, 18.0001f, 11f, 20.0001f)
        curveTo(11f, 20.0001f, 13.4766f, 16.1017f, 16f, 14.501f)
        }
        }.build()

        return _wifiConnected02!!
    }

private var _wifiConnected02: ImageVector? = null
