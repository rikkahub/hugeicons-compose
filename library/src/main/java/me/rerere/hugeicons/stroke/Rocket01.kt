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

val HugeIcons.Rocket01: ImageVector
    get() {
        if (_rocket01 != null) {
            return _rocket01!!
        }
        _rocket01 = ImageVector.Builder(
            name = "Rocket01",
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
            moveTo(6.21875f, 11.618f)
            lineTo(3.31189f, 11.2378f)
            curveTo(2.71644f, 11.1606f, 2.31883f, 10.5841f, 2.58348f, 10.0458f)
            curveTo(3.42523f, 8.33365f, 5.6195f, 6.35437f, 9.73988f, 6.68079f)
            moveTo(6.21875f, 11.618f)
            curveTo(7.27445f, 9.85426f, 8.57175f, 8.00435f, 9.73988f, 6.68079f)
            moveTo(6.21875f, 11.618f)
            lineTo(11.882f, 17.2812f)
            moveTo(9.73988f, 6.68079f)
            curveTo(13.4105f, 2.58986f, 17.1745f, 1.728f, 19.5937f, 2.06685f)
            curveTo(20.5508f, 2.2009f, 21.2991f, 2.94917f, 21.4332f, 3.90626f)
            curveTo(21.772f, 6.32551f, 20.9101f, 10.0895f, 16.8192f, 13.7601f)
            moveTo(11.882f, 17.2812f)
            lineTo(12.2622f, 20.1881f)
            curveTo(12.3394f, 20.7836f, 12.9159f, 21.1812f, 13.4542f, 20.9165f)
            curveTo(15.1664f, 20.0748f, 17.1456f, 17.8805f, 16.8192f, 13.7601f)
            moveTo(11.882f, 17.2812f)
            curveTo(13.6457f, 16.2255f, 15.4956f, 14.9282f, 16.8192f, 13.7601f)
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
            moveTo(17.5f, 8f)
            curveTo(17.5f, 6.89543f, 16.6046f, 6f, 15.5f, 6f)
            curveTo(14.3954f, 6f, 13.5f, 6.89543f, 13.5f, 8f)
            curveTo(13.5f, 9.10457f, 14.3954f, 10f, 15.5f, 10f)
            curveTo(16.6046f, 10f, 17.5f, 9.10457f, 17.5f, 8f)
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
            moveTo(4f, 22f)
            lineTo(8f, 18f)
            moveTo(4f, 17f)
            lineTo(5.5f, 15.5f)
        }
        }.build()

        return _rocket01!!
    }

private var _rocket01: ImageVector? = null
