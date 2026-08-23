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

val HugeIcons.SquareX: ImageVector
    get() {
        if (_squareX != null) {
            return _squareX!!
        }
        _squareX = ImageVector.Builder(
            name = "SquareX",
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
            moveTo(11.9922f, 21.5f)
            horizontalLineTo(11.9922f)
            horizontalLineTo(11.9922f)
            curveTo(16.4705f, 21.5f, 18.7097f, 21.5f, 20.1009f, 20.1088f)
            curveTo(21.4922f, 18.7175f, 21.4922f, 16.4783f, 21.4922f, 12f)
            verticalLineTo(12f)
            verticalLineTo(12f)
            curveTo(21.4922f, 7.52165f, 21.4922f, 5.28248f, 20.1009f, 3.89124f)
            curveTo(18.7097f, 2.5f, 16.4705f, 2.5f, 11.9922f, 2.5f)
            curveTo(7.51384f, 2.5f, 5.27467f, 2.5f, 3.88343f, 3.89124f)
            curveTo(2.49219f, 5.28249f, 2.49219f, 7.52166f, 2.49219f, 12f)
            curveTo(2.49219f, 16.4783f, 2.49219f, 18.7175f, 3.88343f, 20.1088f)
            curveTo(5.27467f, 21.5f, 7.51384f, 21.5f, 11.9922f, 21.5f)
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
            moveTo(14.9922f, 9f)
            lineTo(8.99219f, 14.9996f)
            moveTo(14.9922f, 15f)
            lineTo(8.99219f, 9.00039f)
        }
        }.build()

        return _squareX!!
    }

private var _squareX: ImageVector? = null
