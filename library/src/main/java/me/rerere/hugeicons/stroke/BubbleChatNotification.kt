package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BubbleChatNotification: ImageVector
    get() {
        if (_bubbleChatNotification != null) {
            return _bubbleChatNotification!!
        }
        _bubbleChatNotification = ImageVector.Builder(
            name = "BubbleChatNotification",
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
        moveTo(12.5045f, 12f)
        horizontalLineTo(12.5135f)
        moveTo(16.5f, 12f)
        horizontalLineTo(16.509f)
        moveTo(8.509f, 12f)
        horizontalLineTo(8.51797f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 5f)
        curveTo(22f, 6.38071f, 20.8807f, 7.5f, 19.5f, 7.5f)
        curveTo(18.1193f, 7.5f, 17f, 6.38071f, 17f, 5f)
        curveTo(17f, 3.61929f, 18.1193f, 2.5f, 19.5f, 2.5f)
        curveTo(20.8807f, 2.5f, 22f, 3.61929f, 22f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.7896f, 10.0023f)
        curveTo(21.9274f, 10.6464f, 22f, 11.3147f, 22f, 12f)
        curveTo(22f, 17.2467f, 17.7467f, 21.5f, 12.5f, 21.5f)
        curveTo(10.8719f, 21.5f, 9.3394f, 21.0904f, 8f, 20.3687f)
        curveTo(6.13177f, 19.362f, 4.87462f, 20.2979f, 3.76592f, 20.4658f)
        curveTo(3.59774f, 20.4913f, 3.43024f, 20.4302f, 3.30997f, 20.31f)
        curveTo(3.12741f, 20.1274f, 3.09266f, 19.8451f, 3.1935f, 19.6074f)
        curveTo(3.62865f, 18.5818f, 4.0282f, 16.6382f, 3.48341f, 15f)
        curveTo(3.1698f, 14.057f, 3f, 13.0483f, 3f, 12f)
        curveTo(3f, 6.75329f, 7.25329f, 2.5f, 12.5f, 2.5f)
        curveTo(13.1853f, 2.5f, 13.8536f, 2.57256f, 14.4978f, 2.71042f)
        }
        }.build()

        return _bubbleChatNotification!!
    }

private var _bubbleChatNotification: ImageVector? = null
