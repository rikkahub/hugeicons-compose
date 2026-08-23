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

val HugeIcons.MountainSnow: ImageVector
    get() {
        if (_mountainSnow != null) {
            return _mountainSnow!!
        }
        _mountainSnow = ImageVector.Builder(
            name = "MountainSnow",
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
            moveTo(6.29688f, 10.0518f)
            lineTo(7.7903f, 11.5439f)
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
            moveTo(10.5078f, 13.0361f)
            lineTo(11.8028f, 14.6536f)
            curveTo(11.9637f, 14.8545f, 12.0442f, 14.955f, 12.131f, 15.0161f)
            curveTo(12.3643f, 15.1803f, 12.6709f, 15.1973f, 12.9209f, 15.0598f)
            curveTo(13.0139f, 15.0087f, 13.105f, 14.9177f, 13.2871f, 14.7357f)
            curveTo(13.4521f, 14.5709f, 13.5345f, 14.4885f, 13.6204f, 14.4392f)
            curveTo(13.8508f, 14.3069f, 14.1342f, 14.3069f, 14.3645f, 14.4392f)
            curveTo(14.4504f, 14.4885f, 14.5329f, 14.5709f, 14.6978f, 14.7357f)
            curveTo(14.88f, 14.9177f, 14.971f, 15.0087f, 15.064f, 15.0598f)
            curveTo(15.3141f, 15.1973f, 15.6207f, 15.1803f, 15.854f, 15.0161f)
            curveTo(15.9408f, 14.955f, 16.0212f, 14.8545f, 16.1821f, 14.6536f)
            lineTo(17.4771f, 13.0361f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(15.9922f, 20f)
            horizontalLineTo(1.99219f)
            lineTo(5.21675f, 10.7557f)
            curveTo(6.78773f, 6.25189f, 7.57323f, 4f, 8.99219f, 4f)
            curveTo(10.3294f, 4f, 11.1041f, 6f, 12.5038f, 10f)
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
            moveTo(5.99219f, 20f)
            horizontalLineTo(21.9922f)
            lineTo(17.3988f, 12.6585f)
            curveTo(15.8728f, 10.2195f, 15.1098f, 9f, 13.9922f, 9f)
            curveTo(12.8746f, 9f, 12.1116f, 10.2195f, 10.5856f, 12.6585f)
            lineTo(9.12056f, 15f)
        }
        }.build()

        return _mountainSnow!!
    }

private var _mountainSnow: ImageVector? = null
