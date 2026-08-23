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

val HugeIcons.CouponPercent: ImageVector
    get() {
        if (_couponPercent != null) {
            return _couponPercent!!
        }
        _couponPercent = ImageVector.Builder(
            name = "CouponPercent",
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
            moveTo(15.0001f, 9f)
            lineTo(9.00006f, 15f)
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
            moveTo(9.37506f, 9.25f)
            horizontalLineTo(9.25006f)
            moveTo(9.50006f, 9.25f)
            curveTo(9.50006f, 9.38807f, 9.38813f, 9.5f, 9.25006f, 9.5f)
            curveTo(9.11199f, 9.5f, 9.00006f, 9.38807f, 9.00006f, 9.25f)
            curveTo(9.00006f, 9.11193f, 9.11199f, 9f, 9.25006f, 9f)
            curveTo(9.38813f, 9f, 9.50006f, 9.11193f, 9.50006f, 9.25f)
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
            moveTo(14.8751f, 14.75f)
            horizontalLineTo(14.7501f)
            moveTo(15.0001f, 14.75f)
            curveTo(15.0001f, 14.8881f, 14.8881f, 15f, 14.7501f, 15f)
            curveTo(14.612f, 15f, 14.5001f, 14.8881f, 14.5001f, 14.75f)
            curveTo(14.5001f, 14.6119f, 14.612f, 14.5f, 14.7501f, 14.5f)
            curveTo(14.8881f, 14.5f, 15.0001f, 14.6119f, 15.0001f, 14.75f)
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
            moveTo(2.00012f, 14.5f)
            curveTo(3.38083f, 14.5f, 4.50012f, 13.3807f, 4.50012f, 12f)
            curveTo(4.50012f, 10.6193f, 3.38083f, 9.5f, 2.00012f, 9.5f)
            curveTo(2.00012f, 7.15442f, 2.00012f, 5.98164f, 2.62006f, 5.17372f)
            curveTo(2.77966f, 4.96572f, 2.96584f, 4.77954f, 3.17384f, 4.61994f)
            curveTo(3.98176f, 4f, 5.15455f, 4f, 7.50012f, 4f)
            horizontalLineTo(16.5001f)
            curveTo(18.8457f, 4f, 20.0185f, 4f, 20.8264f, 4.61994f)
            curveTo(21.0344f, 4.77954f, 21.2206f, 4.96572f, 21.3802f, 5.17372f)
            curveTo(22.0001f, 5.98164f, 22.0001f, 7.15442f, 22.0001f, 9.5f)
            curveTo(20.6194f, 9.5f, 19.5001f, 10.6193f, 19.5001f, 12f)
            curveTo(19.5001f, 13.3807f, 20.6194f, 14.5f, 22.0001f, 14.5f)
            curveTo(22.0001f, 16.8456f, 22.0001f, 18.0184f, 21.3802f, 18.8263f)
            curveTo(21.2206f, 19.0343f, 21.0344f, 19.2205f, 20.8264f, 19.3801f)
            curveTo(20.0185f, 20f, 18.8457f, 20f, 16.5001f, 20f)
            horizontalLineTo(7.50012f)
            curveTo(5.15455f, 20f, 3.98176f, 20f, 3.17384f, 19.3801f)
            curveTo(2.96584f, 19.2205f, 2.77966f, 19.0343f, 2.62006f, 18.8263f)
            curveTo(2.00012f, 18.0184f, 2.00012f, 16.8456f, 2.00012f, 14.5f)
            close()
        }
        }.build()

        return _couponPercent!!
    }

private var _couponPercent: ImageVector? = null
