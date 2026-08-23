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

val HugeIcons.FingerPrintScan: ImageVector
    get() {
        if (_fingerPrintScan != null) {
            return _fingerPrintScan!!
        }
        _fingerPrintScan = ImageVector.Builder(
            name = "FingerPrintScan",
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
            moveTo(2f, 7.98608f)
            curveTo(2.10954f, 5.77584f, 2.43723f, 4.39781f, 3.41752f, 3.41752f)
            curveTo(4.39781f, 2.43723f, 5.77584f, 2.10954f, 7.98607f, 2f)
            moveTo(22f, 7.98608f)
            curveTo(21.8905f, 5.77584f, 21.5628f, 4.39781f, 20.5825f, 3.41752f)
            curveTo(19.6022f, 2.43723f, 18.2242f, 2.10954f, 16.0139f, 2f)
            moveTo(16.0139f, 22f)
            curveTo(18.2242f, 21.8905f, 19.6022f, 21.5628f, 20.5825f, 20.5825f)
            curveTo(21.5628f, 19.6022f, 21.8905f, 18.2242f, 22f, 16.0139f)
            moveTo(7.98607f, 22f)
            curveTo(5.77584f, 21.8905f, 4.39781f, 21.5628f, 3.41752f, 20.5825f)
            curveTo(2.43723f, 19.6022f, 2.10954f, 18.2242f, 2f, 16.0139f)
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
            moveTo(16.5146f, 8.9424f)
            curveTo(16.8317f, 9.51789f, 17f, 10.1516f, 17f, 10.7991f)
            verticalLineTo(13.6806f)
            curveTo(17f, 14.8151f, 16.4641f, 15.9327f, 15.5355f, 16.7349f)
            curveTo(14.6069f, 17.5371f, 13.3132f, 18f, 12f, 18f)
            moveTo(7f, 11.2783f)
            verticalLineTo(13.6809f)
            curveTo(6.9995f, 14.9393f, 7.65372f, 16.1769f, 8.801f, 17.002f)
            moveTo(14.5f, 6.57868f)
            curveTo(13.3516f, 6.00592f, 11.9869f, 5.8507f, 10.706f, 6.14718f)
            curveTo(9.42517f, 6.44365f, 8.33309f, 7.16753f, 7.67003f, 8.15958f)
            moveTo(13.6665f, 11.4782f)
            verticalLineTo(10.5912f)
            curveTo(13.6765f, 9.95465f, 13.1333f, 9.38163f, 12.3951f, 9.23077f)
            moveTo(10.3335f, 11.8567f)
            verticalLineTo(13.3805f)
            curveTo(10.3281f, 13.6611f, 10.4265f, 13.9363f, 10.6156f, 14.1694f)
            curveTo(11.2056f, 14.897f, 12.5258f, 14.9802f, 13.24f, 14.3226f)
        }
        }.build()

        return _fingerPrintScan!!
    }

private var _fingerPrintScan: ImageVector? = null
