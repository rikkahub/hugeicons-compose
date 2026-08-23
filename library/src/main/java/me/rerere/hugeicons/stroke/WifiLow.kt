package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.WifiLow: ImageVector
    get() {
        if (_wifiLow != null) {
            return _wifiLow!!
        }
        _wifiLow = ImageVector.Builder(
            name = "WifiLow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(8.5f, 15.9293f)
            curveTo(9.43464f, 15.0132f, 10.6912f, 14.5f, 12f, 14.5f)
            curveTo(13.3088f, 14.5f, 14.5654f, 15.0132f, 15.5f, 15.9293f)
            moveTo(12.1256f, 19.2506f)
            horizontalLineTo(12.0006f)
            moveTo(12.2506f, 19.2506f)
            curveTo(12.2506f, 19.3887f, 12.1387f, 19.5006f, 12.0006f, 19.5006f)
            curveTo(11.8625f, 19.5006f, 11.7506f, 19.3887f, 11.7506f, 19.2506f)
            curveTo(11.7506f, 19.1126f, 11.8625f, 19.0006f, 12.0006f, 19.0006f)
            curveTo(12.1387f, 19.0006f, 12.2506f, 19.1126f, 12.2506f, 19.2506f)
            close()
        }
        }.build()

        return _wifiLow!!
    }

private var _wifiLow: ImageVector? = null
