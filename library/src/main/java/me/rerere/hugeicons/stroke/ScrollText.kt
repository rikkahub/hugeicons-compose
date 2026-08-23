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

val HugeIcons.ScrollText: ImageVector
    get() {
        if (_scrollText != null) {
            return _scrollText!!
        }
        _scrollText = ImageVector.Builder(
            name = "ScrollText",
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
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(1.99219f, 7f)
            curveTo(1.99219f, 7.94281f, 1.99219f, 8.41421f, 2.28508f, 8.70711f)
            curveTo(2.57797f, 9f, 3.04938f, 9f, 3.99219f, 9f)
            horizontalLineTo(5.99219f)
            verticalLineTo(5f)
            curveTo(5.99219f, 3.89543f, 5.09676f, 3f, 3.99219f, 3f)
            curveTo(2.88762f, 3f, 1.99219f, 3.89543f, 1.99219f, 5f)
            verticalLineTo(7f)
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
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.99219f, 19f)
            verticalLineTo(18f)
            curveTo(9.99219f, 17.0572f, 9.99219f, 16.5858f, 10.2851f, 16.2929f)
            curveTo(10.578f, 16f, 11.0494f, 16f, 11.9922f, 16f)
            horizontalLineTo(19.9922f)
            curveTo(20.935f, 16f, 21.4064f, 16f, 21.6993f, 16.2929f)
            curveTo(21.9922f, 16.5858f, 21.9922f, 17.0572f, 21.9922f, 18f)
            verticalLineTo(19f)
            curveTo(21.9922f, 20.1046f, 21.0968f, 21f, 19.9922f, 21f)
            horizontalLineTo(7.99219f)
            curveTo(9.09676f, 21f, 9.99219f, 20.1046f, 9.99219f, 19f)
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
            moveTo(18.9922f, 16f)
            verticalLineTo(7f)
            curveTo(18.9922f, 5.11438f, 18.9922f, 4.17157f, 18.4064f, 3.58579f)
            curveTo(17.8206f, 3f, 16.8778f, 3f, 14.9922f, 3f)
            horizontalLineTo(3.99219f)
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
            moveTo(9.99219f, 8f)
            horizontalLineTo(14.9922f)
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
            moveTo(9.99219f, 11f)
            horizontalLineTo(12.9922f)
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
            moveTo(5.99219f, 9f)
            verticalLineTo(19f)
            curveTo(5.99219f, 20.1046f, 6.88762f, 21f, 7.99219f, 21f)
            curveTo(9.09676f, 21f, 9.99219f, 20.1046f, 9.99219f, 19f)
            verticalLineTo(18f)
        }
        }.build()

        return _scrollText!!
    }

private var _scrollText: ImageVector? = null
