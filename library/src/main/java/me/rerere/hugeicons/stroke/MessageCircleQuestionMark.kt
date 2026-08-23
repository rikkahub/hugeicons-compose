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

val HugeIcons.MessageCircleQuestionMark: ImageVector
    get() {
        if (_messageCircleQuestionMark != null) {
            return _messageCircleQuestionMark!!
        }
        _messageCircleQuestionMark = ImageVector.Builder(
            name = "MessageCircleQuestionMark",
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
            moveTo(9.49609f, 9.5f)
            curveTo(9.49609f, 8.11929f, 10.6154f, 7f, 11.9961f, 7f)
            curveTo(13.3768f, 7f, 14.4961f, 8.11929f, 14.4961f, 9.5f)
            curveTo(14.4961f, 10.3569f, 14.0649f, 11.1131f, 13.4078f, 11.5636f)
            curveTo(12.7244f, 12.0319f, 11.9961f, 12.6716f, 11.9961f, 13.5f)
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
            moveTo(12.1211f, 16.75f)
            horizontalLineTo(11.9961f)
            moveTo(12.2461f, 16.75f)
            curveTo(12.2461f, 16.8881f, 12.1342f, 17f, 11.9961f, 17f)
            curveTo(11.858f, 17f, 11.7461f, 16.8881f, 11.7461f, 16.75f)
            curveTo(11.7461f, 16.6119f, 11.858f, 16.5f, 11.9961f, 16.5f)
            curveTo(12.1342f, 16.5f, 12.2461f, 16.6119f, 12.2461f, 16.75f)
            close()
        }
        }.build()

        return _messageCircleQuestionMark!!
    }

private var _messageCircleQuestionMark: ImageVector? = null
