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

val HugeIcons.MousePointerOff01: ImageVector
    get() {
        if (_mousePointerOff01 != null) {
            return _mousePointerOff01!!
        }
        _mousePointerOff01 = ImageVector.Builder(
            name = "MousePointerOff01",
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
            moveTo(1.99219f, 1.70728f)
            lineTo(21.9922f, 21.7073f)
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
            moveTo(8.99219f, 5.22485f)
            curveTo(9.53721f, 5.43054f, 10.1363f, 5.66497f, 10.7949f, 5.92269f)
            lineTo(16.8285f, 8.28365f)
            curveTo(20.3085f, 9.64539f, 22.0485f, 10.3263f, 21.9908f, 11.4063f)
            curveTo(21.9387f, 12.3814f, 20.4533f, 12.8799f, 17.4922f, 13.6965f)
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
            moveTo(14.4885f, 14.7892f)
            curveTo(14.1137f, 15.1641f, 13.9662f, 15.7048f, 13.6713f, 16.7861f)
            curveTo(12.6808f, 20.4179f, 12.1856f, 22.2338f, 11.1055f, 22.2915f)
            curveTo(10.0255f, 22.3492f, 9.34461f, 20.6092f, 7.98288f, 17.1292f)
            lineTo(5.62192f, 11.0956f)
            curveTo(4.19624f, 7.4522f, 3.48339f, 5.63049f, 4.40661f, 4.70728f)
        }
        }.build()

        return _mousePointerOff01!!
    }

private var _mousePointerOff01: ImageVector? = null
