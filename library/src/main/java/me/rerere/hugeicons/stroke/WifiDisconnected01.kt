package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.WifiDisconnected01: ImageVector
    get() {
        if (_wifiDisconnected01 != null) {
            return _wifiDisconnected01!!
        }
        _wifiDisconnected01 = ImageVector.Builder(
            name = "WifiDisconnected01",
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
        moveTo(8.5f, 15.9996f)
        curveTo(9.36651f, 15.1331f, 10.4207f, 14.642f, 11.5f, 14.5264f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.5f, 12.5f)
        curveTo(8.67327f, 9.32673f, 12.6221f, 8.67087f, 16f, 10.5324f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 8.5f)
        curveTo(8.31579f, 3.16669f, 15.6842f, 3.16668f, 22f, 8.49989f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.0002f, 13.5f)
        lineTo(15.0002f, 19.5f)
        moveTo(21.0002f, 19.5f)
        lineTo(15.0002f, 13.5f)
        }
        }.build()

        return _wifiDisconnected01!!
    }

private var _wifiDisconnected01: ImageVector? = null
