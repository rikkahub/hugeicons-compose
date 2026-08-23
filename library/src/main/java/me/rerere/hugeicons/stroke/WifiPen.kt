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

val HugeIcons.WifiPen: ImageVector
    get() {
        if (_wifiPen != null) {
            return _wifiPen!!
        }
        _wifiPen = ImageVector.Builder(
            name = "WifiPen",
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
            curveTo(15.6897f, 4f, 19.2499f, 5.35989f, 22f, 7.81966f)
            moveTo(5f, 11.8587f)
            curveTo(6.86929f, 10.0264f, 9.38247f, 9.00009f, 12f, 9.00009f)
            curveTo(13.432f, 9.00009f, 14.8327f, 9.30725f, 16.1139f, 9.88549f)
            moveTo(8.5f, 15.4287f)
            curveTo(9.43464f, 14.5125f, 10.6912f, 13.9994f, 12f, 13.9994f)
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
            moveTo(13f, 20f)
            verticalLineTo(18.6611f)
            curveTo(13f, 18.0548f, 13.2408f, 17.4735f, 13.6695f, 17.0448f)
            lineTo(18.3102f, 12.4041f)
            curveTo(18.5689f, 12.1453f, 18.9198f, 12f, 19.2857f, 12f)
            curveTo(19.6516f, 12f, 20.0025f, 12.1453f, 20.2612f, 12.4041f)
            lineTo(20.5959f, 12.7388f)
            curveTo(20.8547f, 12.9975f, 21f, 13.3484f, 21f, 13.7143f)
            curveTo(21f, 14.0802f, 20.8547f, 14.4311f, 20.5959f, 14.6898f)
            lineTo(15.9552f, 19.3305f)
            curveTo(15.5265f, 19.7592f, 14.9452f, 20f, 14.3389f, 20f)
            horizontalLineTo(13f)
            close()
        }
        }.build()

        return _wifiPen!!
    }

private var _wifiPen: ImageVector? = null
