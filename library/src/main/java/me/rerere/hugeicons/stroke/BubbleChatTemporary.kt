package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BubbleChatTemporary: ImageVector
    get() {
        if (_bubbleChatTemporary != null) {
            return _bubbleChatTemporary!!
        }
        _bubbleChatTemporary = ImageVector.Builder(
            name = "BubbleChatTemporary",
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
        moveTo(7.50403f, 20.3687f)
        curveTo(5.6358f, 19.362f, 4.37865f, 20.2979f, 3.26995f, 20.4658f)
        curveTo(3.10177f, 20.4913f, 2.93427f, 20.4302f, 2.81399f, 20.31f)
        curveTo(2.63144f, 20.1274f, 2.59669f, 19.8451f, 2.69753f, 19.6074f)
        curveTo(2.96156f, 18.9852f, 3.21247f, 18.0249f, 3.2473f, 17f)
        moveTo(13.504f, 2.61775f)
        curveTo(13.0154f, 2.54025f, 12.5144f, 2.5f, 12.004f, 2.5f)
        curveTo(11.4936f, 2.5f, 10.9926f, 2.54025f, 10.504f, 2.61775f)
        moveTo(17.5751f, 4.30418f)
        curveTo(18.3893f, 4.89461f, 19.1062f, 5.61108f, 19.697f, 6.42496f)
        moveTo(21.3863f, 10.5f)
        curveTo(21.4638f, 10.9886f, 21.504f, 11.4896f, 21.504f, 12f)
        curveTo(21.504f, 12.5104f, 21.4638f, 13.0114f, 21.3863f, 13.5f)
        moveTo(19.697f, 17.575f)
        curveTo(19.1062f, 18.3889f, 18.3894f, 19.1053f, 17.5752f, 19.6958f)
        moveTo(13.504f, 21.3822f)
        curveTo(13.0154f, 21.4597f, 12.5144f, 21.5f, 12.004f, 21.5f)
        curveTo(11.4936f, 21.5f, 10.9926f, 21.4597f, 10.504f, 21.3822f)
        moveTo(2.62178f, 13.5f)
        curveTo(2.54428f, 13.0114f, 2.50403f, 12.5104f, 2.50403f, 12f)
        curveTo(2.50403f, 11.4896f, 2.54428f, 10.9886f, 2.62178f, 10.5f)
        moveTo(4.30825f, 6.42883f)
        curveTo(4.89868f, 5.61464f, 5.61516f, 4.89781f, 6.42904f, 4.30699f)
        }
        }.build()

        return _bubbleChatTemporary!!
    }

private var _bubbleChatTemporary: ImageVector? = null
