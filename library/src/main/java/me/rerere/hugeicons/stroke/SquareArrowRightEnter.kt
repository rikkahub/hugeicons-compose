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

val HugeIcons.SquareArrowRightEnter: ImageVector
    get() {
        if (_squareArrowRightEnter != null) {
            return _squareArrowRightEnter!!
        }
        _squareArrowRightEnter = ImageVector.Builder(
            name = "SquareArrowRightEnter",
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
            moveTo(3.99213f, 7.00183f)
            curveTo(4.06909f, 5.58456f, 4.27965f, 4.66623f, 4.85575f, 3.96426f)
            curveTo(5.02197f, 3.76172f, 5.20768f, 3.57601f, 5.41022f, 3.40979f)
            curveTo(6.51657f, 2.50183f, 8.16031f, 2.50183f, 11.4478f, 2.50183f)
            lineTo(11.9921f, 2.50199f)
            curveTo(15.7634f, 2.50199f, 17.649f, 2.50199f, 18.8206f, 3.67356f)
            curveTo(19.9921f, 4.84514f, 19.9921f, 6.73076f, 19.9921f, 10.502f)
            verticalLineTo(13.502f)
            curveTo(19.9921f, 17.2732f, 19.9921f, 19.1588f, 18.8206f, 20.3304f)
            curveTo(17.649f, 21.502f, 15.7634f, 21.502f, 11.9921f, 21.502f)
            lineTo(11.4478f, 21.5018f)
            curveTo(8.16031f, 21.5018f, 6.51657f, 21.5018f, 5.41022f, 20.5939f)
            curveTo(5.20768f, 20.4277f, 5.02197f, 20.2419f, 4.85575f, 20.0394f)
            curveTo(4.27965f, 19.3374f, 4.06909f, 18.4191f, 3.99213f, 17.0018f)
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
            moveTo(10.9922f, 8.00195f)
            curveTo(10.9922f, 8.00195f, 14.9922f, 10.9479f, 14.9922f, 12.002f)
            curveTo(14.9922f, 13.0561f, 10.9922f, 16.002f, 10.9922f, 16.002f)
            moveTo(14.4922f, 12.002f)
            horizontalLineTo(3.99219f)
        }
        }.build()

        return _squareArrowRightEnter!!
    }

private var _squareArrowRightEnter: ImageVector? = null
