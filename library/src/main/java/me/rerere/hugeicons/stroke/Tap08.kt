package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Tap08: ImageVector
    get() {
        if (_tap08 != null) {
            return _tap08!!
        }
        _tap08 = ImageVector.Builder(
            name = "Tap08",
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
        moveTo(7.78057f, 13.9568f)
        verticalLineTo(9.49317f)
        moveTo(7.78057f, 9.49317f)
        verticalLineTo(3.97805f)
        curveTo(7.78057f, 3.15846f, 8.46365f, 2.49792f, 9.28334f, 2.49792f)
        curveTo(10.103f, 2.49792f, 10.7489f, 3.15846f, 10.7489f, 3.97805f)
        verticalLineTo(7.974f)
        moveTo(7.78057f, 9.49317f)
        curveTo(6.46629f, 10.684f, 5.05198f, 12.1884f, 4.86153f, 12.5737f)
        curveTo(3.97535f, 13.9225f, 4.06824f, 14.5755f, 5.05582f, 16.2259f)
        curveTo(5.89463f, 17.6277f, 7.02271f, 19.1833f, 7.08856f, 19.2579f)
        curveTo(7.7588f, 20.0174f, 7.62553f, 20.0175f, 8.59699f, 20.7307f)
        curveTo(9.46447f, 21.3327f, 11.2638f, 21.7522f, 15.4822f, 21.3327f)
        curveTo(18.9186f, 20.8019f, 19.7419f, 17.8026f, 19.7241f, 16.3692f)
        verticalLineTo(12.8295f)
        curveTo(19.9381f, 9.88749f, 18.7083f, 9.75469f, 16.4751f, 9.46512f)
        moveTo(10.7489f, 7.974f)
        verticalLineTo(10.4976f)
        moveTo(10.7489f, 7.974f)
        curveTo(11.3062f, 7.06532f, 13.3302f, 7.43254f, 13.7247f, 9.14847f)
        moveTo(13.7603f, 10.4936f)
        verticalLineTo(9.49317f)
        curveTo(13.7603f, 9.4143f, 13.7564f, 9.33519f, 13.7453f, 9.25717f)
        moveTo(13.7247f, 9.14847f)
        curveTo(13.7263f, 9.15569f, 13.728f, 9.16293f, 13.7296f, 9.1702f)
        curveTo(13.7359f, 9.19899f, 13.7411f, 9.228f, 13.7453f, 9.25717f)
        moveTo(13.7247f, 9.14847f)
        curveTo(13.7288f, 9.18343f, 13.7356f, 9.21967f, 13.7453f, 9.25717f)
        moveTo(13.7247f, 9.14847f)
        curveTo(13.5846f, 7.95246f, 16.6156f, 8.24402f, 16.7389f, 10.3474f)
        verticalLineTo(11.4905f)
        }
        }.build()

        return _tap08!!
    }

private var _tap08: ImageVector? = null
