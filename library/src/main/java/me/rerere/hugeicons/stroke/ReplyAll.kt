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

val HugeIcons.ReplyAll: ImageVector
    get() {
        if (_replyAll != null) {
            return _replyAll!!
        }
        _replyAll = ImageVector.Builder(
            name = "ReplyAll",
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
            moveTo(7.99219f, 10f)
            horizontalLineTo(12.9922f)
            curveTo(16.7634f, 10f, 18.649f, 10f, 19.8206f, 11.1716f)
            curveTo(20.9922f, 12.3431f, 20.9922f, 14.2288f, 20.9922f, 18f)
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
            moveTo(6.99219f, 6f)
            lineTo(5.83839f, 6.87652f)
            curveTo(3.94092f, 8.31801f, 2.99219f, 9.03875f, 2.99219f, 10f)
            curveTo(2.99219f, 10.9612f, 3.94092f, 11.682f, 5.83839f, 13.1235f)
            lineTo(6.99219f, 14f)
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
            moveTo(11.9922f, 6f)
            lineTo(10.8384f, 6.87652f)
            curveTo(8.94092f, 8.31801f, 7.99219f, 9.03875f, 7.99219f, 10f)
            curveTo(7.99219f, 10.9612f, 8.94092f, 11.682f, 10.8384f, 13.1235f)
            lineTo(11.9922f, 14f)
        }
        }.build()

        return _replyAll!!
    }

private var _replyAll: ImageVector? = null
