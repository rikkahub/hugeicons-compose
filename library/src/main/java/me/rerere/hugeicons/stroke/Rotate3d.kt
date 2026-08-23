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

val HugeIcons.Rotate3d: ImageVector
    get() {
        if (_rotate3d != null) {
            return _rotate3d!!
        }
        _rotate3d = ImageVector.Builder(
            name = "Rotate3d",
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
            moveTo(11.9922f, 17f)
            curveTo(6.46934f, 17f, 1.99219f, 14.7614f, 1.99219f, 12f)
            curveTo(1.99219f, 10.5996f, 3.14362f, 9.33368f, 4.99893f, 8.42598f)
            moveTo(19.3536f, 15.3842f)
            curveTo(20.9918f, 14.4937f, 21.9922f, 13.3053f, 21.9922f, 12f)
            curveTo(21.9922f, 9.23858f, 17.515f, 7f, 11.9922f, 7f)
            curveTo(11.4022f, 7f, 10.8241f, 7.02555f, 10.2622f, 7.07455f)
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
            moveTo(7.05084f, 13f)
            curveTo(7.01221f, 12.532f, 6.99219f, 12.0529f, 6.99219f, 11.5652f)
            curveTo(6.99219f, 6.28249f, 9.34198f, 2f, 12.2406f, 2f)
            curveTo(13.7106f, 2f, 15.0394f, 3.10137f, 15.9922f, 4.87602f)
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
            moveTo(16.876f, 10f)
            curveTo(16.9521f, 10.6849f, 16.9922f, 11.3964f, 16.9922f, 12.1264f)
            curveTo(16.9922f, 17.5794f, 14.7536f, 22f, 11.9922f, 22f)
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
            moveTo(9.99219f, 14f)
            lineTo(10.8575f, 14.6574f)
            curveTo(12.2806f, 15.7385f, 12.9922f, 16.2791f, 12.9922f, 17f)
            curveTo(12.9922f, 17.7209f, 12.2806f, 18.2615f, 10.8575f, 19.3426f)
            lineTo(9.99219f, 20f)
        }
        }.build()

        return _rotate3d!!
    }

private var _rotate3d: ImageVector? = null
