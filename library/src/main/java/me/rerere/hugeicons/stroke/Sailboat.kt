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

val HugeIcons.Sailboat: ImageVector
    get() {
        if (_sailboat != null) {
            return _sailboat!!
        }
        _sailboat = ImageVector.Builder(
            name = "Sailboat",
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
            moveTo(19.0399f, 17.5f)
            lineTo(5.34775f, 17.5f)
            curveTo(5.0326f, 17.5f, 4.87502f, 17.5f, 4.74573f, 17.5341f)
            curveTo(4.39488f, 17.6265f, 4.12084f, 17.8961f, 4.02683f, 18.2412f)
            curveTo(3.99219f, 18.3683f, 3.99219f, 18.5233f, 3.99219f, 18.8333f)
            curveTo(3.99219f, 19.4533f, 3.99219f, 19.7633f, 4.06147f, 20.0176f)
            curveTo(4.24949f, 20.7078f, 4.79758f, 21.2469f, 5.49927f, 21.4319f)
            curveTo(5.75784f, 21.5f, 6.07301f, 21.5f, 6.70332f, 21.5f)
            lineTo(16.2696f, 21.5f)
            curveTo(18.0167f, 21.5f, 19.5396f, 20.3305f, 19.9633f, 18.6633f)
            curveTo(20.1135f, 18.0724f, 19.6591f, 17.5f, 19.0399f, 17.5f)
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
            moveTo(13.0193f, 14.5f)
            lineTo(9.10925f, 14.5f)
            curveTo(6.8356f, 14.5f, 5.69878f, 14.5f, 5.2013f, 13.7364f)
            curveTo(4.70383f, 12.9728f, 5.14107f, 11.899f, 6.01555f, 9.75131f)
            lineTo(7.41201f, 6.32171f)
            curveTo(8.4133f, 3.86261f, 8.91394f, 2.63306f, 9.87891f, 2.50963f)
            curveTo(10.8439f, 2.38619f, 11.6249f, 3.4518f, 13.1869f, 5.58303f)
            lineTo(15.7005f, 9.01262f)
            curveTo(17.4554f, 11.407f, 18.3328f, 12.6041f, 17.8697f, 13.5521f)
            curveTo(17.4065f, 14.5f, 15.9441f, 14.5f, 13.0193f, 14.5f)
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
            moveTo(9.99219f, 17.5f)
            lineTo(9.99219f, 3f)
        }
        }.build()

        return _sailboat!!
    }

private var _sailboat: ImageVector? = null
