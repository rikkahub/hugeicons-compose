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

val HugeIcons.Reply: ImageVector
    get() {
        if (_reply != null) {
            return _reply!!
        }
        _reply = ImageVector.Builder(
            name = "Reply",
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
            moveTo(3.99219f, 10f)
            horizontalLineTo(11.9922f)
            curveTo(13.8521f, 10f, 14.7821f, 10f, 15.5451f, 10.2044f)
            curveTo(17.6157f, 10.7592f, 19.2329f, 12.3765f, 19.7877f, 14.4471f)
            curveTo(19.9922f, 15.2101f, 19.9922f, 16.1401f, 19.9922f, 18f)
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
            moveTo(7.99219f, 6f)
            lineTo(6.83839f, 6.87652f)
            curveTo(4.94092f, 8.31801f, 3.99219f, 9.03875f, 3.99219f, 10f)
            curveTo(3.99219f, 10.9612f, 4.94092f, 11.682f, 6.83839f, 13.1235f)
            lineTo(7.99219f, 14f)
        }
        }.build()

        return _reply!!
    }

private var _reply: ImageVector? = null
