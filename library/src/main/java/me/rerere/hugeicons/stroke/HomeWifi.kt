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

val HugeIcons.HomeWifi: ImageVector
    get() {
        if (_homeWifi != null) {
            return _homeWifi!!
        }
        _homeWifi = ImageVector.Builder(
            name = "HomeWifi",
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
            moveTo(3f, 12.4896f)
            verticalLineTo(15f)
            curveTo(3f, 18.2998f, 3f, 19.9497f, 4.02513f, 20.9749f)
            curveTo(5.05025f, 22f, 6.70017f, 22f, 10f, 22f)
            horizontalLineTo(14f)
            curveTo(17.2998f, 22f, 18.9497f, 22f, 19.9749f, 20.9749f)
            curveTo(21f, 19.9497f, 21f, 18.2998f, 21f, 15f)
            verticalLineTo(12.4896f)
            curveTo(21f, 10.8083f, 21f, 9.96773f, 20.6441f, 9.24005f)
            curveTo(20.2882f, 8.51237f, 19.6247f, 7.99628f, 18.2976f, 6.96411f)
            lineTo(16.2976f, 5.40855f)
            curveTo(14.2331f, 3.80285f, 13.2009f, 3f, 12f, 3f)
            curveTo(10.7991f, 3f, 9.76689f, 3.80285f, 7.70242f, 5.40855f)
            lineTo(5.70241f, 6.96411f)
            curveTo(4.37533f, 7.99628f, 3.71179f, 8.51237f, 3.3559f, 9.24005f)
            curveTo(3f, 9.96773f, 3f, 10.8083f, 3f, 12.4896f)
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
            moveTo(9.5f, 14.8647f)
            curveTo(10.2106f, 14.2981f, 11.0929f, 13.9904f, 12.0018f, 13.9922f)
            curveTo(12.9106f, 13.994f, 13.7917f, 14.3053f, 14.5f, 14.8747f)
            moveTo(12f, 18f)
            horizontalLineTo(12.01f)
            moveTo(7f, 11.755f)
            curveTo(8.4189f, 10.619f, 10.1824f, 10f, 12f, 10f)
            curveTo(13.8176f, 10f, 15.5811f, 10.619f, 17f, 11.755f)
        }
        }.build()

        return _homeWifi!!
    }

private var _homeWifi: ImageVector? = null
