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

val HugeIcons.MirrorRectangular: ImageVector
    get() {
        if (_mirrorRectangular != null) {
            return _mirrorRectangular!!
        }
        _mirrorRectangular = ImageVector.Builder(
            name = "MirrorRectangular",
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
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(4.99219f, 10f)
            curveTo(4.99219f, 7.19108f, 4.99219f, 5.78661f, 5.66631f, 4.77772f)
            curveTo(5.95814f, 4.34096f, 6.33315f, 3.96596f, 6.76991f, 3.67412f)
            curveTo(7.7788f, 3f, 9.18326f, 3f, 11.9922f, 3f)
            curveTo(14.8011f, 3f, 16.2056f, 3f, 17.2145f, 3.67412f)
            curveTo(17.6512f, 3.96596f, 18.0262f, 4.34096f, 18.3181f, 4.77772f)
            curveTo(18.9922f, 5.78661f, 18.9922f, 7.19108f, 18.9922f, 10f)
            verticalLineTo(14f)
            curveTo(18.9922f, 16.8089f, 18.9922f, 18.2134f, 18.3181f, 19.2223f)
            curveTo(18.0262f, 19.659f, 17.6512f, 20.034f, 17.2145f, 20.3259f)
            curveTo(16.2056f, 21f, 14.8011f, 21f, 11.9922f, 21f)
            curveTo(9.18326f, 21f, 7.7788f, 21f, 6.76991f, 20.3259f)
            curveTo(6.33315f, 20.034f, 5.95814f, 19.659f, 5.66631f, 19.2223f)
            curveTo(4.99219f, 18.2134f, 4.99219f, 16.8089f, 4.99219f, 14f)
            verticalLineTo(10f)
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
            moveTo(14.4922f, 6f)
            lineTo(7.99219f, 12.5f)
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
            moveTo(9.99219f, 6f)
            lineTo(7.99219f, 8f)
        }
        }.build()

        return _mirrorRectangular!!
    }

private var _mirrorRectangular: ImageVector? = null
