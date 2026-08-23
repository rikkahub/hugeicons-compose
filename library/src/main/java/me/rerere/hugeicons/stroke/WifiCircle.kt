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

val HugeIcons.WifiCircle: ImageVector
    get() {
        if (_wifiCircle != null) {
            return _wifiCircle!!
        }
        _wifiCircle = ImageVector.Builder(
            name = "WifiCircle",
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
            moveTo(22f, 12f)
            curveTo(22f, 17.5228f, 17.5228f, 22f, 12f, 22f)
            curveTo(6.47715f, 22f, 2f, 17.5228f, 2f, 12f)
            curveTo(2f, 6.47715f, 6.47715f, 2f, 12f, 2f)
            curveTo(17.5228f, 2f, 22f, 6.47715f, 22f, 12f)
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
            moveTo(9.5f, 12.8647f)
            curveTo(10.2106f, 12.2981f, 11.0929f, 11.9904f, 12.0018f, 11.9922f)
            curveTo(12.9106f, 11.994f, 13.7917f, 12.3053f, 14.5f, 12.8747f)
            moveTo(12f, 16f)
            horizontalLineTo(12.01f)
            moveTo(7f, 9.755f)
            curveTo(8.4189f, 8.61897f, 10.1824f, 8f, 12f, 8f)
            curveTo(13.8176f, 8f, 15.5811f, 8.61897f, 17f, 9.755f)
        }
        }.build()

        return _wifiCircle!!
    }

private var _wifiCircle: ImageVector? = null
