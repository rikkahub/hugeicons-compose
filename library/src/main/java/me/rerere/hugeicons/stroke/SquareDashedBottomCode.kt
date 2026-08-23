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

val HugeIcons.SquareDashedBottomCode: ImageVector
    get() {
        if (_squareDashedBottomCode != null) {
            return _squareDashedBottomCode!!
        }
        _squareDashedBottomCode = ImageVector.Builder(
            name = "SquareDashedBottomCode",
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
            moveTo(13.9922f, 21.5f)
            curveTo(14.5316f, 21.4948f, 15.0303f, 21.4851f, 15.4922f, 21.4669f)
            moveTo(9.99228f, 21.5f)
            curveTo(9.4528f, 21.4948f, 8.9541f, 21.4851f, 8.49219f, 21.4669f)
            moveTo(18.9922f, 20.8693f)
            curveTo(19.4177f, 20.6797f, 19.7816f, 20.4336f, 20.1009f, 20.1142f)
            curveTo(21.4922f, 18.7225f, 21.4922f, 16.4827f, 21.4922f, 12.0029f)
            curveTo(21.4922f, 7.52321f, 21.4922f, 5.28334f, 20.1009f, 3.89167f)
            curveTo(18.7097f, 2.5f, 16.4705f, 2.5f, 11.9922f, 2.5f)
            curveTo(7.51384f, 2.5f, 5.27467f, 2.5f, 3.88343f, 3.89167f)
            curveTo(2.49219f, 5.28334f, 2.49219f, 7.52321f, 2.49219f, 12.0029f)
            curveTo(2.49219f, 16.4827f, 2.49219f, 18.7225f, 3.88343f, 20.1142f)
            curveTo(4.20274f, 20.4336f, 4.56672f, 20.6797f, 4.99219f, 20.8693f)
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
            moveTo(9.49217f, 9.5f)
            curveTo(9.49217f, 9.5f, 6.99219f, 11.3412f, 6.99219f, 12f)
            curveTo(6.99218f, 12.6588f, 9.49219f, 14.5f, 9.49219f, 14.5f)
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
            moveTo(14.4922f, 14.5f)
            curveTo(14.4922f, 14.5f, 16.9922f, 12.6588f, 16.9922f, 12f)
            curveTo(16.9922f, 11.3412f, 14.4922f, 9.5f, 14.4922f, 9.5f)
        }
        }.build()

        return _squareDashedBottomCode!!
    }

private var _squareDashedBottomCode: ImageVector? = null
