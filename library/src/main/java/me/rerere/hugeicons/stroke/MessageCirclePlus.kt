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

val HugeIcons.MessageCirclePlus: ImageVector
    get() {
        if (_messageCirclePlus != null) {
            return _messageCirclePlus!!
        }
        _messageCirclePlus = ImageVector.Builder(
            name = "MessageCirclePlus",
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
            moveTo(21.4961f, 12f)
            curveTo(21.4961f, 17.2467f, 17.2428f, 21.5f, 11.9961f, 21.5f)
            curveTo(10.368f, 21.5f, 8.83549f, 21.0904f, 7.49609f, 20.3687f)
            curveTo(5.62786f, 19.362f, 4.37071f, 20.2979f, 3.26202f, 20.4658f)
            curveTo(3.09383f, 20.4913f, 2.92634f, 20.4302f, 2.80606f, 20.31f)
            curveTo(2.6235f, 20.1274f, 2.58875f, 19.8451f, 2.6896f, 19.6074f)
            curveTo(3.12475f, 18.5818f, 3.5243f, 16.6382f, 2.9795f, 15f)
            curveTo(2.6659f, 14.057f, 2.49609f, 13.0483f, 2.49609f, 12f)
            curveTo(2.49609f, 6.75329f, 6.74939f, 2.5f, 11.9961f, 2.5f)
            curveTo(17.2428f, 2.5f, 21.4961f, 6.75329f, 21.4961f, 12f)
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
            moveTo(15.4961f, 12f)
            horizontalLineTo(8.49609f)
            moveTo(11.9961f, 8.5f)
            verticalLineTo(15.5f)
        }
        }.build()

        return _messageCirclePlus!!
    }

private var _messageCirclePlus: ImageVector? = null
