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

val HugeIcons.WifiDisconnected03: ImageVector
    get() {
        if (_wifiDisconnected03 != null) {
            return _wifiDisconnected03!!
        }
        _wifiDisconnected03 = ImageVector.Builder(
            name = "WifiDisconnected03",
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
            moveTo(2f, 7.81966f)
            curveTo(4.75011f, 5.35989f, 8.31034f, 4f, 12f, 4f)
            moveTo(5f, 11.8587f)
            curveTo(6.86929f, 10.0264f, 9.38247f, 9.00009f, 12f, 9.00009f)
            moveTo(8.5f, 15.4287f)
            curveTo(9.43464f, 14.5125f, 10.6912f, 13.9994f, 12f, 13.9994f)
            curveTo(13.3088f, 13.9994f, 14.5654f, 14.5125f, 15.5f, 15.4287f)
            moveTo(12.1256f, 18.75f)
            horizontalLineTo(12.0006f)
            moveTo(12.2506f, 18.75f)
            curveTo(12.2506f, 18.8881f, 12.1387f, 19f, 12.0006f, 19f)
            curveTo(11.8625f, 19f, 11.7506f, 18.8881f, 11.7506f, 18.75f)
            curveTo(11.7506f, 18.6119f, 11.8625f, 18.5f, 12.0006f, 18.5f)
            curveTo(12.1387f, 18.5f, 12.2506f, 18.6119f, 12.2506f, 18.75f)
            close()
        }

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
            moveTo(16f, 4f)
            lineTo(22f, 10f)
            moveTo(22f, 4f)
            lineTo(16f, 10f)
        }
        }.build()

        return _wifiDisconnected03!!
    }

private var _wifiDisconnected03: ImageVector? = null
