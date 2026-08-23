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

val HugeIcons.SecurityWifi: ImageVector
    get() {
        if (_securityWifi != null) {
            return _securityWifi!!
        }
        _securityWifi = ImageVector.Builder(
            name = "SecurityWifi",
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
            moveTo(18.7088f, 3.49534f)
            curveTo(16.8165f, 2.55382f, 14.5009f, 2f, 12f, 2f)
            curveTo(9.4991f, 2f, 7.1835f, 2.55382f, 5.29116f, 3.49534f)
            curveTo(4.36318f, 3.95706f, 3.89919f, 4.18792f, 3.4496f, 4.91378f)
            curveTo(3f, 5.63965f, 3f, 6.34248f, 3f, 7.74814f)
            verticalLineTo(11.2371f)
            curveTo(3f, 16.9205f, 7.54236f, 20.0804f, 10.173f, 21.4338f)
            curveTo(10.9067f, 21.8113f, 11.2735f, 22f, 12f, 22f)
            curveTo(12.7265f, 22f, 13.0933f, 21.8113f, 13.8269f, 21.4338f)
            curveTo(16.4576f, 20.0804f, 21f, 16.9205f, 21f, 11.2371f)
            lineTo(21f, 7.74814f)
            curveTo(21f, 6.34249f, 21f, 5.63966f, 20.5504f, 4.91378f)
            curveTo(20.1008f, 4.18791f, 19.6368f, 3.95706f, 18.7088f, 3.49534f)
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
            moveTo(9.5f, 12.3647f)
            curveTo(10.2106f, 11.7981f, 11.0929f, 11.4904f, 12.0018f, 11.4922f)
            curveTo(12.9106f, 11.494f, 13.7917f, 11.8053f, 14.5f, 12.3747f)
            moveTo(12f, 15.5f)
            horizontalLineTo(12.01f)
            moveTo(7f, 9.255f)
            curveTo(8.4189f, 8.11897f, 10.1824f, 7.5f, 12f, 7.5f)
            curveTo(13.8176f, 7.5f, 15.5811f, 8.11897f, 17f, 9.255f)
        }
        }.build()

        return _securityWifi!!
    }

private var _securityWifi: ImageVector? = null
