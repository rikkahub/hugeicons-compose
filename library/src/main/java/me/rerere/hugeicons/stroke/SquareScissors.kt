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

val HugeIcons.SquareScissors: ImageVector
    get() {
        if (_squareScissors != null) {
            return _squareScissors!!
        }
        _squareScissors = ImageVector.Builder(
            name = "SquareScissors",
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
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(2.49219f, 12f)
            curveTo(2.49219f, 7.52166f, 2.49219f, 5.28249f, 3.88343f, 3.89124f)
            curveTo(5.27468f, 2.5f, 7.51385f, 2.5f, 11.9922f, 2.5f)
            curveTo(16.4705f, 2.5f, 18.7097f, 2.5f, 20.101f, 3.89124f)
            curveTo(21.4922f, 5.28249f, 21.4922f, 7.52166f, 21.4922f, 12f)
            curveTo(21.4922f, 16.4783f, 21.4922f, 18.7175f, 20.101f, 20.1088f)
            curveTo(18.7097f, 21.5f, 16.4705f, 21.5f, 11.9922f, 21.5f)
            curveTo(7.51385f, 21.5f, 5.27468f, 21.5f, 3.88343f, 20.1088f)
            curveTo(2.49219f, 18.7175f, 2.49219f, 16.4783f, 2.49219f, 12f)
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
            moveTo(9.99219f, 14f)
            lineTo(11.9922f, 12f)
            moveTo(11.9922f, 12f)
            lineTo(16.9922f, 7f)
            moveTo(11.9922f, 12f)
            lineTo(9.99219f, 10f)
            moveTo(14.4922f, 14.5f)
            lineTo(16.9922f, 17f)
            moveTo(9.99219f, 8.5f)
            curveTo(9.99219f, 9.32843f, 9.32061f, 10f, 8.49219f, 10f)
            curveTo(7.66376f, 10f, 6.99219f, 9.32843f, 6.99219f, 8.5f)
            curveTo(6.99219f, 7.67157f, 7.66376f, 7f, 8.49219f, 7f)
            curveTo(9.32061f, 7f, 9.99219f, 7.67157f, 9.99219f, 8.5f)
            close()
            moveTo(9.99219f, 15.5f)
            curveTo(9.99219f, 16.3284f, 9.32061f, 17f, 8.49219f, 17f)
            curveTo(7.66376f, 17f, 6.99219f, 16.3284f, 6.99219f, 15.5f)
            curveTo(6.99219f, 14.6716f, 7.66376f, 14f, 8.49219f, 14f)
            curveTo(9.32061f, 14f, 9.99219f, 14.6716f, 9.99219f, 15.5f)
            close()
        }
        }.build()

        return _squareScissors!!
    }

private var _squareScissors: ImageVector? = null
