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

val HugeIcons.MessageCircleOff: ImageVector
    get() {
        if (_messageCircleOff != null) {
            return _messageCircleOff!!
        }
        _messageCircleOff = ImageVector.Builder(
            name = "MessageCircleOff",
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
            moveTo(1.99609f, 2f)
            lineTo(21.9961f, 22f)
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
            moveTo(7.58179f, 3.58569f)
            curveTo(8.9007f, 2.89234f, 10.4026f, 2.5f, 11.9961f, 2.5f)
            curveTo(17.2428f, 2.5f, 21.4961f, 6.75329f, 21.4961f, 12f)
            curveTo(21.4961f, 13.5935f, 21.1038f, 15.0954f, 20.4104f, 16.4143f)
            moveTo(5.27858f, 5.28249f)
            curveTo(3.55942f, 7.00165f, 2.49609f, 9.37665f, 2.49609f, 12f)
            curveTo(2.49609f, 13.0483f, 2.6659f, 14.057f, 2.9795f, 15f)
            curveTo(3.5243f, 16.6382f, 3.12475f, 18.5818f, 2.6896f, 19.6074f)
            curveTo(2.58875f, 19.8451f, 2.6235f, 20.1274f, 2.80606f, 20.31f)
            curveTo(2.92634f, 20.4302f, 3.09383f, 20.4913f, 3.26202f, 20.4658f)
            curveTo(4.37071f, 20.2979f, 5.62786f, 19.362f, 7.49609f, 20.3687f)
            curveTo(8.83549f, 21.0904f, 10.368f, 21.5f, 11.9961f, 21.5f)
            curveTo(14.6194f, 21.5f, 16.9944f, 20.4367f, 18.7136f, 18.7175f)
        }
        }.build()

        return _messageCircleOff!!
    }

private var _messageCircleOff: ImageVector? = null
