package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Connect: ImageVector
    get() {
        if (_connect != null) {
            return _connect!!
        }
        _connect = ImageVector.Builder(
            name = "Connect",
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
        moveTo(4.51255f, 19.4866f)
        curveTo(7.02498f, 21.8794f, 10.016f, 20.9223f, 11.2124f, 19.9532f)
        curveTo(11.8314f, 19.4518f, 12.1097f, 19.1277f, 12.3489f, 18.8884f)
        curveTo(13.1864f, 18.1107f, 13.1326f, 17.3331f, 12.5882f, 16.711f)
        curveTo(12.3704f, 16.462f, 10.9731f, 15.1198f, 9.63313f, 13.7439f)
        curveTo(8.93922f, 13.0499f, 8.46066f, 12.5595f, 8.05149f, 12.1647f)
        curveTo(7.50354f, 11.6185f, 7.02499f, 10.9922f, 6.30715f, 11.0101f)
        curveTo(5.64913f, 11.0101f, 5.17057f, 11.5904f, 4.57237f, 12.1886f)
        curveTo(3.88422f, 12.8767f, 3.37598f, 13.7439f, 3.19652f, 14.5216f)
        curveTo(2.65814f, 16.7947f, 3.49562f, 18.4098f, 4.51255f, 19.4866f)
        moveTo(4.51255f, 19.4866f)
        lineTo(2.00012f, 21.999f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.4867f, 4.51472f)
        curveTo(16.9736f, 2.12078f, 13.9929f, 3.09593f, 12.7962f, 4.06548f)
        curveTo(12.177f, 4.56712f, 11.8987f, 4.89138f, 11.6593f, 5.13078f)
        curveTo(10.8216f, 5.90881f, 10.8755f, 6.68683f, 11.42f, 7.30926f)
        curveTo(11.4983f, 7.39881f, 11.7292f, 7.62975f, 12.055f, 7.95281f)
        moveTo(19.4867f, 4.51472f)
        curveTo(20.504f, 5.59199f, 21.3528f, 7.22547f, 20.8142f, 9.49971f)
        curveTo(20.6347f, 10.2777f, 20.1264f, 11.1453f, 19.438f, 11.8338f)
        curveTo(18.8397f, 12.4323f, 18.361f, 13.0128f, 17.7028f, 13.0128f)
        curveTo(16.9847f, 13.0308f, 16.6121f, 12.5115f, 16.064f, 11.9651f)
        moveTo(19.4867f, 4.51472f)
        lineTo(21.9999f, 2.0011f)
        moveTo(16.064f, 11.9651f)
        curveTo(15.6547f, 11.5701f, 15.07f, 10.9721f, 14.3759f, 10.2777f)
        curveTo(13.5175f, 9.39612f, 12.6355f, 8.52831f, 12.055f, 7.95281f)
        moveTo(16.064f, 11.9651f)
        lineTo(14.5024f, 13.4896f)
        moveTo(10.5114f, 9.50609f)
        lineTo(12.055f, 7.95281f)
        }
        }.build()

        return _connect!!
    }

private var _connect: ImageVector? = null
