package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BatteryEcoCharging: ImageVector
    get() {
        if (_batteryEcoCharging != null) {
            return _batteryEcoCharging!!
        }
        _batteryEcoCharging = ImageVector.Builder(
            name = "BatteryEcoCharging",
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
        moveTo(8f, 19f)
        horizontalLineTo(13f)
        curveTo(15.8284f, 19f, 17.2426f, 19f, 18.1213f, 18.1213f)
        curveTo(19f, 17.2426f, 19f, 15.8284f, 19f, 13f)
        curveTo(19f, 11.1366f, 19f, 9.887f, 18.7488f, 8.99997f)
        moveTo(5.5f, 7.0383f)
        curveTo(4.24209f, 7.10888f, 3.44798f, 7.30933f, 2.87868f, 7.87863f)
        curveTo(2f, 8.75731f, 2f, 10.1715f, 2f, 13f)
        curveTo(2f, 15.2437f, 2f, 16.5975f, 2.43866f, 17.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 10.5f)
        lineTo(20.0272f, 10.6712f)
        curveTo(20.7085f, 10.7847f, 21.0491f, 10.8415f, 21.3076f, 11.0066f)
        curveTo(21.5618f, 11.169f, 21.7612f, 11.4044f, 21.8796f, 11.6818f)
        curveTo(22f, 11.9639f, 22f, 12.3093f, 22f, 13f)
        curveTo(22f, 13.6906f, 22f, 14.036f, 21.8796f, 14.3181f)
        curveTo(21.7612f, 14.5955f, 21.5618f, 14.8309f, 21.3076f, 14.9933f)
        curveTo(21.0491f, 15.1584f, 20.7085f, 15.2152f, 20.0272f, 15.3287f)
        lineTo(19f, 15.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.03319f, 20f)
        curveTo(4.54502f, 14.6f, 9.00032f, 13.5f, 11.0002f, 11f)
        moveTo(11.0339f, 15.8353f)
        curveTo(13.5787f, 15.1243f, 15.2108f, 13.4224f, 15.8162f, 10.8483f)
        curveTo(16.502f, 7.93305f, 15.2725f, 3.96327f, 12.1026f, 4.00026f)
        curveTo(12.1026f, 4.00026f, 12.4253f, 5.25961f, 12.143f, 5.8764f)
        curveTo(11.1022f, 8.15057f, 7.50025f, 7.99259f, 6.3325f, 10.8769f)
        curveTo(5.63711f, 12.4908f, 6.05765f, 14.2938f, 7.36616f, 15.3279f)
        curveTo(8.18838f, 15.9778f, 9.81192f, 16.1767f, 11.0339f, 15.8353f)
        }
        }.build()

        return _batteryEcoCharging!!
    }

private var _batteryEcoCharging: ImageVector? = null
