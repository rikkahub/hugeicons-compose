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

val HugeIcons.WifiError02: ImageVector
    get() {
        if (_wifiError02 != null) {
            return _wifiError02!!
        }
        _wifiError02 = ImageVector.Builder(
            name = "WifiError02",
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
            moveTo(2f, 8.31974f)
            curveTo(3.99395f, 6.5363f, 6.41376f, 5.33105f, 9f, 4.8031f)
            moveTo(22f, 8.31974f)
            curveTo(20.0061f, 6.5363f, 17.5862f, 5.33105f, 15f, 4.8031f)
            moveTo(5f, 12.3587f)
            curveTo(6.13592f, 11.2453f, 7.50961f, 10.4295f, 9f, 9.96076f)
            moveTo(19f, 12.3587f)
            curveTo(17.8641f, 11.2453f, 16.4904f, 10.4295f, 15f, 9.96076f)
            moveTo(8.5f, 15.9287f)
            curveTo(8.65791f, 15.774f, 8.82501f, 15.6307f, 9f, 15.4994f)
            moveTo(15.5f, 15.9287f)
            curveTo(15.3421f, 15.774f, 15.175f, 15.6307f, 15f, 15.4994f)
            moveTo(12.1256f, 19.2501f)
            horizontalLineTo(12.0006f)
            moveTo(12.2506f, 19.2501f)
            curveTo(12.2506f, 19.3881f, 12.1387f, 19.5001f, 12.0006f, 19.5001f)
            curveTo(11.8625f, 19.5001f, 11.7506f, 19.3881f, 11.7506f, 19.2501f)
            curveTo(11.7506f, 19.112f, 11.8625f, 19.0001f, 12.0006f, 19.0001f)
            curveTo(12.1387f, 19.0001f, 12.2506f, 19.112f, 12.2506f, 19.2501f)
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
            moveTo(12f, 15.5001f)
            verticalLineTo(4.50006f)
        }
        }.build()

        return _wifiError02!!
    }

private var _wifiError02: ImageVector? = null
