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

val HugeIcons.SquareSplitHorizontal: ImageVector
    get() {
        if (_squareSplitHorizontal != null) {
            return _squareSplitHorizontal!!
        }
        _squareSplitHorizontal = ImageVector.Builder(
            name = "SquareSplitHorizontal",
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
            moveTo(11.9922f, 21f)
            lineTo(11.9922f, 20f)
            lineTo(11.9922f, 4f)
            lineTo(11.9922f, 3f)
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
            moveTo(7.99219f, 19.9995f)
            curveTo(6.69208f, 19.8699f, 5.81694f, 19.5772f, 5.16376f, 18.9157f)
            curveTo(3.99219f, 17.7291f, 3.99219f, 15.8193f, 3.99219f, 11.9997f)
            curveTo(3.99219f, 8.18016f, 3.99219f, 6.27038f, 5.16376f, 5.08379f)
            curveTo(5.81694f, 4.42224f, 6.69207f, 4.12952f, 7.99219f, 4f)
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
            moveTo(15.9922f, 19.9998f)
            curveTo(17.2923f, 19.8703f, 18.1674f, 19.5776f, 18.8206f, 18.916f)
            curveTo(19.9922f, 17.7294f, 19.9922f, 15.8196f, 19.9922f, 12.0001f)
            curveTo(19.9922f, 8.1805f, 19.9922f, 6.27072f, 18.8206f, 5.08413f)
            curveTo(18.192f, 4.44741f, 17.3577f, 4.15236f, 16.1368f, 4.01562f)
        }
        }.build()

        return _squareSplitHorizontal!!
    }

private var _squareSplitHorizontal: ImageVector? = null
