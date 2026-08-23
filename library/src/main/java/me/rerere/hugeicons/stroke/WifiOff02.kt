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

val HugeIcons.WifiOff02: ImageVector
    get() {
        if (_wifiOff02 != null) {
            return _wifiOff02!!
        }
        _wifiOff02 = ImageVector.Builder(
            name = "WifiOff02",
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
            moveTo(2f, 8.81966f)
            curveTo(3.05591f, 7.87522f, 4.23126f, 7.09293f, 5.4875f, 6.4875f)
            moveTo(22f, 8.81966f)
            curveTo(19.2499f, 6.35989f, 15.6897f, 5f, 12f, 5f)
            curveTo(10.7883f, 5f, 9.5905f, 5.14667f, 8.4308f, 5.4308f)
            moveTo(5f, 12.8587f)
            curveTo(6.22581f, 11.6571f, 7.72851f, 10.8022f, 9.35595f, 10.3559f)
            moveTo(19f, 12.8587f)
            curveTo(17.3838f, 11.2744f, 15.2862f, 10.2927f, 13.056f, 10.056f)
            moveTo(8.5f, 16.4287f)
            curveTo(9.43464f, 15.5125f, 10.6912f, 14.9994f, 12f, 14.9994f)
            curveTo(13.0878f, 14.9994f, 14.1392f, 15.3543f, 15f, 16f)
            moveTo(12.1256f, 19.75f)
            horizontalLineTo(12.0006f)
            moveTo(12.2506f, 19.75f)
            curveTo(12.2506f, 19.8881f, 12.1387f, 20f, 12.0006f, 20f)
            curveTo(11.8625f, 20f, 11.7506f, 19.8881f, 11.7506f, 19.75f)
            curveTo(11.7506f, 19.6119f, 11.8625f, 19.5f, 12.0006f, 19.5f)
            curveTo(12.1387f, 19.5f, 12.2506f, 19.6119f, 12.2506f, 19.75f)
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
            moveTo(3f, 4f)
            lineTo(19f, 20f)
        }
        }.build()

        return _wifiOff02!!
    }

private var _wifiOff02: ImageVector? = null
