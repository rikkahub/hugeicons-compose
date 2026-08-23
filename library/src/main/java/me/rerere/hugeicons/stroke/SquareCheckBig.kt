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

val HugeIcons.SquareCheckBig: ImageVector
    get() {
        if (_squareCheckBig != null) {
            return _squareCheckBig!!
        }
        _squareCheckBig = ImageVector.Builder(
            name = "SquareCheckBig",
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
            moveTo(14.9922f, 2.5f)
            horizontalLineTo(11.9922f)
            curveTo(7.51384f, 2.5f, 5.27467f, 2.5f, 3.88343f, 3.89124f)
            curveTo(2.49219f, 5.28249f, 2.49219f, 7.52166f, 2.49219f, 12f)
            curveTo(2.49219f, 16.4783f, 2.49219f, 18.7175f, 3.88343f, 20.1088f)
            curveTo(5.27467f, 21.5f, 7.51384f, 21.5f, 11.9922f, 21.5f)
            curveTo(16.4705f, 21.5f, 18.7097f, 21.5f, 20.1009f, 20.1088f)
            curveTo(21.4922f, 18.7175f, 21.4922f, 16.4783f, 21.4922f, 12f)
            verticalLineTo(10f)
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
            moveTo(8.49219f, 10f)
            lineTo(11.9922f, 13.5f)
            lineTo(20.9924f, 3.5f)
        }
        }.build()

        return _squareCheckBig!!
    }

private var _squareCheckBig: ImageVector? = null
