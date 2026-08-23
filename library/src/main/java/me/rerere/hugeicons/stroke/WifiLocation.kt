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

val HugeIcons.WifiLocation: ImageVector
    get() {
        if (_wifiLocation != null) {
            return _wifiLocation!!
        }
        _wifiLocation = ImageVector.Builder(
            name = "WifiLocation",
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
            moveTo(21f, 11.0891f)
            curveTo(21f, 16.8654f, 14.9912f, 20.619f, 12.7931f, 21.7988f)
            curveTo(12.2934f, 22.0671f, 11.7066f, 22.0671f, 11.2069f, 21.7988f)
            curveTo(9.00877f, 20.619f, 3f, 16.8654f, 3f, 11.0891f)
            curveTo(3f, 6.06935f, 7.02944f, 2f, 12f, 2f)
            curveTo(16.9706f, 2f, 21f, 6.06935f, 21f, 11.0891f)
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

        return _wifiLocation!!
    }

private var _wifiLocation: ImageVector? = null
