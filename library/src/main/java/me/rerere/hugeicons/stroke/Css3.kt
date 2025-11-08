package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Css3: ImageVector
    get() {
        if (_css3 != null) {
            return _css3!!
        }
        _css3 = ImageVector.Builder(
            name = "Css3",
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
        moveTo(19.75f, 2.50024f)
        horizontalLineTo(4.75f)
        curveTo(4.19772f, 2.50024f, 3.75f, 2.94796f, 3.75f, 3.50024f)
        lineTo(5.60753f, 17.8961f)
        curveTo(5.69611f, 18.5826f, 6.13335f, 19.1745f, 6.76348f, 19.4609f)
        lineTo(10.7598f, 21.2774f)
        curveTo(11.0829f, 21.4243f, 11.4336f, 21.5002f, 11.7884f, 21.5002f)
        curveTo(12.0935f, 21.5002f, 12.396f, 21.4441f, 12.6808f, 21.3346f)
        lineTo(17.637f, 19.4283f)
        curveTo(18.3227f, 19.1646f, 18.8086f, 18.5462f, 18.9026f, 17.8176f)
        lineTo(20.75f, 3.50024f)
        curveTo(20.75f, 2.94796f, 20.3023f, 2.50024f, 19.75f, 2.50024f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.5f, 6.5f)
        horizontalLineTo(16.5f)
        lineTo(8f, 11f)
        horizontalLineTo(16f)
        lineTo(15.5f, 16f)
        lineTo(12f, 17f)
        lineTo(8.5f, 16f)
        lineTo(8.3f, 14f)
        }
        }.build()

        return _css3!!
    }

private var _css3: ImageVector? = null
