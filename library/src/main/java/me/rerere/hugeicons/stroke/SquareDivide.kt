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

val HugeIcons.SquareDivide: ImageVector
    get() {
        if (_squareDivide != null) {
            return _squareDivide!!
        }
        _squareDivide = ImageVector.Builder(
            name = "SquareDivide",
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
            moveTo(6.99219f, 12f)
            horizontalLineTo(16.9922f)
            moveTo(12.9922f, 8f)
            curveTo(12.9922f, 8.55228f, 12.5445f, 9f, 11.9922f, 9f)
            curveTo(11.4399f, 9f, 10.9922f, 8.55228f, 10.9922f, 8f)
            curveTo(10.9922f, 7.44772f, 11.4399f, 7f, 11.9922f, 7f)
            curveTo(12.5445f, 7f, 12.9922f, 7.44772f, 12.9922f, 8f)
            close()
            moveTo(12.9922f, 16f)
            curveTo(12.9922f, 16.5523f, 12.5445f, 17f, 11.9922f, 17f)
            curveTo(11.4399f, 17f, 10.9922f, 16.5523f, 10.9922f, 16f)
            curveTo(10.9922f, 15.4477f, 11.4399f, 15f, 11.9922f, 15f)
            curveTo(12.5445f, 15f, 12.9922f, 15.4477f, 12.9922f, 16f)
            close()
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
            moveTo(2.49219f, 12f)
            curveTo(2.49219f, 7.52166f, 2.49219f, 5.28249f, 3.88343f, 3.89124f)
            curveTo(5.27467f, 2.5f, 7.51384f, 2.5f, 11.9922f, 2.5f)
            curveTo(16.4705f, 2.5f, 18.7097f, 2.5f, 20.1009f, 3.89124f)
            curveTo(21.4922f, 5.28249f, 21.4922f, 7.52166f, 21.4922f, 12f)
            curveTo(21.4922f, 16.4783f, 21.4922f, 18.7175f, 20.1009f, 20.1088f)
            curveTo(18.7097f, 21.5f, 16.4705f, 21.5f, 11.9922f, 21.5f)
            curveTo(7.51384f, 21.5f, 5.27467f, 21.5f, 3.88343f, 20.1088f)
            curveTo(2.49219f, 18.7175f, 2.49219f, 16.4783f, 2.49219f, 12f)
            close()
        }
        }.build()

        return _squareDivide!!
    }

private var _squareDivide: ImageVector? = null
