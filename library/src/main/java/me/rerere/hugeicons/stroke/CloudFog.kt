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

val HugeIcons.CloudFog: ImageVector
    get() {
        if (_cloudFog != null) {
            return _cloudFog!!
        }
        _cloudFog = ImageVector.Builder(
            name = "CloudFog",
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
            moveTo(4f, 17.0004f)
            curveTo(2.78555f, 16.0882f, 2f, 14.6358f, 2f, 13f)
            curveTo(2f, 10.4003f, 3.98398f, 8.26407f, 6.52042f, 8.0227f)
            moveTo(9f, 8.41604f)
            curveTo(8.38754f, 8.14845f, 7.7111f, 8f, 7f, 8f)
            curveTo(6.83823f, 8f, 6.67826f, 8.00768f, 6.52042f, 8.0227f)
            moveTo(16.9003f, 11f)
            curveTo(17.2119f, 10.3904f, 17.4131f, 9.71494f, 17.4776f, 9.00005f)
            curveTo(17.4924f, 8.83536f, 17.5f, 8.66856f, 17.5f, 8.5f)
            curveTo(17.5f, 5.46243f, 15.0376f, 3f, 12f, 3f)
            curveTo(9.12324f, 3f, 6.76233f, 5.20862f, 6.52042f, 8.0227f)
            moveTo(17.4776f, 9.00005f)
            curveTo(17.485f, 9.00002f, 17.4925f, 9f, 17.5f, 9f)
            curveTo(19.9853f, 9f, 22f, 11.0147f, 22f, 13.5f)
            curveTo(22f, 14.9136f, 21.3482f, 16.175f, 20.3287f, 17f)
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
            moveTo(17f, 17f)
            horizontalLineTo(11f)
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
            moveTo(11f, 21f)
            horizontalLineTo(5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(8f, 17f)
            horizontalLineTo(7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(15f, 21f)
            horizontalLineTo(14f)
        }
        }.build()

        return _cloudFog!!
    }

private var _cloudFog: ImageVector? = null
