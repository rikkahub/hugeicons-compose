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

val HugeIcons.CloudCog: ImageVector
    get() {
        if (_cloudCog != null) {
            return _cloudCog!!
        }
        _cloudCog = ImageVector.Builder(
            name = "CloudCog",
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
            moveTo(17.4776f, 9.00005f)
            curveTo(17.485f, 9.00002f, 17.4925f, 9f, 17.5f, 9f)
            curveTo(19.9853f, 9f, 22f, 11.0147f, 22f, 13.5f)
            curveTo(22f, 15.4593f, 20.7478f, 17.1262f, 19f, 17.7439f)
            moveTo(16.9003f, 11f)
            curveTo(17.2119f, 10.3904f, 17.4131f, 9.71494f, 17.4776f, 9.00005f)
            curveTo(17.4924f, 8.83536f, 17.5f, 8.66856f, 17.5f, 8.5f)
            curveTo(17.5f, 5.46243f, 15.0376f, 3f, 12f, 3f)
            curveTo(9.12324f, 3f, 6.76233f, 5.20862f, 6.52042f, 8.0227f)
            moveTo(6.52042f, 8.0227f)
            curveTo(3.98398f, 8.26407f, 2f, 10.4003f, 2f, 13f)
            curveTo(2f, 15.0503f, 3.2341f, 16.8124f, 5f, 17.584f)
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
            moveTo(12.028f, 19f)
            curveTo(13.1326f, 19f, 14.028f, 18.1046f, 14.028f, 17f)
            curveTo(14.028f, 15.8954f, 13.1326f, 15f, 12.028f, 15f)
            moveTo(12.028f, 19f)
            curveTo(10.9234f, 19f, 10.028f, 18.1046f, 10.028f, 17f)
            curveTo(10.028f, 15.8954f, 10.9234f, 15f, 12.028f, 15f)
            moveTo(12.028f, 19f)
            verticalLineTo(21f)
            moveTo(12.028f, 15f)
            verticalLineTo(13f)
            moveTo(13.7626f, 15.9956f)
            lineTo(15.4946f, 14.9956f)
            moveTo(10.2985f, 17.9956f)
            lineTo(8.56643f, 18.9956f)
            moveTo(13.7676f, 17.9956f)
            lineTo(15.4996f, 18.9956f)
            moveTo(10.3035f, 15.9956f)
            lineTo(8.57143f, 14.9956f)
        }
        }.build()

        return _cloudCog!!
    }

private var _cloudCog: ImageVector? = null
