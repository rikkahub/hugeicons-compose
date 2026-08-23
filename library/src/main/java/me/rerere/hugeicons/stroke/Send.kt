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

val HugeIcons.Send: ImageVector
    get() {
        if (_send != null) {
            return _send!!
        }
        _send = ImageVector.Builder(
            name = "Send",
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
            moveTo(8.87038f, 6.13264f)
            lineTo(14.7327f, 4.19538f)
            curveTo(18.033f, 3.10476f, 19.6831f, 2.55945f, 20.5579f, 3.43426f)
            curveTo(21.4327f, 4.30907f, 20.8874f, 5.95922f, 19.7968f, 9.25953f)
            lineTo(17.8595f, 15.1218f)
            curveTo(16.6236f, 18.8619f, 16.0056f, 20.7319f, 14.8796f, 20.9603f)
            curveTo(14.6411f, 21.0087f, 14.3955f, 21.0129f, 14.1549f, 20.9727f)
            curveTo(13.019f, 20.7832f, 12.3132f, 18.9359f, 10.9016f, 15.2413f)
            curveTo(10.6328f, 14.5376f, 10.4983f, 14.1858f, 10.2574f, 13.9127f)
            curveTo(10.2018f, 13.8497f, 10.1424f, 13.7903f, 10.0795f, 13.7348f)
            curveTo(9.80638f, 13.4938f, 9.45455f, 13.3594f, 8.75089f, 13.0906f)
            curveTo(5.05627f, 11.679f, 3.20896f, 10.9732f, 3.01945f, 9.83727f)
            curveTo(2.97931f, 9.59669f, 2.98353f, 9.35108f, 3.03189f, 9.11259f)
            curveTo(3.26025f, 7.98657f, 5.13029f, 7.36859f, 8.87038f, 6.13264f)
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
            moveTo(12.8008f, 11.1865f)
            lineTo(15.498f, 8.48926f)
        }
        }.build()

        return _send!!
    }

private var _send: ImageVector? = null
