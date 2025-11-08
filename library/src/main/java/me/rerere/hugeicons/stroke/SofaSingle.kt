package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SofaSingle: ImageVector
    get() {
        if (_sofaSingle != null) {
            return _sofaSingle!!
        }
        _sofaSingle = ImageVector.Builder(
            name = "SofaSingle",
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
        moveTo(8f, 18f)
        lineTo(7f, 22f)
        moveTo(16f, 18f)
        lineTo(17f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 9f)
        curveTo(16.2969f, 9f, 16f, 11f, 16f, 11f)
        curveTo(15.7633f, 11.9468f, 15.6596f, 14.1441f, 14.8346f, 14.7882f)
        curveTo(14.5634f, 15f, 14.1884f, 15f, 13.4384f, 15f)
        horizontalLineTo(10.5616f)
        curveTo(9.8116f, 15f, 9.43663f, 15f, 9.16536f, 14.7882f)
        curveTo(8.34039f, 14.1441f, 8.23669f, 11.9468f, 8f, 11f)
        curveTo(8f, 11f, 7.70312f, 9f, 6f, 9f)
        curveTo(4.89543f, 9f, 4f, 9.89543f, 4f, 11f)
        curveTo(4f, 11.7403f, 4.4022f, 12.3866f, 5f, 12.7324f)
        lineTo(5.38226f, 14.746f)
        curveTo(5.67777f, 16.3026f, 5.82552f, 17.0809f, 6.38051f, 17.5405f)
        curveTo(6.93549f, 18f, 7.72769f, 18f, 9.31208f, 18f)
        horizontalLineTo(14.6879f)
        curveTo(16.2723f, 18f, 17.0645f, 18f, 17.6195f, 17.5405f)
        curveTo(18.1745f, 17.0809f, 18.3222f, 16.3026f, 18.6177f, 14.746f)
        lineTo(19f, 12.7324f)
        curveTo(19.5978f, 12.3866f, 20f, 11.7403f, 20f, 11f)
        curveTo(20f, 9.89543f, 19.1046f, 9f, 18f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.5f, 12.5f)
        curveTo(9.43278f, 11.8776f, 10.6581f, 11.5f, 12f, 11.5f)
        curveTo(13.3419f, 11.5f, 14.5672f, 11.8776f, 15.5f, 12.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.01633f, 9f)
        lineTo(6.83223f, 7.7071f)
        curveTo(6.45413f, 5.0517f, 6.26508f, 3.72399f, 7.01024f, 2.862f)
        curveTo(7.7554f, 2f, 9.09221f, 2f, 11.7658f, 2f)
        horizontalLineTo(12.2342f)
        curveTo(14.9078f, 2f, 16.2446f, 2f, 16.9898f, 2.862f)
        curveTo(17.7349f, 3.72399f, 17.5459f, 5.0517f, 17.1678f, 7.7071f)
        lineTo(16.9837f, 9f)
        }
        }.build()

        return _sofaSingle!!
    }

private var _sofaSingle: ImageVector? = null
