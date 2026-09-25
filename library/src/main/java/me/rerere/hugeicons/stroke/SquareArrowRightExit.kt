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

val HugeIcons.SquareArrowRightExit: ImageVector
    get() {
        if (_squareArrowRightExit != null) {
            return _squareArrowRightExit!!
        }
        _squareArrowRightExit = ImageVector.Builder(
            name = "SquareArrowRightExit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
            autoMirror = true
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
            moveTo(19.9921f, 7.00183f)
            curveTo(19.9152f, 5.58456f, 19.7046f, 4.66623f, 19.1285f, 3.96426f)
            curveTo(18.9623f, 3.76172f, 18.7766f, 3.57601f, 18.574f, 3.40979f)
            curveTo(17.4677f, 2.50183f, 15.8239f, 2.50183f, 12.5365f, 2.50183f)
            lineTo(11.9921f, 2.50199f)
            curveTo(8.22089f, 2.50199f, 6.33527f, 2.50199f, 5.1637f, 3.67356f)
            curveTo(3.99213f, 4.84514f, 3.99213f, 6.73076f, 3.99213f, 10.502f)
            verticalLineTo(13.502f)
            curveTo(3.99213f, 17.2732f, 3.99213f, 19.1588f, 5.1637f, 20.3304f)
            curveTo(6.33527f, 21.502f, 8.22089f, 21.502f, 11.9921f, 21.502f)
            lineTo(12.5365f, 21.5018f)
            curveTo(15.8239f, 21.5018f, 17.4677f, 21.5018f, 18.574f, 20.5939f)
            curveTo(18.7766f, 20.4277f, 18.9623f, 20.2419f, 19.1285f, 20.0394f)
            curveTo(19.7046f, 19.3374f, 19.9152f, 18.4191f, 19.9921f, 17.0018f)
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
            moveTo(15.9922f, 8.00195f)
            curveTo(15.9922f, 8.00195f, 19.9922f, 10.9479f, 19.9922f, 12.002f)
            curveTo(19.9922f, 13.0561f, 15.9922f, 16.002f, 15.9922f, 16.002f)
            moveTo(19.4922f, 12.002f)
            horizontalLineTo(8.99219f)
        }
        }.build()

        return _squareArrowRightExit!!
    }

private var _squareArrowRightExit: ImageVector? = null
