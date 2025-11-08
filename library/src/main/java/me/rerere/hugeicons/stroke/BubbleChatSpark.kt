package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BubbleChatSpark: ImageVector
    get() {
        if (_bubbleChatSpark != null) {
            return _bubbleChatSpark!!
        }
        _bubbleChatSpark = ImageVector.Builder(
            name = "BubbleChatSpark",
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
        moveTo(11.9649f, 8.02864f)
        curveTo(11.9727f, 7.99045f, 12.0273f, 7.99045f, 12.0351f, 8.02864f)
        curveTo(12.4402f, 10.0108f, 13.9892f, 11.5598f, 15.9714f, 11.9649f)
        curveTo(16.0095f, 11.9727f, 16.0095f, 12.0273f, 15.9714f, 12.0351f)
        curveTo(13.9892f, 12.4402f, 12.4402f, 13.9892f, 12.0351f, 15.9714f)
        curveTo(12.0273f, 16.0095f, 11.9727f, 16.0095f, 11.9649f, 15.9714f)
        curveTo(11.5598f, 13.9892f, 10.0108f, 12.4402f, 8.02864f, 12.0351f)
        curveTo(7.99045f, 12.0273f, 7.99045f, 11.9727f, 8.02864f, 11.9649f)
        curveTo(10.0108f, 11.5598f, 11.5598f, 10.0108f, 11.9649f, 8.02864f)
        }
        }.build()

        return _bubbleChatSpark!!
    }

private var _bubbleChatSpark: ImageVector? = null
