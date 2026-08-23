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

val HugeIcons.CloudLightning: ImageVector
    get() {
        if (_cloudLightning != null) {
            return _cloudLightning!!
        }
        _cloudLightning = ImageVector.Builder(
            name = "CloudLightning",
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
            moveTo(7f, 18f)
            curveTo(4.23858f, 18f, 2f, 15.7614f, 2f, 13f)
            curveTo(2f, 10.4003f, 3.98398f, 8.26407f, 6.52042f, 8.0227f)
            moveTo(17.5f, 18f)
            curveTo(19.9853f, 18f, 22f, 15.9853f, 22f, 13.5f)
            curveTo(22f, 11.0147f, 19.9853f, 9f, 17.5f, 9f)
            curveTo(17.4925f, 9f, 17.485f, 9.00002f, 17.4776f, 9.00005f)
            moveTo(16.9003f, 11f)
            curveTo(17.2119f, 10.3904f, 17.4131f, 9.71494f, 17.4776f, 9.00005f)
            curveTo(17.4924f, 8.83536f, 17.5f, 8.66856f, 17.5f, 8.5f)
            curveTo(17.5f, 5.46243f, 15.0376f, 3f, 12f, 3f)
            curveTo(9.12324f, 3f, 6.76233f, 5.20862f, 6.52042f, 8.0227f)
            moveTo(6.52042f, 8.0227f)
            curveTo(6.67826f, 8.00768f, 6.83823f, 8f, 7f, 8f)
            curveTo(7.7111f, 8f, 8.38754f, 8.14845f, 9f, 8.41604f)
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
            moveTo(12.9994f, 13f)
            lineTo(11.1994f, 15.4f)
            curveTo(10.6758f, 16.0981f, 10.414f, 16.4472f, 10.5522f, 16.7236f)
            curveTo(10.6904f, 17f, 11.1267f, 17f, 11.9994f, 17f)
            curveTo(12.8721f, 17f, 13.3084f, 17f, 13.4466f, 17.2764f)
            curveTo(13.5848f, 17.5528f, 13.323f, 17.9019f, 12.7994f, 18.6f)
            lineTo(10.9994f, 21f)
        }
        }.build()

        return _cloudLightning!!
    }

private var _cloudLightning: ImageVector? = null
