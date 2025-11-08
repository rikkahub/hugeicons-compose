package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BubbleChatBlocked: ImageVector
    get() {
        if (_bubbleChatBlocked != null) {
            return _bubbleChatBlocked!!
        }
        _bubbleChatBlocked = ImageVector.Builder(
            name = "BubbleChatBlocked",
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
        moveTo(2f, 2f)
        lineTo(22f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.58569f, 3.58569f)
        curveTo(8.90461f, 2.89234f, 10.4065f, 2.5f, 12f, 2.5f)
        curveTo(17.2467f, 2.5f, 21.5f, 6.75329f, 21.5f, 12f)
        curveTo(21.5f, 13.5935f, 21.1077f, 15.0954f, 20.4143f, 16.4143f)
        moveTo(5.28249f, 5.28249f)
        curveTo(3.56332f, 7.00165f, 2.5f, 9.37665f, 2.5f, 12f)
        curveTo(2.5f, 13.0483f, 2.6698f, 14.057f, 2.98341f, 15f)
        curveTo(3.5282f, 16.6382f, 3.12865f, 18.5818f, 2.6935f, 19.6074f)
        curveTo(2.59266f, 19.8451f, 2.62741f, 20.1274f, 2.80997f, 20.31f)
        curveTo(2.93024f, 20.4302f, 3.09774f, 20.4913f, 3.26592f, 20.4658f)
        curveTo(4.37462f, 20.2979f, 5.63177f, 19.362f, 7.5f, 20.3687f)
        curveTo(8.8394f, 21.0904f, 10.3719f, 21.5f, 12f, 21.5f)
        curveTo(14.6234f, 21.5f, 16.9984f, 20.4367f, 18.7175f, 18.7175f)
        }
        }.build()

        return _bubbleChatBlocked!!
    }

private var _bubbleChatBlocked: ImageVector? = null
