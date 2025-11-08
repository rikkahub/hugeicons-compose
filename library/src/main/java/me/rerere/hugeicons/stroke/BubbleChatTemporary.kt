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
        moveTo(7.50397f, 20.3687f)
        curveTo(5.63574f, 19.362f, 4.37858f, 20.2979f, 3.26989f, 20.4658f)
        curveTo(3.10171f, 20.4913f, 2.93421f, 20.4302f, 2.81393f, 20.31f)
        curveTo(2.63138f, 20.1274f, 2.59663f, 19.8451f, 2.69747f, 19.6074f)
        curveTo(2.96149f, 18.9852f, 3.21241f, 18.0249f, 3.24724f, 17f)
        moveTo(13.504f, 2.61775f)
        curveTo(13.0154f, 2.54025f, 12.5144f, 2.5f, 12.004f, 2.5f)
        curveTo(11.4936f, 2.5f, 10.9926f, 2.54025f, 10.504f, 2.61775f)
        moveTo(17.5751f, 4.30418f)
        curveTo(18.3893f, 4.89461f, 19.1061f, 5.61108f, 19.6969f, 6.42496f)
        moveTo(21.3862f, 10.5f)
        curveTo(21.4637f, 10.9886f, 21.504f, 11.4896f, 21.504f, 12f)
        curveTo(21.504f, 12.5104f, 21.4637f, 13.0114f, 21.3862f, 13.5f)
        moveTo(19.697f, 17.575f)
        curveTo(19.1062f, 18.3889f, 18.3893f, 19.1053f, 17.5751f, 19.6958f)
        moveTo(13.504f, 21.3822f)
        curveTo(13.0154f, 21.4597f, 12.5144f, 21.5f, 12.004f, 21.5f)
        curveTo(11.4936f, 21.5f, 10.9926f, 21.4597f, 10.504f, 21.3822f)
        moveTo(2.62172f, 13.5f)
        curveTo(2.54422f, 13.0114f, 2.50397f, 12.5104f, 2.50397f, 12f)
        curveTo(2.50397f, 11.4896f, 2.54422f, 10.9886f, 2.62172f, 10.5f)
        moveTo(4.30819f, 6.42883f)
        curveTo(4.89862f, 5.61464f, 5.6151f, 4.89781f, 6.42898f, 4.30699f)
        }
        }.build()

        return _bubbleChatTemporary!!
    }

private var _bubbleChatTemporary: ImageVector? = null
