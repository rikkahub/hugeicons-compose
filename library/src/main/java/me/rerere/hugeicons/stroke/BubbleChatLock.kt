package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BubbleChatLock: ImageVector
    get() {
        if (_bubbleChatLock != null) {
            return _bubbleChatLock!!
        }
        _bubbleChatLock = ImageVector.Builder(
            name = "BubbleChatLock",
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
        moveTo(10f, 11f)
        verticalLineTo(9.5f)
        curveTo(10f, 8.39543f, 10.8954f, 7.5f, 12f, 7.5f)
        curveTo(13.1046f, 7.5f, 14f, 8.39543f, 14f, 9.5f)
        verticalLineTo(11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 11f)
        horizontalLineTo(10f)
        curveTo(9.17157f, 11f, 8.5f, 11.6716f, 8.5f, 12.5f)
        verticalLineTo(14f)
        curveTo(8.5f, 14.8284f, 9.17157f, 15.5f, 10f, 15.5f)
        horizontalLineTo(14f)
        curveTo(14.8284f, 15.5f, 15.5f, 14.8284f, 15.5f, 14f)
        verticalLineTo(12.5f)
        curveTo(15.5f, 11.6716f, 14.8284f, 11f, 14f, 11f)
        }
        }.build()

        return _bubbleChatLock!!
    }

private var _bubbleChatLock: ImageVector? = null
