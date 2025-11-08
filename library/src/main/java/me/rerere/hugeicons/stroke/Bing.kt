package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Bing: ImageVector
    get() {
        if (_bing != null) {
            return _bing!!
        }
        _bing = ImageVector.Builder(
            name = "Bing",
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
        moveTo(4f, 18.4705f)
        verticalLineTo(3.32143f)
        curveTo(4f, 2.57781f, 4f, 2.20599f, 4.23713f, 2.05571f)
        curveTo(4.47427f, 1.90543f, 4.79858f, 2.07171f, 5.44721f, 2.40427f)
        lineTo(7.44721f, 3.42969f)
        curveTo(7.71617f, 3.56759f, 7.85065f, 3.63654f, 7.92533f, 3.76044f)
        curveTo(8f, 3.88433f, 8f, 4.03851f, 8f, 4.34686f)
        verticalLineTo(15.2766f)
        curveTo(8f, 16.0625f, 8f, 16.4554f, 8.24904f, 16.6036f)
        curveTo(8.49807f, 16.7518f, 8.83076f, 16.5568f, 9.49614f, 16.167f)
        lineTo(14.2232f, 13.3971f)
        curveTo(14.5572f, 13.2014f, 14.7242f, 13.1035f, 14.7114f, 12.9712f)
        curveTo(14.6986f, 12.8389f, 14.5162f, 12.7766f, 14.1513f, 12.6518f)
        lineTo(12.5208f, 12.0945f)
        curveTo(12.2661f, 12.0075f, 12.1388f, 11.9639f, 12.0516f, 11.8675f)
        curveTo(11.9645f, 11.771f, 11.932f, 11.6375f, 11.8669f, 11.3704f)
        lineTo(11.4164f, 9.5227f)
        curveTo(11.2311f, 8.7628f, 11.1385f, 8.38285f, 11.3443f, 8.17718f)
        curveTo(11.5502f, 7.97152f, 11.9182f, 8.07634f, 12.6542f, 8.28598f)
        lineTo(18.5353f, 9.96116f)
        curveTo(19.2399f, 10.1619f, 19.5923f, 10.2622f, 19.7961f, 10.5373f)
        curveTo(20f, 10.8123f, 20f, 11.1873f, 20f, 11.9372f)
        verticalLineTo(13.8824f)
        curveTo(20f, 14.4602f, 20f, 14.7491f, 19.866f, 14.9871f)
        curveTo(19.7321f, 15.225f, 19.488f, 15.3695f, 19f, 15.6584f)
        lineTo(9.04083f, 21.5546f)
        curveTo(8.53376f, 21.8548f, 8.28022f, 22.0049f, 8.00292f, 21.9999f)
        curveTo(7.72561f, 21.9949f, 7.47735f, 21.8358f, 6.98083f, 21.5176f)
        lineTo(4.94f, 20.2096f)
        curveTo(4.48048f, 19.9151f, 4.25071f, 19.7679f, 4.12536f, 19.5359f)
        curveTo(4f, 19.304f, 4f, 19.0262f, 4f, 18.4705f)
        }
        }.build()

        return _bing!!
    }

private var _bing: ImageVector? = null
