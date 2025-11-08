package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Loading01: ImageVector
    get() {
        if (_loading01 != null) {
            return _loading01!!
        }
        _loading01 = ImageVector.Builder(
            name = "Loading01",
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
        moveTo(17.2014f, 2f)
        horizontalLineTo(6.79876f)
        curveTo(5.341f, 2f, 4.06202f, 2.9847f, 4.0036f, 4.40355f)
        curveTo(3.93009f, 6.18879f, 5.18564f, 7.37422f, 6.50435f, 8.4871f)
        curveTo(8.32861f, 10.0266f, 9.24075f, 10.7964f, 9.33642f, 11.7708f)
        curveTo(9.35139f, 11.9233f, 9.35139f, 12.0767f, 9.33642f, 12.2292f)
        curveTo(9.24075f, 13.2036f, 8.32862f, 13.9734f, 6.50435f, 15.5129f)
        curveTo(5.14932f, 16.6564f, 3.9263f, 17.7195f, 4.0036f, 19.5964f)
        curveTo(4.06202f, 21.0153f, 5.341f, 22f, 6.79876f, 22f)
        lineTo(17.2014f, 22f)
        curveTo(18.6591f, 22f, 19.9381f, 21.0153f, 19.9965f, 19.5964f)
        curveTo(20.043f, 18.4668f, 19.6244f, 17.342f, 18.7352f, 16.56f)
        curveTo(18.3298f, 16.2034f, 17.9089f, 15.8615f, 17.4958f, 15.5129f)
        curveTo(15.6715f, 13.9734f, 14.7594f, 13.2036f, 14.6637f, 12.2292f)
        curveTo(14.6487f, 12.0767f, 14.6487f, 11.9233f, 14.6637f, 11.7708f)
        curveTo(14.7594f, 10.7964f, 15.6715f, 10.0266f, 17.4958f, 8.4871f)
        curveTo(18.8366f, 7.35558f, 20.0729f, 6.25809f, 19.9965f, 4.40355f)
        curveTo(19.9381f, 2.9847f, 18.6591f, 2f, 17.2014f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 21.6381f)
        curveTo(9f, 21.1962f, 9f, 20.9752f, 9.0876f, 20.7821f)
        curveTo(9.10151f, 20.7514f, 9.11699f, 20.7214f, 9.13399f, 20.6923f)
        curveTo(9.24101f, 20.509f, 9.42211f, 20.3796f, 9.78432f, 20.1208f)
        curveTo(10.7905f, 19.4021f, 11.2935f, 19.0427f, 11.8652f, 19.0045f)
        curveTo(11.955f, 18.9985f, 12.045f, 18.9985f, 12.1348f, 19.0045f)
        curveTo(12.7065f, 19.0427f, 13.2095f, 19.4021f, 14.2157f, 20.1208f)
        curveTo(14.5779f, 20.3796f, 14.759f, 20.509f, 14.866f, 20.6923f)
        curveTo(14.883f, 20.7214f, 14.8985f, 20.7514f, 14.9124f, 20.7821f)
        curveTo(15f, 20.9752f, 15f, 21.1962f, 15f, 21.6381f)
        verticalLineTo(22f)
        horizontalLineTo(9f)
        verticalLineTo(21.6381f)
        }
        }.build()

        return _loading01!!
    }

private var _loading01: ImageVector? = null
