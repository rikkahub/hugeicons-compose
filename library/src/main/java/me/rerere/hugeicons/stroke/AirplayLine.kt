package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AirplayLine: ImageVector
    get() {
        if (_airplayLine != null) {
            return _airplayLine!!
        }
        _airplayLine = ImageVector.Builder(
            name = "AirplayLine",
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
        moveTo(4.5f, 18f)
        curveTo(3.96555f, 17.8228f, 3.53433f, 17.5662f, 3.17157f, 17.1945f)
        curveTo(2f, 15.994f, 2f, 14.0618f, 2f, 10.1975f)
        curveTo(2f, 6.33316f, 2f, 4.40099f, 3.17157f, 3.2005f)
        curveTo(4.34315f, 2f, 6.22876f, 2f, 10f, 2f)
        horizontalLineTo(14f)
        curveTo(17.7712f, 2f, 19.6569f, 2f, 20.8284f, 3.2005f)
        curveTo(22f, 4.40099f, 22f, 6.33316f, 22f, 10.1975f)
        curveTo(22f, 14.0618f, 22f, 15.994f, 20.8284f, 17.1945f)
        curveTo(20.4657f, 17.5662f, 20.0345f, 17.8228f, 19.5f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.91499f, 16.7661f)
        curveTo(10.1081f, 15.0762f, 10.7046f, 14.2312f, 11.5143f, 14.0528f)
        curveTo(11.8336f, 13.9824f, 12.1664f, 13.9824f, 12.4857f, 14.0528f)
        curveTo(13.2954f, 14.2312f, 13.8919f, 15.0762f, 15.085f, 16.7661f)
        curveTo(16.4811f, 18.7436f, 17.1791f, 19.7324f, 16.9605f, 20.5425f)
        curveTo(16.875f, 20.8594f, 16.7031f, 21.151f, 16.4611f, 21.3897f)
        curveTo(15.8425f, 22f, 14.5617f, 22f, 12f, 22f)
        curveTo(9.43831f, 22f, 8.15747f, 22f, 7.5389f, 21.3897f)
        curveTo(7.29691f, 21.151f, 7.12502f, 20.8594f, 7.03949f, 20.5425f)
        curveTo(6.82085f, 19.7324f, 7.5189f, 18.7436f, 8.91499f, 16.7661f)
        }
        }.build()

        return _airplayLine!!
    }

private var _airplayLine: ImageVector? = null
