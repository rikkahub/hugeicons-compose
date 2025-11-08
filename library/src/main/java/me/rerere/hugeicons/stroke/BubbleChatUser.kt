package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BubbleChatUser: ImageVector
    get() {
        if (_bubbleChatUser != null) {
            return _bubbleChatUser!!
        }
        _bubbleChatUser = ImageVector.Builder(
            name = "BubbleChatUser",
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
        moveTo(8.5f, 15.4984f)
        curveTo(8.5f, 13.5654f, 10.067f, 11.9984f, 12f, 11.9984f)
        curveTo(13.933f, 11.9984f, 15.5f, 13.5654f, 15.5f, 15.4984f)
        moveTo(14f, 10f)
        curveTo(14f, 11.1046f, 13.1046f, 12f, 12f, 12f)
        curveTo(10.8954f, 12f, 10f, 11.1046f, 10f, 10f)
        curveTo(10f, 8.89543f, 10.8954f, 8f, 12f, 8f)
        curveTo(13.1046f, 8f, 14f, 8.89543f, 14f, 10f)
        }
        }.build()

        return _bubbleChatUser!!
    }

private var _bubbleChatUser: ImageVector? = null
