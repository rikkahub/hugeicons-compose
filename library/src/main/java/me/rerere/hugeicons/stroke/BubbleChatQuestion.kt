package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BubbleChatQuestion: ImageVector
    get() {
        if (_bubbleChatQuestion != null) {
            return _bubbleChatQuestion!!
        }
        _bubbleChatQuestion = ImageVector.Builder(
            name = "BubbleChatQuestion",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.5f, 12f)
        curveTo(21.5f, 17.2467f, 17.2467f, 21.5f, 12f, 21.5f)
        curveTo(10.3719f, 21.5f, 8.8394f, 21.0904f, 7.5f, 20.3687f)
        curveTo(5.63177f, 19.362f, 4.37462f, 20.2979f, 3.26592f, 20.4658f)
        curveTo(3.09774f, 20.4913f, 2.93024f, 20.4302f, 2.80997f, 20.31f)
        curveTo(2.62741f, 20.1274f, 2.59266f, 19.8451f, 2.6935f, 19.6074f)
        curveTo(3.12865f, 18.5818f, 3.5282f, 16.6382f, 2.98341f, 15f)
        curveTo(2.6698f, 14.057f, 2.5f, 13.0483f, 2.5f, 12f)
        curveTo(2.5f, 6.75329f, 6.75329f, 2.5f, 12f, 2.5f)
        curveTo(17.2467f, 2.5f, 21.5f, 6.75329f, 21.5f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.5f, 9.5f)
        curveTo(9.5f, 8.11929f, 10.6193f, 7f, 12f, 7f)
        curveTo(13.3807f, 7f, 14.5f, 8.11929f, 14.5f, 9.5f)
        curveTo(14.5f, 10.3569f, 14.0689f, 11.1131f, 13.4117f, 11.5636f)
        curveTo(12.7283f, 12.0319f, 12f, 12.6716f, 12f, 13.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 16.5f)
        horizontalLineTo(12.009f)
        }
        }.build()

        return _bubbleChatQuestion!!
    }

private var _bubbleChatQuestion: ImageVector? = null
