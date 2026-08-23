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

val HugeIcons.Sprout: ImageVector
    get() {
        if (_sprout != null) {
            return _sprout!!
        }
        _sprout = ImageVector.Builder(
            name = "Sprout",
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
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(19.9922f, 21f)
            curveTo(18.1679f, 18.5711f, 15.2635f, 17f, 11.9922f, 17f)
            curveTo(8.72085f, 17f, 5.81643f, 18.5711f, 3.99219f, 21f)
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
            moveTo(16.4922f, 7.5f)
            lineTo(15.5277f, 8.46447f)
            curveTo(14.9315f, 9.06067f, 14.6334f, 9.35877f, 14.37f, 9.6689f)
            curveTo(13.0154f, 11.264f, 12.1953f, 13.2439f, 12.0252f, 15.3297f)
            curveTo(11.9922f, 15.7353f, 11.9922f, 16.1568f, 11.9922f, 17f)
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
            moveTo(18.9922f, 9.44563f)
            curveTo(19.1547f, 9.33473f, 19.3092f, 9.20719f, 19.4534f, 9.06301f)
            curveTo(21.3384f, 7.17794f, 20.9614f, 3.03078f, 20.9614f, 3.03078f)
            curveTo(20.9614f, 3.03078f, 16.8142f, 2.65376f, 14.9292f, 4.53884f)
            curveTo(13.6799f, 5.78815f, 13.6799f, 7.81369f, 14.9292f, 9.06301f)
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
            moveTo(7.49219f, 7.5f)
            lineTo(8.45666f, 8.46447f)
            curveTo(9.05286f, 9.06067f, 9.35096f, 9.35877f, 9.61434f, 9.6689f)
            curveTo(10.969f, 11.264f, 11.7891f, 13.2439f, 11.9591f, 15.3297f)
            curveTo(11.9922f, 15.7353f, 11.9922f, 16.1568f, 11.9922f, 17f)
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
            moveTo(9.0552f, 9.06301f)
            curveTo(7.80588f, 10.3123f, 5.78034f, 10.3123f, 4.53102f, 9.06301f)
            curveTo(2.64595f, 7.17794f, 3.02296f, 3.03078f, 3.02296f, 3.03078f)
            curveTo(3.02296f, 3.03078f, 7.17013f, 2.65376f, 9.0552f, 4.53884f)
            curveTo(9.19938f, 4.68301f, 9.32692f, 4.83753f, 9.43782f, 5f)
        }
        }.build()

        return _sprout!!
    }

private var _sprout: ImageVector? = null
