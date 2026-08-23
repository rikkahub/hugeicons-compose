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

val HugeIcons.BatteryPlus: ImageVector
    get() {
        if (_batteryPlus != null) {
            return _batteryPlus!!
        }
        _batteryPlus = ImageVector.Builder(
            name = "BatteryPlus",
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
            moveTo(7f, 6.00171f)
            curveTo(4.82497f, 6.01382f, 3.64706f, 6.11027f, 2.87868f, 6.87865f)
            curveTo(2f, 7.75733f, 2f, 9.17154f, 2f, 12f)
            curveTo(2f, 14.8284f, 2f, 16.2426f, 2.87868f, 17.1213f)
            curveTo(3.64706f, 17.8897f, 4.82497f, 17.9861f, 7f, 17.9982f)
            moveTo(14f, 17.9982f)
            curveTo(16.175f, 17.9861f, 17.3529f, 17.8897f, 18.1213f, 17.1213f)
            curveTo(19f, 16.2426f, 19f, 14.8284f, 19f, 12f)
            curveTo(19f, 9.17154f, 19f, 7.75733f, 18.1213f, 6.87865f)
            curveTo(17.3529f, 6.11027f, 16.175f, 6.01382f, 14f, 6.00171f)
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
            moveTo(19f, 9.49976f)
            lineTo(20.0272f, 9.67096f)
            curveTo(20.7085f, 9.7845f, 21.0491f, 9.84128f, 21.3076f, 10.0064f)
            curveTo(21.5618f, 10.1688f, 21.7612f, 10.4042f, 21.8796f, 10.6816f)
            curveTo(22f, 10.9637f, 22f, 11.3091f, 22f, 11.9998f)
            curveTo(22f, 12.6904f, 22f, 13.0358f, 21.8796f, 13.3179f)
            curveTo(21.7612f, 13.5953f, 21.5618f, 13.8307f, 21.3076f, 13.9931f)
            curveTo(21.0491f, 14.1582f, 20.7085f, 14.215f, 20.0272f, 14.3286f)
            lineTo(19f, 14.4998f)
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
            moveTo(10.5f, 8.99976f)
            verticalLineTo(14.9998f)
            moveTo(13.505f, 11.9946f)
            lineTo(7.50497f, 11.9946f)
        }
        }.build()

        return _batteryPlus!!
    }

private var _batteryPlus: ImageVector? = null
