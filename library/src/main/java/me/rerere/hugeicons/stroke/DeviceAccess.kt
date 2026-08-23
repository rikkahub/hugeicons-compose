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

val HugeIcons.DeviceAccess: ImageVector
    get() {
        if (_deviceAccess != null) {
            return _deviceAccess!!
        }
        _deviceAccess = ImageVector.Builder(
            name = "DeviceAccess",
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
            moveTo(16.8606f, 5f)
            curveTo(16.7255f, 4.13105f, 16.4698f, 3.5086f, 15.9859f, 3.02513f)
            curveTo(14.9599f, 2f, 13.3086f, 2f, 10.006f, 2f)
            curveTo(6.70332f, 2f, 5.052f, 2f, 4.026f, 3.02513f)
            curveTo(3f, 4.05025f, 3f, 5.70017f, 3f, 9f)
            verticalLineTo(15f)
            curveTo(3f, 18.2998f, 3f, 19.9497f, 4.026f, 20.9749f)
            curveTo(5.052f, 22f, 6.70332f, 22f, 10.006f, 22f)
            curveTo(13.3086f, 22f, 14.9599f, 22f, 15.9859f, 20.9749f)
            curveTo(16.7796f, 20.1819f, 16.9593f, 19.0151f, 17f, 17f)
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
            moveTo(18f, 14f)
            curveTo(19.6569f, 14f, 21f, 12.6569f, 21f, 11f)
            curveTo(21f, 9.34315f, 19.6569f, 8f, 18f, 8f)
            curveTo(16.8896f, 8f, 15.9201f, 8.6033f, 15.4013f, 9.5f)
            horizontalLineTo(8f)
            lineTo(7f, 11f)
            lineTo(9f, 13.5f)
            lineTo(10.5f, 12.5f)
            lineTo(12f, 13.5f)
            lineTo(13.5f, 12.5f)
            horizontalLineTo(15.4013f)
            curveTo(15.9201f, 13.3967f, 16.8896f, 14f, 18f, 14f)
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
            moveTo(10.125f, 19f)
            horizontalLineTo(10f)
            moveTo(10.25f, 19f)
            curveTo(10.25f, 19.1381f, 10.1381f, 19.25f, 10f, 19.25f)
            curveTo(9.86193f, 19.25f, 9.75f, 19.1381f, 9.75f, 19f)
            curveTo(9.75f, 18.8619f, 9.86193f, 18.75f, 10f, 18.75f)
            curveTo(10.1381f, 18.75f, 10.25f, 18.8619f, 10.25f, 19f)
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
            moveTo(18.125f, 11f)
            horizontalLineTo(18f)
            moveTo(18.25f, 11f)
            curveTo(18.25f, 11.1381f, 18.1381f, 11.25f, 18f, 11.25f)
            curveTo(17.8619f, 11.25f, 17.75f, 11.1381f, 17.75f, 11f)
            curveTo(17.75f, 10.8619f, 17.8619f, 10.75f, 18f, 10.75f)
            curveTo(18.1381f, 10.75f, 18.25f, 10.8619f, 18.25f, 11f)
            close()
        }
        }.build()

        return _deviceAccess!!
    }

private var _deviceAccess: ImageVector? = null
