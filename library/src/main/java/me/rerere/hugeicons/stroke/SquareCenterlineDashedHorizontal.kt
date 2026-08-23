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

val HugeIcons.SquareCenterlineDashedHorizontal: ImageVector
    get() {
        if (_squareCenterlineDashedHorizontal != null) {
            return _squareCenterlineDashedHorizontal!!
        }
        _squareCenterlineDashedHorizontal = ImageVector.Builder(
            name = "SquareCenterlineDashedHorizontal",
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
            moveTo(11.9922f, 21.002f)
            verticalLineTo(20.002f)
            moveTo(11.9922f, 17.002f)
            verticalLineTo(16.002f)
            moveTo(11.9922f, 12.502f)
            verticalLineTo(11.502f)
            moveTo(11.9922f, 8.00195f)
            verticalLineTo(7.00195f)
            moveTo(11.9922f, 3.00195f)
            verticalLineTo(4.00195f)
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
            moveTo(7.99219f, 20.0014f)
            curveTo(6.69208f, 19.8719f, 5.81694f, 19.5792f, 5.16376f, 18.9176f)
            curveTo(3.99219f, 17.731f, 3.99219f, 15.8213f, 3.99219f, 12.0017f)
            curveTo(3.99219f, 8.18212f, 3.99219f, 6.27233f, 5.16376f, 5.08575f)
            curveTo(5.81694f, 4.42419f, 6.69207f, 4.13147f, 7.99219f, 4.00195f)
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
            moveTo(15.9922f, 20.0018f)
            curveTo(17.2923f, 19.8722f, 18.1674f, 19.5795f, 18.8206f, 18.918f)
            curveTo(19.9922f, 17.7314f, 19.9922f, 15.8216f, 19.9922f, 12.002f)
            curveTo(19.9922f, 8.18246f, 19.9922f, 6.27267f, 18.8206f, 5.08608f)
            curveTo(18.192f, 4.44937f, 17.3577f, 4.15431f, 16.1368f, 4.01758f)
        }
        }.build()

        return _squareCenterlineDashedHorizontal!!
    }

private var _squareCenterlineDashedHorizontal: ImageVector? = null
