package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BubbleChatEdit: ImageVector
    get() {
        if (_bubbleChatEdit != null) {
            return _bubbleChatEdit!!
        }
        _bubbleChatEdit = ImageVector.Builder(
            name = "BubbleChatEdit",
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
        moveTo(10.2367f, 15.1527f)
        lineTo(8.5f, 15.5f)
        lineTo(8.84733f, 13.7633f)
        curveTo(8.91788f, 13.4106f, 9.09126f, 13.0866f, 9.34563f, 12.8323f)
        lineTo(13.4111f, 8.76684f)
        curveTo(13.7668f, 8.41105f, 14.3437f, 8.41105f, 14.6995f, 8.76684f)
        lineTo(15.2332f, 9.30052f)
        curveTo(15.5889f, 9.65631f, 15.5889f, 10.2332f, 15.2332f, 10.5889f)
        lineTo(11.1677f, 14.6544f)
        curveTo(10.9134f, 14.9087f, 10.5894f, 15.0821f, 10.2367f, 15.1527f)
        }
        }.build()

        return _bubbleChatEdit!!
    }

private var _bubbleChatEdit: ImageVector? = null
