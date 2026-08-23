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

val HugeIcons.Wireless: ImageVector
    get() {
        if (_wireless != null) {
            return _wireless!!
        }
        _wireless = ImageVector.Builder(
            name = "Wireless",
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
            moveTo(14.5f, 11f)
            horizontalLineTo(9.5f)
            curveTo(7.6341f, 11f, 6.70115f, 11f, 5.98141f, 11.3466f)
            curveTo(5.26703f, 11.6906f, 4.69063f, 12.267f, 4.34661f, 12.9814f)
            curveTo(4f, 13.7011f, 4f, 14.6341f, 4f, 16.5f)
            curveTo(4f, 18.3659f, 4f, 19.2989f, 4.34661f, 20.0186f)
            curveTo(4.69063f, 20.733f, 5.26703f, 21.3094f, 5.98141f, 21.6534f)
            curveTo(6.70115f, 22f, 7.6341f, 22f, 9.5f, 22f)
            horizontalLineTo(14.5f)
            curveTo(16.3659f, 22f, 17.2989f, 22f, 18.0186f, 21.6534f)
            curveTo(18.733f, 21.3094f, 19.3094f, 20.733f, 19.6534f, 20.0186f)
            curveTo(20f, 19.2989f, 20f, 18.3659f, 20f, 16.5f)
            curveTo(20f, 14.6341f, 20f, 13.7011f, 19.6534f, 12.9814f)
            curveTo(19.3094f, 12.267f, 18.733f, 11.6906f, 18.0186f, 11.3466f)
            curveTo(17.2989f, 11f, 16.3659f, 11f, 14.5f, 11f)
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
            moveTo(13f, 15f)
            horizontalLineTo(16f)
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
            moveTo(9.5f, 6.99002f)
            curveTo(10.2106f, 6.42455f, 11.0929f, 6.11744f, 12.0018f, 6.11926f)
            curveTo(12.9106f, 6.12107f, 13.7917f, 6.4317f, 14.5f, 7f)
            moveTo(7f, 3.7515f)
            curveTo(8.4189f, 2.61774f, 10.1824f, 2f, 12f, 2f)
            curveTo(13.8176f, 2f, 15.5811f, 2.61774f, 17f, 3.7515f)
        }
        }.build()

        return _wireless!!
    }

private var _wireless: ImageVector? = null
